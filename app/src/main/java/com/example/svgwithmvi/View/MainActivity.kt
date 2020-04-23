package com.example.svgwithmvi.View

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.View
import android.view.View.OnTouchListener
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.svgwithmvi.intents.InitialEventsIntent
import com.example.svgwithmvi.viewmodel.MainViewModel
import com.example.svgwithmvi.R
import com.example.svgwithmvi.View.maintaskrecyclerview.MainRecyclerViewClickListener
import com.example.svgwithmvi.View.maintaskrecyclerview.MainTasksRecyclerViewAdapter
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainRecyclerViewClickListener, OnTouchListener,
    GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    var TAG: String = "MainActivity"

    private var x: Float? = null
    private var y: Float? = null
    var fragmentManager: FragmentManager = supportFragmentManager
    private lateinit var gestureDetector: GestureDetector
    private lateinit var onTouchImagePublisher: PublishSubject<InitialEventsIntent>
    private lateinit var liveDataForMainImageView: MutableLiveData<Bitmap>
    private lateinit var scaleDetector: ScaleGestureDetector

    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        liveDataForMainImageView = viewModel.mainImageViewBitmap
        liveDataForMainImageView.observe(
            this,
            Observer { mainImageView.setImageBitmap(it) }
        )
        mainImageView.setOnTouchListener(this)
        mainScrollViewForImage.setOnTouchListener(this)
        mainVerticalScrollViewForImage.setOnTouchListener(this)
        gestureDetector = GestureDetector(this, this)
        onTouchImagePublisher = viewModel.onTouchImagePublisher
        scaleDetector = ScaleGestureDetector(
            this,
            ScaleListener(onTouchImagePublisher)
        )

        mainRecyclerViewForTasksList.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mainRecyclerViewForTasksList.adapter =
            MainTasksRecyclerViewAdapter(viewModel.mainImagesData.getList(), this)

    }

    override fun onClick(position: Int) {
        when (viewModel.mainImagesData.getImageId(position)) {
            R.drawable.shapes_24dp -> {
                val tag = "shapes"
                if (!removeFragment(tag))
                    addFragment(tag, ShapeFragment())
            }
            R.drawable.action_24dp -> {
                val tag = "actions"
                if (!removeFragment(tag))
                    addFragment(tag, ActionsFragment())
            }
        }
    }

    private fun removeFragment(tag: String): Boolean {
        val fragment = fragmentManager.findFragmentByTag(tag)
        fragment?.let {
            fragmentManager.beginTransaction().remove(it).commit()
            return true
        }
        return false
    }

    private fun addFragment(tag: String, fragmentType: Fragment) {

        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(
            R.id.mainFrameLayoutForFragments,
            fragmentType, tag
        )
        fragmentTransaction.commit()
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (event?.action == MotionEvent.ACTION_UP)
            onTouchImagePublisher.onNext(InitialEventsIntent.TouchEvents.OnActionUp)
        scaleDetector.onTouchEvent(event)
        gestureDetector.onTouchEvent(event)

        return true
    }

    override fun onShowPress(e: MotionEvent?) {
        e?.let {
            onTouchImagePublisher.onNext(
                InitialEventsIntent.TouchEvents.onDown(
                    it.x,
                    it.y
                )
            )
        }
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        e?.let {
            onTouchImagePublisher.onNext(
                InitialEventsIntent.TouchEvents.SingleTap(
                    it
                )
            )
        }
        return true
    }

    override fun onDown(e: MotionEvent?): Boolean {
        return true
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        return true
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        e1?.let {
            onTouchImagePublisher.onNext(
                InitialEventsIntent.TouchEvents.OnDrag(
                    it,
                    e2!!,
                    distanceX,
                    distanceY
                )
            )
        }
        return true
    }

    override fun onLongPress(e: MotionEvent?) {
        e?.let {
            onTouchImagePublisher.onNext(
                InitialEventsIntent.TouchEvents.Pinch.UpdateHeight(
                    2f,
                    true
                )
            )
        }
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        e?.let {
            onTouchImagePublisher.onNext(
                InitialEventsIntent.TouchEvents.DoubleTap(
                    it
                )
            )
        }
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        return true
    }

    private class ScaleListener(var onTouchImagePublisher: PublishSubject<InitialEventsIntent>) :
        ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScale(detector: ScaleGestureDetector?): Boolean {
            detector?.let {
                onTouchImagePublisher.onNext(
                    InitialEventsIntent.TouchEvents.Pinch.UpdateHeight(
                        it.scaleFactor,
                        true
                    )
                )
            }
            return super.onScale(detector)
        }
    }
}

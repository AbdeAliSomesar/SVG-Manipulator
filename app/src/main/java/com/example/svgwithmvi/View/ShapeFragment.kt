package com.example.svgwithmvi.View


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.svgwithmvi.intents.InitialEventsIntent
import com.example.svgwithmvi.viewmodel.MainViewModel
import com.example.svgwithmvi.R
import com.example.svgwithmvi.View.Adapter.ShapeListAdapter
import io.reactivex.disposables.Disposable
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.fragment_shape.view.*

/**
 * A simple [Fragment] subclass.
 */
class ShapeFragment : Fragment(){

    private val shapePublisher:PublishSubject<InitialEventsIntent> = PublishSubject.create()
    private lateinit var disposable:Disposable

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewModel = ViewModelProviders.of(activity!!).get(MainViewModel::class.java)
        //add publisher to disposable
        disposable = shapePublisher.subscribe(viewModel.mainIntentsPublisher::onNext)

        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_shape, container, false)
        var list = listOf(
            R.drawable.shape_circle_24dp,
            R.drawable.shape_rectangle_24dp,
            R.drawable.shape_triangle_24dp,
            R.drawable.shape_circle_24dp,
            R.drawable.shape_rectangle_24dp,
            R.drawable.shape_triangle_24dp,
            R.drawable.shape_circle_24dp,
            R.drawable.shape_rectangle_24dp,
            R.drawable.shape_triangle_24dp,
            R.drawable.shape_circle_24dp,
            R.drawable.shape_rectangle_24dp,
            R.drawable.shape_triangle_24dp,
            R.drawable.shape_circle_24dp,
            R.drawable.shape_rectangle_24dp,
            R.drawable.shape_triangle_24dp,
            R.drawable.shape_circle_24dp,
            R.drawable.shape_rectangle_24dp,
            R.drawable.shape_triangle_24dp
        )
        view.shapeFragmentRecyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        view.shapeFragmentRecyclerView.adapter =
            ShapeListAdapter(list) { position ->
                var name = viewModel.getShapeName(list[position])
                name?.let {
                    shapePublisher.onNext(
                        InitialEventsIntent.ShapeSelect(
                            name
                        )
                    )
                }
            }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        disposable.dispose()
    }

}

package com.example.svgwithmvi.viewmodel
import android.graphics.Bitmap
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.svgwithmvi.model.state.ProjectViewState
import com.example.svgwithmvi.R
import com.example.svgwithmvi.actionprocessor.ActionProcessorHolder
import com.example.svgwithmvi.daggerdependencies.DaggerSVGComponent
import com.example.svgwithmvi.daggerdependencies.SVGConverterModule
import com.example.svgwithmvi.intents.InitialEventsIntent
import com.example.svgwithmvi.intents.IntentActionResult
import com.example.svgwithmvi.View.maintaskrecyclerview.RecyclerViewImageAndTextDataListHolder
import com.example.svgwithmvi.intents.IntentActions
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.BiFunction
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject


class MainViewModel:ViewModel(){


    private val actionProcessorHolder: ActionProcessorHolder =
        ActionProcessorHolder(
            DaggerSVGComponent.builder().sVGConverterModule(
                SVGConverterModule(2000, 3000)
            ).build().getSVGModul()
        )
    // LiveData for mainImageView
    var mainImageViewBitmap = MutableLiveData<Bitmap>()

    var mainIntentsPublisher:PublishSubject<InitialEventsIntent> = PublishSubject.create()
    private var statesObservable: Observable<ProjectViewState> = compose()
    var onTouchImagePublisher = PublishSubject.create<InitialEventsIntent>()
    var mainImagesData = RecyclerViewImageAndTextDataListHolder()
    var actionsFragmentDataList = RecyclerViewImageAndTextDataListHolder()

    private val disposable:CompositeDisposable = CompositeDisposable()

   init {

     //Add Observable to disposable
        disposable.add(statesObservable.subscribe(this::render))
        createInitialList()

        mainIntentsPublisher.onNext(InitialEventsIntent.intialState)
        disposable.add(onTouchImagePublisher.subscribe{ type ->
            mainIntentsPublisher.onNext(type)})
        mainImageViewBitmap.value = Bitmap.createBitmap(2000,3000,Bitmap.Config.RGB_565)
   }

   fun createInitialList():List<RecyclerViewImageAndTextDataListHolder.RecyclerViewData>
   {
       //For main RecyclerView

       mainImagesData.add(R.drawable.shapes_24dp,"Shapes")
       mainImagesData.add(R.drawable.action_24dp,"Actions")
       mainImagesData.add(R.drawable.layers_24dp,"Layers")
       //For action Fragment RecyclerView
       actionsFragmentDataList.add(R.drawable.action_group_24dp,"Group")
       actionsFragmentDataList.add(R.drawable.action_ungroup_24dp,"UnGroup")
       actionsFragmentDataList.add(R.drawable.action_attach24dp,"Attach")
       actionsFragmentDataList.add(R.drawable.action_deattach24dp,"DeAttach")
       actionsFragmentDataList.add(R.drawable.action_duplicate_24dp,"Duplicate")
       actionsFragmentDataList.add(R.drawable.action_zoom_in_24dp,"Zoom in")
       actionsFragmentDataList.add(R.drawable.action_zoom_out_24dp,"Zoom out")
       actionsFragmentDataList.add(R.drawable.action_delete_24dp,"Delete")


      return mainImagesData.getList()
   }



    private fun compose():Observable<ProjectViewState> =
        mainIntentsPublisher
            .map (this::actionFromIntents)
            .compose(actionProcessorHolder.actionProcessor)
            .scan(
                ProjectViewState.idle(2000, 3000),
                reducer
            )
            .replay(1)
            .autoConnect(0)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())



    private fun actionFromIntents(intent: InitialEventsIntent): IntentActions
    {
        return when(intent)
        {
            is InitialEventsIntent.intialState -> IntentActions.ShapeSelect(null)
            is InitialEventsIntent.TouchEvents -> when(intent){
                is InitialEventsIntent.TouchEvents.onDown -> IntentActions.onDown(intent.x,intent.y)
                is InitialEventsIntent.TouchEvents.OnDrag ->    { Log.d("TestEvenDrag","x1 =${intent.event1.x} y1 =${intent.event1.y} x2 =${intent.event1.x} y2 =${intent.event1.y}")
                IntentActions.Drag(intent.event1.x,intent.event1.y,intent.event2.x,intent.event2.y,intent.distanceX,intent.distanceY)}
                is InitialEventsIntent.TouchEvents.OnActionUp -> IntentActions.OnActionUp
                is InitialEventsIntent.TouchEvents.SingleTap -> IntentActions.SingleTap(intent.event.x,intent.event.y)
                is InitialEventsIntent.TouchEvents.DoubleTap -> IntentActions.DoubleTap(intent.event.x,intent.event.y)
                is InitialEventsIntent.TouchEvents.Pinch -> when(intent)
                {
                    is InitialEventsIntent.TouchEvents.Pinch.UpdateHeight -> IntentActions.Zoom.UpdateHeight(intent.scaleFactor,intent.isLocked)
                    is InitialEventsIntent.TouchEvents.Pinch.UpdateWidth -> IntentActions.Zoom.UpdateWidth(intent.scaleFactor)
                }
            }
            is InitialEventsIntent.ActionSelect -> when(intent){
                is InitialEventsIntent.ActionSelect.Attach -> IntentActions.ActionSelect.Attach
                is InitialEventsIntent.ActionSelect.DeAttach -> IntentActions.ActionSelect.DeAttach
                is InitialEventsIntent.ActionSelect.Group -> IntentActions.ActionSelect.Group
                is InitialEventsIntent.ActionSelect.UnGroup -> IntentActions.ActionSelect.UnGroup
                is InitialEventsIntent.ActionSelect.Duplicate -> IntentActions.ActionSelect.Duplicate
                is InitialEventsIntent.ActionSelect.Delete -> IntentActions.ActionSelect.Delete
            }
            is InitialEventsIntent.ShapeSelect -> IntentActions.ShapeSelect(intent.shapeName)

        }
    }

    companion object {
        private val reducer =
            BiFunction { previousState: ProjectViewState, result: IntentActionResult ->
                when (result) {
                    is IntentActionResult.ImageBitmap -> previousState.copy(bitmap = result.bitmap)
                    is IntentActionResult.Failure -> previousState.copy()
                }
            }
    }
    fun getShapeName(resourceId:Int):String?
    {
        return when(resourceId)
        {
            R.drawable.shape_circle_24dp -> "circle"
            R.drawable.shape_rectangle_24dp -> "rectangle"
            R.drawable.shape_triangle_24dp -> "triangle"
            else -> null
        }
    }
    fun getActionId(position: Int):Int
    {
        return actionsFragmentDataList.getImageId(position)
    }
    private fun render(state: ProjectViewState)
    {
        state.bitmap.let {
            mainImageViewBitmap.value = state.bitmap
        }
        if(state.Failure)
        {
         //   Toast.makeText(,state.FailureMsg,Toast.LENGTH_SHORT)
        }
    }
    /*private fun onError(msg:String)
    {
        mainImageViewBitmap.value = state.bitmap
    }*/
    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }
}
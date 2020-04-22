package com.example.svgwithmvi.actionprocessor

import com.example.svgwithmvi.intents.IntentActionResult
import com.example.svgwithmvi.model.SVGModel
import com.example.svgwithmvi.intents.IntentActions
import io.reactivex.ObservableTransformer
import java.lang.Exception


class ActionProcessorHolder(val model: SVGModel) {

    private fun onDownActionProcessor(action: IntentActions.onDown): IntentActionResult.ImageBitmap =
    IntentActionResult.ImageBitmap(model.onTouchShape(action.x,action.y))
    private fun moveActionProcessor(action: IntentActions.Drag): IntentActionResult.ImageBitmap =
    IntentActionResult.ImageBitmap(model.onDrag(action.x1,action.y1,action.x2,action.y2,action.distanceX,action.distanceY))

    private fun onActionUp(): IntentActionResult.ImageBitmap =
        IntentActionResult.ImageBitmap(model.onActionUp())

    private fun singleTapProcessor(action: IntentActions.SingleTap): IntentActionResult.ImageBitmap =
        IntentActionResult.ImageBitmap(model.singleTap(action.x,action.y))


    private fun doubleTapProcessor(action: IntentActions.DoubleTap): IntentActionResult.ImageBitmap =
        IntentActionResult.ImageBitmap(model.doubleTap(action.x,action.y))

    private fun zoomProcessor(action: IntentActions.Zoom): IntentActionResult.ImageBitmap =
        when(action)
        {
            is IntentActions.Zoom.UpdateHeight -> IntentActionResult.ImageBitmap(model.updateHeightOfSelectedBy(action.scaleFactor,action.isLocked))
            is IntentActions.Zoom.UpdateWidth -> IntentActionResult.ImageBitmap(model.updateWidthOfSelectedBy(action.scaleFactor))
        }

    private fun actionSelectProcessor(action: IntentActions.ActionSelect): IntentActionResult.ImageBitmap =
                when(action) {
                    is IntentActions.ActionSelect.Attach -> IntentActionResult.ImageBitmap(model.attachSelected())
                    is IntentActions.ActionSelect.DeAttach -> IntentActionResult.ImageBitmap(model.deAttachSelected())
                    is IntentActions.ActionSelect.Group -> IntentActionResult.ImageBitmap(model.groupSelected())
                    is IntentActions.ActionSelect.UnGroup -> IntentActionResult.ImageBitmap(model.unGroupSelected())
                    is IntentActions.ActionSelect.Duplicate -> //try {
                        IntentActionResult.ImageBitmap(model.duplicateSelected())
                    //}
//                    catch (e:Exception)
//                    {
//                        IntentActionResult.Failure("")
//                    }
                    is IntentActions.ActionSelect.Delete -> IntentActionResult.ImageBitmap(model.deleteSelected())
                }

    private fun shapeSelectProcessor(action: IntentActions.ShapeSelect): IntentActionResult.ImageBitmap =
        IntentActionResult.ImageBitmap(model.selectShape(action.shapeName))



    internal val actionProcessor =
        ObservableTransformer <IntentActions, IntentActionResult>{ action ->

            action.map {
               when(it)
               {
                   is IntentActions.onDown -> onDownActionProcessor(it)
                   is IntentActions.Drag -> moveActionProcessor(it)
                   is IntentActions.OnActionUp -> onActionUp()
                   is IntentActions.ShapeSelect -> shapeSelectProcessor(it)
                   is IntentActions.ActionSelect -> actionSelectProcessor(it)
                   is IntentActions.SingleTap -> singleTapProcessor(it)
                   is IntentActions.DoubleTap -> doubleTapProcessor(it)
                   is IntentActions.Zoom -> zoomProcessor(it)
               }
            }
        }


}
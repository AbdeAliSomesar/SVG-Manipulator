package com.example.svgwithmvi.intents

import android.view.MotionEvent

sealed class InitialEventsIntent {
    object intialState: InitialEventsIntent()
    sealed class TouchEvents: InitialEventsIntent()
    {
        data class OnDrag(val event1:MotionEvent, val event2:MotionEvent, val distanceX:Float, val distanceY:Float):
            TouchEvents()
        object OnActionUp: TouchEvents()
        data class onDown(val x:Float,val y:Float):
            TouchEvents()
        sealed class Pinch : TouchEvents()
        {
            data class UpdateHeight(val scaleFactor:Float,val isLocked:Boolean):
                Pinch()
            data class UpdateWidth(val scaleFactor:Float):
                Pinch()
        }
        data class SingleTap(val event: MotionEvent): TouchEvents()
        data class DoubleTap(val event:MotionEvent): TouchEvents()
    }
    sealed class ActionSelect: InitialEventsIntent()
    {
        object Delete: ActionSelect()
        object Attach: ActionSelect()
        object DeAttach: ActionSelect()
        object Group: ActionSelect()
        object UnGroup: ActionSelect()
        object Duplicate: ActionSelect()
    }
    data class ShapeSelect(val shapeName:String):
        InitialEventsIntent()
}
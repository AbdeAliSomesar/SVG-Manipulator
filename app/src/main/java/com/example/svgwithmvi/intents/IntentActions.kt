package com.example.svgwithmvi.intents

sealed class IntentActions {
    data class ShapeSelect(val shapeName: String?) : IntentActions()
    data class Drag(
        val x1: Float,
        val y1: Float,
        val x2: Float,
        val y2: Float,
        val distanceX: Float,
        val distanceY: Float
    ) : IntentActions()
    object OnActionUp: IntentActions()
    data class onDown(val x:Float,val y:Float):
        IntentActions()
    data class SingleTap(val x: Float, val y: Float) : IntentActions()
    data class DoubleTap(val x: Float, val y: Float) : IntentActions()
    sealed class Zoom: IntentActions()
    {
        data class UpdateHeight(val scaleFactor:Float,val isLocked:Boolean):
            Zoom()
        data class UpdateWidth(val scaleFactor:Float):
            Zoom()
    }
    sealed class ActionSelect: IntentActions() {
        object Attach : ActionSelect()
        object DeAttach : ActionSelect()
        object Group : ActionSelect()
        object UnGroup : ActionSelect()
        object Duplicate : ActionSelect()
        object Delete: ActionSelect()
    }

}
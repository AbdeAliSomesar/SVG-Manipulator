package com.example.svgwithmvi.intents

import android.view.MotionEvent

sealed class SVGIntents {
    object InitialIntent : SVGIntents()
    data class FragmentSelected(var FragmentId:Int)
    data class MainSingleTouch(var event: MotionEvent) : SVGIntents()
    data class MainMultiTouch(var event: MotionEvent) : SVGIntents()
    data class ActionSelected(var actionId: Int) : SVGIntents()
    data class ImageSelected(var imageId: Int)
}
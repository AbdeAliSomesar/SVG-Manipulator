package com.example.svgwithmvi.intents

import android.graphics.Bitmap

sealed class IntentActionResult {
    data class ImageBitmap(val bitmap: Bitmap): IntentActionResult()
    data class Failure(val msg:String): IntentActionResult()
}
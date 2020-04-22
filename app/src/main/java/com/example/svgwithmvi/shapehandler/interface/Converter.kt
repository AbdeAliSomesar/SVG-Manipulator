package com.example.testproject.shapehandler

import android.graphics.Bitmap

interface Converter {
    fun convertToBitmap(svg:String):Bitmap
    fun getBitmapHeight():Int
    fun getBitmapWidth():Int
}
package com.example.svgwithmvi.shapehandler.svg

import android.graphics.Bitmap
import android.graphics.Canvas
import android.util.Log
import com.caverock.androidsvg.SVG
import com.example.testproject.shapehandler.Converter

class SVGConverter(private val bitmapWidth:Int,private val bitmapHeight:Int):Converter {
    override fun convertToBitmap(svg: String): Bitmap {

        val bitmap:Bitmap = Bitmap.createBitmap(bitmapWidth,bitmapHeight,Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        try {
            val svg: SVG = SVG.getFromString(svg)
            if (svg.documentWidth != -1f) {
                canvas.drawARGB(0, 0, 0, 0)
                svg.renderToCanvas(canvas)
            }
            svg
        } catch (e: Exception) {
            Log.d("MySvgConverter", "svg not supported")
        }
        // }

        return bitmap
    }

    override fun getBitmapHeight(): Int {
        return bitmapHeight
    }

    override fun getBitmapWidth(): Int {
        return bitmapWidth
    }
}
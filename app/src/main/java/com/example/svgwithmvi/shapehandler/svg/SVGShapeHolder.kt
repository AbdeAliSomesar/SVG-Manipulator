package com.example.svgwithmvi.shapehandler.svg

import android.graphics.Bitmap
import com.example.svgdemo.shapehandler.Shape
import com.example.testproject.shapehandler.Converter
import com.example.testproject.shapehandler.ShapeHolder
import java.util.concurrent.atomic.AtomicBoolean
import javax.inject.Inject

class SVGShapeHolder @Inject constructor(var converter: Converter) : ShapeHolder {


    private var SVGShape: Shape? = null
    private var bitmap: Bitmap = Bitmap.createBitmap(
        converter.getBitmapWidth(),
        converter.getBitmapHeight(),
        Bitmap.Config.ARGB_8888
    )
    private var minMax: Array<Float> = arrayOf(
        Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE,
        Float.MIN_VALUE
    )

    var locked = AtomicBoolean(false)


    private val mainTag = "<svg height = \"height?\" width = \"width?\"> body?</svg>"

    override fun addShape(shape: Shape) {
        this.SVGShape?.addShape(shape, 1) ?: kotlin.run {
            this.SVGShape = shape
        }
        minMax = arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
        shape.getMinMax(minMax)
        updateBitmap()
    }

    override fun updateLockStatus(status: Boolean) {
        this.locked.set(status)
    }

    override fun updateHeightBy(percent: Float) {
        //  if(minMax[1] - percent >0)
        // {
        if (percent != 0f) {
            SVGShape?.updateHeightBy(percent, 0f)
            minMax = arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
            getMinMax()

            if (locked.get()) {
                SVGShape?.updateWidthBy(percent, 0f)
                minMax = arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
                getMinMax()
            }
        }
    }

    override fun updateWidthBy(percent: Float) {

        if (percent != 0f) {
            SVGShape?.updateWidthBy(percent, 0f)
            minMax = arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
            getMinMax()

            if (locked.get()) {
                SVGShape?.updateHeightBy(percent, 0f)
                minMax = arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
                getMinMax()
            }
        }
    }

    override fun getBitmap(): Bitmap {
        return bitmap
    }

    private fun updateBitmap() {
        SVGShape?.let { bitmap = converter.convertToBitmap(getSvgBody()) }
    }

    override fun getMinMax(): Array<Float> {
        minMax = arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
        SVGShape?.getMinMax(minMax)
        return minMax
    }

    override fun moveShape(x: Float, y: Float) {
        SVGShape?.moveShape(x, y)
        minMax = arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
        SVGShape?.getMinMax(this.minMax)
        updateBitmap()
    }

    override fun rearrangeShape(oldId: Int, newId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getShape(id: Int): Shape? {
        TODO("not implemented")//return SVGShape?.let
    }

    override fun updateRotation(degree: Int) {
        SVGShape?.let {
            it.updateRotation(degree)
            updateBitmap()
        }
    }

    override fun getSvgBody(): String {
        val finalTag = mainTag.replaceFirst("height?", "" + (minMax[3] + 100))
            .replaceFirst("width?", "" + (minMax[2] + 100))
        return finalTag.replaceFirst("body?", SVGShape?.getShapeSvg() ?: "")
    }

    override fun isEmpty(): Boolean {
        if (SVGShape == null)
            return true
        return false
    }

    override fun removeConstantFromHeight(diff: Float) {
        if (diff != 0f)
            SVGShape?.removeConstantFromHeight(diff)
        updateBitmap()
    }

    override fun removeConstantFromWidth(diff: Float) {
        if (diff != 0f)
            SVGShape?.removeConstantFromWidth(diff)
        updateBitmap()
    }
}
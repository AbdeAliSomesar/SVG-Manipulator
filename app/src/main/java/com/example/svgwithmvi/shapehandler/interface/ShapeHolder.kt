package com.example.testproject.shapehandler

import android.graphics.Bitmap
import com.example.svgdemo.shapehandler.Shape

interface ShapeHolder {
    fun addShape(shape: Shape)
    fun updateHeightBy(percent:Float)
    fun updateWidthBy(percent:Float)
    fun updateLockStatus(status:Boolean)
    fun getBitmap():Bitmap
    fun getMinMax():Array<Float>
    fun moveShape(x:Float,y:Float)
    fun rearrangeShape(oldId :Int,newId:Int)
    fun getShape(id: Int):Shape?
   // fun updateSvgAttribute(attributeName:String,attributeVlaue:Float)
   // fun addAttribute(attribute:String)
    fun updateRotation(degree: Int)
    fun getSvgBody():String
    fun isEmpty():Boolean
    fun removeConstantFromHeight(diff:Float)
    fun removeConstantFromWidth(diff:Float)
}
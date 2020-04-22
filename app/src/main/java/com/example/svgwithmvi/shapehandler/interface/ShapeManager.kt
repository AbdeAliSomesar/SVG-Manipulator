package com.example.testproject.shapehandler

import android.graphics.Bitmap
import com.example.svgdemo.shapehandler.Shape

interface ShapeManager {
    fun getBitmap():Bitmap
    fun selectShapes(x1:Float,y1:Float,x2:Float,y2:Float):Array<Float>?
    fun selectShape(x: Float, y: Float):Array<Float>?
    fun getSelectedArea():Array<Float>?
    fun isShapeSelected():Boolean
  //  fun clickOnSelected(x:Float,y: Float):Boolean
    fun moveSelected(x:Float,y:Float)
    fun deleteSelected()
    fun rotateSelected(degree:Int)
    fun addNewShape(shape: Shape)
    fun groupSelected()
    fun unGroupSelected()
    fun attachSelected()
    fun deAttachSelected()
    fun duplicateSelected()
    fun updateHeightOfSelectedBy(percent:Float)
    fun updateWidthOfSelectedBy(percent:Float)
    fun generateFromString(string: String)
    fun createBasicShape(shapeName:String)


}
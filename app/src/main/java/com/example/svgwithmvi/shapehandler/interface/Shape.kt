package com.example.svgdemo.shapehandler

import com.example.svgwithmvi.shapehandler.svg.SVGSharedData

interface Shape {

    fun addShape(shape:Shape,id:Int)
    fun getShapeId():Int

    fun removeShape(id:Int)
    fun getShape():Shape?
    fun updateHeightBy(height:Float,def:Float)
    fun updateWidthBy(width:Float,def:Float)
    fun rearrangeId(id:Int)
    fun updateRotation(value: Int)
  //  fun updateSvgAttribute(attributeName:String,attributeValue:Float)
    //fun addAttribute(attribute:String)
    fun getMinMax(minMax:Array<Float>)
    fun getShapeSvg():String
    fun moveShape(x:Float,y:Float)
    fun addConstant(minX:Float,minY:Float)
    fun getShapeData(svgSharedDataList: MutableList<SVGSharedData>):MutableList<SVGSharedData>
 /*   fun updatecenterx(i:Float)

    fun updatecentery(i:Float)
*/
    fun removeConstantFromHeight(diff:Float)
    fun removeConstantFromWidth(diff:Float)
}
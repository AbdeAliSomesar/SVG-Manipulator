package com.example.svgwithmvi.shapehandler.baseshape

import com.example.svgdemo.shapehandler.Shape
import com.example.svgwithmvi.shapehandler.SVG.SVGSharedData

class Ellipse(private var radiusX: Float,
              private var radiusY: Float,
              var centerX: Float,
              var centerY: Float,
              private var svgAttributes: String?) : Shape {
    override fun removeConstantFromHeight(diff: Float) {
        centerY -= diff
        myShape?.removeConstantFromHeight(diff)
    }

    override fun removeConstantFromWidth(diff: Float) {
        centerX -= diff
        myShape?.removeConstantFromWidth(diff)
    }

    var myShape: Shape? = null
    private var id: Int = 0

    //Data related to ellipse SVG tag
    private val mainTag: String =
        "<svg height = \"height?\" width = \"width?\" > body? </svg>"
    private val ellipseTag = "<ellipse cx = \"cx?\" cy = \"cy?\" rx=\"rx?\" ry=\"ry?\"  r = \"r?\"at? />"
    private var svgFile: String = ""   //final shape
    private var body: String = ""

    var constantX:Float = 0f
    var constantY:Float = 0f

    override fun addShape(shape: Shape, id:Int) {
        myShape?.addShape(shape,this.id+1) ?: kotlin.run {
            myShape = shape
            this.id = id
            //shape.addConstant(this.minX, this.minY)
        }
    }

    override fun getShapeId(): Int {
        return id
    }

    override fun removeShape(id: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getShape(): Shape? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateHeightBy(height: Float,def:Float) {

        radiusY *= height
        centerY *= height
            myShape?.updateHeightBy(height, def)

    }

    override fun updateWidthBy(width: Float,def:Float) {

        radiusX *= width
        centerX *= width
        myShape?.updateWidthBy(width, def)

    }

    override fun rearrangeId(id: Int) {
        this.id = id
        myShape?.rearrangeId(this.id + 1)
    }

    override fun updateRotation(value: Int) {
       //do nothing
    }

    override fun getMinMax(minMax: Array<Float>) {


        val minX: Float = centerX - radiusX
        val minY: Float = centerY - radiusY
        val maxX: Float = centerX + radiusX
        val maxY: Float = centerY + radiusY

        if (minMax[0] > minX)
            minMax[0] = minX

        if (minMax[1] > minY)
            minMax[1] = minY

        if (minMax[2] < maxX)
            minMax[2] = maxX

        if (minMax[3] < maxY)
            minMax[3] = maxY

        myShape?.getMinMax(minMax)
    }
    override fun getShapeSvg():String
    {
        updateSvgFile()

        myShape?.let {
            return svgFile + "<!-- -->" + (myShape?.getShapeSvg() ?: "")
        } ?: kotlin.run { return svgFile }
    }
    override fun getShapeData(svgSharedDataList:MutableList<SVGSharedData>): MutableList<SVGSharedData> {
        myShape?.let {
            myShape?.getShapeData(svgSharedDataList)
        }
        svgSharedDataList.add(SVGSharedData.EllipseData(radiusX,radiusY,centerX,centerY,svgAttributes))
        return svgSharedDataList
    }

    override fun moveShape(x: Float, y: Float) {

        centerX += x
        centerY += y

        updateBody()
        myShape?.moveShape(x, y)
    }

    override fun addConstant(minX: Float, minY: Float) {

        constantX = minX - centerX - radiusX
        constantY = minY - centerY - radiusY
    }


    private fun updateBody() {

        body = ellipseTag

        body = body.replaceFirst("cx?",(""+centerX))
            .replaceFirst("cy?",""+centerY)
            .replaceFirst("rx?",""+radiusX)
            .replaceFirst("ry?",""+radiusY)
    }


    private fun updateSvgFile() {
        updateBody()

        svgFile = mainTag.replaceFirst("height?", "" + (((centerY + radiusY)) + 20))  //height = maxY - minY
            .replaceFirst("width?", "" + (((centerX + radiusX)) + 20))
        svgFile = svgFile.replaceFirst("body?", body)
        svgFile = svgFile.replaceFirst("at?", svgAttributes ?: "")
        //Log.d("SVGString = ", svgFile)
    }
}
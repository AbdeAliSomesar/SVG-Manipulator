package com.example.svgwithmvi.shapehandler.svg

import com.example.svgdemo.shapehandler.Shape
import javax.inject.Inject
import kotlin.math.max
import kotlin.math.min

class PathShape @Inject constructor(
    private var moves: Array<Float>,
    private var xCoordinates: Array<Float>,
    private var yCoordinates: Array<Float>,
    private var pathTag: String,
    private var svgAttributes: String?
) : Shape {

    var myShape: Shape? = null
    private var id: Int = 1
    private var constantX: Float = 0f
    private var constantY: Float = 0f

    var minX: Float = Float.MAX_VALUE
    var minY: Float = Float.MAX_VALUE
    var maxX: Float = Float.MIN_VALUE
    var maxY: Float = Float.MIN_VALUE

    private val mainTag: String =
        "<svg height = \"height?\" width = \"width?\" > body? </svg>"
    private var svgFile: String = ""
    private var body: String = ""

    init {
        for ((index, value) in moves.withIndex()) {
            if (index % 2 == 0) {
                if(value < minX)
                    minX = value
                else if(value > maxX)
                    maxX = value
            }
            else
                if(value < minY)
                    minY = value
                else if(value > maxY)
                    maxY = value
        }
        for(value in xCoordinates)
        {
            if(value < minX)
                minX = value
            else if(value > maxX)
                maxX = value
        }
        for(value in yCoordinates)
        {
            if(value < minY)
                minY = value
            else if(value > maxY)
                maxY = value
        }
        updateBody()
        updateSvgFile()
    }

    override fun removeConstantFromHeight(diff: Float) {

        for(index in moves.indices)
        {
            if(index % 2 != 0)
            {
                moves[index] -= diff
            }
        }
        for(index in yCoordinates.indices)
        {
            yCoordinates[index] -= diff
        }
        minY -= diff
        maxY -= diff
        myShape?.removeConstantFromHeight(diff)
    }

    override fun removeConstantFromWidth(diff: Float) {
        for(index in moves.indices)
        {
            if(index % 2 == 0)
            {
                moves[index] -= diff
            }
        }
        for(index in xCoordinates.indices)
        {
            xCoordinates[index] -= diff
        }
        minX-=diff
        maxX-=diff
        myShape?.removeConstantFromWidth(diff)
    }

    override fun addShape(shape: Shape, id:Int) {
        myShape?.addShape(shape,id+1) ?: kotlin.run {
            myShape = shape
            this.id = 1
           // shape.addConstant(this.minX, this.minY)
        }
    }


    override fun removeShape(id: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getShape(): Shape? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getShapeId(): Int {
        return this.id
    }

    override fun updateHeightBy(height: Float,def:Float) {//change value to height after testing

        for(index in moves.indices)
        {
            if(index % 2 != 0)
            {
                moves[index] *= height
            }
        }
        for(i in 0 until yCoordinates.size)
        {
            yCoordinates[i] *= height
        }
        minY *= height
        maxY *= height
        myShape?.updateHeightBy(height,def)


    }

    override fun updateWidthBy(width: Float,def:Float) {
        for(index in moves.indices)
        {
            if(index % 2 == 0)
            {
                moves[index] *= width
            }
        }
        for(i in 0 until xCoordinates.size)
        {
            xCoordinates[i] *= width
        }
        minX *= width
        maxX *= width
        myShape?.updateWidthBy(width,def)

    }
    override fun rearrangeId(id: Int) {
        myShape?.let {
            this.id = id
            myShape?.rearrangeId(id + 1)
        }
    }

    override fun updateRotation(value: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMinMax(minMax: Array<Float>) {
        minMax[0] = min(minMax[0],minX)
        minMax[1] = min(minMax[1],minY)
        minMax[2] = max(minMax[2],maxX)
        minMax[3] = max(minMax[3],maxY)


        myShape?.getMinMax(minMax)
    }

    override fun getShapeSvg(): String {
        updateSvgFile()

        myShape?.let {
            return svgFile + "<!-- -->" + (myShape?.getShapeSvg() ?: "")
        } ?: kotlin.run { return svgFile }

    }
    override fun getShapeData(svgSharedDataList: MutableList<SVGSharedData>): MutableList<SVGSharedData> {

        myShape?.let {
            myShape?.getShapeData(svgSharedDataList)
        }
        svgSharedDataList.add(
            SVGSharedData.PathData(
                moves,
                xCoordinates,
                yCoordinates,
                pathTag,
                svgAttributes
            )
        )
        return svgSharedDataList

    }
    override fun moveShape(x: Float, y: Float) {
        minX += x
        minY += y
        maxX += x
        maxY += y

        for(index in moves.indices)
        {
            if(index % 2 == 0)
                moves[index] += x
            else
                moves[index] += y
        }
        for(index in xCoordinates.indices)
            xCoordinates[index] += x
        for(index in yCoordinates.indices)
            yCoordinates[index] += y

        myShape?.moveShape(x, y)
    }

    override fun addConstant(minX: Float, minY: Float) {
        constantX = minX - this.minX
        constantY = minY - this.minY
    }


    private fun updateBody() {
        body = pathTag
        for (v in moves) {
            body = body.replaceFirst("mxy?", "" + v)
        }
        for (v in xCoordinates) {
            body = body.replaceFirst("cx?", "" + v)
        }
        for (v in yCoordinates) {
            body = body.replaceFirst("cy?", "" + v)
        }

    }

    private fun updateSvgFile() {
        updateBody()

        svgFile = mainTag.replaceFirst("height?", "" + (maxY + 20))
            .replaceFirst("width?", "" + (maxX + 20))
        svgFile = svgFile.replaceFirst("body?", body)
        svgFile = svgFile.replaceFirst("at?", svgAttributes ?: "")

    }
}
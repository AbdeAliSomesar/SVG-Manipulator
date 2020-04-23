package com.example.svgwithmvi.shapehandler.svg


import com.example.svgdemo.shapehandler.Shape
import com.example.testproject.shapehandler.ShapeGenerator
import javax.inject.Inject

class SVGShapeGenerator@Inject constructor():ShapeGenerator {
    override fun generateShape(svg: String): Shape? {

        var svgShape1: Shape = PathShape(
            arrayOf(220f, 220f),
            arrayOf(320f, 220f), arrayOf(320f, 220f),
            "<path stroke = \"red\" fill =\"green\" stroke-width = \"2\" d=\"Mmxy? mxy? Hcx? Vcy? Hcx? Vcy?\"/>",
            ""
        )//.addShape(
        var svgShape2 = PathShape(
            arrayOf(120f, 120f),
            arrayOf(220f, 120f), arrayOf(220f, 120f),
            "<path stroke = \"blue\" fill=\"yellow\"stroke-width = \"2\" d=\"Mmxy? mxy? Hcx? Vcy? Hcx? Vcy?\"/>",
            ""
        )
        svgShape1.addShape(svgShape2,2)

        return svgShape1
    }
}
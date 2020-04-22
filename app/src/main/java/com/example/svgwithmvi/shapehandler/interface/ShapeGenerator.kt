package com.example.testproject.shapehandler

import com.example.svgdemo.shapehandler.Shape

interface ShapeGenerator {
    fun generateShape(svg:String): Shape?
}
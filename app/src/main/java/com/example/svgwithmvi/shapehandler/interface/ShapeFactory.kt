package com.example.svgwithmvi.shapehandler

import com.example.svgdemo.shapehandler.Shape

interface ShapeFactory {
    fun getShape(shapeName: String):Shape?
}
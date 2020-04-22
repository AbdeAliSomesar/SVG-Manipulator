package com.example.svgwithmvi.daggerdependencies

import com.example.svgwithmvi.shapehandler.SVG.SVGShapeHolder
import com.example.testproject.shapehandler.Converter
import com.example.testproject.shapehandler.ShapeHolder
import dagger.Module
import dagger.Provides

@Module
class SVGShapeHolderModule(private val converter: Converter) {

    @Provides
    fun provideSVGShapeHolder():ShapeHolder
    {
        return SVGShapeHolder(converter)
    }
}
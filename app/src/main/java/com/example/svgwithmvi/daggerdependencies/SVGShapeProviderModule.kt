package com.example.svgwithmvi.daggerdependencies

import com.example.svgwithmvi.shapehandler.SVG.SVGShapeGenerator
import com.example.svgwithmvi.shapehandler.SVG.SVGShapeManager
import com.example.testproject.shapehandler.ShapeGenerator
import com.example.testproject.shapehandler.ShapeManager
import dagger.Binds
import dagger.Module

@Module
abstract class SVGShapeProviderModule {

    @Binds
    abstract fun bindsSVGShapeGenerator(shapeGenerator: SVGShapeGenerator):ShapeGenerator
    @Binds
    abstract fun shapeProvider(shapeProvider: SVGShapeManager):ShapeManager

}
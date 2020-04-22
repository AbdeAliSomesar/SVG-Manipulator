package com.example.svgwithmvi.daggerdependencies

import com.example.svgwithmvi.shapehandler.ShapeFactory
import com.example.testproject.shapehandler.ShapeHolder
import dagger.Component

@Component(modules = [SVGShapeHolderModule::class,BaseShapeFactoryModule::class])
interface SVGShapeHolderComponent {
    fun getSVGShapeHolder():ShapeHolder
    fun getBasicShapeFactory(): ShapeFactory
}
package com.example.svgwithmvi.daggerdependencies

import com.example.svgwithmvi.model.SVGModel
import com.example.testproject.shapehandler.ShapeManager
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [SVGShapeProviderModule::class,SVGConverterModule::class])
interface SVGComponent{
    fun getShapeProvider(): ShapeManager
    fun getSVGModul(): SVGModel
}
package com.example.svgwithmvi.daggerdependencies

import com.example.svgwithmvi.shapehandler.SVG.BaseShapeFactory
import com.example.svgwithmvi.shapehandler.ShapeFactory
import dagger.Binds
import dagger.Module

@Module
abstract class BaseShapeFactoryModule {
    @Binds
    abstract fun bindBaseShapeFactory(baseShapeFacroty: BaseShapeFactory):ShapeFactory
}
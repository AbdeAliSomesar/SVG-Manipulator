package com.example.svgwithmvi.daggerdependencies

import com.example.svgwithmvi.shapehandler.svg.SVGConverter
import com.example.testproject.shapehandler.Converter
import dagger.Module
import dagger.Provides


@Module
class SVGConverterModule(private val width:Int, private val height:Int){

    @Provides
    fun provideSVGConverter():Converter
    {
        return SVGConverter(width, height)
    }
}
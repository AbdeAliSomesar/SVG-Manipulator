package com.example.svgwithmvi.shapehandler.svg

import com.example.svgdemo.shapehandler.Shape
import com.example.svgwithmvi.shapehandler.ShapeFactory
import com.example.svgwithmvi.shapehandler.baseshape.Ellipse
import java.util.*
import javax.inject.Inject

class BaseShapeFactory @Inject constructor(): ShapeFactory {
    override fun getShape(
        shapeName: String
    ): Shape? {

        return when(shapeName.trim().toLowerCase(Locale.ROOT))
        {
            "circle" -> {
                val shape = Ellipse(50f,50f,100f,100f,"fill = \"blue\"")
                   /* shape.addShape(
                        Ellipse(50f,50f,170f,170f,"fill = \"green\"")
                    ,1)
                shape.addShape(Ellipse(50f,50f,120f,100f,"fill = \"red\"")
                    ,2)
                *//*shape.addShape(PathShape(arrayOf(220f,220f),
                    arrayOf(320f,220f), arrayOf(320f,220f),
                    "<path stroke = \"red\" fill =\"green\" stroke-width = \"2\" d=\"Mmxy? mxy? Hcx? Vcy? Hcx? Vcy?\"/>",
                    ""),3)*//*
                shape.rearrangeId(1)*/
                shape
            }
            "rectangle" ->{
                val shape = PathShape(
                    arrayOf(20f, 20f),
                    arrayOf(120f, 20f), arrayOf(120f, 20f),
                    "<path stroke = \"red\" fill =\"green\" stroke-width = \"2\" d=\"Mmxy? mxy? Hcx? Vcy? Hcx? Vcy?\"/>",
                    ""
                )/*
                shape.addShape(
                    PathShape(
                        arrayOf(220f, 220f),
                        arrayOf(320f, 220f), arrayOf(320f, 220f),
                        "<path stroke = \"red\" fill =\"green\" stroke-width = \"2\" d=\"Mmxy? mxy? Hcx? Vcy? Hcx? Vcy?\"/>",
                        ""
                    ),2)
                shape.addShape(
                    PathShape(
                        arrayOf(110f, 110f),
                        arrayOf(150f, 110f), arrayOf(150f, 110f),
                        "<path stroke = \"red\" fill =\"green\" stroke-width = \"2\" d=\"Mmxy? mxy? Hcx? Vcy? Hcx? Vcy?\"/>",
                        ""
                    ),2)*/
                shape
            }
            "rectangle2" ->{
                val shape = PathShape(
                    arrayOf(120f, 120f),
                    arrayOf(220f, 120f), arrayOf(220f, 120f),
                    "<path stroke = \"red\" fill =\"green\" stroke-width = \"2\" d=\"Mmxy? mxy? Hcx? Vcy? Hcx? Vcy?\"/>",
                    ""
                )
                shape
            }
            "rectangle3" ->{
                val shape = PathShape(
                    arrayOf(10f, 10f),
                    arrayOf(20f, 10f), arrayOf(20f, 10f),
                    "<path stroke = \"red\" fill =\"green\" stroke-width = \"2\" d=\"Mmxy? mxy? Hcx? Vcy? Hcx? Vcy?\"/>",
                    ""
                )
                shape
            }
            "triangle" ->{
                val shape = PathShape(arrayOf(100f,0f), arrayOf(140f,50f,100f), arrayOf(100f,0f),"<path stroke-width = \"1\" fill = \"green\" d = \"Mmxy? mxy? Lcx? cy? Hcx? Lcx? cy?\"/> ","")
                shape
            }
            else -> null
        }

    }
}
//<path stroke = "black"sroke-width = "1" fill = "green"d = "M50 0 L70 50 H25 L50 0" />
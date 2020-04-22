package com.example.svgwithmvi.shapehandler.SVG

import android.graphics.Bitmap
import android.graphics.Canvas
import com.example.svgdemo.shapehandler.Shape
import com.example.svgwithmvi.daggerdependencies.DaggerSVGShapeHolderComponent
import com.example.svgwithmvi.daggerdependencies.SVGShapeHolderComponent
import com.example.svgwithmvi.daggerdependencies.SVGShapeHolderModule
import com.example.testproject.shapehandler.Converter
import com.example.testproject.shapehandler.ShapeGenerator
import com.example.testproject.shapehandler.ShapeManager
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.max
import kotlin.math.min

@Singleton
class SVGShapeManager @Inject constructor(private val shapeGenerator: ShapeGenerator, private val converter: Converter):ShapeManager {



    private var shapeHolders:ArrayList<ShapeHolderContainer> = ArrayList()
    private var selectedShapeHolders:ArrayList<ShapeHolderContainer> = ArrayList()
    private var defaultBitmap:Bitmap = Bitmap.createBitmap(converter.getBitmapWidth(),converter.getBitmapHeight(), Bitmap.Config.ARGB_8888)
    private var bitmap:Bitmap? = null
    private val shapeHolderDaggerComponent: SVGShapeHolderComponent = DaggerSVGShapeHolderComponent.builder().sVGShapeHolderModule(
        SVGShapeHolderModule(converter)
    ).build()
    private val baseShapeFactory = shapeHolderDaggerComponent.getBasicShapeFactory()

   // private var selectedArea:Array<Float>? = arrayOf()

    override fun getBitmap(): Bitmap {
reCreateBitmap()
        return Bitmap.createBitmap(bitmap?:this.defaultBitmap)

    }
    override fun addNewShape(shape: Shape) {
        var shapeHolder = SVGShapeHolder(converter)
        shapeHolder.addShape(shape)
        //New shape supposed insert at first position to maintain the top order of shapes
        shapeHolders.add(0,
            ShapeHolderContainer(shapeHolder)
        )
        reCreateBitmap()
    }
    override fun selectShapes(minX: Float, minY: Float, maxX: Float, maxY: Float):Array<Float>? {
        val minMax:Array<Float> = arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
        var minMax2:Array<Float>
        selectedShapeHolders.clear()
        for (shapeHolderContainer in shapeHolders) {
            //if (!shapeHolder.isEmpty()) {
            minMax2 = arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
            shapeHolderContainer.findMinMax(minMax2)
            if(minMax2[0]!=Float.MAX_VALUE) {
                if (compareMinMax(minMax2, minX, minY, maxX, maxY)) {
                    selectedShapeHolders.add(shapeHolderContainer)
                    updateMinMax(minMax, minMax2)
                }
            }
           // }
        }
        if(minMax[0]!= Float.MAX_VALUE)
            return minMax
        return null

    }
    override fun selectShape(x: Float, y: Float):Array<Float>? {
        //To remove previously selected shapes
        selectedShapeHolders.clear()
        var minMax:Array<Float>

        //Reverse to maintain the order of shapes in selection
        for (shapeHolderContainer in shapeHolders.asReversed()) {
            minMax = arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
            shapeHolderContainer.findMinMax(minMax)
            //Container may have null ShapeHolder
            if(minMax[0] != Float.MAX_VALUE){
                if (compareMinMax(minMax, x, y)) {
                            selectedShapeHolders.add(shapeHolderContainer)
                            return minMax
                        }
            }
        }
        return null
    }
    override fun getSelectedArea():Array<Float>?
    {

        if (selectedShapeHolders.size > 0) {
            val minMax: Array<Float> =
                arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
            var minMax2: Array<Float>
            for (shapeHolderContainer in selectedShapeHolders) {
                //  if (!shapeHolder.isEmpty()) {
                minMax2 =
                    arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
                shapeHolderContainer.findMinMax(minMax2)
                updateMinMax(minMax, minMax2)
            }
            return if(minMax[0]!= Float.MAX_VALUE) minMax else null
        }
        return null
    }
    override fun isShapeSelected():Boolean
    {
        if(selectedShapeHolders.size>0)
            return true
        return false
    }


    private fun compareMinMax(minMax:Array<Float>,x:Float,y:Float):Boolean
    {
        if((minMax[0]<= x && minMax[2]>=x)&&(minMax[1]<= y && minMax[3]>=y))
            return true
        return false
    }
    private fun compareMinMax(minMax:Array<Float>,minX:Float, minY:Float, maxX: Float, maxY: Float):Boolean
    {
        if(minMax[0] in minX..maxX && minMax[1] in minY..maxY)
            return true
        if(minMax[2] in minX..maxX && minMax[3] in minY..maxY)
            return true

        return false
    }

    override fun moveSelected(x: Float, y: Float) {
        for(shapeHolderContainers in selectedShapeHolders)
        {
            for(shapeHolderContainer in shapeHolderContainers.secondaryList)
            {
                shapeHolderContainer.shapeHolder?.moveShape(x, y)
            }
           // shapeHolderContainer.shapeHolder.moveShape(x,y)

        }
        reCreateBitmap()
    }



    override fun rotateSelected(degree: Int) {
        for(shapeHolderContainers in selectedShapeHolders)
        {
            for(shapeHolderContainer in shapeHolderContainers.secondaryList)
            {
                shapeHolderContainer.shapeHolder?.updateRotation(degree)
            }

        }
        reCreateBitmap()
    }
    override fun updateHeightOfSelectedBy(percent: Float) {
        if(selectedShapeHolders.size > 0) {
            val minYList1 = mutableListOf<Float>()
            val minYList2 = mutableListOf<Float>()
            var minMax: Array<Float>
            for (shapeHolderContainers in selectedShapeHolders) {
                for (shapeHolderContainer in shapeHolderContainers.secondaryList) {
                    minMax =
                        arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
                    shapeHolderContainer.findMinMax(minMax)
                    if (minMax[1] != Float.MAX_VALUE) {
                        minYList1.add(minMax[1])
                        shapeHolderContainer.shapeHolder?.updateHeightBy(percent)
                        minMax = arrayOf(
                            Float.MAX_VALUE,
                            Float.MAX_VALUE,
                            Float.MIN_VALUE,
                            Float.MIN_VALUE
                        )
                        shapeHolderContainer.findMinMax(minMax)
                        minYList2.add(minMax[1])
                    }
                }

            }

            if(minYList1.size > 0) {
                var minY1 = minYList1[0]
                var minY2 = minYList2[0]
                for (value in minYList1) {
                    minY1 = min(minY1, value)
                }

                for (value in minYList2) {
                    minY2 = min(minY2, value)
                }
               // if(minY2 - minY1 != 0f) {
                    for (shapeHolderContainers in selectedShapeHolders) {
                        for (shapeHolderContainer in shapeHolderContainers.secondaryList) {
                            shapeHolderContainer.shapeHolder?.removeConstantFromHeight(minY2 - minY1)
                        }
                    }
               // }
            }

            reCreateBitmap()
        }
    }

    override fun updateWidthOfSelectedBy(percent: Float) {
        if(selectedShapeHolders.size > 0) {
            val minXList1 = mutableListOf<Float>()
            val minXList2 = mutableListOf<Float>()
            var minMax: Array<Float>
            for (shapeHolderContainers in selectedShapeHolders) {
                for (shapeHolderContainer in shapeHolderContainers.secondaryList) {
                    minMax =
                        arrayOf(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE)
                    shapeHolderContainer.findMinMax(minMax)
                    if (minMax[0] != Float.MAX_VALUE) {
                        minXList1.add(minMax[0])
                        shapeHolderContainer.shapeHolder?.updateWidthBy(percent)
                        minMax = arrayOf(
                            Float.MAX_VALUE,
                            Float.MAX_VALUE,
                            Float.MIN_VALUE,
                            Float.MIN_VALUE
                        )
                        shapeHolderContainer.findMinMax(minMax)
                        minXList2.add(minMax[0])
                    }
                }


            }
            if(minXList1.size > 0) {
                var minX1 = minXList1[0]
                var minX2 = minXList2[0]
                for (value in minXList1) {
                    minX1 = min(minX1, value)
                }

                for (value in minXList2) {
                    minX2 = min(minX2, value)
                }
              //  if((minX2 - minX1) != 0f) {
                    for (shapeHolderContainers in selectedShapeHolders) {
                        for (shapeHolderContainer in shapeHolderContainers.secondaryList) {
                            shapeHolderContainer.shapeHolder?.removeConstantFromWidth(minX2 - minX1)
                        }

                    }
              //  }
            }

            reCreateBitmap()
        }
    }

    override fun deleteSelected() {
        if(selectedShapeHolders.size > 0) {
            for (shapeHolder in selectedShapeHolders) {
                shapeHolders.remove(shapeHolder)
            }
            selectedShapeHolders.clear()
            reCreateBitmap()
        }
    }
    override fun groupSelected() {
        if(selectedShapeHolders.size > 1 )
        {
            val position = shapeHolders.indexOf(selectedShapeHolders[0])

            if(selectedShapeHolders[0].actionType == ShapeHolderContainer.ActionType.NONE)
            {
                for(index in 1 until selectedShapeHolders.size)
                {

                    shapeHolders[position].addShapeHolders(selectedShapeHolders[index],
                        ShapeHolderContainer.ActionType.GROUP
                    )
                    shapeHolders.remove(selectedShapeHolders[index])
                }

            }
            else
            {
                shapeHolders.add(position,
                    ShapeHolderContainer(null)
                )

                shapeHolders.removeAt(position+1)
                for(shapeHolder in selectedShapeHolders)
                {
                    shapeHolders[position].addShapeHolders(shapeHolder ,
                        ShapeHolderContainer.ActionType.GROUP
                    )
                    shapeHolders.remove(shapeHolder)
                }
            }
            selectedShapeHolders.clear()
            selectedShapeHolders.add(shapeHolders[position])
        }
    }
    override fun unGroupSelected() {
        if (selectedShapeHolders.size == 1) {
            if(selectedShapeHolders[0].actionType == ShapeHolderContainer.ActionType.GROUP) {
                val position = shapeHolders.indexOf(selectedShapeHolders[0])

                shapeHolders[position].shapeHolder?.let {
                    for((index,shapeHolder) in shapeHolders[position].pairedShapeHolders.asReversed().withIndex())
                    {
                        shapeHolders.add(position + index + 1, shapeHolder)
                        selectedShapeHolders.add(shapeHolder)
                    }
                    shapeHolders[position].resetPaired()


                }?:run{
                    selectedShapeHolders.clear()
                    for(shapeHolder in shapeHolders[0].pairedShapeHolders.asReversed())
                    {
                        selectedShapeHolders.add(shapeHolder)
                    }
                    shapeHolders.removeAt(position)
                    shapeHolders.addAll(position,selectedShapeHolders)
                }
            }
        }

    }

    override fun attachSelected() {
        coupleSelectedShapes(ShapeHolderContainer.ActionType.ATTACH)
    }

    override fun deAttachSelected() {
        decoupleSelectedShapes(ShapeHolderContainer.ActionType.ATTACH)
    }
    private fun coupleSelectedShapes(actionType: ShapeHolderContainer.ActionType)
    {
        if(selectedShapeHolders.size > 1 )
        {
            val position = shapeHolders.indexOf(selectedShapeHolders[0])

            if(selectedShapeHolders[0].actionType == ShapeHolderContainer.ActionType.NONE)
            {
                for(index in 1 until selectedShapeHolders.size)
                {

                    shapeHolders[position].addShapeHolders(selectedShapeHolders[index],actionType)
                    shapeHolders.remove(selectedShapeHolders[index])
                }

            }
            else
            {
                shapeHolders.add(position,
                    ShapeHolderContainer(null)
                )

                shapeHolders.removeAt(position+1)
                for(shapeHolder in selectedShapeHolders)
                {
                    shapeHolders[position].addShapeHolders(shapeHolder ,actionType)
                    shapeHolders.remove(shapeHolder)
                }
            }
            selectedShapeHolders.clear()
            selectedShapeHolders.add(shapeHolders[position])
        }
    }
    private fun decoupleSelectedShapes(actionType: ShapeHolderContainer.ActionType)
    {
        if (selectedShapeHolders.size == 1) {
            if(selectedShapeHolders[0].actionType == actionType) {
                val position = shapeHolders.indexOf(selectedShapeHolders[0])

                shapeHolders[position].shapeHolder?.let {
                    for((index,shapeHolder) in shapeHolders[position].pairedShapeHolders.asReversed().withIndex())
                    {
                        shapeHolders.add(position + index + 1, shapeHolder)
                        selectedShapeHolders.add(shapeHolder)
                    }
                    shapeHolders[position].resetPaired()


                }?:run{
                    selectedShapeHolders.clear()
                    for(shapeHolder in shapeHolders[0].pairedShapeHolders.asReversed())
                    {
                        selectedShapeHolders.add(shapeHolder)
                    }
                    shapeHolders.removeAt(position)
                    shapeHolders.addAll(position,selectedShapeHolders)
                }
            }
        }
    }
    override fun duplicateSelected() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        reCreateBitmap()
    }



    override fun generateFromString(string: String) {
        val shape: Shape? = shapeGenerator.generateShape(string)
        shape?.let{
            val shapeHolder = shapeHolderDaggerComponent.getSVGShapeHolder()
            shapeHolder.addShape(shape)
            shapeHolders.add(
                ShapeHolderContainer(
                    shapeHolder
                )
            )
            //selectedShapeHolders.add(shapeHolder)
        }

    }

    override fun createBasicShape(shapeName:String)
    {
        val shape  = baseShapeFactory.getShape(shapeName)
        shape?.let {
            val shapeHolder = shapeHolderDaggerComponent.getSVGShapeHolder()
            shapeHolder.addShape(shape)
            shapeHolders.add(
                ShapeHolderContainer(
                    shapeHolder
                )
            )
           // selectedShapeHolders.add(shapeHolder)
            reCreateBitmap()
        }
    }
    private fun updateMinMax(minMax1:Array<Float>, minMax2:Array<Float>)
    {
        minMax1[0] = min(minMax1[0],minMax2[0])
        minMax1[1] = min(minMax1[1],minMax2[1])
        minMax1[2] = max(minMax1[2],minMax2[2])
        minMax1[3] = max(minMax1[3],minMax2[3])
    }

    // Re Create bitmap when ever a update perform on shapes
    //To avoid recreation every time, it can be costly because when we perform any action which do not change selected shapes bitmap remain same
    private fun reCreateBitmap()
    {
        if (shapeHolders.size > 0) {
              bitmap = Bitmap.createBitmap(
                converter.getBitmapWidth(),
                converter.getBitmapHeight(),
                Bitmap.Config.ARGB_8888
            )
            val canvas = Canvas(bitmap!!)
            val list = mutableListOf<ShapeHolderContainer>()
            for (shapeHolderContainers in shapeHolders) {
                shapeHolderContainers.unPackContainers(list)
                for(shapeHolderContainer in shapeHolderContainers.secondaryList)
                {
                    shapeHolderContainer.shapeHolder?.let { canvas.drawBitmap(it.getBitmap(),0f,0f, null) }

                }
            }
        }
        else
            bitmap = defaultBitmap
    }

}
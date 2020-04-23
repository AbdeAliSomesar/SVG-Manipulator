package com.example.svgwithmvi.model

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import com.example.testproject.shapehandler.ShapeManager
import javax.inject.Inject

class SVGModel @Inject constructor(private val shapeProvider: ShapeManager) {
    val TAG:String = "SVGModel"
    //To hold the selected area of shape or shapes
    private var selectedArea:Array<Float>? = null
    private var previousDistanceFromMoveAction:Array<Float>? = null
    private val canvas: Canvas = Canvas()
    private val paint:Paint = Paint()
    //To store initial position of x and y coordinates
    private var isDoubleTapActive:Boolean = false

    init {
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 2f
        paint.color = Color.BLUE
    }


    fun onActionUp():Bitmap
    {
        if(isDoubleTapActive)
        {
            selectedArea?.let { selectedArea = shapeProvider.selectShapes(it[0],it[1],it[2],it[3])}
            isDoubleTapActive = false
        }
        return getBitmapWitArea()
    }
    fun onDrag(x1: Float, y1:Float, x2:Float, y2:Float, distanceX:Float, distanceY:Float):Bitmap
    {
        //Double tap used to select multiple shapes
        if(isDoubleTapActive) {

            //to get the minimum and maximum value in proper order
            selectedArea =
                if (x1 < x2)
                    if (y1 < y2)
                        arrayOf(x1, y1, x2, y2)
                    else
                        arrayOf(x1, y2, x2, y1)
                else
                    if (y1 < y2)
                        arrayOf(x2, y1, x1, y2)
                    else
                        arrayOf(x2, y2, x1, y1)

        }
        else
        {

            //isDoubleTapActive is null then perform onDrag shape
            //isDoubleTapActive = false
            selectedArea?.let {
                /*if(checkInArea(selectedArea,x2,y2))
                {
               //     shapeProvider.updateHeightOfSelectedBy(1.5f)
                 //   shapeProvider.updateWidthOfSelectedBy(1.5f)
                    //shapeProvider.moveSelected(-distanceX, -distanceY)
                }
                else if(checkInArea(arrayOf(it[2],it[3],it[2]+25,it[3]+25),x2,y2))
                {
                    shapeProvider.updateHeightOfSelectedBy(1.5f)
                   // shapeProvider.
                }*/
                shapeProvider.moveSelected(-distanceX, -distanceY)
                selectedArea = shapeProvider.getSelectedArea()

            }
        }

//        Log.d("Tagg","\nevent1 x = $x1 y= $y1 \nevent2 x = $x2 y = $y2" )

        return getBitmapWitArea()

    }

    fun updateHeightOfSelectedBy(scaleFactor:Float,isLocked:Boolean):Bitmap
    {
//        Log.d(TAG,"onZoom")
        if (scaleFactor!=0f)
        {
            shapeProvider.updateHeightOfSelectedBy(scaleFactor)
            if(isLocked)
                shapeProvider.updateWidthOfSelectedBy(scaleFactor)
            selectedArea = shapeProvider.getSelectedArea()
        }
        return getBitmapWitArea()
    }
    fun updateWidthOfSelectedBy(scaleFactor:Float):Bitmap
    {
//        Log.d(TAG,"onZoom")
        if (scaleFactor!=0f)
        {
            shapeProvider.updateHeightOfSelectedBy(scaleFactor)
            selectedArea = shapeProvider.getSelectedArea()
        }
        return getBitmapWitArea()
    }
    fun singleTap(x:Float, y:Float):Bitmap
    {

        selectedArea?.let {
                if (x >= it[0] && x <= it[2] && y >= it[1] && y <= it[3]) {
                    return getBitmapWitArea()
                }
            }
        selectedArea = shapeProvider.selectShape(x,y)
//        Log.d(TAG,"onSingleTap")
        return getBitmapWitArea()
    }
    fun onTouchShape(x:Float, y:Float):Bitmap
    {
        selectedArea?.let {
            if (x >= it[0] && x <= it[2] && y >= it[1] && y <= it[3]) {
                return getBitmapWitArea()
            }
        }
        selectedArea = shapeProvider.selectShape(x,y)
//        Log.d(TAG,"onTouchShape")
        return getBitmapWitArea()
    }
    fun doubleTap(x:Float,y: Float):Bitmap
    {
//        Log.d(TAG,"onDoubleTap")
        isDoubleTapActive = true
        selectedArea = shapeProvider.selectShape(x,y)
        return getBitmapWitArea()
    }
    fun selectShape(name:String?):Bitmap
    {
//        Log.d(TAG,"onSelectShape")
        name?.let {
            shapeProvider.createBasicShape(it)
        }
        selectedArea = null
        return getBitmapWitArea()
    }




    private fun checkInArea(selectedZone:Array<Float>?,x:Float,y:Float):Boolean
    {
        selectedZone?.let {
            if((it[0]<=x && it[1] <=y) && (it[2]>=x && it[3] >=y))
                return true
        }
        return false
    }

    private fun getBitmapWitArea():Bitmap
    {
        val bitmap:Bitmap = shapeProvider.getBitmap()
        selectedArea?.let {
            paint.style = Paint.Style.STROKE
            paint.strokeWidth = 2f
            paint.color = Color.BLUE
            val canvas = Canvas(bitmap)
            canvas.drawRect(it[2],it[3],it[0],it[1],paint)
            paint.color = Color.GREEN
            paint.style = Paint.Style.FILL
            paint.strokeWidth = 0f
            canvas.drawCircle(it[2] + 10f,it[3] + 10f,15f, paint)
//            Log.d(TAG,"selected area = x1 = ${it[0]} y1 = ${it[1]} x2 = ${it[2]} y2 = ${it[3]}")
        }
        return bitmap
    }

    fun attachSelected():Bitmap
    {
 //       Log.d(TAG,"")
        shapeProvider.attachSelected()
        return getBitmapWitArea()
    }
    fun deAttachSelected():Bitmap
    {
//        Log.d(TAG,"")
        shapeProvider.deAttachSelected()
        return getBitmapWitArea()
    }
    fun groupSelected():Bitmap
    {
//        Log.d(TAG,"")
        shapeProvider.groupSelected()
        return getBitmapWitArea()
    }
    fun unGroupSelected():Bitmap
    {
 //       Log.d(TAG,"")
        shapeProvider.unGroupSelected()
        return getBitmapWitArea()
    }
    fun duplicateSelected():Bitmap
    {
//        Log.d(TAG,"")
        shapeProvider.deAttachSelected()
        return getBitmapWitArea()
    }

    fun deleteSelected():Bitmap{
        shapeProvider.deleteSelected()
        selectedArea = null
        return getBitmapWitArea()
    }
}

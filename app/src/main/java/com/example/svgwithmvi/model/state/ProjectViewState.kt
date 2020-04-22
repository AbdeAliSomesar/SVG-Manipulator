package com.example.svgwithmvi.model.state

import android.graphics.Bitmap

data class ProjectViewState(val bitmap: Bitmap,val drawerStatus:Boolean, val Failure:Boolean, val FailureMsg:String) {
    companion object{
        fun idle(width:Int, height:Int): ProjectViewState =
            ProjectViewState(
                Bitmap.createBitmap(
                    width,
                    height,
                    Bitmap.Config.RGB_565
                ), false
                , Failure = false
                , FailureMsg = ""

            )
    }
}
package com.example.svgwithmvi.View.maintaskrecyclerview

class RecyclerViewImageAndTextDataListHolder {
    private var myList:MutableList<RecyclerViewData> = mutableListOf()

    fun getList():List<RecyclerViewData>
    {
        return myList
    }
    fun add(imageId:Int,imageText:String)
    {
        myList.add(RecyclerViewData(imageId,imageText))
    }
    fun remove(position:Int)
    {
        myList.removeAt(position)
    }
    fun getImageId(position:Int):Int
    {
        return myList[position].imageId
    }
    data class RecyclerViewData(var imageId: Int, var imageText: String)
}
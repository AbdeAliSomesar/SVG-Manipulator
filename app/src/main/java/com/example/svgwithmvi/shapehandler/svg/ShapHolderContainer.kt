package com.example.svgwithmvi.shapehandler.svg


import com.example.testproject.shapehandler.ShapeHolder
import kotlin.math.max
import kotlin.math.min

data class ShapeHolderContainer(val shapeHolder: ShapeHolder?) {
    val pairedShapeHolders: MutableList<ShapeHolderContainer> = mutableListOf()
    val secondaryList: MutableList<ShapeHolderContainer> = mutableListOf()
    var actionType: ActionType =
        ActionType.NONE
    init {
        secondaryList.add(this)
    }


    fun addShapeHolders(shapeHolderContainer: ShapeHolderContainer, actionType: ActionType) {
        pairedShapeHolders.add(shapeHolderContainer)
        this.actionType = actionType
        secondaryList.add(shapeHolderContainer)
        shapeHolderContainer.unPackContainers(secondaryList)
    }

    fun resetPaired() {
        pairedShapeHolders.clear()
        resetSecondaryList()
        actionType = ActionType.NONE
    }
    fun resetSecondaryList()
    {
        secondaryList.clear()
        secondaryList.add(this)
    }


    fun unPackContainers(list: MutableList<ShapeHolderContainer>) {
        // shapeHolder?.let { list.add(this) }
        if (pairedShapeHolders.size > 0)
            list.addAll(pairedShapeHolders)
        for (shapeHolders in pairedShapeHolders) {
            shapeHolders.unPackContainers(list)
        }
    }

    fun findMinMax(minMax: Array<Float>) {
        shapeHolder?.let { updateMinMax(minMax, it.getMinMax()) }
        for(container in secondaryList)
        {
            container.shapeHolder?.getMinMax()?.let {
                updateMinMax(minMax,it)
            }
        }
    }

    private fun updateMinMax(targetMinMax: Array<Float>, sourceMinMax: Array<Float>) {
        targetMinMax[0] = min(targetMinMax[0], sourceMinMax[0])
        targetMinMax[1] = min(targetMinMax[1], sourceMinMax[1])
        targetMinMax[2] = max(targetMinMax[2], sourceMinMax[2])
        targetMinMax[3] = max(targetMinMax[3], sourceMinMax[3])
    }

    enum class ActionType {
        ATTACH, GROUP, NONE
    }


}
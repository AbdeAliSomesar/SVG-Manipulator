package com.example.svgwithmvi.shapehandler.SVG

sealed class SVGSharedData {
    data class EllipseData(val radiusX: Float,
                           val radiusY: Float,
                           val xCoordinate: Float,
                           val yCoordinate: Float,
                           val svgAttributes: String?):
        SVGSharedData()
    data class PathData(val moves: Array<Float>,
                        val xCoordinates: Array<Float>,
                        val yCoordinates: Array<Float>,
                        val pathTag: String,
                        val svgAttributes: String?):
        SVGSharedData() {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as PathData

            if (!moves.contentEquals(other.moves)) return false
            if (!xCoordinates.contentEquals(other.xCoordinates)) return false
            if (!yCoordinates.contentEquals(other.yCoordinates)) return false

            return true
        }

        override fun hashCode(): Int {
            var result = moves.contentHashCode()
            result = 31 * result + xCoordinates.contentHashCode()
            result = 31 * result + yCoordinates.contentHashCode()
            return result
        }
    }
}
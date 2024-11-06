package classes

import kotlin.math.sqrt

class Point(private var x: Double = 1.0, private var y: Double = 1.0) {
    constructor(x: Double) : this(y = x)

    fun translate(displacementX: Double, displacementY: Double) {
        x += displacementX
        y += displacementY
    }

    fun calculateEuclideanDistance(point: Point): Double {
        return sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y))
    }

    override fun toString(): String {
        return "($x, $y)"
    }
}
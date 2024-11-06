package classes

import kotlin.math.PI

class Circle(private val radius: Double) {
    constructor() : this(1.0)

    fun calculateArea(): Double {
        return radius * radius * PI;
    }

    fun calculateCircumference(): Double {
        return 2 * radius * PI;
    }
}
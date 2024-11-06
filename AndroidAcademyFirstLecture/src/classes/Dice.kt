package classes

import kotlin.random.Random

class Dice() {
    private val sides = setOf(1, 2, 3, 4, 5, 6)
    var currentState: Int = sides.elementAt(Random.nextInt(0, 6))
    var isLocked = false

    fun lock() {
        isLocked = true
    }

    fun unlock() {
        isLocked = false
    }

    fun roll(): Int {
        currentState = Random.nextInt(1, 7)
        return currentState
    }

    override fun toString(): String {
        return "$currentState"
    }
}
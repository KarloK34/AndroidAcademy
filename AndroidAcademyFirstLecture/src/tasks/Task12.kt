package tasks

import classes.Circle

fun runTask12() {
    val circle = Circle()
    println("classes.Circle:\"My area is ${circle.calculateArea()} and circumference ${circle.calculateCircumference()}\"")
}
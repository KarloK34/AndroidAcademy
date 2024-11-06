package tasks

import classes.Point

fun runTask13() {
    val pointA = Point()
    val pointB = Point(-3.0, 1.0)
    val pointC = Point(-1.0)

    pointA.translate(5.0, 3.0)
    println("Euclidean distance of $pointA to $pointB is ${pointA.calculateEuclideanDistance(pointB)}")
}
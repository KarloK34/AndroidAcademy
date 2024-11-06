package tasks

fun runTask3() {
    println("Enter 3 numbers:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    if (num1 > num2 && num1 > num3) println("Number $num1 is the largest.")
    else if (num2 > num1 && num2 > num3) println("Number $num2 is the largest.")
    else if (num3 > num1 && num3 > num2) println("Number $num3 is the largest.")
    else println("There isn't a unique largest number.")
}
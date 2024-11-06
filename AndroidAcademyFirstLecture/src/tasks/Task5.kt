package tasks

fun runTask5() {
    println("Please, enter a natural number:")
    val n = readln().toInt()
    var sum = 0
    for (num in (1..n)) {
        sum += num
    }
    println("The sum of first $n numbers is $sum.")
}
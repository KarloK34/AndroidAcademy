package tasks

fun isPrime(number: Int): Boolean {
    for (i in (2..<number)) {
        if (number % i == 0) return false
    }
    return true
}

fun runTask8() {
    println("Please, enter a number:")
    val number = readln().toInt()
    if (isPrime(number)) println("$number is a prime number.")
    else println("$number isn't a prime number.")
}
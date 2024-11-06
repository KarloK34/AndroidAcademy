package tasks

fun runTask6() {
    println("Please, enter lower bound:")
    val lowerBound = readln().toInt()

    println("Please, enter upper bound:")
    val upperBound = readln().toInt()

    var enteredNumber: Int

    do {
        println("Please, enter a number within those bounds:")
        enteredNumber = readln().toInt()
    } while (enteredNumber < lowerBound || enteredNumber > upperBound)

    var largestDigit = enteredNumber % 10
    var num = enteredNumber

    do {
        num /= 10
        val lastDigit = num % 10
        if (lastDigit > largestDigit) largestDigit = lastDigit
    } while (num > 0)

    println("$largestDigit is the largest digit of $enteredNumber.")
}
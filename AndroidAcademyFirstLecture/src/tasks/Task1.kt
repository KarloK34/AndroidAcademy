package tasks

fun runTask1() {
    val yearOfBirth = 2002
    val currentYear = 2024

    val age = currentYear - yearOfBirth
    val yearsIn2048 = 2048 - yearOfBirth

    println("I'm currently $age years old. In 2048 I will be $yearsIn2048 years old.")
}
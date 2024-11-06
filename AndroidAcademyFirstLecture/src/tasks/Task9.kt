package tasks

fun isStrongPassword(password: String): Boolean {
    val containsUpperCase = password.any { it.isUpperCase() }
    val containsNumber = password.any { it.isDigit() }
    val isValidLength = password.length > 7

    return containsUpperCase && containsNumber && isValidLength
}

fun runTask9() {
    var password: String
    do {
        println("Please, enter a strong password:")
        password = readln()
        if (!isStrongPassword(password)) println("Password must contain an upper case letter, a digit and at least 8 characters!")
    } while (!isStrongPassword(password))
}
package tasks

fun countUniqueCharacters(text: String): Int {
    val uniqueCharacters = mutableSetOf<Char>()
    for (char in text) {
        if (!uniqueCharacters.contains(char)) uniqueCharacters.add(char) //counts space as well
    }
    return uniqueCharacters.size
}

fun runTask11() {
    println("Please, enter a string:")
    val text = readln()
    println("There are ${countUniqueCharacters(text)} unique characters in the inputted string.")
}
package tasks

import java.util.*

fun countVowels(text: String): Int {
    val vowels = setOf("a", "e", "i", "o", "u")
    var vowelsCount = 0
    for (letter in text) {
        if (letter.lowercase(Locale.getDefault()) in vowels) vowelsCount++
    }
    return vowelsCount
}

fun runTask10() {
    println("Please, enter a string:")
    val text = readln()
    println("There are ${countVowels(text)} vowels in the inputted string.")
}
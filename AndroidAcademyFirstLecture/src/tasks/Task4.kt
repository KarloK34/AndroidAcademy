package tasks

import java.util.*

fun runTask4() {
    println("Please, enter a character:")
    val char = readln()
    val isVowel = when (char.lowercase(Locale.getDefault())) {
        "a" -> true
        "e" -> true
        "i" -> true
        "o" -> true
        "u" -> true
        else -> false
    }
    if (isVowel) println("$char is a vowel.")
    else println("$char is not a vowel.")
}
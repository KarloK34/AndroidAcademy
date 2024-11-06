package tasks

import classes.Deck

fun runTask15() {
    val deck = Deck()
    deck.shuffle()
    val card1 = deck.deal()
    val card2 = deck.deal()
    println("Player 1 card: $card1")
    println("Player 2 card: $card2")
    if (card1.strength > card2.strength) println("$card1 is stronger than $card2 - Player 1 wins")
    else if (card1.strength < card2.strength) println("$card2 is stronger than $card1 - Player 2 wins")
    else println("It's a draw! $card1 has equal strength as $card2")
    println()
}
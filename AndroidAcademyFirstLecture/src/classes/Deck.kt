package classes

import enums.CardColor
import enums.CardStrength

class Deck() {
    private val deck = mutableListOf<Card>()

    init {
        for (color in CardColor.entries) {
            for (strength in CardStrength.entries) {
                deck.add(Card(color, strength))
            }
        }
    }

    fun shuffle() {
        deck.shuffle()
    }

    fun deal(): Card {
        val card = deck.random()
        deck.remove(card)
        return card
    }
}
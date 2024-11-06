package classes

import enums.CardColor
import enums.CardStrength

class Card(val color: CardColor, val strength: CardStrength) {
    override fun toString(): String {
        return "$strength of $color"
    }
}
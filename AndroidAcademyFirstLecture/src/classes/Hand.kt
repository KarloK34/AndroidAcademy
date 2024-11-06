package classes

class Hand() {
    val dice = arrayOf(Dice(), Dice(), Dice(), Dice(), Dice(), Dice())

    fun isYahtzee(): Boolean {
        val result = dice[0].currentState
        for (d in dice) {
            if (d.currentState != result) return false
        }
        return true
    }

    fun isPoker(): Boolean {
        val rollResult = rollResult()
        var numOfEquals = 1
        for (i in 0..5) {
            numOfEquals = 1
            for (j in 0..5) {
                if (i != j) {
                    if (rollResult[i] == rollResult[j]) numOfEquals++
                }
            }
        }
        return numOfEquals == 4
    }

    fun isLargeStraight() : Boolean{
        return rollResult().distinct().size == 6
    }

    fun rollResult(): IntArray {
        return intArrayOf(
            dice[0].currentState,
            dice[1].currentState,
            dice[2].currentState,
            dice[3].currentState,
            dice[4].currentState,
            dice[5].currentState
        )
    }

    fun rollAllDice() {
        for (d in dice) {
            d.roll()
        }
    }

    fun rollUnlockedDice() {
        for (d in dice) {
            if (!d.isLocked)
                d.roll()
        }
    }

    fun lockDice(indexes: IntArray) {
        for (index in indexes) {
            dice[index].lock()
        }
    }

    fun unlockDice(){
        for(d in dice){
            d.unlock()
        }
    }

    override fun toString(): String {
        return "${dice[0]} ${dice[1]} ${dice[2]} ${dice[3]} ${dice[4]} ${dice[5]}"
    }
}
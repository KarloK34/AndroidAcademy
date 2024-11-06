package tasks

import classes.Hand

fun runTask14() {
    val hand = Hand()
    var input2 : String
    var input3 : String
    val currentlyLocked = mutableListOf<Int>()
    repeat(6){
        do {
            println("Enter \"r\" to roll:")
            val input1 = readln()
        } while(input1 != "r")
        hand.rollUnlockedDice()
        println(hand)
        currentlyLocked.sort()
        if(currentlyLocked.isNotEmpty()) println("Currently locked: $currentlyLocked")
        if(hand.isYahtzee()) println("YAHTZEE!!!")
        if(hand.isPoker()) println("Poker!")
        if(hand.isLargeStraight()) println("L-L-L-LAAAARGE STRAIGHT!")
        do {
            println("Do you want to lock some dice? (y/n)")
            input2 = readln()
        }while(input2 != "y" && input2 != "n")
        if(input2 == "y"){

            println("Enter indexes(1-6) of dice you want to lock (e.g. 135):")
            input3 = readln()
            var indexes = input3.toInt()
            val indexesToLock = mutableListOf<Int>()
            while(indexes > 0){
                val index = indexes % 10
                indexesToLock.add(index-1)
                currentlyLocked.add(index)
                indexes /= 10
            }
            hand.lockDice(indexesToLock.toIntArray())
        }
    }
    println("==============GAME FINISHED==============")
}
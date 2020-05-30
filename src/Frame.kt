open class Frame {
    val rolls = mutableListOf<Roll>()
    var rollPointer = 0
    var isStrike = false
    var isSpare = false

    open fun nextRoll(roll: Roll): Boolean {
        isStrike = (rollPointer == 0 && roll.pins == 10)
        isSpare = (rollPointer == 1 && roll.pins + rolls[rollPointer-1].pins == 10)
        if (rollPointer == 1 && roll.pins + rolls[rollPointer-1].pins > 10) throw Error("Too many pins.")
        rolls.add(roll)
        rollPointer++
        return (isStrike || rollPointer == 2)
    }

    fun totalPins(): Int {
        var total = 0
        for (roll in rolls) {
            total += roll.pins
        }
        return total
    }
}
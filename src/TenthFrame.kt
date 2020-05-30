class TenthFrame : Frame() {
    override fun nextRoll(roll: Roll): Boolean {
        if (rollPointer == 1 && rolls[rollPointer-1].pins < 10 && rolls[rollPointer-1].pins + roll.pins > 10) {
            throw Error("Too many pins.")
        }
        rolls.add(roll)
        rollPointer++
        return (rollPointer == 3 || isOpenFrame())
    }

    private fun isOpenFrame(): Boolean {
        if (rollPointer == 2) {
            return (rolls[0].pins + rolls[1].pins < 10)
        } else {
            return false
        }
    }
}
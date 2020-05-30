class Game {
    val frames = mutableListOf<Frame>()
    var framePointer = 0

    init {
        for (i in 1..9) {
            frames.add(Frame())
        }
        frames.add(TenthFrame())
    }

    fun roll(pins: Int) {
        if (framePointer == 10) throw Error("Hey Kingpin! You rolled too many balls!")
        if (frames[framePointer].nextRoll(Roll(pins))) framePointer++
    }

    fun score(): Int {
        var score = 0
        for (i in 0..9) {
            if ((frames[i].rolls.size < 2 && !frames[i].isStrike)
                || (i == 9 && frames[i].totalPins() >= 10 && frames[i].rolls.size < 3)) {
                throw Error("You didn't roll enough balls.")
            }
            score += frames[i].totalPins()
            try {
                if (frames[i].isSpare) {
                    score += frames[i+1].rolls[0].pins
                }
                if (frames[i].isStrike) {
                    score += frames[i+1].rolls[0].pins
                    if (frames[i+1].isStrike) {
                        score += frames[i+2].rolls[0].pins
                    } else {
                        score += frames[i+1].rolls[1].pins
                    }
                }
            } catch (e: Exception) {
                throw Error("You didn't roll enough balls.")
            }
        }
        return score
    }
}
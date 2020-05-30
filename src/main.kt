fun main() {
    val perfect = Game()
    try {
        for (i in 1..12) {
            perfect.roll(10)
        }
    } catch (e: Error) {
        println(e.message)
    }
    print("Score should be 300: ")
    println(perfect.score())

    val ones = Game()
    try {
        for (i in 1..20) {
            ones.roll(1)
        }
    } catch (e: Error) {
        println(e.message)
    }
    print("Score should be 20: ")
    println(ones.score())

    roll168()

    val thirteenStrikes = Game()
    try {
        for (i in 1..13) {
            thirteenStrikes.roll(10)
        }
        println(thirteenStrikes.score())
    } catch (e: Error) {
        println(e.message)
    }

    val twentyTwo = Game()
    try {
        for (i in 1..22) {
            twentyTwo.roll(1)
        }
        println(twentyTwo.score())
    } catch (e: Error) {
        println(e.message)
    }

    val eleven = Game()
    try {
        for (i in 1..11) {
            eleven.roll(10)
        }
        println(eleven.score())
    } catch (e: Error) {
        println(e.message)
    }

    val eight = Game()
    try {
        for (i in 1..8) {
            eight.roll(10)
        }
        println(eight.score())
    } catch (e: Error) {
        println(e.message)
    }

    val nine = Game()
    try {
        for (i in 1..9) {
            nine.roll(10)
        }
        println(nine.score())
    } catch (e: Error) {
        println(e.message)
    }
}
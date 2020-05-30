import java.lang.Error

fun roll168() {
    val game = Game()

    try {
        game.roll(10)

        game.roll(7)
        game.roll(3)

        game.roll(7)
        game.roll(2)

        game.roll(9)
        game.roll(1)

        game.roll(10)

        game.roll(10)

        game.roll(10)

        game.roll(2)
        game.roll(3)

        game.roll(6)
        game.roll(4)

        game.roll(7)
        game.roll(3)
        game.roll(3)

        print("Score should be 168: ")
        println(game.score())
    } catch (e: Error) {
        println(e.message)
    }
}
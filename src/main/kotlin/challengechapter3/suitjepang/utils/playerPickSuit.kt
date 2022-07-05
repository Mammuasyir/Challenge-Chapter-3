package challengechapter3.suitjepang.utils

lateinit var inputPlayer1: String
lateinit var inputPlayer2: String

class playerPickSuit {

    fun player1Pick() {
        print("Player 1, please pick a suit: ")
        inputPlayer1 = readLine().toString().lowercase()
        when (inputPlayer1) {
            "gunting" -> player2Pick()
            "batu" -> player2Pick()
            "kertas" -> player2Pick()

            else -> {
                println("Anda tidak memilih antara gunting, batu atau kertas")
                player1Pick()
            }
        }
    }

    private fun player2Pick() {
        print("Player 2, please pick a suit: ")
        inputPlayer2 = readLine().toString().lowercase()
        when (inputPlayer2) {
            "gunting" -> RumusSuit().rumusJepang(inputPlayer1, inputPlayer2)
            "batu" -> RumusSuit().rumusJepang(inputPlayer1, inputPlayer2)
            "kertas" -> RumusSuit().rumusJepang(inputPlayer1, inputPlayer2)

            else -> {
                println("Anda tidak memilih antara gunting, batu atau kertas")
                player2Pick()
            }
        }
    }
}
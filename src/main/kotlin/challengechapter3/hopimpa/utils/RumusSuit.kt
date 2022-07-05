package com.humam.challengechapter3.hopimpa.utils

class RumusHopimpa{

    fun rumusHopimpa(player1: String, player2: String, player3: String) {
        if (player1 == "hitam" && player2 == "hitam" && player3 == "hitam") {
            println()
            println("Hasil : ")
            println("Tidak ada Yang Tereliminasi")
        } else if (player1 == "putih" && player2 == "putih" && player3 == "putih") {
            println()
            println("Hasil : ")
            println("Tidak ada Yang Tereliminasi")
        } else if (player1 == "hitam" && player2 == "putih" && player3 == "putih") {
            println()
            println("Hasil : ")
            println("Player 1 Tereliminasi!")
        } else if (player1 == "putih" && player2 == "hitam" && player3 == "putih") {
            println()
            println("Hasil : ")
            println("Player 2 Tereliminasi!")
        } else if (player1 == "putih" && player2 == "putih" && player3 == "hitam") {
            println()
            println("Hasil : ")
            println("Player 3 Tereliminasi!")
        } else if (player1 == "hitam" && player2 == "hitam" && player3 == "putih") {
            println()
            println("Hasil : ")
            println("Player 3 Tereliminasi!")
        } else if (player1 == "hitam" && player2 == "putih" && player3 == "hitam") {
            println()
            println("Hasil : ")
            println("Player 2 Tereliminasi!")
        } else if (player1 == "putih" && player2 == "hitam" && player3 == "hitam") {
            println()
            println("Hasil : ")
            println("Player 1 Tereliminasi!")
        }
}
}
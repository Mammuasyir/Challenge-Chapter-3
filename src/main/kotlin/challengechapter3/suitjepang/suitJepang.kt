package challengechapter3.suitjepang

import challengechapter3.suitjepang.utils.playerPickSuit
import kotlin.system.exitProcess

class suitJepang {

    fun GameJepang() {
        println("""
                |========================
                |Game Suit Jepang Terminal
                |========================
                | Pilih antara Batu, Gunting dan Kertas :  
                |""".trimMargin())
        playerPickSuit().player1Pick()
        playAgainJepang()
    }

    fun playAgainJepang() {
        println()
        println("Apakah kamu ingin bermain Suit Jepang lagi? (y/n) :")
        if (readLine()?.lowercase() == "y") {
            GameJepang()
        }  else {
            println("Terima kasih sudah bermain")
            println("=========================")
            exitProcess(0)
        }
    }
}
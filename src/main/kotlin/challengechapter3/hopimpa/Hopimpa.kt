package com.humam.challengechapter3.hopimpa

import com.humam.challengechapter3.hopimpa.utils.playerPick
import kotlin.system.exitProcess

class Hopimpa {

        fun GameHopimpa() {
            println("""
                |========================
                |Game Hopimpa Terminal
                |========================
                | Pilih antara Putih dan Hitam :  
                |""".trimMargin())
            playerPick().player1Pick()
            playAgainHopimpa()
        }

        fun playAgainHopimpa() {
            println()
            println("Apakah kamu ingin bermain Hopimpa lagi? (y/n) :")
            if (readLine()?.lowercase() == "y") {
                GameHopimpa()
            }  else {
                println("Terima kasih sudah bermain")
                println("=========================")
                exitProcess(0)
            }
        }
    }
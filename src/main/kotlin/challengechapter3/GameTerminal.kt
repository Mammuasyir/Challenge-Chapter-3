package com.humam.challengechapter3


import challengechapter3.suitjepang.suitJepang
import com.humam.challengechapter3.hopimpa.Hopimpa

class GameTerminal{
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            headerGame()
            pilihGame()
        }

        private fun headerGame() {
            println("""
                |===========================================================
                |                   GAME TERMINAL VERSION
                |===========================================================
                | PILIH GAME : 
                   1. Hopimpa
                   2. Suit Jepang
                |""".trimMargin())

        }

        private fun pilihGame() {
            print("Pilihan : ")
            val pilihGame = readLine()!!.toInt()
            when(pilihGame){
                1 -> Hopimpa().GameHopimpa()
                2 -> suitJepang().GameJepang()
                else -> println("Game Tidak ada")
            }
        }
    }
}
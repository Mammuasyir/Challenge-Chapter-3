package com.humam.challengechapter3.hopimpa.utils

lateinit var inputPlayer1: String
lateinit var inputPlayer2: String
lateinit var inputPlayer3: String

class playerPick {

    fun player1Pick(){
        print("Player 1 silahkan pilih : ")
        inputPlayer1 = readLine().toString().lowercase()
        when(inputPlayer1){
            "hitam" -> player2Pick()
            "putih" -> player2Pick()

            else -> {
                println("Pilihan tidak ada")
                player1Pick()
            }
        }
    }

    private fun player2Pick() {
        print("Player 2 silahkan pilih : ")
        inputPlayer2 = readLine().toString().lowercase()
        when(inputPlayer2){
            "hitam" -> player3Pick()
            "putih" -> player3Pick()

            else -> {
                println("Pilihan tidak ada")
                player2Pick()
            }
        }
    }

    private fun player3Pick() {
        print("Player 3 silahkan pilih : ")
        inputPlayer3 = readLine().toString().lowercase()
        when(inputPlayer3){
            "hitam" -> RumusHopimpa().rumusHopimpa(inputPlayer1, inputPlayer2, inputPlayer3)
            "putih" -> RumusHopimpa().rumusHopimpa(inputPlayer1, inputPlayer2, inputPlayer3)

            else -> {
                println("Pilihan tidak ada")
                player3Pick()
            }
        }
    }
}

package challengechapter3.suitjepang.utils

class RumusSuit{

    fun rumusJepang(player1: String, player2: String){

        when (player1) {
            "gunting" -> {
                when (player2) {
                    "gunting" -> println("Hasil : " +
                            "Tidak ada yang tereliminasi")
                    "batu" -> println("Hasil : " +
                            "Pemain 2 MENANG")
                    "kertas" -> println("Hasil : " +
                            "Pemain 1 MENANG")
                    else -> println( "Invalid input. Masukkan gunting, batu, atau kertas!")
                }
            }
            "batu" -> {
                when (player2) {
                    "gunting" -> println("Hasil : " +
                            "Pemain 1 MENANG")
                    "batu" -> println("Hasil : " +
                            "Tidak ada yang tereliminasi")
                    "kertas" -> println("Hasil : " +
                            "Pemain 2 MENANG")
                    else -> println( "Invalid input. Masukkan gunting, batu, atau kertas!")
                }
            }
            "kertas" -> {
                when (player2) {
                    "gunting" -> println("Hasil : " +
                            "Pemain 2 MENANG")
                    "batu" -> println("Hasil : " +
                            "Pemain 1 MENANG")
                    "kertas" -> println("Hasil : " +
                            "Tidak ada yang tereliminasi")
                    else -> println( "Invalid input. Masukkan gunting, batu, atau kertas!")
                }
            }
            else -> println( "Invalid input. Ketik gunting, batu, atau kertas!")
        }
    }

}
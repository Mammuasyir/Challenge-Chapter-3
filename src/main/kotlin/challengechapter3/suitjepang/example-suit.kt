package com.humam.challengechapter3

// " PSEUDO CODE "

// Inisialisasi pilihan
// Menangkap pilihan player
// Menangkap pilihan komputer
// Random pilihan komputer
// Tentukan peraturan permainan
// Tampilkan hasil


fun main() {
//Inisialisasi pilihan
    val pilihan = arrayOf("gunting", "batu", "kertas")

//    Membuat pilihan random untuk komputer
    var komputer = pilihan.random()

//    Masukkan nama player

    println("Kenalan dulu ya... Siapa nama kamu nih?")
    var namaPlayer = readLine()
    println("Hi, $namaPlayer !! Selamat datang...")

//    Menangkap pilihan player
    println("Masukan Antara (gunting,batu, kertas) ")
    print("Input : ")

    var player = readLine()
    var status = false

//    Menentukan peraturan
    if (player!!.lowercase().equals(komputer.lowercase())) {
        println("Seri $komputer dengan $player")
    }
    else if (player.lowercase().equals("batu")) {
        if(komputer.lowercase().equals("gunting")){
            status = true
            hasil(status,player,komputer)
        }else{
            status = false
            hasil(status,player,komputer)
        }
    }
    else if (player.lowercase().equals("gunting")) {
        if (komputer.lowercase().equals("kertas")) {
            status = true
            hasil(status,player,komputer)
        } else {
            status = false
            hasil(status,player,komputer)
        }
    }
    else if (player.lowercase().equals("kertas")) {
        if (komputer.lowercase().equals("batu")) {
            status = true
            hasil(status,player,komputer)
        } else {
            status = false
            hasil(status,player,komputer)
        }
    }
}

fun hasil(status: Boolean, p1: String, p2: String) {
    if (status) {
        println("Kamu Menang!! $p1 mengalahkan $p2")
    } else {
        println("Yah.. Kamu Kalah nih!! $p2 mengalahkan $p1")

    }
}

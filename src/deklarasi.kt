
/*
    deklarasi variabel

    tipe data
    Int = bilangan bulat positif dan negatif
    Float = bilangan desimal + / -
    Double = bilangan desimal
    String = kalimat "Saya suka kotlin"
    boolean = True / False
    char = "#" , "*"

    deklarasi variabel

    C++
    int nilai = 10

    Kotlin
    var / val nama_variabel : tipe data = value

    var nilai : Int = 10
    nilai = 100
    val bilangan : Int = 11
    bilangan = 10


    operator aritmatika
    + , - ,/ , * , %

 */

import java.util.Scanner


fun main(args: Array<String>) {

    var bilangan : Int = 100
    println("Ini nilai variabel bilangan ${bilangan + bilangan}")

    var input = Scanner(System.`in`)
    var nilai :Int
    var nilai2 : Int
    println("Masukkan bilangan : ")
    nilai = input.nextInt()
    println("Masukkan bilangan ke 2 : ")
    nilai2 = input.nextInt()

    var hasil = nilai + nilai2

    println("Hasil jumlah : "+ hasil)

}

fun main(args: Array<String>) {

    val sapi = Mamalia()

    sapi.makanan = "Rumput"
    sapi.warna = "Cokelat"
    sapi.kaki = 4

    sapi.bergerak()
    sapi.berkembangBiak()
    sapi.bernapas()

    println("Sapi makanannya : ${sapi.makanan} dan warna : ${sapi.warna} dengan kaki : ${sapi.kaki}")
}

fun inputNilai( input : Int ): Int {


    var jum = 0
    for ( i in 1 .. input )
    {
        println("Masukkan nilai ke $i : ")
        var inputan = readLine()!!.toInt()
        jum += inputan
    }

    return jum
}

infix fun Int.hasilRataRata( hasilInput : Int ) : Double = hasilInput.toDouble() / this.toDouble()

fun nilaiRataRata( nilai : Double ) : String = if (nilai > 90)
{
    "A"
} else {
    "B"
}

fun hasilJumlah( bilangan : Int, bilangan2 : Int ) : Int = bilangan + bilangan2


fun main(args: Array<String>) {

    println(" Masukkan nilai  : ")
    val input = readLine()!!.toInt()
    val hasilInput = inputNilai(input)
    println("Hasil jumlah : $hasilInput")
    val nilaiRata = input hasilRataRata hasilInput
    println(" Maka nilainya : ")
    println(nilaiRataRata(nilaiRata))


    val bilangan = readLine()!!.toInt()
    val bilangan2 = readLine()!!.toInt()
    val jum = hasilJumlah( bilangan, bilangan2 )
    println("Hasil jumlah : $jum")
    val nilaiRata2 = 2 hasilRataRata jum
    println(" Maka nilainya : ")
    println(nilaiRataRata(nilaiRata2))
}



/*

    fungsi dengan tipe pengembalian nilai

    fun nama_variabel (parameter) : tipe_data {

        return tipedata
    }

    fungsi tanpa tipe pengembalian nilai

    fun nama_variabel ( parameter ) : Unit {

    }

 */

fun penjumlahan ( bilangan : Int, bilangan2 : Int ) : Int{

    return bilangan + bilangan2
}

fun perkalian ( bilangan: Int, bilangan2: Int ) {

    println("${bilangan * bilangan2}")
}


// fungsi ekspresi
fun pengurangan ( bilangan: Int , bilangan2: Int) : Int = bilangan - bilangan2

// fungsi extension dan ekspresi
fun Int.pembagian(bilangan2: Int) : Double = this.toDouble() / bilangan2.toDouble()

// fungsi infix

infix fun Int.dimodularkan(bilangan2: Int) : Int = this % bilangan2

// fungsi ekspresi
fun hasilRata( nilai : Int ) : String = if (nilai > 90)
{
    "A"
} else {
    "B"
}

// fungsi named parameter
fun inputString(kata1 : String = "Hi", kata2 : String) {

    println(kata1 + kata2)
}


fun main(args: Array<String>) {

    println(" Masukkan bilangan : ")
    val bilangan = readLine()!!.toInt()
    println(" Masukkan bilangan 2 : ")
    val bilangan2 = readLine()!!.toInt()

    println("Hasil jumlah : ${penjumlahan(bilangan, bilangan2)}")
    println("Hasil kurang : ${pengurangan(bilangan, bilangan2)}")
    perkalian(bilangan, bilangan2)

    println("Hasil pembagian : ${bilangan.pembagian(bilangan2)}")

    val sisaPembagian = bilangan dimodularkan  bilangan2
    println("Maka sisa bagi : $sisaPembagian")

    println(hasilRata(bilangan2))

    inputString("Hello", "World")

    inputString(kata2 = "World", kata1 = "HeyHo")
}
fun main(args: Array<String>) {

    for (i in 1 .. 10)
    {
        println(i)
    }

    println("---------------------------")
    for (i in 1 until 10)
    {
        println(i)
    }

    println("---------------------------")

    for (i in 1 .. 10 step 2)
    {
        println(i)
    }
    println("---------------------------")

    for (hasil in 10 downTo 1 step 2)
    {
        println(hasil)
    }

    var bilangan : Int

    println("Masukkan bilangan ")
    bilangan = readLine()!!.toInt()
    var jumlah = 0
    for (i in 1 .. bilangan)
    {
        println("Masukkan bilangan yang ke $i")
        var nilai = readLine()!!.toInt()
        jumlah = jumlah + nilai

    }

    var rata = jumlah.toDouble() / bilangan.toDouble()
    println("nilai rata - rata $rata")

    if (rata > 90)
    {
        println("A")
    }else if(rata > 80 && rata <= 90)
        println("B+")
}

/*

    input jumlah : 3
    input bilangan 1 : 100
    input bilangan 2 : 100
    input bilangan 3 : 100

    300 / 3 = 100




 */


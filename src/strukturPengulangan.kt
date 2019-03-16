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
}

/*

    input jumlah : 3
    input bilangan 1 : 100
    input bilangan 2 : 100
    input bilangan 3 : 100

    300 / 3 = 100




 */


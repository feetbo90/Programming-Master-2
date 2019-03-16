import java.util.*

/*

    operator perbandingan
    > , < , >= , <= != , ==
    menghasilkan true or false
    contoh :
    8 > 9   FALSE

    operator logika AND dan OR
    contoh

    AND &&
    T       T       T
    T       F       F
    F       T       F
    F       F       F

    OR ||
    T       T       T
    T       F       T
    F       T       T
    F       F       F

    menghasilkan true or false


    statement if else
    if(TRUE)
    {
    }
    else {

    }

    keputusan bertingkat

    if()

 */




fun main(args: Array<String>) {

    var bilangan : Int?
    var bilangan2 : Int?
    var bilangan3 : Int?
//    var input = readLine()
    println("Masukkan bilangan pertama ")
    bilangan = readLine()!!.toInt()
    println("Masukkan bilangan kedua ")
    bilangan2 = readLine()!!.toInt()
    println("Masukkan bilangan ketiga ")
    bilangan3 = readLine()!!.toInt()


    if(bilangan > bilangan2)
    {
        println("bilangan yang terbesar $bilangan")
    }
    else{
        println("bilangan yang terbesar $bilangan2")
    }



    if (bilangan > bilangan2 && bilangan > bilangan3)
    {
        println("bilangan yang terbesar $bilangan")
    }else if(bilangan2 > bilangan3)
    {
        println("bilangan yang terbesar $bilangan2")
    }else{
        println("bilangan yang terbesar $bilangan3")
    }


}
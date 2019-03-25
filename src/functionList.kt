
fun inputList(input : Int) : List<Int>{
    var list = mutableListOf<Int>()
    var nilai = 0;
    for ( i in 0 until input){
        println("Masukkan nilai di index $i : ")
        nilai = readLine()!!.toInt()
        list.add(nilai)
    }
    //println("ini manggil fungsi di dalam fungsi")
    //printFunction(list)

    return list
}


fun printFunction(list: List<Int>){
    for ( i in 0 until list.size) {
        println(" Hasil input index ke $i : ${list.get(i)}")
    }
}

/*
    input : 3

    0   1   2
    100 100 100

    input index 0 : 100
    input index 1 : 100
    input index 2 : 100

    300.toDouble() / list.size.toDouble()

    nilai > 90
    A
 */
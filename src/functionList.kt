
fun inputList(input : Int) : List<Int>{
    var list = mutableListOf<Int>()
    var nilai = 0;
    for ( i in 0 until input){
        println("Masukkan nilai di index $i : ")
        nilai = readLine()!!.toInt()
        list.add(nilai)
    }
    return list
}


fun printFunction(list: List<Int>){
    for ( i in 0 until list.size) {
        println(" Hasil input index ke $i : ${list.get(i)}")
    }
}
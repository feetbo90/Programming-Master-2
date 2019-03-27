class CreateList{

    fun inputList( input : Int ) : List<Int> {
        val list = mutableListOf<Int>()
        var nilai: Int
        for ( i in 0 until input){
            println("Masukkan nilai di index $i : ")
            nilai = readLine()!!.toInt()
            list.add(nilai)
        }
        return list
    }

    fun printFunction( list: List<Int> ) {
        for ( i in 0 until list.size) {
            println(" Hasil input index ke $i : ${list[i]}")
        }
    }


}

fun main(args: Array<String>) {

    val list = CreateList()
    val nilaiList = list.inputList(4)
    list.printFunction(nilaiList)
}
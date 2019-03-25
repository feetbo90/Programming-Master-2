/*

    4

    0 s/d 3

    0   1   2   3
    100 20  30  40

    var array[4]
    array[3]

    array[1] = 200

 */

fun main(args: Array<String>) {

    var list = mutableListOf<Int>()

    list.add(0,100)
    list.add(1,200)

    println(list.get(1))
    println(list.size)
    list.removeAt(1)
    list.remove(100)

    println(list.size)

    var input = readLine()!!.toInt()
    var nilai = 0;
    for ( i in 0 until input){
        println("Masukkan nilai di index $i : ")
        nilai = readLine()!!.toInt()
        list.add(nilai)
    }

    for ( i in 0 until input) {
        println(" Hasil input index ke $i : ${list.get(i)}")
    }

    println("ini pemanggilan dari fungsi ")
    var listBaru = inputList(input)
    printFunction(listBaru)


}
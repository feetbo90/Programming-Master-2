



fun main(args: Array<String>) {

    var arrayContoh = intArrayOf(4,3,2,1)

    arrayContoh.get(0)
    arrayContoh.set(0, 5)
    println(arrayContoh.get(0))


    var input = readLine()!!.toInt()
    var arrayContoh2 = IntArray(input)
    printArray(arrayContoh)
}


fun printArray(array : IntArray){//: IntArray{
    for (i in 0 until array.size){
        println(array.get(i))
    }

//    return array
}
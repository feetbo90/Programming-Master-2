open class Hewan(kaki: Int) {

    init {
        println(" ini dari primary induk ")
    }

    constructor(kaki: Int, warna: String) : this(kaki) {
        println(" ini dari secondary induk")
    }

    var kaki : Int = 0
    val warna : String = ""

    init {
        this.kaki = kaki
    }

    open fun bernapas(warna :  String) {
        println(" Hewan Bernapas ")
    }

    open val x: Int get() = 1

    open fun bernapas():String {
        println(" Hewan bernapas ")
        return "Hewan bernapas"
    }

    open fun bernapas(kaki : Int) {

    }

    /*fun getKaki() : Int{
        return this.kaki
    }*/

    fun bergerak() {
        println(" Hewan Bergerak")
    }
}
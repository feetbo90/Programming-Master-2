open class Hewan(kaki: Int) {

    var kaki : Int = 0
    private var warna : String = ""

    init {
        println(" ini dari primary induk ")
    }

    constructor(kaki: Int, warna: String) : this(kaki) {
        println(" ini dari secondary induk")
        this.warna = warna
    }

    init {
        this.kaki = kaki
    }

    open fun bernapas(warna :  String) {
        println(" Hewan Bernapas ")
    }

    open val x: Int get() = 1

    open fun getNilai(): Int {
        return this.kaki
    }

    open fun bernapas() {
        println(" Hewan bernapas ")
    }

    open fun bernapas(kaki : Int) {

    }

    fun bergerak() {
        println(" Hewan Bergerak")
    }
}
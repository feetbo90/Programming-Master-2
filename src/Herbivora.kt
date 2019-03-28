class Herbivora(kaki: Int, warna: String) : Hewan(kaki, warna) {


    constructor(kaki: Int, warna: String, nama: String) :this(kaki, warna){
        println("ini dari secondary turunan")
    }

    init {
        println("ini dari primary turunan")
    }

    fun bernapasHerbivora() {
        println(" Herbivora bernapas ")
    }

    override
    fun bernapas(warna : String) {

    }

    override val x: Int get() = super.x + 1

    override
    open fun bernapas(): String {
        val nilai = super.bernapas()
        println("Ini bernapas dari herbivora")
        return nilai
    }

    override
    open fun bernapas(kaki : Int) {

    }
}


fun main(args: Array<String>) {

    var sapi = Herbivora(4, "Coklat", "budi")
    println("$sapi.bernapas()")
    sapi.bergerak()
    sapi.bernapasHerbivora()
    println("${sapi.kaki}")

}


open class Herbivora(kaki: Int, warna: String) : Hewan(kaki, warna) {

    var nama : String = ""
    constructor(kaki: Int, warna: String, nama: String) :this(kaki, warna){
        println("ini dari secondary turunan")
        this.nama = nama
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

    override fun bernapas() {
        println("Ini bernapas dari herbivora")
    }

    override fun bernapas(kaki : Int) {
    }
}


fun main(args: Array<String>) {

    val sapi = Herbivora(4, "Coklat", "budi")
    println("$sapi.bernapas()")
    sapi.bergerak()
    sapi.bernapasHerbivora()
    println("${sapi.kaki}")

}


class Mahasiswa(private var nama : String, var nim : String) {

    init {
        println("ini dari constructor $nama dan $nim")
    }

    // secondary constructor
    constructor(nama: String, nim: String, jurusan : String):this(nama, nim){
        println("ini dari secondary $jurusan")
    }

    fun getNama() : String {
        return this.nama
    }

}

fun main(args: Array<String>) {

    val nama = "Budi"
    val budi = Mahasiswa(nama, "080803")

    //budi.nama = "budi ..."
    //budi.nim = "093939"

    val sarah = Mahasiswa( "Sarah", "0938383", "TI")
}
class Mahasiswa(private val nama : String, private val nim : String) {


    // secondary constructor
    constructor(nama: String, nim: String, jurusan : String):this(nama, nim){
        println("ini dari secondary $jurusan")
    }

    fun getNama() : String {
        return this.nama
    }

    fun getNim() : String {
        //return ""
        return this.nim
    }


}

fun main(args: Array<String>) {

    val nama = "Budi"
    val budi = Mahasiswa(nama, "080803")
    budi.getNama()
    //budi.nama = "budi ..."
    //budi.nim = "093939"

    val sarah = Mahasiswa( "Sarah", "0938383", "TI")
    sarah.getNama()
    sarah.getNim()


}
package OOP1

class Buku (val namaBuku: String, val harga: Int) {

    fun Tampilkan(): String {
        return "Judul: $namaBuku | Harga: Rp$harga"
    }

    override fun toString(): String {
        return "Judul: $namaBuku | Harga: Rp$harga"
    }
}
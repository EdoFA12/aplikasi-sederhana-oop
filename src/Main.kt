import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    val book1 = Buku("Filosofi Teras", "mardin", 80000)
    val book2 = Buku("Pergi", "Romi", 90000)

    println("====== Daftar Buku ======")
    println("1.")
    book1.Tampilkan()
    println("2.")
    book2.Tampilkan()

    print("Silakan pilih buku (1/2): ")
    val pilihan = scanner.nextInt()

    val selectedBook = when (pilihan) {
        1 -> book1
        2 -> book2
        else -> {
            println("Buku tidak tersedia.")
            return
        }
    }

    print("Masukkan jumlah buku: ")
    val jumlah = scanner.nextInt()

    val transaksi = Transaksi(selectedBook, jumlah)
    println("Total harga: Rp${transaksi.total}")

    print("Masukkan uang pembayaran: Rp")
    val bayar = scanner.nextInt()

    transaksi.prosesPembayaran(bayar)
}
package OOP1
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    print("Nasukkan Nama")
    var inputNama = scanner.next()

    val book1 = Buku(inputNama)

    print("Nasukkan Nama")
    inputNama = scanner.next()
    val book2 = Buku(inputNama)

    val array  = arrayOf(book1.Tampilkan(),book2.Tampilkan())

    println(array)



    println("====== Daftar OOP1.Buku ======")
    println("1.")

    println("2.")


    print("Silakan pilih buku (1/2): ")
    val pilihan = scanner.nextInt()

    val selectedBook = when (pilihan) {
        1 -> book1
        2 -> book2
        else -> {
            println("OOP1.Buku tidak tersedia.")
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
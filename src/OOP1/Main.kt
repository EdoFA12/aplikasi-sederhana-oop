package OOP1
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Judul Buku ke-1: ")
    val inputNama1 = scanner.nextLine().trim()
    val book1 = Buku(inputNama1, 25000)

    print("Masukkan Judul Buku ke-2: ")
    val inputNama2 = scanner.nextLine().trim()
    val book2 = Buku(inputNama2, 30000)

    val daftarBuku = arrayOf(book1, book2)

    println("\n====== Daftar Buku Tersedia ======")
    println("1. ${daftarBuku[0].Tampilkan()}")
    println("2. ${daftarBuku[1].Tampilkan()}")
    println("==================================")

    var selectedBook: Buku? = null

    while (selectedBook == null) {
        print("Silakan pilih buku (1/2): ")
        if (scanner.hasNextInt()) {
            val pilihan = scanner.nextInt()
            scanner.nextLine()

            selectedBook = when (pilihan) {
                1 -> book1
                2 -> book2
                else -> {
                    println(" Pilihan tidak valid. Masukkan 1 atau 2.")
                    null
                }
            }
        } else {
            println(" Input harus berupa angka (1 atau 2).")
            scanner.nextLine()
        }
    }

    var jumlah = 0
    while (jumlah <= 0) {
        print("Masukkan jumlah buku yang dibeli: ")
        if (scanner.hasNextInt()) {
            val inputJumlah = scanner.nextInt()
            scanner.nextLine()
            if (inputJumlah > 0) {
                jumlah = inputJumlah
            } else {
                println(" Jumlah buku harus lebih dari 0.")
            }
        } else {
            println(" Input jumlah harus berupa angka.")
            scanner.nextLine()
        }
    }

    val transaksi = Transaksi(selectedBook!!, jumlah)

    println("Total harga yang harus dibayar: Rp${transaksi.total}")

    var bayar = 0
    while (bayar <= 0) {
        print("Masukkan uang pembayaran: Rp")
        if (scanner.hasNextInt()) {
            val inputBayar = scanner.nextInt()
            scanner.nextLine()
            if (inputBayar > 0) {
                bayar = inputBayar
            } else {
                println(" Uang pembayaran harus lebih dari 0.")
            }
        } else {
            println(" Input pembayaran harus berupa angka.")
            scanner.nextLine()
        }
    }

    transaksi.prosesPembayaran(bayar)

    scanner.close()
}
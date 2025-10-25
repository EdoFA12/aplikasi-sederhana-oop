package OOP1

class Transaksi(private val buku: Buku, private val jumlah: Int) {
    val total:Int = buku.harga * jumlah

    fun prosesPembayaran(bayar: Int) {
        if (bayar >= total) {
            val kembalian = bayar - total
            println("Pembayaran berhasil! Kembalian Anda: Rp$kembalian")
        } else {
            val kurang = total - bayar
            println("Uang Anda kurang Rp$kurang. OOP1.Transaksi dibatalkan.")
        }
    }
}
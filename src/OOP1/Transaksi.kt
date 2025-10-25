package OOP1

class Transaksi(private val buku: Buku, private val jumlah: Int) {
    val total: Int = buku.harga * jumlah

    fun prosesPembayaran(bayar: Int) {
        println("\n--- Detail Transaksi ---")
        println("Buku: ${buku.namaBuku} (${buku.harga} x $jumlah)")
        println("Total Harga: Rp$total")
        println("Uang Bayar: Rp$bayar")
        println("------------------------")

        if (bayar >= total) {
            val kembalian = bayar - total
            println("✅ Pembayaran BERHASIL!")
            println("Kembalian Anda: Rp$kembalian")
        } else {
            val kurang = total - bayar
            println("❌ Pembayaran GAGAL!")
            println("Uang Anda kurang Rp$kurang. Transaksi dibatalkan.")
        }
    }
}
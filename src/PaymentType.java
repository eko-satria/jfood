/**
 * Enum yang memuat informasi yang dibutuhkan mengenai kategori makanan
 * 
 * @author Eko Satria
 * @version 05-03-2020
 * 
 */
public enum PaymentType {   //enum untuk tipe pembayaran
    Cashless("Cashless"),   //awal enum
    Cash("Cash");           //akhir enum
    
    String paymentType;     //variabel string untuk tipe pembayaran yang dipilih
    
    /**
     * Metode yang digunakan untuk mendapatkan tipe pembayaran
     * @param paymentType Type of payment
     * @return nothing
     */
    PaymentType (String paymentType) {
        this.paymentType = paymentType;
    }
    
    /**
     * Metode yang digunakan untuk mengembalikan nilai string tipe pembayaran
     * @param nothing
     * @return paymentType Type of payment
     */
    public String toString () {
        return paymentType;
    }
}

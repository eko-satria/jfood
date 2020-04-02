/**
 * Enum yang memuat informasi yang dibutuhkan mengenai status faktur
 * 
 * @author Eko Satria
 * @version 06-03-2020
 * 
 */
public enum InvoiceStatus {     //enum untuk status faktur
    Ongoing ("Ongoing"),        //isi enum
    Finished ("Finished"),      //~
    Cancelled ("Cancelled");    //akhir enum
    
    String status;              //variabel string untuk status yang dipilih
    
    /**
     * Metode yang digunakan untuk mendapatkan status faktur
     * @param status Status of invoice
     * @return nothing
     */
    InvoiceStatus (String status) {
        this.status = status;
    }
    
    /**
     * Metode yang digunakan untuk mengembalikan nilai string status faktur
     * @param nothing
     * @return status Status of invoice
     */
    public String toString () {
        return status;
    }
}

package EkoSatria.jfood; /**
 * Kelas memuat informasi yang dibutuhkan mengenai faktur penjualan.
 * Kelas ini bersifat abstrak
 * 
 * @author Eko Satria
 * @version 27-02-2020
 * 
 */

/**
 * Import library yang dibutuhkan
 */
import java.util.*;
import java.text.SimpleDateFormat;

public abstract class Invoice {                     //kelas yang memuat informasi mengenai faktur
    private int id;                                 //variabel privat untuk ID dari faktur
    private ArrayList<Food> foods;                              //variabel privat untuk ID dari makanan
    private Calendar date;                          //variabel privat untuk tanggal faktur
    protected int totalPrice;                       //variabel privat untuk total harga
    private Customer customer;                      //variabel privat untuk pelanggan, diambil dari kelas Customer
    private InvoiceStatus invoiceStatus;            //variabel privat untuk status faktur, diambil dari kelas InvoiceStatus
    
    /**
     * Constructor untuk kelas Invoice
     * @param id ID dari faktur, bernilai integer
     * @param food Informasi mengenai makanan yang terjual, diambil dari kelas Food
     * @param customer Informasi pelanggan, diambil dari kelas Customer
     * @param invoiceStatus Informasi mengenai status faktur, diambil dari kelas InvoiceStatus
     * @return nothing
     */
    public Invoice (int id, ArrayList<Food> foods, Customer customer) {
      this.id = id;
      this.foods = new ArrayList<Food>();
      this.customer = customer;
      this.totalPrice = totalPrice;
      this.date = Calendar.getInstance();
    }

    /**
     * Metode accessor yang digunakan untuk mendapatkan ID faktur
     * Metode akan mengembalikan nilai integer
     * @param nothing
     * @return id ID of invoice
     */
    public int getId () {
        return id;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan informasi makanan
     * Metode akan mengembalikan nilai berdasarkan parameter dari kelas Food
     * @param nothing
     * @return food Food information from Food class
     */
    public ArrayList<Food> getFoods () {
        return foods;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan tanggal faktur
     * Metode akan mengembalikan nilai Calendar
     * @param nothing
     * @return date Date of invoice
     */
    public Calendar getDate () {
        return date;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan total harga dari faktur
     * Metode akan mengembalikan nilai integer
     * @param nothing
     * @return totalPrice Total price of invoice
     */
    public int getTotalPrice () {
        return totalPrice;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan informasi pelanggan
     * Metode akan mengembalikan nilai sesuai dengan parameter dari kelas Customer
     * @param nothing
     * @return customer Customer of invoice
     */
    public Customer getCustomer () {
        return customer;
    }
    
    /**
     * Metode abstrak yang digunakan untuk mendapatkan tipe pembayaran untuk faktur
     * Metode ini berhubungan dengan kelas CashInvoice dan CashlessInvoice
     */
    public abstract PaymentType getPaymentType ();
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan status dari faktur
     * Metode akan mengembalikan nilai sesuai dengan parameter yang ada di kelas InvoiceStatus
     * @param nothing
     * @return invoiceStatus Invoice status from InvoiceStatus class
     */
    public InvoiceStatus getInvoiceStatus () {
        return invoiceStatus;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur ID dari faktur
     * @param id ID of invoice
     * @return nothing
     */
    public void setId (int id) {
        this.id = id;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur parameter makanan
     * @param food Food parameters
     * @return nothing
     */
    public void setFood (Food food) {
        this.foods = foods;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur tanggal dari faktur
     * @param date Date of invoice
     * @return nothing
     */
    public void setDate(Calendar date) {
        this.date = date;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur tanggal dari faktur
     * @param year Year of Gregorian Calendar
     * @param month Month of Gregorian Calendar
     * @param dayOfMonth Day of Gregorian Calendar
     * @return nothing
     */
    public void setDate(int year, int month, int dayOfMonth){
        date = new GregorianCalendar(dayOfMonth, month, year);
    }
    
    /**
     * Metode abstrak untuk mengatur total harga
     * Metode ini berhubungan dengan kelas CashInvoice dan CashlessInvoice
     */
    public abstract void setTotalPrice ();
    
    /**
     * Metode mutator yang digunakan untuk mengatur informasi pelanggan dari faktur
     * @param customer Customer of invoice
     * @return nothing
     */
    public void setCustomer (Customer customer) {
        this.customer = customer;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur informasi status faktur
     * @param invoiceStatus Status of invoice
     * @return nothing
     */
    public void setInvoiceStatus (InvoiceStatus invoiceStatus) {
        this.invoiceStatus = InvoiceStatus.Ongoing;
    }
    
    /**
     * Metode yang digunakan untuk melakukan print terhadap variabel yang digunakan
     */
    public abstract String toString();
}

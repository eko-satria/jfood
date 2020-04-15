package EkoSatria.jfood;

/**
 *  Kelas yang memuat informasi mengenai faktur pesanan yang menggunakan uang non-tunai.
 *  
 *  @author Eko Satria
 *  @version 12-03-2020
 *  
 */

/**
 * Import library yang dibutuhkan
 */
import java.util.*;
import java.text.SimpleDateFormat;

public class CashlessInvoice extends Invoice {                              //kelas faktur pesanan non-tunai, mengambil inheritance dari kelas Invoice
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless;   //variabel tipe pesanan dengan enum dari PaymentType, berisikan Cashless dan bersifat final
    private Promo promo;                                                    //variabel privat untuk promo, diambil dari keras promo

    /**
     * Konstruktor untuk kelas faktur non-tunai, tanpa promo
     * @param id ID dari faktur, bernilai integer
     * @param food Informasi mengenai makanan yang terjual, diambil dari kelas Food
     * @param customer Informasi pelanggan, diambil dari kelas Customer
     * @param invoiceStatus Informasi faktur, diambil dari enum InvoiceStatus
     * @return nothing
     */
    public CashlessInvoice (int id, ArrayList<Food> foods, Customer customer) {
        super(id, foods, customer);         //assign parameter ke superclass, Invoice
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        
    }
    
    /**
     * Konstruktor untuk kelas faktur non-tunai, tanpa promo
     * @param id ID dari faktur, bernilai integer
     * @param food Informasi mengenai makanan yang terjual, diambil dari kelas Food
     * @param customer Informasi pelanggan, diambil dari kelas Customer
     * @param invoiceStatus Informasi faktur, diambil dari enum InvoiceStatus
     * @param promo Informasi mengenai promo, diambil dari kelas Promo
     * @return nothing
     */
    public CashlessInvoice (int id, ArrayList<Food> foods, Customer customer, InvoiceStatus invoiceStatus, Promo promo) {
        super (id, foods, customer);    //assign parameter ke superclass, Invoice
        this.promo = promo;
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
    }

    /**
     * Metode accessor yang digunakan untuk mendapatkan tipe pembayaran faktur
     * Metode akan mengembalikan nilai string berdasarkan enum yang dipilih
     * @param nothing
     * @return PAYMENT_TYPE Tipe pembayaran faktur
     */
    public PaymentType getPaymentType () {
        return PAYMENT_TYPE;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan informasi mengenai promo
     * Metode akan mengembalikan promo
     * @param nothing
     * @return promo Promo yang ada
     */
    public Promo getPromo () {
        return promo;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur promo untuk faktur
     * @param promo Promo untuk faktur
     * @return nothing
     */
    public void setPromo (Promo promo) {
        this.promo = promo;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur harga total penjualan
     * Metode akan melakukan pengecekan sesuai dengan parameter yang diinginkan atau dipenuhi
     * @param nothing
     * @return nothing
     */
    public void setTotalPrice () {
        /*if (promo != null && promo.getActive() == true && getFood().getPrice() > promo.getMinPrice()) {     //kondisi: ada promo, promo sedang aktif dan harga total lebih besar daripada harga minimum
        super.totalPrice = getFood().getPrice() - promo.getDiscount();                                  //passing nilai total harga ke superclass dimana harga total = harga total - harga diskon
        } else {                                                                                            //apabila kondisi pertama tidak terpenuhi
        super.totalPrice = getFood().getPrice();                                                        //passing nilai total harga ke superclass, sesuai dengan total harga saat ini
        }*/
        getFoods().forEach((foodPrice) -> {
            if (promo != null && promo.getActive() == true && foodPrice.getPrice() > promo.getMinPrice()) {
                super.totalPrice = super.totalPrice + foodPrice.getPrice() - promo.getDiscount();
            } else {
                super.totalPrice = super.totalPrice + foodPrice.getPrice();
            }
        });
    }
    
    /**
     * Metode yang digunakan untuk melakukan print terhadap variabel yang diberikan
     
    public void printData () {
        if (promo != null && promo.getActive() == true && getFood().getPrice() > promo.getMinPrice()) {     //kondisi: ada promo, promo sedang aktif dan harga total lebih besar daripada harga minimum
            System.out.println ("===============================INVOICE===============================");
            System.out.println ("ID: " + getId());
            System.out.println ("Food: " + getFood().getName());
            System.out.println ("Date: " + getDate());
            System.out.println ("Customer: " + getCustomer().getName());
            System.out.println ("Promo: " + promo.getCode());
            System.out.println ("Total price: " + super.totalPrice);
            System.out.println ("Status: " + getInvoiceStatus());
            System.out.println ("Payment Type: " + getPaymentType());                                       //print sesuai kondisi
        } else {                                                                                            //apabila kondisi pertama tidak terpenuhi
            System.out.println ("===============================INVOICE===============================");
            System.out.println ("ID: " + getId());
            System.out.println ("Food: " + getFood().getName());
            System.out.println ("Date: " + getDate());
            System.out.println ("Customer: " + getCustomer().getName());
            System.out.println ("Total price: " + super.totalPrice);
            System.out.println ("Status: " + getInvoiceStatus());
            System.out.println ("Payment Type: " + getPaymentType());                                       //print sesuai kondisi
        }
    }*/
    
    /**
     * Metode yang digunakan untuk melakukan print terhadap variabel yang diberikan
     */
    public String toString() {
        String foods = " ";
        
        for(Food foodList : getFoods()) {
            foods = foods + foodList.getName() + ", ";
        }
        foods = foods.substring(0, foods.length() - 2);
        
        if (promo != null && promo.getActive() == true && getTotalPrice() > promo.getMinPrice()) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
            
            return "===============================INVOICE===============================" +
            "\nID: " + getId() +
            "\nFood: " + foods +
            "\nDate: " + sdf.format(super.getDate().getTime()) +
            "\nCustomer: " + getCustomer().getName() +
            "\nPromo: " + promo.getCode() + 
            "\nTotal Price: " + super.totalPrice +
            "\nStatus: " + getInvoiceStatus() +
            "\nPayment Type: " + getPaymentType();
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
            
            return "\n\n===============================INVOICE===============================" +
            "\nID: " + getId() +
            "\nFood: " + foods +
            "\nDate: " + sdf.format(super.getDate().getTime()) +
            "\nCustomer: " + getCustomer().getName() + 
            "\nTotal Price: " + super.totalPrice +
            "\nStatus: " + getInvoiceStatus() +
            "\nPayment Type: " + getPaymentType();
        }
    }
}

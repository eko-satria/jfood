/**
 *  Kelas yang memuat informasi mengenai faktur pesanan yang menggunakan uang tunai.
 *  
 *  @author Eko Satria
 *  @version 13-03-2020
 *  
 */

/**
 * Import library yang dibutuhkan
 */
import java.util.*;
import java.text.SimpleDateFormat;

public class CashInvoice extends Invoice {                              //kelas faktur pesanan non-tunai, mengambil inheritance dari kelas Invoice
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash;   //variabel tipe pesanan dengan enum dari PaymentType, berisikan Cashless dan bersifat final
    private int deliveryFee;                                            //variabel privat untuk biaya pengiriman
    
    /**
     * Konstruktor untuk kelas faktur tunai, tanpa biaya pengiriman
     * @param id ID dari faktur, bernilai integer
     * @param food Informasi mengenai makanan yang terjual, diambil dari kelas Food
     * @param customer Informasi pelanggan, diambil dari kelas Customer
     * @param invoiceStatus Informasi faktur, diambil dari enum InvoiceStatus
     * @return nothing
     */
    public CashInvoice (int id, ArrayList<Food> foods, Customer customer) {
        super(id, foods, customer);     //assign parameter ke superclass, Invoice
    }
    
    /**
     * Konstruktor untuk kelas faktur tunai, dengan biaya pengiriman
     * @param id ID dari faktur, bernilai integer
     * @param food Informasi mengenai makanan yang terjual, diambil dari kelas Food
     * @param customer Informasi pelanggan, diambil dari kelas Customer
     * @param invoiceStatus Informasi faktur, diambil dari enum InvoiceStatus
     * @param deliveryFee Harga biaya pengiriman, bernilai integer
     * @return nothing
     */
    public CashInvoice (int id, ArrayList<Food> foods, Customer customer, int deliveryFee) {
        super(id, foods, customer);     //assign parameter ke superclass, Invoice
        this.deliveryFee = deliveryFee;
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
     * Metode accessor yang digunakan untuk mendapatkan informasi mengenai harga biaya pengiriman
     * Metode akan mengembalikan integer untuk harga biaya pengiriman
     * @param nothing
     * @return deliveryFee Harga biaya pengiriman
     */
    public int getDeliveryFee () {
        return deliveryFee;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur harga biaya pengiriman untuk faktur
     * @param deliveryFee Harga biaya pengiriman untuk faktur
     * @return nothing
     */
    public void setDeliveryFee (int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur harga total penjualan
     * Metode akan melakukan pengecekan sesuai dengan parameter yang diinginkan atau dipenuhi
     * @param nothing
     * @return nothing
     */
    public void setTotalPrice () {
        /*if (deliveryFee != 0) {                                             //kondisi: tidak ada atau harga biaya pengiriman sama dengan nol
        super.totalPrice = getFood().getPrice() + getDeliveryFee();     //passing nilai total harga ke superclass dimana harga total = harga total ditambah biaya pengiriman
        } else {                                                            //apabila kondisi pertama tidak terpenuhi
        super.totalPrice = getFood().getPrice();                        //passing nilai total harga ke superclass, sesuai dengan total harga saat ini
        }*/
        getFoods().forEach((foodPrice) -> {
            if (deliveryFee != 0) {
                totalPrice = totalPrice + foodPrice.getPrice() + getDeliveryFee();
            } else {
                totalPrice = totalPrice + foodPrice.getPrice();
            }
        });
    }
    
    /**
     * Metode yang digunakan untuk melakukan print terhadap variabel yang diberikan
     
    public void printData () {
            System.out.println ("===============================INVOICE===============================");
            System.out.println ("ID: " + getId());
            System.out.println ("Food: " + getFood().getName());
            System.out.println ("Date: " + getDate());
            System.out.println ("Customer: " + getCustomer().getName());
            System.out.println ("Delivery Fee: " + getDeliveryFee());
            System.out.println ("Total price: " + super.totalPrice);
            System.out.println ("Status: " + getInvoiceStatus());
            System.out.println ("Payment Type: " + getPaymentType());
    }*/
    
    /**
     * Metode yang digunakan untuk melakukan print terhadap variabel yang diberikan
     */
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        String foods = " ";
        
        for(Food foodList : getFoods()) {
            foods = foods + foodList.getName() + ", ";
        }
        foods = foods.substring(0, foods.length() - 2);
        
        return "\n\n===============================INVOICE===============================" +
            "\nID: " + getId() +
            "\nFood: " + foods +
            "\nDate: " + sdf.format(super.getDate().getTime()) +
            "\nCustomer: " + super.getCustomer().getName() +
            "\nDelivery Fee: " + getDeliveryFee() +
            "\nTotal Price: " + super.totalPrice +
            "\nStatus: " + super.getInvoiceStatus() +
            "\nPayment Type: " + getPaymentType();
    }
}

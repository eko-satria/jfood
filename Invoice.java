/**
 * ini berfungsi untuk menyimpan semua data dari invoice
 *
 * @author eko satria
 * @version 0.9.0
 * @sin28-02-2020
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    protected int totalPrice;
    private String date;
    private Customer customer;
    private PaymentType paymentType;
    private InvoiceStatus invoiceStatus;
    private Food food;
    
    /**
     * Constructor for objects of class Invoice
     * @param customer, @param id, @param idFood, 
     * @param date, @param totalPrice 
     */
    public Invoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        this.customer = customer; // customer disini mengarah pada customer instance
        this.id = id; //id disini mengarah pada id instance
        this.food = food; // idFood disini mengarah pada idFood instance
        this.date = date; //date disini mengarah pada date instance
        this.totalPrice = totalPrice; //totalPrice disini mengarah pada totalPrice instance
        this.invoiceStatus = invoiceStatus;
    }

     /**
     * get id method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return id
     */
    //get the id
    public int getId()
    {
        return id; //exit method id
    }

     /**
     * get idFood method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return idFood
     */
    //get the idFood
    public Food getFood()
    {
        return food; //exit method idFood
    }    
 
         /**
     * get date method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return date
     */
    //get the date
    public String getDate()
    {
        return date; //exit method date
    }    

         /**
     * get totalPrice method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return totalPrice
     */
    //get the totalPrice
    public int getTotalPrice()
    {
        return totalPrice; //exit method totalPrice
    }    
    
     /**
     * get customer method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return customer
     */
    public Customer getCustomer()
    {
        return customer; //exit method customer
    }
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus()
    {
        return invoiceStatus;
    }
    
        /**
     * set id
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param id
     */
    public void setId(int id)
    {
        this.id = id; //assign id ke id instance
    }
    
     /**
     * set idFood
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param idFood
     */
    public void setFood(Food food)
    {
        this.food = food; //assign idFood ke idFood instance
    }
    
     /**
     * set date
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param date
     */
    public void setDate(String date)
    {
        this.date = date; //assign date ke date instance
    }
    
     /**
     * set totalPrice
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param totalPrice
     */
    public abstract void setTotalPrice();
       
     /**
     * set customer
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param customer
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer; //assign customer ke customer instance
    }
    
    public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }
    
    public abstract void printData();
    
}

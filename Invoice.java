/**
 * ini berfungsi untuk menyimpan semua data dari invoice
 *
 * @author eko satria
 * @version 0.9.0
 * @sin28-02-2020
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id, idFood, totalPrice;
    private String date;
    private Customer customer;
    private PaymentType paymentType;
    private InvoiceStatus status;
    
    /**
     * Constructor for objects of class Invoice
     * @param customer, @param id, @param idFood, 
     * @param date, @param totalPrice 
     */
    public Invoice(int id, int idFood, String date, Customer customer, int totalPrice, InvoiceStatus status)
    {
        this.customer = customer; // customer disini mengarah pada customer instance
        this.id = id; //id disini mengarah pada id instance
        this.idFood = idFood; // idFood disini mengarah pada idFood instance
        this.date = date; //date disini mengarah pada date instance
        this.totalPrice = totalPrice; //totalPrice disini mengarah pada totalPrice instance
        this.status = status;
    }

     /**
     * get id method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return id
     */
    //get the id
    public int getId()
    {
        return (id); //exit method id
    }

     /**
     * get idFood method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return idFood
     */
    //get the idFood
    public int getIdFood()
    {
        return (idFood); //exit method idFood
    }    
 
         /**
     * get date method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return date
     */
    //get the date
    public String getDate()
    {
        return (date); //exit method date
    }    

         /**
     * get totalPrice method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return totalPrice
     */
    //get the totalPrice
    public int getTotalPrice()
    {
        return (totalPrice); //exit method totalPrice
    }    
    
     /**
     * get customer method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return customer
     */
    public Customer getCustomer()
    {
        return(customer); //exit method customer
    }
    
    public InvoiceStatus getStatus()
    {
        return status;
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
    public void setidFood(int idFood)
    {
        this.idFood = idFood; //assign idFood ke idFood instance
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
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice; //assign totalPrice ke totalPrice instance
    }
    
     /**
     * set customer
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param customer
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer; //assign customer ke customer instance
    }
    
    public void setStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    
    public void printData()
    {
        System.out.println("====INVOICE====");
        System.out.println("ID: " +getId());
        System.out.println("Food ID: " + getIdFood());
        System.out.println("Date: " +getDate());
        System.out.println("Customer: " + getCustomer().getName());
        System.out.println("Total Price: " +getTotalPrice());
        System.out.println("Status: " + getStatus());
    }
    
}

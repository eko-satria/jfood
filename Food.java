
/**
 * ini berfungsi untuk menyimpan semua data dari food
 *
 * @author eko satria
 * @version 0.9.0
 * @sin28-02-2020
 */
public class Food
{
    // instance variables - replace the example below with your own
    private int id, price;
    private String name;
    private Seller seller;
    private FoodCategory category;

    /**
     * Constructor for objects of class Customer
     * @param id, @param name, 
     * @param seller, @param price, @param category
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category)
    {
        this.id = id; //id disini mengarah pada id instance
        this.name = name; //name disini mengarah pada name instance
        this.seller = seller; //seller disini mengarah pada seller instance
        this.price = price; //price disini mengarah pada price instance
        this.category = category; //category disini mengarah pada category instance
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
     * get seller method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return seller
     */
    //get the seller
    public Seller getSeller()
    {
        return (seller); //exit method seller
    }
    
     /**
     * get name method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return name
     */
    //get the name
    public String getName()
    {
        return (name); //exit method name
    }
    
     /**
     * get price method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return price
     */
    //get the price
    public int getPrice()
    {
        return (price); //exit method price
    }
    
     /**
     * get category method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return category
     */
    //get the category
    public FoodCategory getCategory()
    {
        return category; //exit method category
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
     * set seller
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param seller
     */
    public void setSeller(Seller seller)
    {
        this.seller = seller; //assign seller ke seller instance
    }
    
        /**
     * set name
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param name
     */
    public void setName(String name)
    {
        this.name = name; //assign name ke name instance
    }
    
        /**
     * set price
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param price
     */
    public void setPrice(int price)
    {
        this.price = price; //assign price ke price instance
    }
    
        /**
     * set category
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param category
     */
    public void setCategory(FoodCategory category)
    {
        this.category = category; //assign category ke category instance
    }
    
    public void printData()
    {
           System.out.println("===========FOOD===========");
           System.out.println(id);
           System.out.println(name);
           System.out.println(seller.getName());
           System.out.println(getSeller().getLocation().getCity());
           System.out.println(getPrice());
           System.out.println(getCategory());
    }
}

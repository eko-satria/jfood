/**
 * ini berfungsi untuk menyimpan semua data dari seller
 *
 * @author eko satria
 * @version 0.9.0
 * @sin28-02-2020
 */
public class Seller
{
    // instance variables - replace the example below with your own
    private int id;
    private String name, email, phoneNumber;
    private Location location;

     /**
     * Constructor for objects of class Seller
     * @param id,@param name, 
     * @param email, @param phoneNuber, @param location
     */
    public Seller(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id; //id disini mengarah pada id instance
        this.name = name; //name disini mengarah pada name instance
        this.email =email; //email disini mengarah pada email instance
        this.phoneNumber = phoneNumber; //phoneNumber disini mengarah pada phoneNumber instance
        this.location = location; //location disini mengarah pada location instance
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
     * get email method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return email
     */
    //get the id
    public String getEmail()
    {
        return (email); //exit method email
    }
    
     /**
     * get phoneNumber method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return phoneNumber
     */
    //get the id
    public String getPhoneNumber()
    {
        return (phoneNumber); //exit method phoneNumber
    }    
    
     /**
     * get location method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return location
     */
    //get the id
    public Location getLocation()
    {
        return (location); //exit method location
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
     * set name
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param name
     */
    public void setName(String name)
    {
        this.name = name; //assign name ke name instance
    }
    
    /**
     * set email
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param id
     */
    public void setEmail(String email)
    {
         this.email = email; //assign email ke email instance
    }
    
    /**
     * set phoneNumber
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber; //assign phoneNumber ke phoneNumber instance
    }
    
    /**
     * set location
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param location
     */
    public void setLocation (Location location)
    {
        this.location = location; //assign location ke location instance
    }
    
    public void printData ()
    {
    }
}


/**
 * Write a description of class Seller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Seller
{
    // instance variables - replace the example below with your own
    private int id;
    private String name, email, phoneNumber;
    private Location location;

    public Seller(int id, String name, String email, String phoneNumber, Location location)
    {
    }

    public int getId()
    {
        return (id);
    }
    
    public String getName()
    {
        return (name);
    }
    
    public String getEmail()
    {
        return (email);
    }
    
    public String getPhoneNumber()
    {
        return (phoneNumber);
    }    
    
    public Location getLocation()
    {
        return (location);
    }   
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
         this.email = email;
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public void setLocation (Location location)
    {
        this.location = location;
    }
    
    public void printData ()
    {
    }
}

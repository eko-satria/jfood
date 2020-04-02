
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    private static String[] listFood;
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables
        x = 0;
    }

    public boolean addCustomer (Customer customer)
    {
        return(true);
    }
    
    public boolean removeCustomer(Customer customer)
    {
        return(true);
    }
    
    public Customer getCustomer()
    {
        return null;
    }
    
    public static String[] getListFood ()
    {
        return (listFood); //exit method listFood
    }
}

/**
 * ini berfungsi untuk menyimpan semua data dari databaseFood
 *
 * @author eko satria
 * @version 0.9.0
 * @sin28-02-2020
 */
public class DatabaseFood
{
    // instance variables - replace the example below with your own
    private static String[] listFood;

    /**
     * Constructor for objects of class DatabaseFood
     * @param listFood
     */
    public DatabaseFood()
    {
    }

    public boolean addFood(Food food)
    {
        return (true); 
    }
    
    public boolean removeFood(Food food)
    {
        return (true);
    }
        
    public Seller getSeller()
    {
        return null;
    }
    /**
     * get listFood method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return listFood
     */
    //get the listFood
    public static String[] getListFood ()
    {
        return (listFood); //exit method listFood
    }
}

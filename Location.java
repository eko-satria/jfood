/**
 * ini berfungsi untuk menyimpan semua data dari location
 *
 * @author eko satria
 * @version 0.9.0
 * @sin28-02-2020
 */
public class Location
{
    // instance variables - replace the example below with your own
    private String province, description, city;

    /**
     * Constructor for objects of class Location
     * @param city, @param province, @param description
     */
    public Location(String city, String province, String description)
    {
        this.city = city; //city disini mengarah pada city instance
        this.province = province; //province disini mengarah pada province instance
        this.description = description; //description disini mengarah pada description instance
    }

     /**
     * get province method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return province
     */
    //get the province
    public String getProvince()
    {
        return (province); //exit method province
    }
    
         /**
     * get city method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return city
     */
    //get the city
    public String getCity()
    {
        return (city); //exit method city
    }
    
         /**
     * get description method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return description
     */
    //get the description
    public String getDescription()
    {
        return (description); //exit method description
    }
    
    /**
     * set province
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param province
     */
    public void setProvince (String province)
    {
        this.province = province; //assign province ke province instance
    }
    
    /**
     * set city
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param city
     */
    public void setCity (String city)
    {
        this.city = city; //assign city ke city instance
    }
    
    /**
     * set description
     * berfungsi mengupdate objek state terakhir dari id instance
     * @param description
     */
    public void setDescription (String description)
    {
        this.description = description; //assign description ke description instance
    }
    
    public void printData ()
    {
        System.out.println(province);
    }
}

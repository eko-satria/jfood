
/**
 * ini berfungsi untuk menyimpan semua data dari customer
 *
 * @author eko satria
 * @version 0.9.0
 * @sin28-02-2020
 */
public class Customer
{
    private int id;
    private String name, email, password, joinDate;

    /**
     * Constructor for objects of class Customer
     * @param id, @param name, @param email, 
     * @param passwword, @param joinDate
     */
    public Customer(int id, String name, String email, String password, String joinDate)
    {
        this.id = id; //id disini mengarah pada id instance
        this.name = name; //name disini mengarah pada name instance
        this.email = email; //email disini mengarah pada email instance
        this.password = password; //password disini mengarah pada password instance
        this.joinDate = joinDate; //joinDate disini mengarah pada joinDate instance
    }
    
    /**
     * get id method
     * berfungsi mengambil objek state terakhir dari id instance
     * @return id
     */
    //get the id
    public int getid()
    {
        return (id); //exit id method
    }
    
     /**
     * get name method
     * berfungsi mengambil objek state terakhir dari name instance
     * @return name
     */
    //get name
    public String getName() 
    {
        return (name); //exit name method
    }
    
     /**
     * get email method
     * berfungsi mengambil objek state terakhir dari email instance
     * @return email
     */
    //get the email
    public String getEmail() 
    {
        return (email); //exit email method
    }
    
     /**
     * get password method
     * berfungsi mengambil objek state terakhir dari password instance
     * @return password
     */
    //get the password
    public String getPassword()
    {
        return (password); //exit method password
    }
    
     /**
     * get joinDate method
     * berfungsi mengambil objek state terakhir dari joinDate instance
     * @return joinDate
     */
    //get the joinDate
    public String getJoinDate()
    {
        return (joinDate); //exit method joinDate
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
     * berfungsi mengupdate objek state terakhir dari name instance 
     * @name
     */
    public void setName(String name)
    {
        this.name = name; //assign name ke name instance
    }
    
     /**
     * set email, 
     * berfungsi mengupdate objek state terakhir dari email instance
     * @email
     */
    public void setEmail(String email)
    {
        this.email = email; //assign email ke email instance
    }
    
     /**
     * set password
     * berfungsi mengupdate objek state terakhir dari password instance 
     * @password
     */
    public void setPassword(String password)
    {
        this.password = password; //assign password ke password instance
    }
    
    /**
     * set joinDate 
     * berfungsi mengupdate objek state terakhir dari joinDate instance 
     * @joinDate
     */    
    public void setJoinDate(String joinDate)
    {
        this.joinDate = joinDate; //assign joinDate ke email joinDate
    }
    
    public void printData ()
    {
    }
    
}

/**
 * Write a description of class JFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JFood
{
    public static void main (String[] args){
        Location location1 = new Location
        ("chemnitz", "Berlin", "Pusat");
        Seller seller1 = new Seller
        (1,"yuyu", "yuyu@yahoo.com", "0888", location1);
        Food food1 = new Food
        (1, "ayam geprek", seller1, 14000, "ayam");
        Customer customer1 = new Customer
        (1, "hanon", "hanonnya@gmail.com", "nigga", "22-1-2019");
        Invoice invoice1 = new Invoice
        (1, 14, "27-2-2020", customer1, 14000);
            };
}

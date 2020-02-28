public class JFood
{   
   
    public static void main (String[] args){
            //location dulu karna seller membutuhkan location 
        //sebagai salah satu classnya
        Location location1 = new Location 
        //urutannya
        //"city","province","description"
        ("Jakarta", "Jakarta", "Timur");
        //seller dulu karna food membutuhkan seller
        //sebagai salah satu classnya
        Seller seller1 = new Seller
        //urutannya
        //id,"name","email","phoneNumber",location
        (1,"eko", "eko.satria@ui.ac.id", "081246831820", location1);
        Food food1 = new Food
        //urutannya
        //id, "name", seller, price, "category"
        (1, "ayam geprek", seller1, 14000, "ayam");
        Customer customer1 = new Customer
        //urutannya
        //id,"name","eamil","password","joinDate"
        (1, "hanon", "hanonnya@gmail.com", "nigga", "22-1-2019");
        //urutannya
        //id, idFood,"joinDate",customer, totalPrice
        Invoice invoice1 = new Invoice
        (1, 14, "27-2-2020", customer1, 14000);

        System.out.println(seller1.getName());
        food1.getName();
        customer1.getName();
        
        
    }
             
}
     
    
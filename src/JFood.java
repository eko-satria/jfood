/**
 *  Kelas yang memuat informasi mengenai sistem penjualan JFood.
 *  
 *  @author Eko Satria
 *  @version 13-03-2020
 *  
 */

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.regex.*;

public class JFood {        //Kelas yang memuat informasi sistem penjualan JFood
    
    public static void main (String[] args) {
        Location location = new Location("Depok", "Jawa Barat", "Tempat Makan nomor 1 se-Depok");

        DatabaseSeller.addSeller(new Seller(DatabaseCustomer.getLastId(), "Marinus Martin", "martinf95@gmail.gov", "08227617829", location));

        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId(), "Eko Satria", "eko.satria@ui.ac.id", "qwerty19OK"));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId(), "Eko Satria", "eko.satria@ui.ac.id", "WASD9090yeah"));
        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId(), "Fathur", "fathur@gmail.com", "AAAAAyeah10"));
        
        System.out.println(DatabaseCustomer.getCustomerDatabase());
        
        Food pizza = new Food(1, "Pizza", DatabaseSeller.getSellerById(0), 125000, FoodCategory.Western);
        Food esTeh = new Food(2, "Iced Tea", DatabaseSeller.getSellerById(0), 3000, FoodCategory.Beverages);
        Food esKopi = new Food(3, "Iced Cofee", DatabaseSeller.getSellerById(0), 20000, FoodCategory.Beverages);
        
        System.out.println(DatabaseFood.getFoodByCategory(FoodCategory.Beverages));
        System.out.println(DatabaseFood.getFoodByCategory(FoodCategory.Bakery));
    }
}

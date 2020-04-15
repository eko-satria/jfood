package EkoSatria.jfood;

/**
 * Kelas memuat informasi yang dibutuhkan mengenai database makanan.
 * 
 * @author Eko Satria
 * @version 27-02-2020
 * 
 */
import java.util.*;

public class DatabaseFood {             //kelas yang memuat informasi mengenai database makanan
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<>();         //variabel privat berupa string dari daftar makanan
    private static int lastId = 0;
    
    /**
     * Constructor untuk kelas DatabaseFood
     * @param nothing
     * @return nothing
     */
    public DatabaseFood() {
        
    }
    
    public static ArrayList<Food> getFoodDatabase() {
        return FOOD_DATABASE;
    }
    
    public static int getLastId() {
        return lastId;
    }
    
    public static Food getFoodById(int id) throws FoodNotFoundException{
        for(Food food : FOOD_DATABASE) {
            if(food.getId() == id) {
                return food;
            }
        }
        throw new FoodNotFoundException(id);
    }
    
    public static ArrayList<Food> getFoodBySeller(int id) {
        for(Food seller : FOOD_DATABASE) {
            if(seller.getId() == id) {
                FOOD_DATABASE.add(seller);
                return FOOD_DATABASE;
            }
        }
        return null;
    }
    
    public static ArrayList<Food> getFoodByCategory(FoodCategory category) {
        ArrayList<Food> list = new ArrayList<Food>();
        
        for(Food food : FOOD_DATABASE) {
            if(food.getCategory().equals(category)) {
                list.add(food);
                //return temp;
            }
        }
        return list;
    }

    /**
     * Metode accessor yang digunakan untuk mendapatkan konfirmasi saat menambahkan makanan ke database, berisi boolean
     * @param food Makanan yang akan ditambahkan ke database, diambil dari kelas Food
     * @return boolean Hanya berisi benar atau tidak
     */
    public static boolean addFood (Food food) {
        FOOD_DATABASE.add(food);
        lastId = food.getId() + 1;
        
        return true;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan konfirmasi saat menghapus makanan di database, berisi boolean
     * @param food Makanan yang akan dihapus di database, diambil dari kelas Food
     * @return boolean Hanya berisi benar atau tidak
     */
    public static boolean removeFood (int id) throws FoodNotFoundException{
        for(Food food : FOOD_DATABASE) {
            if (food.getId() == id) {
                FOOD_DATABASE.remove(food);
                return true;
            }
        }
        throw new FoodNotFoundException(id);
    }
}

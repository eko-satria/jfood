/**
 * Kelas yang memuat informasi mengenai database penjual.
 *
 * @author Eko Satria
 * @28-02-2020
 */
import java.util.*;

public class DatabaseSeller {               //kelas yang memuat informasi mengenai database penjual
    private static ArrayList<Seller> SELLER_DATABASE = new ArrayList<>();    //variabel privat berupa string dari daftar penjual
    private static int lastId = 0;
    
    /**
     * Constructor untuk kelas DatabaseSeller
     * @param nothing
     * @return nothing
     */
    public DatabaseSeller() {
        
    }

    public static ArrayList<Seller> getSellerDatabase() {
        return SELLER_DATABASE;
    }
    
    public static int getLastId() {
        return lastId;
    }
    
    public static Seller getSellerById(int id) {
        for(Seller seller : SELLER_DATABASE) {
            if(seller.getId() == id) {
                return seller;
            }
        }
        return null;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan konfirmasi saat menambahkan informasi penjual di database, berisi boolean
     * @param seller Informasi penjual yang akan ditambahkan di database, diambil dari kelas Seller
     * @return boolean Hanya berisi benar atau tidak
     */
    public static boolean addSeller(Seller seller) {
        SELLER_DATABASE.add(seller);
        lastId = seller.getId() + 1;
        
        return true;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan konfirmasi saat menghapus informasi penjual di database, berisi boolean
     * @param seller Informasi penjual yang akan dihapus di database, diambil dari kelas Seller
     * @return boolean Hanya berisi benar atau tidak
     */
    public static boolean removeSeller(int id) {
        for(Seller seller : SELLER_DATABASE) {
            if(seller.getId() == id) {
                SELLER_DATABASE.remove(seller);
                return true;
            }
        }
        return false;
    }
}

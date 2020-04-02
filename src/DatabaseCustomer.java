/**
 * Kelas yang memuat informasi mengenai database pelanggan.
 *
 * @author Eko Satria
 * @05-03-2020
 */
import java.util.*;

public class DatabaseCustomer {         //kelas database pelanggan.
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();  //variabel string yang berisikan daftar makanan
    private static int lastId = 0;
    
    /**
     * Constructor kelas database pelanggan
     * @param nothing
     * @return nothing
     */
    public DatabaseCustomer() {

    }
    
    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }
    
    public static int getLastId() {
        return lastId;
    }
    
    public static Customer getCustomerById(int id) {
        for (Customer customer : CUSTOMER_DATABASE) {
            if(customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    /**
     * Metode accessor yang digunakan untuk mendapatkan konfirmasi saat menambahkan informasi pelanggan di database, berisi boolean
     * @param seller Informasi pelanggan yang akan ditambahkan di database, diambil dari kelas Customer
     * @return boolean Hanya berisi benar atau tidak
     */
    public static boolean addCustomer(Customer customer) {
        CUSTOMER_DATABASE.add(customer);
        lastId = customer.getId() + 1;
        
        return true;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan konfirmasi saat menghapus informasi pelanggan di database, berisi boolean
     * @param seller Informasi pelanggan yang akan dihapus di database, diambil dari kelas Customer
     * @return boolean Hanya berisi benar atau tidak
     */
    public static boolean removeCustomer(int id) {
        for(Customer customer : CUSTOMER_DATABASE) {
            if (customer.getId() == id) {
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        return false;
    }
}

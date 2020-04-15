package EkoSatria.jfood;

/**
 * Kelas yang memuat informasi mengenai database promo.
 *
 *@author Eko Satria
 * @12-03-2020
 */
import java.util.*;

public class DatabasePromo {                //kelas database promo
    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<>();     //variabel string yang berisikan daftar promo
    private static int lastId = 0;

    /**
     * Constructor kelas database promo
     * @param nothing
     * @return nothing
     */
    public DatabasePromo () {
        
    }
    
    public static ArrayList<Promo> getPromoDatabase() {
        return PROMO_DATABASE;
    }
    
    public static int getLastId() {
        return lastId;
    }
    
    public static Promo getPromoById(int id) throws PromoNotFoundException{
            for (Promo promo : PROMO_DATABASE) {
            if(promo.getId() == id) {
                return promo;
            }
        }
        throw new PromoNotFoundException(id);
    }

    public static String getPromoByCode(String code) throws PromoNotFoundException{
        for(Promo promo : PROMO_DATABASE) {
            if(promo.getCode().equals(code)) {
                return code;
            }
        }
        return null;
    }

    /**
     * Metode accessor yang digunakan untuk mendapatkan konfirmasi saat menambahkan promo di database, berisi boolean
     * @param promo Promo yang akan ditambahkan di database, diambil dari kelas Promo
     * @return boolean Hanya berisi benar atau tidak
     */
    public static boolean addPromo (Promo promo) throws PromoCodeAlreadyExistsException{
        for(Promo tester : PROMO_DATABASE) {
            if(tester.getCode().equals(promo.getCode())) {
                throw new PromoCodeAlreadyExistsException(promo);
            }
        }
        PROMO_DATABASE.add(promo);
        lastId = promo.getId() + 1;

        return true;
    }
    
    public static boolean activatePromo(int id) {
        for(Promo promo : PROMO_DATABASE) {
            if(promo.getId() == id) {
                promo.setActive(true);
                return true;
            }
        }
        return false;
    }
    
    public static boolean deactivatePromo(int id) {
        for(Promo promo : PROMO_DATABASE) {
            if(promo.getId() == id) {
                promo.setActive(false);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan konfirmasi saat menghapus promo di database, berisi boolean
     * @param promo Promo yang akan ditambahkan di database, diambil dari kelas Promo
     * @return boolean Hanya berisi benar atau tidak
     */
    public static boolean removePromo (int id) throws PromoNotFoundException{
        for(Promo promo : PROMO_DATABASE) {
            if (promo.getId() == id) {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        throw new PromoNotFoundException(id);
    }
}

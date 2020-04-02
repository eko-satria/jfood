/**
 * Kelas memuat informasi yang dibutuhkan mengenai promo.
 * 
 * @author Eko Satria
 * @version 12-03-2020
 * 
 */
public class Promo {            //kelas yang memuat informasi mengenai promo.
    private int id;             //variabel privat untuk ID dari promo
    private String code;        //variabel privat untuk kode dari promo
    private int discount;       //variabel privat untuk diskon promo
    private int minPrice;       //variabel privat untuk menunjukkan harga minimal agar mendapatkan promo
    private boolean active;     //variabel privat untuk menunjukkan apakah promo aktif

    /**
     * Constructor untuk kelas Promo
     * @param id ID dari promo, bernilai integer
     * @param code Kode dari promo, bernilai string
     * @param discount Diskon yang didapatkan dari promo, bernilai integer
     * @param minPrice Harga minimal yang diperlukan untuk mendapatkan promo, bernilai integer
     * @param active Status keaktifan dari promo, bernilai boolean
     * @return nothing
     */
    public Promo(int id, String code, int discount, int minPrice, boolean active) {
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.minPrice = minPrice;
        this.active = active;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan ID promo
     * Metode akan mengembalikan nilai integer
     * @param nothing
     * @return id ID of promo
     */
    public int getId () {
        return id;
    }

    /**
     * Metode accessor yang digunakan untuk mendapatkan kode promo
     * Metode akan mengembalikan nilai string
     * @param nothing
     * @return code Code of promo
     */
    public String getCode () {
        return code;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan nilai diskon untuk promo
     * Metode akan mengembalikan nilai integer
     * @param nothing
     * @return discount Discount of promo
     */
    public int getDiscount () {
        return discount;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan harga minimal untuk promo
     * Metode akan mengembalikan nilai integer
     * @param nothing
     * @return minPrice Minimum price needed for obtain a promo
     */
    public int getMinPrice () {
        return minPrice;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan informasi keaktifan dari promo
     * Metode akan mengembalikan nilai boolean
     * @param nothing
     * @return true Promo is active
     */
    public boolean getActive () {
        return true;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur ID dari promo
     * @param id ID of promo
     * @return nothing
     */
    public void setId (int id) {
        this.id = id;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur kode dari promo
     * @param code Code of promo
     * @return nothing
     */
    public void setCode (String code) {
        this.code = code;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur nilai diskon untuk promo
     * @param discount Discount of promo
     * @return nothing
     */
    public void setDiscount (int discount) {
        this.discount = discount;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur nilai minimal untuk promo
     * @param minPrice Minimum price for promo
     * @return nothing
     */
    public void setMinPrice (int minPrice) {
        this.minPrice = minPrice;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur keaktifan promo
     * @param active Promo status
     * @return nothing
     */
    public void setActive (boolean active) {
        this.active = active;
    }
    
    /**
     * Metode yang digunakan untuk melakukan print terhadap variabel yang digunakan
     */
    public String toString() {
        return id + " " + code + " " + discount + " " + minPrice + " " + active;
    }
}

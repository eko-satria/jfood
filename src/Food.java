/**
 * Kelas memuat informasi yang dibutuhkan mengenai makanan.
 * 
 * @author Eko Satria
 * @version 27-02-2020
 * 
 */
public class Food {                     //kelas yang memuat informasi mengenai makanan
    private int id;                     //variabel privat untuk ID dari makanan
    private String name;                //variabel privat untuk nama dari makanan
    private Seller seller;              //variabel privat untuk nama penjual makanan, diambil dari kelas Seller
    private int price;                  //variabel privat untuk harga dari makanan
    private FoodCategory category;      //variabel privat untuk kategori dari makanan, diambil dari enum FoodCategory
    
    /**
     * Constructor untuk kelas Food
     * @param id ID dari makanan, bernilai integer
     * @param name Nama dari makanan, bernilai string
     * @param seller Name penjual makanan, diambil dari kelas Seller
     * @param price Harga dari makanan, bernilai integer
     * @param category Kategori dari makanan, bernilai string, diambil dari enum FoodCategory
     * @return nothing
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category){
        this.id = id;
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.category = category;
    }

    /**
     * Metode accessor yang digunakan untuk mendapatkan ID makanan
     * Metode akan mengembalikan nilai integer
     * @param nothing
     * @return id ID of food
     */
    public int getId() {
        return id;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan nama makanan
     * Metode akan mengembalikan nilai string
     * @param nothing
     * @return name Name of food
     */
    public String getName() {
        return name;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan nama penjual
     * Metode akan mengembalikan nilai sesuai dengan parameter dari kelas Seller
     * @param nothing
     * @return seller Seller of food
     */
    public Seller getSeller () {
        return seller;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan harga makanan
     * Metode akan mengembalikan nilai integer
     * @param nothing
     * @return price Price of food
     */
    public int getPrice() {
        return price;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan kategori dari makanan
     * Metode akan mengembalikan nilai string
     * @param nothing
     * @return category Category of food
     */
    public FoodCategory getCategory() {
        return category;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur ID dari makanan
     * @param id ID of food
     * @return nothing
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur nama dari makanan
     * @param name Name of food
     * @return nothing
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur penjual dari makanan
     * @param seller Seller of food
     * @return nothing
     */
    public void setSeller(Seller seller) {
        this.seller = seller;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur harga dari makanan
     * @param price Price of food
     * @return nothing
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur kategori dari makanan
     * @param category Category of food
     * @return nothing
     */
    public void setCategory(FoodCategory category) {
        this.category = category;
    }
    
    /**
     * Metode yang digunakan untuk melakukan print terhadap variabel yang digunakan
     */
    public String toString () {
        return id + " " + name + " " + seller + " " + seller.getLocation().getCity() + " " + price + " " + category;
    }
}

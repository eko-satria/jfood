package EkoSatria.jfood;

/**
 * Enum yang memuat informasi yang dibutuhkan mengenai kategori makanan
 * 
 * @author Eko Satria
 * @version 05-03-2020
 * 
 */
public enum FoodCategory {          //enum untuk kategori makanan
    Beverages("Beverages"),         //isi enum
    Coffee("Coffee"),               //~
    Western("Western"),             //~
    Snacks("Snacks"),               //~
    Rice("Rice"),                   //~
    Noodles("Noodles"),             //~
    Bakery("Bakery"),               //~
    Japanese("Japanese");           //akhir enum
    
    String category;                //variabel string untuk kategori yang dipilih
    
    /**
     * Metode yang digunakan untuk mendapatkan kategori makanan
     * @param category Category of food
     * @return nothing
     */
    FoodCategory (String category) {
        this.category = category;
    }
    
    /**
     * Metode yang digunakan untuk mengembalikan nilai string kategori makanan
     * @param nothing
     * @return category Category of food
     */
    public String toString () {
        return category;
    }
}
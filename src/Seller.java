/**
 * Kelas memuat informasi yang dibutuhkan mengenai penjual.
 * 
 * @author Eko Satria
 * @version 27-02-2020
 * 
 */

public class Seller {               //kelas untuk memuat informasi mengenai penjual.
    private int id;                 //variabel privat untuk ID penjual
    private String name;            //variabel privat untuk nama penjual
    private String email;           //variabel privat untuk email penjual
    private String phoneNumber;     //variabel privat untuk nomor telpon penjual
    private Location location;      //variabel privat lokasi yang diambil dari kelas Location

    /**
     * Constructor untuk kelas Seller
     * @param id ID dari penjual, bernilai integer
     * @param name Nama dari penjual, bernilai string
     * @param email Email dari penjual, bernilai string
     * @param phoneNumber Nomor telpon dari penjual, bernilai string
     * @param location Lokasi dari penjual, diambil dari kelas Location
     * @return nothing
     */
    public Seller(int id, String name, String email, String phoneNumber, Location location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
     * Metode accessor yang digunakan untuk mendapatkan ID penjual
     * Metode akan mengembalikan nilai integer
     * @param nothing
     * @return id ID of seller
     */
    public int getId() {
        return id;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan nama penjual
     * Metode akan mengembalikan nilai string
     * @param nothing
     * @return name Name of seller
     */
    public String getName() {
        return name;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan email penjual
     * Metode akan mengembalikan nilai string
     * @param nothing
     * @return email Email of seller
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan nomor telpon penjual
     * Metode akan mengembalikan nilai string
     * @param nothing
     * @return phoneNumber Phone number of seller
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan lokasi dari penjual
     * Metode akan mengembalikan nilai sesuai dengan parameter dari kelas Location
     * @param nothing
     * @return location Location of seller
     */
    public Location getLocation () {
        return location;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur ID dari seorang penjual
     * @param id ID of seller
     * @return nothing
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur nama penjual
     * @param name Name of seller
     * @return nothing
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur email penjual
     * @param email Email of seller
     * @return nothing
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur nomor telpon dari penjual
     * @param phoneNumber Phone number of seller
     * @return nothing
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur lokasi dari penjual
     * @param location Location of seller
     * @return nothing
     */
    public void setLocation (Location location) {
        this.location = location;
    }
    
    /**
     * Metode yang digunakan untuk melakukan print terhadap variabel yang digunakan
     */
    public String toString () {
        return id + " " + name + " " + phoneNumber + " " + location;
    }
}

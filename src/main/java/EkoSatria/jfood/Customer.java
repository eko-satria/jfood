package EkoSatria.jfood;

/**
 * Kelas memuat informasi yang dibutuhkan mengenai pelanggan.
 * 
 * @author Eko Satria
 * @version 27-02-2020
 * 
 */

/**
 * Import library yang dibutuhkan
 */
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.regex.*;

public class Customer {             //kelas untuk memuat informasi mengenai pelanggan
    private int id;                 //variabel privat untuk ID pelanggan
    private String name;            //variabel privat untuk nama pelanggan
    private String email;           //variabel privat untuk alamat email pelanggan
    private String password;        //variabel privat untuk password dari email pelanggan
    private Calendar joinDate;      //variabel privat untuk mencatat tanggal bergabung pelanggan
    
    /**
     * Constructor untuk kelas Customer
     * @param id Parameter ID number of customer
     * @param name Parameter Name of customer
     * @param email Parameter email of customer
     * @param password Parameter password of customer
     * @param joinDate Parameter joining date of customer
     * @return nothing used
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate) {
        //constructor kelas Customer
        this.id =id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate =joinDate;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
    }
    
    /**
     * Constructor kedua untuk kelas Customer
     * @param id Parameter ID number of customer
     * @param name Parameter Name of customer
     * @param email Parameter email of customer
     * @param password Parameter password of customer
     * @param year Parameter year for Gregorian Calendar used
     * @param month Parameter month for Gregorian Calendar used
     * @param dayOfMonth Parameter day for Gregorian Calendar used
     * @return nothing used
     */
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth) {
        //constructor kelas Customer
        this.id =id;
        this.name = name;
        this.email = email;
        this.password = password;
        joinDate = new GregorianCalendar(dayOfMonth, month-1, year);
    }
    
    /**
     * Constructor ketiga untuk kelas Customer
     * @param id Parameter ID number of customer
     * @param name Parameter Name of customer
     * @param email Parameter email of customer
     * @param password Parameter password of customer
     * @return nothing used
     */
    public Customer(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = Calendar.getInstance();
    }

    /**
     * Metode accessor yang digunakan untuk mendapatkan ID pelanggan
     * Metode akan mengembalikan nilai integer
     * @param nothing used
     * @return id :ID of customer
     */
    public int getId() {
        return id;                  //mengembalikan nilai integer dari variabel id
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan nama pelanggan
     * Metode akan mengembalikan nilai string
     * @param nothing used
     * @return name : name of customer
     */
    public String getName () {
        return name;                //mengembalikan nilai string berupa nama dari user, berdasarkan variabel name
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan email pellangan
     * Metode akan mengembalikan nilai string
     * @param nothing used
     * @return email : email of customer
     */
    public String getEmail () {
        return email;               //mengembalikan nilai string berupa email dari user yang bersangkutan berdasarkan variabel email
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan password pengguna
     * Metode akan mengembalikan nilai string
     * @param nothing used
     * @return password : password of customer
     */
    public String getPassword () {
        return password;        //mengembalikan nilai string berupa password dari user yang bersangkutan berdasarkan variabel password
    }
    
    /**
     * Metode accessor yang digunakan untuk mendapatkan tanggal bergabungnya pengguna
     * Metode akan mengembalikan nilai string
     * @param nothing used
     * @return joinDate : customer joining date 
     */
    public Calendar getJoinDate () {
        return joinDate;        //mengembalikan nilai string berupa tanggal saat user yang bersangkuatn bergabung berdasarkan variabel joinDate
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur ID dari seorang customer
     * @param id ID of customer
     * @return nothing used
     */
    public void setId (int id) {
        this.id = id;
    }
    
    
    /**
     * Metode mutator yang digunakan untuk mengatur nama customer
     * @param name Name of customer
     * @return nothing used
     */
    public void setName (String name) {
        this.name = name;
    }
    
    
    /**
     * Metode mutator yang digunakan untuk mengatur email dari seorang customer
     * Menggunakan regex untuk mengatur dan menguji validitas dari email pelanggan
     * @param email Email of customer
     * @return nothing used
     */
    public void setEmail (String email) {
        String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(email);
        
        if (matcher.matches()) {
            this.email = email;
        } else {
            this.email = "        ";
        }
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur password seorang customer
     * Menggunakan regex untuk mengatur dan menguji validitas dari email pelanggan
     * @param password Password of customer
     * @return nothing used
     */
    public void setPassword (String password) {
        String regexPassword = "(?=.*[a-z])(?=.*\\d)(?=.*[A-Z]).{6,}$";
        Pattern pattern = Pattern.compile(regexPassword);
        Matcher matcher = pattern.matcher(password);
        
        if (matcher.matches()) {
            this.password = password;
        } else {
            this.password = "        ";
        }
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur tanggal bergabung seorang customer
     * @param joinDate Customer joining date
     * @return nothing used
     */
    public void setJoinDate (Calendar joinDate) {
        this.joinDate = joinDate;
    }
    
    /**
     * Metode mutator yang digunakan untuk mengatur tanggal bergabung seorang customer
     * @param year Tahun dari kalender Gregorian
     * @param month Bulan dari kalender Gregorian
     * @param dayOfMonth Hari dari kalender Gregorian
     * @return nothing used
     */
    public void setJoinDate(int year, int month, int dayOfMonth) {
        this.joinDate = new GregorianCalendar(dayOfMonth, month, year);
    }
    
    /**
     * Metode yang digunakan untuk melakukan print terhadap variabel yang digunakan
     */
    public String toString () {
        if (joinDate != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
            
            return "==============================CUSTOMER==============================" +
            "\nID: " + id +
            "\nName: " + name +
            "\nEmail: " + email +
            "\nPassword: " + password +
            "\nJoin Date: " + sdf.format(getJoinDate().getTime());

        } else {
            return "==============================CUSTOMER==============================" +
            "\nID: " + id +
            "\nName: " + name +
            "\nEmail: " + email +
            "\nPassword: " + password +
            "\nJoin Date: " + getJoinDate();
        }
    }
}
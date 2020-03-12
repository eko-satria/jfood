/**
 * Write a description of class Promo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Promo
{
    // instance variables - replace the example below with your own
    private int id, discount, minPrice;
    private String code;
    private boolean active;
    
    public Promo(int id, String code, int discount, int minPrice, boolean active)
    {
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.minPrice = minPrice;
        this.active =  active;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId(){return id;}
    public String getCode(){return code;}
    public int getDiscount(){return discount;}
    public int getMinPrice(){return minPrice;}
    public boolean getActive(){return true;}
    public void setId(int id){}
    public void setCode(String code){}
    public void setDiscount(String discount){}
    public void setMinPrice(){}
    public void setActive(){}
    public void printData(){}
}

import java.util.*; 
import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
/**
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashInvoice extends Invoice
{
    private final static PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;

    public CashInvoice
    (int id, Food food, Calendar date, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, date, customer, invoiceStatus);
    }
    
    public CashInvoice
    (int id, Food food, Calendar date, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super(id, food, date, customer, invoiceStatus);
        this.deliveryFee = deliveryFee;
    }
    
    public PaymentType getPaymentType(){return PAYMENT_TYPE;}
    public int getDeliveryFee(){return deliveryFee;} 
    public void setDeliveryFee (int deliveryFee){}
    public void setTotalPrice()
    {
        if(deliveryFee != 0)
        {
            super.totalPrice = getFood().getPrice() + getDeliveryFee();
        }
        else
        {
            super.totalPrice = getFood().getPrice();
        }
    }
    public String toString()
    {
        String string = "";
        SimpleDateFormat format1 = new SimpleDateFormat ("dd-MM-yyyy"); 
        Date date = new Date();
        if(deliveryFee != 0)
        {
            
            string = 
                    "=====INVOICE=====" +"\n"+
                    "ID: "+ super.getId()+"\n"+
                    "Food: "+ super.getFood().getName()+"\n"+
                    "Date: " +super.getDate()+"\n"+
                    "Total Price: "+totalPrice+"\n"+
                    "Invoice Status: "+super.getInvoiceStatus();
        }
        else
        {
            string = 
                "=====INVOICE====="+"\n"+
                "ID: "+ super.getId()+"\n"+
                "Food: "+ super.getFood().getName()+"\n"+
                "Date: " +super.getDate()+"\n"+
                "Total Price: "+totalPrice+"\n"+
                "Invoice Status: "+super.getInvoiceStatus();
        }
        System.out.println(string); 
        return string; 
    }    
}

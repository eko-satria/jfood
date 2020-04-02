import java.util.*; 
import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private final static PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;

    public CashlessInvoice(int id, Food food, Calendar date, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, date, customer, invoiceStatus);
    }
    
    public CashlessInvoice(int id, Food food, Calendar date, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, date, customer, invoiceStatus);
        this.promo = promo;
    }
            
    public PaymentType getPaymentType(){return PAYMENT_TYPE;}
    public Promo getPromo(){return promo;} 
    public void setPromo (Promo promo){}
    public void setTotalPrice()
    {
        if(promo!= null && getFood().getPrice()>=promo.getMinPrice() && promo.getActive()== true)
        {
            super.totalPrice=getFood().getPrice() - promo.getDiscount();
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
        if(promo!=null)
        {
            if(totalPrice>=promo.getMinPrice())
            {
                string=  
                    "=====INVOICE====="+"\n"+
                    "ID: "+ super.getId()+"\n"+
                    "Food: "+ super.getFood().getName()+"\n"+
                    "Date: " +super.getDate()+"\n"+
                    "Customer: " +super.getCustomer().getName()+"\n"+
                    "Promo: "+promo.getCode()+"\n"+
                    "Total Price: "+totalPrice+"\n"+
                    "Status: "+super.getInvoiceStatus()+"\n"+
                    "Payment Type: " +getPaymentType();
            }
            else
            {
                string=  
                    "=====INVOICE====="+"\n"+
                    "ID: "+ super.getId()+"\n"+
                    "Food: "+ super.getFood().getName()+"\n"+
                    "Date: " +super.getDate()+"\n"+
                    "Customer: " +super.getCustomer().getName()+"\n"+
                    "Total Price: "+totalPrice+"\n"+
                    "Status: "+super.getInvoiceStatus()+"\n"+
                    "Payment Type: " +getPaymentType();
            }
        }
        else
        {
                string=  
                    "=====INVOICE====="+"\n"+
                    "ID: "+ super.getId()+"\n"+
                    "Food: "+ super.getFood().getName()+"\n"+
                    "Date: " +super.getDate()+"\n"+
                    "Customer: " +super.getCustomer().getName()+"\n"+
                    "Total Price: "+totalPrice+"\n"+
                    "Status: "+super.getInvoiceStatus()+"\n"+
                    "Payment Type: " +getPaymentType();
        }
        System.out.println(string); 
        return string;
    }
}

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
    (int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, date, customer, invoiceStatus);
    }
    
    public CashInvoice
    (int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
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
    public void printData()
    {
        if(deliveryFee != 0)
        {
        System.out.println("=====INVOICE=====");
        System.out.println("ID: "+ super.getId());
        System.out.println("Food: "+ super.getFood().getName());
        System.out.println("Date: " +super.getDate());
        System.out.println("Total Price: "+totalPrice);
        System.out.println("Invoice Status: "+super.getInvoiceStatus());
        }
        else
        {
        System.out.println("=====INVOICE=====");
        System.out.println("ID: "+ super.getId());
        System.out.println("Food: "+ super.getFood().getName());
        System.out.println("Date: " +super.getDate());
        System.out.println("Total Price: "+totalPrice);
        System.out.println("Invoice Status: "+super.getInvoiceStatus());
        }
    }    
}

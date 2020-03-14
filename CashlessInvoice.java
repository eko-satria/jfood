
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

    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, date, customer, invoiceStatus);
    }
    
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
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
    public void printData()
    {
        if(promo!=null)
        {
            if(totalPrice>=promo.getMinPrice())
            {
                System.out.println("=====INVOICE=====");
                System.out.println("ID: "+ super.getId());
                System.out.println("Food: "+ super.getFood().getName());
                System.out.println("Date: " +super.getDate());
                System.out.println("Customer: " +super.getCustomer().getName());
                System.out.println("Promo: "+promo.getCode());
                System.out.println("Total Price: "+totalPrice);
                System.out.println("Status: "+super.getInvoiceStatus());
                System.out.println("Payment Type: " +getPaymentType());
            }
            else
            {
                System.out.println("=====INVOICE=====");
                System.out.println("ID: "+ super.getId());
                System.out.println("Food: "+ super.getFood().getName());
                System.out.println("Date: " +super.getDate());
                System.out.println("Customer: " +super.getCustomer().getName());
                System.out.println("Total Price: "+totalPrice);
                System.out.println("Status: "+super.getInvoiceStatus());
                System.out.println("Payment Type: " +getPaymentType());
            }
        }
        else
        {
                System.out.println("=====INVOICE=====");
                System.out.println("ID: "+ super.getId());
                System.out.println("Food: "+ super.getFood().getName());
                System.out.println("Date: " +super.getDate());
                System.out.println("Customer: " +super.getCustomer().getName());
                System.out.println("Total Price: "+totalPrice);
                System.out.println("Status: "+super.getInvoiceStatus());
                System.out.println("Payment Type: " +getPaymentType());
        }
    }
}

/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class CashlessInvoice extends Invoice
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
            
    public PaymentType getPaymentType(){return null;}
    public Promo getPromo(){return promo;} 
    public void setPromo (Promo promo){}
    public void setTotalPrice()
    {
        if(promo != null && promo.getActive()== true && getFood().getPrice()>= promo.getMinPrice())
        {
            super.totalPrice= getFood().getPrice() - promo.getDiscount();
        }else{super.totalPrice = getFood().getPrice();}
    }
    public void printData()
    {
        if((promo != null && promo.getActive()==false) || getFood().getPrice()<promo.getMinPrice()) {}
    }
}

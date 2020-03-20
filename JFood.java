import java.util.GregorianCalendar;
import java.util.TimeZone;

public class JFood
{   
       public static void main (String[] args){
           
           Customer customer1 = new Customer
           (12, "wahyudi", ".wahyudicanda@gmail.co.id", "Salto22",
            new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angles")));
           Customer customer2 = new Customer
           (13, "salladin", "sal-haddin@gmail.com", "cusTa12", 2019,2,05);
           Customer customer3 = new Customer
           (14, "einzben", "ain45@gmail.com", "cusTb123");
           
           customer1.setEmail(".wahyudicanda@gmail.co.id");
           customer1.setPassword("salto22");
           
           
           CashlessInvoice CS_invoice1 = new CashlessInvoice(2, food1, new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angles")), customer1, InvoiceStatus.ONGOING);
           CS_invoice1.setTotalPrice();
           CS_invoice1.toString();
           
           CashInvoice C_invoice1 = new CashInvoice(1, food1, "2-02-2020", customer1, InvoiceStatus.ONGOING);
           C_invoice1.setTotalPrice();
           C_invoice1.toString();

           customer1.toString();
           customer2.toString();
           customer3.toString();
    }
             
}
     
    

public class JFood
{   
       public static void main (String[] args){
            //location dulu karna seller membutuhkan location 
        //sebagai salah satu classnya
        Location location1 = new Location 
        //urutannya
        //"city","province","description"
        ("Jakarta", "Jakarta", "Timur");
        //seller dulu karna food membutuhkan seller
        //sebagai salah satu classnya        
        Seller seller1 = new Seller
        //urutannya
        //id,"name","email","phoneNumber",location
        (1,"eko", "eko.satria@ui.ac.id", "081246831820", location1);
        
        //urutannya
        //id, "name", seller, price, "category"
        Food food1 = new Food
        (1, "kopi arabia", seller1, 14000, FoodCategory.Coffee);
        Food food2 = new Food
        (2, "cheesecake", seller1, 20000, FoodCategory.Bakery);
        Food food3 = new Food
        (2, "mie ayam", seller1, 15000, FoodCategory.Noodles);
        
        Customer customer1 = new Customer
        //urutannya
        //id,"name","eamil","password","joinDate"
        (1, "hanon", "hanonnya@gmail.com", "nigga", "22-1-2019");
        Promo promo1 = new Promo
        (1, "code1", 30, 16000, true);
        
        CashlessInvoice CS_invoice1 = new CashlessInvoice(2, food1, "14-03-2020", customer1, InvoiceStatus.ONGOING);
        CS_invoice1.setTotalPrice();
        CS_invoice1.printData();
        
        CashlessInvoice CS_invoice2 = new CashlessInvoice(2, food2, "14-03-2020", customer1, InvoiceStatus.ONGOING, promo1);
        CS_invoice2.setTotalPrice();
        CS_invoice2.printData();
        
        CashlessInvoice CS_invoice3 = new CashlessInvoice(3, food3, "14-03-2020", customer1, InvoiceStatus.ONGOING, promo1);
        CS_invoice3.setTotalPrice();
        CS_invoice3.printData();
        
        CashInvoice C_invoice1 = new CashInvoice(1, food1, "2-02-2020", customer1, InvoiceStatus.ONGOING);
        C_invoice1.setTotalPrice();
        C_invoice1.printData();
        
        CashInvoice C_invoice2 = new CashInvoice(1, food2, "2-02-2020", customer1, InvoiceStatus.ONGOING,10000);
        C_invoice2.setTotalPrice();
        C_invoice2.printData();
                
    }
             
}
     
    
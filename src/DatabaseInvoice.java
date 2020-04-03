import java.util.ArrayList;

public class DatabaseInvoice {
    public static ArrayList<Invoice> INVOICE_DATABSE = new ArrayList<>();
    private static int lastId = 0;
    private static InvoiceStatus invoiceStatus;

    public DatabaseInvoice()
    {

    }

    public static ArrayList<Invoice> getInvoiceDatabse()
    {
        return INVOICE_DATABSE;
    }

    public int getLastId()
    {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) {
        for(Invoice invoice : INVOICE_DATABSE) {
            if(invoice.getId() == id) {
                return invoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoiceByCustomer(int id) {
        for(Invoice customer : INVOICE_DATABSE) {
            if(customer.getId() == id) {
                INVOICE_DATABSE.add(customer);
                return INVOICE_DATABSE;
            }
        }
        return null;
    }

    public static boolean addInvoice(Invoice invoice)
    {
        if(invoiceStatus == InvoiceStatus.Ongoing)
        {
            INVOICE_DATABSE.add(invoice);
            lastId = invoice.getId()+1;
            return true;
        }
        return false;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        for(Invoice invoice : INVOICE_DATABSE)
        {
            if(invoice.getId() == id)
            {
                if(invoiceStatus == InvoiceStatus.Ongoing)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean removeInvoice (int id) {
        for(Invoice invoice : INVOICE_DATABSE) {
            if (invoice.getId() == id) {
                INVOICE_DATABSE.remove(invoice);
                return true;
            }
        }
        return false;
    }
}

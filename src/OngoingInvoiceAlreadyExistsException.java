import java.util.*;

public class OngoingInvoiceAlreadyExistsException extends Exception{
    private Invoice invoice_error;

    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input)
    {
        super("Status Invoice:");
        this.invoice_error=invoice_input;
    }

    public String getMessage()
    {
        return  super.getMessage();
    }
}

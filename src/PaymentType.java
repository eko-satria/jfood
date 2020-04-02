
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum PaymentType
{
    Cash("Cash"), 
    Cashless("Cashless");
    
    public String pt;
    private PaymentType(String pt)
    {
        this.pt=pt;
    }
}

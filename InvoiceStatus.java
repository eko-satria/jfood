
/**
 * Enumeration class InvoiceStatrus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceStatus
{
        ONGOING("ONGOING"), 
        FINISHED("FINISHED"), 
        CANCELLED("CANCELLED");
        
        public String iS;
        
        private InvoiceStatus(String iS)
        {
            this.iS = iS;
        }
}

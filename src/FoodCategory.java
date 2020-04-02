/**
 * Enumeration class FoodCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum FoodCategory
{
    Beverages("Beverages"), 
    Coffee("Coffee"), 
    Western("Western"), 
    Rice("Rice"), 
    Noodles("Noodles"), 
    Bakery("Bakery"), 
    Japanese("Japanese");
    
    public String p;
    
    private FoodCategory(String p)
    {
        this.p = p;
    }

    public String toString()
    {
        return toString();
    }
}


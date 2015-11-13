
/**
 * Write a description of class NumbreDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumbreDisplay
{
    private int limitNumber;
    
    private int display;
    
    private int display1;

    /**
     * Constructor for objects of class NumbreDisplay
     */
    public NumbreDisplay(int limitNumber,int display2)
    {
        display = 0;
        display1 = display2;
    }

    /**
     * Método setter que fija el valor actual del display al valor pasado como parámetro.
     */
    public void setValue()
    {
        display = display1;
    }
    public String getDisplayValue()
    {
       String displaYc = "%02d";
       String resultado = String.format(displaYc,display);
       return resultado;
    }
    
    public int getValue()
    {
        return display;
    }
}

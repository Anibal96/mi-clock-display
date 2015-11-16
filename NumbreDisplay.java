
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

    /**
     * Constructor for objects of class NumbreDisplay
     */
    public NumbreDisplay(int limitNumber1)
    {
        display = 0;
        limitNumber = limitNumber1;
    }

    /**
     * Método setter que fija el valor actual del display al valor pasado como parámetro.
     */
    public void setValue(int display1)
    {
        display = display1;
    }
    /**
     * Muestra display con 2 elementos.
     */
    public String getDisplayValue()
    {
       String displaYc = "%02d";
       String resultado = String.format(displaYc,display);
       return resultado;
    }
    /**
     * Devuelve display.
     */
    public int getValue()
    {
        return display;
    }
    /**
     * Suma 1 a display.
     */
    public void increment()
    {
        if (display == limitNumber){
            display = 0;
        }
        else{
            display = display + 1;
        }
    }
}
    
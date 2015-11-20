/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // Guarda la hora
    private NumberDisplay horas;
    // Guarda los minutos
    private NumberDisplay minutos;
    // Almacena la hora actual con 5 caracteres
    private String horaActual;
    // Permite elegir si estamos en formato 12 horas(true) o 24 horas(false)
    private boolean relojDe12Horas;
    //Guarda el año.
    private NumberDisplay años;
    //Guarda el mes.
    private NumberDisplay meses;
    //Guarda el dia.
    private NumberDisplay dias;

    /**
     * Crea un objeto ClockDisplay con hora por defecto 00:00
     * Es posible elegir el modelo horario en el que el reloj
     * muestra la hora: si reloj12Horas es true entonces funciona 
     * como un reloj en formato de 12 horas; en caso contrario,
     * como un reloj de 24 horas.
     */
    public ClockDisplay(boolean reloj12Horas)
    {
        años = new NumberDisplay(99);
        meses = new NumberDisplay(12);
        dias = new NumberDisplay(30);
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        años.setValue(15);
        meses.setValue(11);
        dias.setValue(21);
        relojDe12Horas = reloj12Horas;
        updateHoraActual();             
    }

    /** 
     * Crea un objeto ClockDisplay con la hora y los minutos dados
     * Es posible elegir el modelo horario en el que el reloj
     * muestra la hora: si reloj12Horas es true entonces funciona 
     * como un reloj en formato de 12 horas; en caso contrario,
     * como un reloj de 24 horas.
     */
    public ClockDisplay (int año, int mes, int dia, int horasX, int minutosX, boolean reloj12Horas)
    {
        años = new NumberDisplay(99);
        meses = new NumberDisplay(13);
        dias = new NumberDisplay(31);
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);  
        horas.setValue(horasX); 
        minutos.setValue(minutosX);
        años.setValue(año);
        meses.setValue(mes);
        dias.setValue(dia);
        relojDe12Horas = reloj12Horas;
        updateHoraActual();    
    }

    /**
     * Fija la hora del reloj a la hora y los minutos dados
     */
    public void setTime(int año, int mes, int dia, int horaY, int minutoY)
    {
        años.setValue(año);
        meses.setValue(mes);
        dias.setValue(dia);
        horas.setValue(horaY);  
        minutos.setValue(minutoY);
        updateHoraActual();
    }

    /**
     * Devuelve la hora del reloj como una cadena de 5 caracteres
     */
    public String getTime()
    {
        return horaActual;
    }

    /**
     * Hace avanzar la hora 1 minuto
     */
    public void timeTick()
    {
        minutos.increment();
        if ( minutos.getValue() == 0) {
            horas.increment();
            if ( horas.getValue() == 0) {
                dias.increment();
                if ( dias.getValue() == 0) {
                    meses.increment();
                    if ( meses.getValue() == 0) {
                        años.increment();
                    }
                }
            }
        }
        updateHoraActual();
    }

    /**
     * Actualiza el atributo horaActual siguiendo las normas de un
     * reloj de 12 horas.
     */
    public void updateHoraActual()
    {
        if (relojDe12Horas) {
            String formato = "a.m";
            int horaAhora = horas.getValue(); 
            if (horaAhora >= 12){
                formato = "p.m.";
            }

            if (horaAhora > 12) {
                horaAhora = horaAhora - 12;
            }
            else if (horaAhora == 0) {
                horaAhora = 12;
            }
            horaActual = años.getDisplayValue() + "/" + meses.getDisplayValue() + "/" + dias.getDisplayValue()+ " " + horaAhora + ":" + minutos.getDisplayValue() + " " + formato;
        }
        else {
            horaActual = años.getDisplayValue() + "/" + meses.getDisplayValue() + "/" + dias.getDisplayValue()+ " " + horas.getDisplayValue() + ":" + minutos.getDisplayValue();     
        }
    }

    /**
     * Método que permite alternar entre los modos del reloj
     */
    public void changeFormat()
    {
        relojDe12Horas = !relojDe12Horas;
        updateHoraActual();	
    }	
}











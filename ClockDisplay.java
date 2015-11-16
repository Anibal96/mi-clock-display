
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    //Horas asignadas.
    private NumbreDisplay hora;
    //Minutos asignados.
    private NumbreDisplay minuto;
    //Atributo que almacena la hora actual.
    private String horaActual;

    /**
     * Contructor que inicializa a 00:00.
     */
    public ClockDisplay(){
        hora = new NumbreDisplay(24);
        minuto = new NumbreDisplay(60);
        actualizarHoraActual();
    }
  
    /**
     * Constructor que inicializa a los valores que das.
     */
    public ClockDisplay(int horas, int minutos){
        hora = new NumbreDisplay(24);
        minuto = new NumbreDisplay(60);
        setTime(horas, minutos);
    }
    /**
     * Metodo que asigna a la hora actual unos parametros para que salga con 5 caracteres.
     */
    public void actualizarHoraActual(){
        horaActual = hora.getDisplayValue() + ":" + minuto.getDisplayValue();
    }
    
     /**
     * Devuelve la hora actual.
     */
    public String getTime(){
        return horaActual;
    }
    
     /**
     * Asigna valores a las horas y minutos.
     */
    public void setTime(int horas, int minutos){
        hora.setValue(horas);
        minuto.setValue(minutos);
        actualizarHoraActual();
    }
     /**
     * Añade un minuto a la hora actual.
     */
    public void timeTick(){
        minuto.increment();
        if(minuto.getValue() == 0) {
            hora.increment();
        }
        actualizarHoraActual();
    }

}

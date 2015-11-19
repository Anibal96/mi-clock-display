
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
    //Atributo que almacena la hora actual en formato 24 horas.
    private String horaActual;
    //Atributo booleano que asigno a la maquina si es o no de 24 horas.
    private boolean tipos;
    /**
     * Contructor que inicializa a 00:00.
     */
    public ClockDisplay(boolean tipo){
        hora = new NumbreDisplay(24);
        minuto = new NumbreDisplay(59);
        actualizarHoraActual();
        tipos = tipo;
    }
  
    /**
     * Constructor que inicializa a los valores que das.
     */
    public ClockDisplay(int horas, int minutos, boolean tipo){
        hora = new NumbreDisplay(24);
        minuto = new NumbreDisplay(59);
        setTime(horas, minutos);
        tipos = tipo;
    }
    /**
     * Metodo que asigna a la hora actual unos parametros para que salga con 5 caracteres.
     */
    public void actualizarHoraActual(){
        if (tipos == true){
            if (hora.getValue() > 12){
                int horas = hora.getValue() - 12;
                horaActual = horas + ":" + minuto.getDisplayValue() + "pm" ;
            }
            else if(hora.getValue() <= 12){
                horaActual = hora.getDisplayValue() + ":" + minuto.getDisplayValue() + "am" ;
            }
        }
        else{
            horaActual = hora.getDisplayValue() + ":" + minuto.getDisplayValue();
        }
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

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reloj
{
    private Display horas;
    private Display minutos;
    private int formato;

    public Reloj()
    {
        horas = new Display();
        minutos = new Display();
        horas.setLimite(24);
        minutos.setLimite(60);
        formato = 0;
    }
    
    public String toString(){
        String cadena;
        String fa = " AM";
        
        if(formato == 0){
            cadena = horas+":"+minutos;
        }
        else{
           if(horas.getValor() >= 12){
               fa = " PM";
            }
            cadena = convierteHoras()+":"+minutos+fa+".";
        }
        return(cadena);
    }
    
    public void setHoraMinuto(int datoH, int datoM){
        horas.setValor(datoH);
        minutos.setValor(datoM);
    }
    
    public void incMin() {
        minutos.incValor();
        if(minutos.getValor() == 0){
            horas.incValor();
        }
    }
    
    public void cambiaFormato(){
        if(formato == 0){
            formato = 1;
        }
        else{
            formato = 0;
        }
    }
    
    private String convierteHoras(){
        String cadena;
        int aux;
        
        aux = horas.getValor();
        if(horas.getValor() > 12){
            aux = horas.getValor() - 12;
        }
        if(aux < 10){
            cadena = "0"+aux + "";
        }
        else
            cadena = aux+"";
        
        return(cadena);
    }
    
    public void ponerHoraActual(){
        Calendar c = new GregorianCalendar();
        
        this.setHoraMinuto(c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE));
    }
            
}

public class Reloj
{
    private Display horas;
    private Display minutos;

    public Reloj()
    {
        horas = new Display();
        minutos = new Display();
    }
    
    public String toString(){
        String cadena;
        
        cadena = horas+":"+minutos;
        return(cadena);
    }
    
    public void setHoraMinuto(int datoH, int datoM){
        horas.setValor(datoH);
        minutos.setValor(datoM);
    }
    
    public void incMin() {
        minutos.incValor();
    }
}

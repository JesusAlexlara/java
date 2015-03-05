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
    
}

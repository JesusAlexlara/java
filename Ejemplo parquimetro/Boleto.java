public class Boleto
{
    private String horaInicio;
    private String horaFin;

    public Boleto()
    {
        horaInicio = "";
        horaFin = "";
    }
    
    public void setHoraInicioFin(String dato1, String dato2){
        horaInicio = dato1;
        horaFin = dato2;
    }
    
    public String toString(){
        String cadena;
        
        cadena = horaInicio+" a "+horaFin;
        return(cadena);
    }
}

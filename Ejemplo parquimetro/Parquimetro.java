public class Parquimetro
{
    private Reloj time;
    private float costoXhora;
    private float saldoActual;

    public Parquimetro() {
        time = new Reloj();
        costoXhora = 0;
        saldoActual = 0;
    }
    
    public void setCostoxHora(int dato) {
        costoXhora = dato;
    }
    
    public void aceptaDinero(int dato){
        saldoActual += dato;
    }
    
    public Boleto dameBoleto(){
        Boleto bole = new Boleto();
        float minutos=0f;
        Double y1;
        float i=0;
        String t1;
        
        if(saldoActual > 0){
            time.ponerHoraActual();
            t1 = time.toString();
            minutos = (((float)saldoActual)/((float)costoXhora))*60f;
            for(i = 0f; i<minutos; i++)
            {
                time.incMin();
            }
            saldoActual = 0;
            bole.setHoraInicioFin(t1,time.toString());
            
        }
        else{
            System.out.println("no hay dinero");
        }
        return(bole);
    }
    
    
    
    
   
    
    public void FormatoHora(){
        time.cambiaFormato();
    }

}

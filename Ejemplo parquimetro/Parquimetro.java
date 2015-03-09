public class Parquimetro
{
    private Reloj time;
    private float costoXhora;
    private float saldoActual;

    public Parquimetro() {
        time = new Reloj();
        costoXhora = 0f;
        saldoActual = 0f;
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
        float i;
        String t1;
        
        if(saldoActual > 0){
            time.ponerHoraActual();
            t1 = time.toString();
            minutos = (((float)saldoActual)/((float)costoXhora))*60f;
            for(i = 0f ; i<minutos; i++)
            {
                time.incMin();
            }
            saldoActual = 0;
            bole.setHoraInicioFin(t1,time.toString());
            return(bole);
        }
        else{
            System.out.println("no hay dinero");
            return(null);
        }
        
    }
     
    public void FormatoHora(){
        time.cambiaFormato();
    }

}

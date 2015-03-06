public class Parquimetro
{
    private Reloj time;
    private int costoXhora;
    private int saldoActual;

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
        int minutos=0;
        int i=0;
        String t1;
        
        if(saldoActual > 0){
            time.ponerHoraActual();
            t1 = time.toString();
            minutos = saldoActual/costoXhora*60;
            while(i<minutos){
                time.incMin();
                System.out.println(i);
                i++;
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

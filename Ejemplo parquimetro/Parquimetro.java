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
        int minutos, cont=0;
        String t1;
        
        if(saldoActual > 0){
            time.ponerHoraActual();
            t1 = time.toString();
            minutos = saldoActual/costoXhora*60;
            while(cont != minutos){
                time.incMin();
                cont++;
            }
            saldoActual = 0;
            bole.setHoraInicioFin(t1,time.toString());
        }   
        return(bole);
    }

}

public class PorHoras extends Empleado
{
    private int numHoras;
    private float costoHora;

    public PorHoras(int numH, float cosH){
        numHoras = numH;
        costoHora = cosH;
    }
    
    public void calcularSuelo(){
        int hExtra = 0;
        if(numHoras > 40){
            hExtra = numHoras - 40;
        }
        sueldo = numHoras*costoHora+(costoHora*2)*(hExtra);
            
    }
        
}

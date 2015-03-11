public class PorComision extends Empleado
{
    private double ventas;
    private double comision;
    
    public PorComision(double ven, double comis) {
        ventas = ven;
        comision = comis;
    }
    
    public float calculaSueldo() {
        sueldo = (float)(ventas*(comision/100.0));
        return(sueldo);
    }   
}

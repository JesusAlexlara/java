
public class AsalariadoComision extends PorComision
{
    private double salarioBase;
    
    public AsalariadoComision(double v, double c, double base) {
        super(v, c);
        salarioBase = base;
    }
    
    public float calculaSueldo(){
        super.calculaSueldo();
        sueldo += (float)(salarioBase*1.1);
        return(sueldo);
    }
}

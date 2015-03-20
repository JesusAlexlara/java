
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Figura
{
    protected float area;
    
    public Figura()
    {
        area = 0;
    }
    
    public String toString(){
        String cadena = "El área del "+getClass().getName()+" es "+ area;
        return(cadena);
    }
    
    abstract public void CalculaArea();
}

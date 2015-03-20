
/**
 * Write a description of class Poligono here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poligono extends Figura
{
    private int lados;
    
    public Poligono(int l)
    {
        lados = l;
    }
    
    public void CalculaArea(){
        area = lados*lados;
    }

}

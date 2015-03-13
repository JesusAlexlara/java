
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura
{
    protected int area;
    
    public Figura()
    {
        area = 0;
    }
    
    public void ImprimeArea(){
        String nombre = getClass().getName();
        System.out.println("el area del "+nombre+" es "+area);
    }
}

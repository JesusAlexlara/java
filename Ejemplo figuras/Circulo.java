
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private Double radio;
    
    public Circulo(Double ra)
    {
        super();
        radio = ra;
    }
    
    public void CalculaArea(){
        area = (float)(3.1416*(radio*radio));
    }
   
}

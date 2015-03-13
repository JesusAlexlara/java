
public class Cuadrado extends Figura
{
    private int lado;
    public Cuadrado(int unNumero)
    {
        super();
        lado = unNumero;
    }
    
    public void CalculaArea(){
        area = (float)(lado*4);
    }
}

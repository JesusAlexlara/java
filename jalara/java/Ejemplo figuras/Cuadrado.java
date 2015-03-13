
public class Cuadrado extends Figura
{
    private int lado;
    public Cuadrado()
    {
        super();
        lado = 0;
    }

    public void DarLado(int unNumero){
        lado = unNumero;
    }
    
    public void CalculaArea(){
        area = lado*4;
    }
}

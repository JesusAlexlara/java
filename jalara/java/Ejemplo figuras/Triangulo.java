public class Triangulo extends Figura
{
    private int base;
    private int altura;
    public Triangulo(int b, int a)
    {
        super();
        base = b;
        altura = a;
    }
    
    public void CalculaArea(){
        area = (float)(base * altura / 2);
    }

}

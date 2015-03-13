public class Triangulo extends Figura
{
    private int base;
    private int altura;
    public Triangulo()
    {
        super();
        base = 0;
        altura = 0;
    }
    
    public void DarBase(int unNumero){
        base = unNumero;
    }
    
    public void DarAltura(int unNumero){
        altura = unNumero;
    }
    
    public void CalculaArea(){
        area = base * altura / 2;
    }

}

import java.util.LinkedList;
public class Principal
{
    static public void main(String [] args){
        LinkedList<Figura> figuras;
        figuras = new LinkedList<Figura>();
        
        figuras.add(new Circulo(10.00));
        figuras.add(new Triangulo(3,4));
        figuras.add(new Cuadrado(5));
        
        for(Figura fig: figuras){
            fig.CalculaArea();
            System.out.println(fig);
        }
    }
}

import java.util.LinkedList;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String arg[]){
        LinkedList<Animal> animales;
        
        animales = new LinkedList<Animal>();
        Ballena balle = new Ballena("Willy");
        Perro dogo = new Perro("Chewbacca");
        dogo.SeRuidoso();
        Pinguino pingu = new Pinguino("Tux");
        Loro lod = new Loro("Pablito");
        lod.Vocabulario("Tumbacutiricutambacutiricutatumbacutiricuta");
        
        animales.add(balle);
        animales.add(dogo);
        animales.add(pingu);
        animales.add(lod);
        
        for(Animal ani: animales){
            ani.Habla();
        }
        
        lod.Vocabulario("Yolo");
        dogo.SeCallado();
        
                for(Animal ani: animales){
            ani.Habla();
        }
    }
}

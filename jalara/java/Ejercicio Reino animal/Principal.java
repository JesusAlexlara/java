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
        Ballena balle = new Ballena();
        balle.Nombre("willy");
        Perro dogo = new Perro();
        dogo.Nombre("Scooby");
        dogo.SeRuidoso();
        Pinguino pingu = new Pinguino();
        pingu.Nombre("Tux");
        Loro lod = new Loro();
        lod.Nombre("Pablito");
        lod.Vocabulario("Pablito clavo un clavito");
        
        animales.add(balle);
        animales.add(dogo);
        animales.add(pingu);
        animales.add(lod);
        
        for(Animal ani: animales){
            ani.Habla();
            //System.out.println(ani);
        }
    }
}

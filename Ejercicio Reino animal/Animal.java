
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    
    protected String nombre;
    
    public void Nombre(String unNombre){
        nombre = unNombre;
    }
    
    public void Responde(String unaCadena){
        String nom=getClass().getName();
        System.out.println(nom+nombre+" dice: ",unaCadena);
    }
}

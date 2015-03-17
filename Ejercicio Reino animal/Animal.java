public class Animal
{
    
    protected String nombre;
    
    public void Nombre(String unNombre){
        nombre = unNombre;
    }
    
    public void Responde(String unaCadena){
        String nom=this.getClass().getName();
        System.out.println(nom+" "+nombre+" dice: "+unaCadena);
    }
    
    public void Habla(){
        this.Responde("No puede hablar");
    }
}

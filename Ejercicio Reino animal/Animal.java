public class Animal
{
    
    private String nombre;
    
    public Animal(String cadena){
        nombre = cadena;
    }
    
    public void Responde(String unaCadena){
        String nom=this.getClass().getName();
        System.out.println(nom+" "+nombre+" dice: "+unaCadena);
    }
    
    public void Habla(){
        this.Responde("No puede hablar");
    }
}


/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro extends Mamifero
{
    private boolean ladraMucho;
    
    public Perro(){
    }
    
    public void SeRuidoso(){
        ladraMucho = true;
        
    }
    
    public void SeCallado(){
        ladraMucho = false;
    }
    
    public void Ladra(){
        if(ladraMucho)
            this.Responde("Woof woof Woof woof");
        else
            this.Responde("woof");
      
    }
    
    public void Habla(){
        this.Ladra();
    }

}

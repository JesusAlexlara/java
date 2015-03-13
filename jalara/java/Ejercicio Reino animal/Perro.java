
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro extends Mamifero
{
    private int ladraMucho;
    
    public Perro(){
        ladraMucho = 0;
    }
    
    public void SeRuidoso(){
        ladraMucho = 2;
        
    }
    
    public void SeCallado(){
        ladraMucho = 1;
    }
    
    public void Ladra(){
        if(ladraMucho==2){
            Responde("Bow wow wow, Bow, wow");
        }
        else{
            if(ladraMucho==1){
                Responde("Woof");
            }
        }
    }
    
    public void Habla(){
        if(ladraMucho==1){
            super.Habla();
        }
        else{
            Ladra();
        }
    }

}

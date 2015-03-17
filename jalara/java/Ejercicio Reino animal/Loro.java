public class Loro extends Ave
{
    // instance variables - replace the example below with your own
    private String vocabulario;
    
    public Loro(String ani){
        super(ani);
        vocabulario = null;
    }
    
    public void Vocabulario(String unaCadena){
         vocabulario = unaCadena;
    }
    
    public void Habla(){
        if(vocabulario == null){
            super.Habla();
        }
        else{
            Responde(vocabulario);
        }
    }

}

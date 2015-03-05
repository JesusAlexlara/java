public class Display{
    private int valor;
    private int limite;

    public Display(){
        valor = 0;
        limite = 0;
    }
    
    public void setValor(int dato){
        valor = dato;
    }
    public void setLimite(int dato){
        limite = dato;
    }
    public String toString(){
        if(valor < 10){
            return "0"+valor;
        }
        else{
            return ""+valor;
        }
    }
}

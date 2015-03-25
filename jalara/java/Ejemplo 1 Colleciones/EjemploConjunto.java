import java.util.*;
public class EjemploConjunto{
    
    public static void main(String []args){
        Set conjunto = new HashSet();
        List lista = new LinkedList();
        
        conjunto.add(new Estudiante("Sergio", 2013));
        conjunto.add(new Estudiante("Oscar", 2013));
        conjunto.add(new Estudiante("Yarazet", 2011));
        conjunto.add(new Estudiante("Sergio", 2013));
        conjunto.add(new Estudiante("Oscar", 2013));
        System.out.println(conjunto);
        
        lista.add(new Estudiante("Sergio", 2013));
        lista.add(new Estudiante("Oscar", 2013));
        lista.add(new Estudiante("Yarazet", 2011));
        lista.add(new Estudiante("Sergio", 2013));
        lista.add(new Estudiante("Oscar", 2013));
        System.out.println(lista);
        
    }
}

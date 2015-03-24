import java.util.*;
public class EjemploConjunto{
    
    public static void main(String []args){
        Set conjunto = new HashSet();
        conjunto.add("one");
        conjunto.add("second");
        conjunto.add("3ed");
        conjunto.add(new Integer(4));
        conjunto.add(new Float(5.0f));
        conjunto.add("second");
        conjunto.add(new Integer(4));
        System.out.println(conjunto);
    }
}

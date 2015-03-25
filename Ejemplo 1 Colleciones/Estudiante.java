public class Estudiante extends Object implements Comparable{
    private String nombre;
    private int generacion;

    public Estudiante(String nom, int gen){
        nombre = nom;
        generacion = gen;
    }
    
    public String toString(){
        String cadena = "Generacion: "+generacion+" "+nombre;
        return (cadena);
    }
    
    public int compareTo(Object o){
        if(o.instaceof(Estudiante)){
            if(this.nom == ((Estudiante)o).nombre)
                return 0;
        }
        return 1;
    }
}

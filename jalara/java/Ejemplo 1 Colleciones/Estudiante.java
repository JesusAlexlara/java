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
       if(o instanceof Estudiante){
//             //if(this.nombre == ((Estudiante)o).nombre)
//             //return 0;
//             if(this.nombre == ((Estudiante)o).nombre){
//                 return 0;
//             }
//             else{
//                 if(this.generacion < ((Estudiante)o).generacion){
//                     return -1;
//                 }
//             }
            return (this.nombre).compareTo(((Estudiante)o).nombre);
       }
       return 1;
    }
    
}

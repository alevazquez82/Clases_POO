package paquete1;

public class Clase2 {
    public static void main(String[] args){
        Clase1 objeto1 = new Clase1();
        
        objeto1.setEdad(42);
        System.out.println("La edad es: "+objeto1.getEdad());
        
        objeto1.setNombre("Alejandro");
        System.out.println("El nombre es: "+objeto1.getNombre());
    }
    
}

package T9Ejercicio3;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public void saluda(){
        System.out.println("Hola, mi nombre es " + nombre);
    }
    public void salta(){
        System.out.println(nombre + " ha saltado.");
    }
    public void duerme(){
        System.out.println(nombre + " está durmiendo.");
    }
}

package T9Ejercicio3;

public abstract class Ave extends Animal {
    public Ave(String nombre) {
        super(nombre);
    }
    public void volar(){
        System.out.println("Estoy volando!");
    }
    public void ponerHuevos(){
        System.out.println("Dejando huevos");
    }
}

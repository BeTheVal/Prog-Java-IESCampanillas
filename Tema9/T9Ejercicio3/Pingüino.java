package T9Ejercicio3;

public class Pingüino extends Ave {
    public Pingüino(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        System.out.println(" Soy un pingüino, no puedo volar.");
    }
}

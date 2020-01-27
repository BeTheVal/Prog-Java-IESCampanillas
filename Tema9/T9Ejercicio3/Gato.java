package T9Ejercicio3;

public class Gato extends Mamifero {

  public Gato(String nombre) {
    super(nombre);
  }

  public Gato() {
    super("nombre");
  }

  public void maullar() {
    System.out.println("MIAAAUUU!");
  }
}

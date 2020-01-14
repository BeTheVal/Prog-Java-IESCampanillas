package T9Ejercicio1;

public class Caballo {
  String numRef;
  String nombre;
  String color;
  String raza;
  String velocidad;

  // Constructor
  public Caballo(String nombre) {
    super();
    this.nombre = nombre;
  }

  void relincha() {
    System.out.println(this.nombre + " relincha.");
  }

  void anda() {
    System.out.println(this.nombre + " está andando.");
  }

  void corre() {
    System.out.println(this.nombre + " está corriendo.");
  }

}

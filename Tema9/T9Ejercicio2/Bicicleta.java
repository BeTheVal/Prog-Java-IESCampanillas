package T9Ejercicio2;

public class Bicicleta extends Vehiculo {
  private long kilometrosRecorridos;

  void saltar() {
    System.out.println("Has saltado con éxito!.");
  }

  public long getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(long kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }


}

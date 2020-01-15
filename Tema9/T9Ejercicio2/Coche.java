package T9Ejercicio2;

public class Coche extends Vehiculo {
  private long kilometrosRecorridos;

  void derrapar() {
    System.out.println("Estás derrapando con el coche");
  }

  public long getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(long kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }


}

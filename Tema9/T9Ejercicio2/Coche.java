package T9Ejercicio2;

public class Coche extends Vehiculo {

  static void quemarRueda() {
    System.out.println("Estás quemando rueda con el coche");
  }
  static void andar(long kilometrosCoche){
    kilometrosRecorridos += kilometrosCoche;
    setKilometrosTotales(getKilometrosTotales() + kilometrosCoche);
  }

  public static long getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(long kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }


}

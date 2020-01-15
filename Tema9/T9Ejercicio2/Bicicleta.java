package T9Ejercicio2;

import java.util.Scanner;

public class Bicicleta extends Vehiculo {
  private static long kilometrosRecorridos;
  Scanner sc = new Scanner(System.in);

  void saltar() {
    System.out.println("Has saltado con éxito!.");
  }
   static void andar(long kilometrosBici){
    kilometrosRecorridos += kilometrosBici;
    setKilometrosTotales((getKilometrosTotales() + kilometrosBici));
  }

  public static long getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(long kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }


}

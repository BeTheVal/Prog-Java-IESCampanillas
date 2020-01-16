package T9Ejercicio2;

import java.util.Scanner;

public class Bicicleta extends Vehiculo {
  Scanner sc = new Scanner(System.in);

  void saltar() {
    System.out.println("Has saltado con éxito!.");
  }
   static void andar(long kilometrosBici){
    kilometrosRecorridos += kilometrosBici;
    setKilometrosTotales((getKilometrosTotales() + kilometrosRecorridos));
  }

  public static long getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(long kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }


}

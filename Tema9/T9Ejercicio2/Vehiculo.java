package T9Ejercicio2;

public class Vehiculo {
  private static long vehiculosCreados;
  private static long KilometrosTotales;

  // Getter
  public static long getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static long getKilometrosTotales() {
    return KilometrosTotales;
  }

//setter
  public static void setKilometrosTotales(long kilometrosTotales) {
    KilometrosTotales = kilometrosTotales;
  }
}

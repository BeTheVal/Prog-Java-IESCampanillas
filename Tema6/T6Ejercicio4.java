public class T6Ejercicio4 {
  public static void main(String[] args) {
    /*
     * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separa-
     * dos por espacios.
     */
    System.out.println("Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)");
    for (int i = 1; i <= 20; i++) {
      int numero = (int) (Math.random() * 10) + 1;
      System.out.print(numero + "  ");
    }
  }
}
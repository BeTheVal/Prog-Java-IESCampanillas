public class T6Ejercicio5 {
  public static void main(String[] args) {
    /*
     * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
     * separados por espacios. Muestra también el máximo, el mínimo y la media de
     * esos números.
     */
    System.out.println("50 números aleatorios entre 100 y 199:");
    int media = 0;
    int mayor = 0;
    int menor = 120;
    for (int i = 1; i <= 50; i++) {
      // System.out.print(((int) (Math.random() * 50) + 100) + " ");
      int numero = ((int) (Math.random() * 101) + 100);
      System.out.println(numero);

      // mayor
      if (numero > mayor) {
        mayor = numero;
      }

      // menor
      if (numero < menor) {
        menor = numero;
      }

      // Media
      media += numero;
    }
    System.out.println("La media es : " + media / 50);
    System.out.println("El menor es : " + menor + " y el mayor es : " + mayor);

  }
}

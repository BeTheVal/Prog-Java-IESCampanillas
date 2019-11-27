package matematicas;

public class Miarray {
  /**
   * Muestra una array unidimensional
   * 
   * @param x Array a mostrar
   * @return Pinta la array x
   */
  public static void muestraArray(int[] x) {
    for (int i = 0; i < x.length; i++) {
      System.out.print(" " + x[i] + " ");
    }
  }

  /**
   * Muestra una array bidimensional
   * 
   * @param x Array Bidimensional
   * @@return Pinta array Bidimensional x
   */
  public static void muestraArrayBidi(int[][] x) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[0].length; j++) {
        System.out.print(" " + x[i][j] + " ");
      }
      System.out.println();
    }
  }
}
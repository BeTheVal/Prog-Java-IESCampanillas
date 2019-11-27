public class T8Ejercicio20al28 {
  public static void main(String[] args) {

    /*
     * Crea una biblioteca de funciones para arrays (de una dimensión) de números
     * enteros que contenga las siguientes funciones: 1. generaArrayInt: Genera un
     * array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se
     * indica como parámetro. 2. minimoArrayInt: Devuelve el mínimo del array que se
     * pasa como parámetro. 3. maximoArrayInt: Devuelve el máximo del array que se
     * pasa como parámetro. 4. mediaArrayInt: Devuelve la media del array que se
     * pasa como parámetro. 5. estaEnArrayInt: Dice si un número está o no dentro de
     * un array. 6. posicionEnArray: Busca un número en un array y devuelve la
     * posición (el índice) en la que se encuentra. 7. volteaArrayInt: Le da la
     * vuelta a un array. 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los
     * números de un array. 9. rotaIzquierdaArrayInt: Rota n posiciones a la
     * izquierda los números de un array.
     */
    System.out.println("Ejercicio 20: ");
    System.out.println(generaArrayInt(10, 1, 10));
    System.out.println("Ejercicio 21: ");
    System.out.println("El valor minimo es : " + minimoArrayInt(generaArrayInt(10, 1, 10)));
  }

  /**
   * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
   * intervalo (mínimo y máximo) se indica como parámetro.
   */
  public static int[] generaArrayInt(int tamaño, int minimo, int maximo) {
    int nuevaArray[] = new int[tamaño];
    for (int i = 0; i < nuevaArray.length; i++) {
      nuevaArray[i] = (int) ((Math.random() * (maximo - minimo) + minimo));
    }
    return nuevaArray;
  }

  /**
   * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
   */
  public static int minimoArrayInt(int[] laArray) {
    int valorminimo = 10;
    for (int i = 0; i < laArray.length; i++) {
      if (laArray[i] < valorminimo) {
        valorminimo = laArray[i];
      }
    }
    return valorminimo;
  }
  /**
   * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
   */
  /**
   * 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
   */
  /**
   * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
   */
  /**
   * 6. posicionEnArray: Busca un número en un array y devuelve la posición (el
   * índice) en la que se encuentra.
   */
  /**
   * 7. volteaArrayInt: Le da la vuelta a un array.
   */
  /**
   * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
   * array.
   */
  /**
   * 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un
   * array.
   */

}
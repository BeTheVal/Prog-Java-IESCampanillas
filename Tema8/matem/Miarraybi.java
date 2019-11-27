public class Miarraybi {
  public static void main(String[] args) {
    /**
     * 2.filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
     * parámetro. 3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que
     * se pasa como parámetro. 4. coordenadasEnArrayBiInt: Devuelve la fila y la
     * columna (en un array con dos elementos) de la primera ocurrencia de un número
     * dentro de un array bidimensional. Si el número no se encuentra en el array,
     * la función devuelve el array {-1, -1}. 5. esPuntoDeSilla: Dice si un número
     * es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
     * 6. diagonal: Devuelve un array que contiene una de las diagonales del array
     * bidimensional que se pasa como parámetro. Se pasan como parámetros fila,
     * columna y dirección. La fila y la columna determinan el número que marcará
     * las dos posibles diagonales dentro del array. La dirección es una cadena de
     * caracteres que puede ser “nose” o “neso”. La cadena “nose” indica que se
     * elige la diagonal que va del noroeste hacia el sureste, mientras que la
     * cadena “neso” indica que se elige la diagonal que va del noreste hacia el
     * suroeste.
     */
  }

  /**
   * Genera array aleatoria.
   * 
   * @param fila
   * @param columna
   * @param maximo
   * @param minimo
   * 
   */

  public static int[][] generaArrayBiInt(int fila, int columna, int maximo, in minimo) {
    int[][] array = new int[fila][columna];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        array[i][j] = (int) ((Math.random() * (maximo - minimo) + minimo));
      }
    }
    return array;
  }

  /**
   * 2.filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
   * parámetro
   */
  public static void filaDeArrayBiInt() {

  }
}
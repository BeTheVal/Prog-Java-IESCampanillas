public class T7BEjercicio12 {
  public static void main(String[] args) {
    /*
     * Realiza un programa que muestre por pantalla un array de 9 filas por 9
     * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
     * programa debe mostrar los números de la diagonal que va desde la esquina
     * inferior izquierda a la esquina superior derecha, así como el máximo, el
     * mínimo y la media de los números que hay en esa diagonal.
     */
    int[][] num = new int[9][9];
    // asignar numeros aleatorios al array
    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num[0].length; j++) {
        num[i][j] = (int) ((Math.random() * 400) + 500);
        System.out.print(" " + num[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    // Recorrer la diagonal
    int fila = 8;
    int columna = 0;
    int aux = 0;
    int min = 901;
    int maximo = 0;
    int suma = 0;
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[fila][columna]);
      aux = num[fila][columna];
      suma += aux;
      if (aux > maximo) {
        maximo = aux;
      }
      if (aux < min) {
        min = aux;
      }
      columna++;
      fila--;

    }
    System.out.println();
    System.out.println("El máximo es: " + maximo);
    System.out.println("El minimo es: " + min);
    System.out.println("La media es: " + (suma / num.length));

  }
}
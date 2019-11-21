
public class T7BEjercicio11 {
  public static void main(String[] args) {
    /*
     * Realiza un programa que muestre por pantalla un array de 10 filas por 10
     * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
     * programa debe mostrar los números de la diagonal que va desde la esquina
     * superior izquierda a la esquina inferior derecha, así como el máximo, el
     * mínimo y la media de los números que hay en esa diagonal.
     */
    int[][] num = new int[10][10];
    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num[0].length; j++) {
        num[i][j] = (int) ((Math.random() * 100) + 200);
        System.out.print(" " + num[i][j] + " ");
      }
      System.out.println();
    }
    int fila = 0;
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
      fila++;

    }

    System.out.println("Media = " + (suma / 10));
    System.out.println("Mínimo = " + min);
    System.out.println("Máximo = " + maximo);
  }
}
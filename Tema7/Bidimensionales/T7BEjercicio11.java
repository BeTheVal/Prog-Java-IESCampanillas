import javax.print.attribute.standard.Media;

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
      }
    }
    int fila = 0;
    int columna = 0;
    int minimo = 301;
    int maximo = 0;
    int suma = 0;
    for (fila = 0; fila < num.length; fila++) {
      for (columna = 0; columna < num[0].length; columna++) {
        System.out.println(num[fila][columna]);
        suma += num[fila][columna];
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
        }
        if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
        }

      }
    }
    System.out.println("Media = " + (suma / 10));
    System.out.println("Mínimo = " + minimo);
    System.out.println("Máximo = " + maximo);
  }
}
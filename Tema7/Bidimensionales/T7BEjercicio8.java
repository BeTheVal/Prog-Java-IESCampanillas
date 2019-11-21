import java.util.Scanner;

public class T7BEjercicio8 {
  public static void main(String[] args) {
    /*
     * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
     * a qué casillas podría saltar un alfil que se encuentra en esa posición. Como
     * se indica en la figura, el alfil se mueve siempre en diagonal. El tablero
     * cuenta con 64 casillas. Las columnas se indican con las letras de la “a” a la
     * “h” y las filas se indican del 1 al 8
     */
    Scanner sc = new Scanner(System.in);
    int[][] tablero = new int[7][7];
    System.out.println("Introduce la posición del alfil");
    System.out.print("Fila (1-8) : ");
    int fila = (sc.nextInt() - 1);
    int columna = 0;
    System.out.println("Letra (a-h): ");
    String letra = sc.next().toLowerCase();
    switch (letra) {
    case "a":
      columna = 0;
      break;
    case "b":
      columna = 1;
      break;
    case "c":
      columna = 2;
      break;
    case "d":
      columna = 3;
      break;
    case "e":
      columna = 4;
      break;
    case "f":
      columna = 5;
      break;
    case "g":
      columna = 6;
      break;
    case "h":
      columna = 7;
      break;
    default:
      break;
    }
    System.out.print("posicion : " + fila + "," + columna);

  }
}
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
    System.out.print("Fila : ");
    int fila = sc.nextInt();
    System.out.print("Letra: ");
    String letra = sc.nextLine();

  }
}
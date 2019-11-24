import java.util.Scanner;

public class T7Ejercicio17 {
  public static void main(String[] args) {
    /*
     * Escribe un programa que muestre por pantalla un array de 10 números enteros
     * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
     * número al usuario. Se debe comprobar que el número introducido por teclado se
     * encuentra dentro del array, en caso contrario se mostrará un mensaje por
     * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca
     * uno correctamente. A continuación, el programa rotará el array hacia la
     * derecha las veces que haga falta hasta que el número introducido quede
     * situado en la posición 0 del array. Por último, se mostrará el array rotado
     * por pantalla.
     */
    Scanner sc = new Scanner(System.in);
    int[] num = new int[10];
    boolean existeNumero = false;
    for (int i = 0; i < num.length; i++) {
      num[i] = (int) (Math.random() * 100);
    }
    // pinta la array
    int contador = 0;
    for (int i = 0; i < num.length; i++) {
      System.out.print(" " + num[i] + " ");
      if (contador == num.length) {
        System.out.println();

      }
    }
    int numeroIntroducido;
    System.out.println();

    do {
      System.out.print("Introduzca el número a mover:");
      numeroIntroducido = sc.nextInt();
      // Comprobación de número
      for (int i = 0; i < num.length; i++) {
        if (num[i] == numeroIntroducido) {
          existeNumero = true;
        }
      }
    } while (!existeNumero);

    while (num[0] != numeroIntroducido) {
      int aux = num[9];
      // Rotación a la derecha
      for (int i = 9; i > 0; i--) {
        num[i] = num[i - 1];
      }
      num[0] = aux;
    }
    for (int i : num) {
      System.out.print(" " + i + " ");
    }
  }
}

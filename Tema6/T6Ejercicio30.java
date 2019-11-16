import java.util.Scanner;

public class T6Ejercicio30 {
  public static void main(String[] args) {
    /*
     * El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
     * Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
     * le hagan compañía al pez. Realiza un programa que pinte por pantalla la
     * pecera con los tres animalitos acuáticos colocados dentro en posiciones
     * aleatorias. Por una cuestión de física elemental, ninguno de los animales
     * puede coincidir en la misma posición. Se debe pedir al usuario el ancho y el
     * alto de la pecera, que como mínimo serán de 4 unidades.
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el alto de la pecera (minimo 4)");
    int altura = sc.nextInt();
    System.out.println("Ahora introduce el ancho de la pecera (minimo 4)");
    int ancho = sc.nextInt();

    int posicion = 0;
    int posicionPez;
    int posicionCaballito;
    int posicionCaracola;

    do {
      posicionPez = (int) (Math.random() * (altura - 2) * (ancho - 2));
      posicionCaballito = (int) (Math.random() * (altura - 2) * (ancho - 2));
      posicionCaracola = (int) (Math.random() * (altura - 2) * (ancho - 2));
    } while ((posicionPez == posicionCaballito) || (posicionPez == posicionCaracola)
        || (posicionCaballito == posicionCaracola));
    // Pinta el ancho
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();

    for (int i = 2; i < altura; i++) {
      System.out.print("*");
      for (int j = 2; j < ancho; j++) { // Pinta ancho
        if (posicion == posicionPez) {
          System.out.print("&");
        } else if (posicion == posicionCaracola) { // Pinta las figuras y sigue con el bucle
          System.out.print("@");
        } else if (posicion == posicionCaballito) {
          System.out.print("$");
        } else {
          System.out.print(" ");
        }
        posicion++;
      }
      System.out.println("*");
    }

    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}
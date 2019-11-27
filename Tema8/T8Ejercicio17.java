import java.util.Scanner;

public class T8Ejercicio17 {
  public static void main(String[] args) {
    /*
     * Escribe un programa que pase de binario a decimal.
     */
    Scanner sc = new Scanner(System.in);
    long numero, aux, digito;
    boolean esBinario;
    // Leer un número por teclado y comprobar que es binario
    do {
      System.out.print("Introduce un numero binario: ");
      numero = sc.nextLong();
      // comprobamos que sea un número binario es decir
      // que este formado solo por ceros y unos
      esBinario = true;
      aux = numero;
      while (aux != 0) {
        digito = aux % 10; // última cifra del números
        if (digito != 0 && digito != 1) { // si no es 0 ó 1
          esBinario = false; // no es un número binario
        }
        aux = aux / 10; // quitamos la última cifra para repetir el proceso
      }
    } while (!esBinario); // se vuelve a pedir si no es binario
    System.out.println("En Decimal: " + BinADecimal(numero));
  }

  public static long BinADecimal(long x) {
    // proceso para pasar de binario a decimal
    long exponente = 0;
    long decimal = 0; // será el equivalente en base decimal
    while (x != 0) {
      // se toma la última cifra
      long digito = x % 10;
      // se multiplica por la potencia de 2 correspondiente y se suma al número
      decimal = decimal + digito * (int) Math.pow(2, exponente);
      // se aumenta el exponente
      exponente++;
      // se quita la última cifra para repetir el proceso
      x = x / 10;
    }
    return decimal;
  }
}
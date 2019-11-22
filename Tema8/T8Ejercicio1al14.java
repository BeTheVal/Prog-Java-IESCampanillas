import java.util.Scanner;

public class T8Ejercicio1al14 {
  public static void main(String[] args) {
    /*
     * Crea una biblioteca de funciones matemáticas que contenga las siguientes
     * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
     * Observa bien lo que hace cada función ya que, si las implementas en el orden
     * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
     * resulta trivial teniendo voltea y la función siguientePrimo también es muy
     * fácil de implementar teniendo esPrimo. 1. esCapicua: Devuelve verdadero si el
     * número que se pasa como parámetro es capicúa y falso en caso contrario. 2.
     * esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo
     * y falso en caso contrario. 3. siguientePrimo: Devuelve el menor primo que es
     * mayor al número que se pasa como parámetro. 4. potencia: Dada una base y un
     * exponente devuelve la potencia. 5. digitos: Cuenta el número de dígitos de un
     * número entero. 6. voltea: Le da la vuelta a un número. 7. digitoN: Devuelve
     * el dígito que está en la posición n de un número entero. Se empieza contando
     * por el 0 y de izquierda a derecha. 8. posicionDeDigito: Da la posición de la
     * primera ocurrencia de un dígito dentro de un número entero. Si no se
     * encuentra, devuelve -1. 9. quitaPorDetras: Le quita a un número n dígitos por
     * detrás (por la derecha). 10. quitaPorDelante: Le quita a un número n dígitos
     * por delante (por la izquierda). 11. pegaPorDetras: Añade un dígito a un
     * número por detrás. 12. pegaPorDelante: Añade un dígito a un número por
     * delante. 13. trozoDeNumero: Toma como parámetros las posiciones inicial y
     * final dentro de un número y devuelve el trozo correspondiente. 14.
     * juntaNumeros: Pega dos números para formar uno.
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("Elige lo que quieres hacer : ");
    System.out.println(
        "1.Es Capicua\n2.Es Primo\n3.Siguiente Primo\n4.potencia\n5.Cuenta digitos\n6.Voltea\n7.Digito en\n8.Posicion de digito\n9.Quita por detras\n10.Quita por delante\n11.Pega por detras\n12.Pega por delante\n13.Trozo de Numero\n14.Junta números");
    System.out.print("Introduce número: ");
    int eleccion = sc.nextInt();

    switch (eleccion) {
    case 1:

      break;
    case 2:

      break;
    case 3:

      break;
    case 4:

      break;
    case 5:

      break;
    case 6:

      break;
    case 7:

      break;
    case 8:

      break;
    case 9:

      break;
    case 10:

      break;
    case 11:

      break;
    case 12:

      break;
    case 13:

      break;
    case 14:

    default:
      break;
    }

  }

  /////////////////////////////////////////////////// Funciones//////////////////////////////////////
  /**
   * Comprueba si un número es capicua o no.
   */
  public static boolean esCapicua(Long numero) {

    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while

    if (volteado == numeroIntroducido) {
      System.out.println("El " + numeroIntroducido + " es capicúa");
    } else {
      System.out.println("El " + numeroIntroducido + " no es capicúa");
    }
  }
}

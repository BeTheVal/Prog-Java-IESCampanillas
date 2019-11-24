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
    int numero;
    long largonumero;

    switch (eleccion) {
    case 1:
      System.out.print("Introduce el número para saber si es capicua: ");
      numero = sc.nextInt();
      if (esCapicua(numero)) {
        System.out.println("El " + numero + " es capicúa");
      } else {
        System.out.println("El " + numero + " no es capicúa");

      }

      break;
    case 2:
      System.out.print("Introduce el número para saber si es primo: ");
      numero = sc.nextInt();
      if (esPrimo(numero)) {
        System.out.println("El numero " + numero + " es primo.");
      } else {
        System.out.println("El numero " + numero + " no es primo.");
      }

      break;
    case 3:
      System.out.print("Introduce el número y te digo el siguiente primo: ");
      numero = sc.nextInt();
      System.out.println("El siguiente primo es " + siguientePrimo(numero));

      break;
    case 4:
      System.out.print("Introduce una base : ");
      int base = sc.nextInt();
      System.out.print("Introduce un exponente: ");
      int exponente = sc.nextInt();
      System.out.println("El resultado de la potencia es : " + potencia(base, exponente));
      break;
    case 5:
      System.out.println("Introduce el número al que contarle los digitos : ");
      numero = sc.nextInt();
      System.out.println("El numero introducido tiene " + digitos(numero));
      break;
    case 6:
      System.out.println("Introduce el número a voltear: ");
      numero = sc.nextInt();
      System.out.println("El número volteado es: " + voltea(numero));

      break;
    case 7:
      System.out.print("Introduce el número del que elegir el dígito: ");
      numero = sc.nextInt();
      System.out.print("Introduce la posición: ");
      eleccion = sc.nextInt();
      System.out.println("El digito que está en la posición " + eleccion + " es: " + digitoN(numero, eleccion));
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
   * ES CAPICUA Comprueba si un número es capicua o no.
   */
  public static boolean esCapicua(int x) {

    int volteado = 0;
    int aux = x;

    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x /= 10;
    } // while

    if (volteado == aux) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * ES PRIMO Devuelve verdadero si el número que se pasa como parámetro es primo
   * y falso en caso contrario
   */
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      } else {
        return true;
      }
    }
    return false;
  }

  /**
   * Devuelve el siguiente primo despues del que se le pasa como parámetro.
   * 
   * 
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {
    }
    ;

    return x;
  }

  /**
   * potencia: Dada una base y un exponente devuelve la potencia.
   */
  public static double potencia(int x, int y) {
    double resultado = Math.pow(x, y);
    return resultado;

  }

  /**
   * digitos: Cuenta el número de dígitos de u número entero.
   */
  public static long digitos(long x) {
    if (x < 0) {
      x = -x;
    }
    if (x == 0) {
      return 1;
    }
    int contador = 0;
    do {
      x = (x / 10);
      contador++;
    } while (x != 0);
    return contador;
  }

  /**
   * voltea: Le da la vuelta a un número.
   */
  public static int voltea(int x) {
    int volteado = 0;
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x /= 10;
    }
    return volteado;

  }

  /**
   * digitoN: Devuelve el dígito que está en la posición n de un número entero
   */
  public static int digitoN(int x, int n) {
    x = voltea(x);

    while (n-- > 1) {
      x = x / 10;
    }

    return x % 10;
  }

  /**
   * posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro
   * de un número entero. Si no se encuentra, devuelve -1.
   */
  public static int posicionDeDigito(int x, int y) {

  }
}

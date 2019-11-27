package matematicas;

public class Mates {
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
  public static int potencia(int x, int y) {
    double resultado = Math.pow(x, y);
    return (int) resultado;

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
    return (long) contador;
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
    int i;

    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != y); i++) {
    }
    ;

    if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }

  }

  /**
   * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
   * derecha).
   */
  public static int quitaPorDetras(int x, int y) {
    for (int i = 0; i < y; i++) {
      x = x / 10;
    }
    return x;

  }

  /**
   * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
   * izquierda).
   */
  public static int quitaPorDelante(int x, int y) {
    x = voltea(x);
    for (int i = 0; i < y; i++) {
      x = x / 10;
    }
    return voltea(x);

  }

  /**
   * 11. pegaPorDetras: Añade un dígito a un número por detrás.
   */
  public static int pegaPorDetras(int x, int y) {
    String sX = String.valueOf(x);
    String sY = String.valueOf(y);
    String res = sX + sY;
    int resultado = Integer.parseInt(res);
    return resultado;
  }

  /**
   * 12.pegaPorDelante: Añade un dígito a un número por delante.
   * 
   */
  public static int pegaPorDelante(int x, int y) {
    String sX = String.valueOf(x);
    String sY = String.valueOf(y);
    String res = sX + sY;
    int resultado = Integer.parseInt(res);
    return resultado;
  }

  /**
   * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro
   * de un número y devuelve el trozo correspondiente.
   */
  public static int trozoDeNumero(int x, int y, int z) {
    int longitud = (int) digitos(x);
    x = quitaPorDelante(x, y);
    x = quitaPorDetras(x, longitud - z - 1);
    return x;
  }

  /**
   * 14. juntaNumeros: Pega dos números para formar uno.
   */
  public static int juntaNumeros(int x, int y) {
    return (x * potencia(10, (int) digitos(y))) + y;
  }

  /**
   * Número aleatorio
   */
  public static int aleatorio(int x, int y) {
    return (int) ((Math.random() * x) + y);
  }
}
public class T8Ejercicio20al28 {
  public static void main(String[] args) {

    /*
     * Crea una biblioteca de funciones para arrays (de una dimensión) de números
     * enteros que contenga las siguientes funciones: 1. generaArrayInt: Genera un
     * array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se
     * indica como parámetro. 2. minimoArrayInt: Devuelve el mínimo del array que se
     * pasa como parámetro. 3. maximoArrayInt: Devuelve el máximo del array que se
     * pasa como parámetro. 4. mediaArrayInt: Devuelve la media del array que se
     * pasa como parámetro. 5. estaEnArrayInt: Dice si un número está o no dentro de
     * un array. 6. posicionEnArray: Busca un número en un array y devuelve la
     * posición (el índice) en la que se encuentra. 7. volteaArrayInt: Le da la
     * vuelta a un array. 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los
     * números de un array. 9. rotaIzquierdaArrayInt: Rota n posiciones a la
     * izquierda los números de un array.
     */
    System.out.println("Ejercicio 20: ");
    System.out.println(generaArrayInt(10, 1, 10));
    System.out.println("Ejercicio 21: ");
    System.out.println("El valor minimo es : " + minimoArrayInt(generaArrayInt(10, 1, 10)));
  }

  /**
   * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
   * intervalo (mínimo y máximo) se indica como parámetro.
   */
  public static int[] generaArrayInt(int tamaño, int minimo, int maximo) {
    int nuevaArray[] = new int[tamaño];
    for (int i = 0; i < nuevaArray.length; i++) {
      nuevaArray[i] = (int) ((Math.random() * (maximo - minimo) + minimo));
    }
    return nuevaArray;
  }

  /**
   * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
   */
  public static int minimoArrayInt(int[] laArray) {
    int valorminimo = 10;
    for (int i = 0; i < laArray.length; i++) {
      if (laArray[i] < valorminimo) {
        valorminimo = laArray[i];
      }
    }
    return valorminimo;
  }

  /**
   * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
   */
  public static int maximoArrayInt(int[] laArray) {
    int valormaximo = 0;
    for (int i = 0; i < laArray.length; i++) {
      if (laArray[i] > valormaximo) {
        valormaximo = laArray[i];
      }
    }
    return valormaximo;
  }

  /**
   * 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
   */
  public static double mediaArrayInt(int[] laArray) {
    int suma = 0;
    int contador = 0;
    for (int i = 0; i < laArray.length; i++) {
      suma += laArray[i];
      contador++;
    }
    int media = suma / contador;
    return media;

  }

  /**
   * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
   */
  public static boolean estaEnArray(int[] arr, int numero) {
    for (int i = 0; i < array.length; i++) {
      if (i == numero) {
        return true;
      } else {
        return false;
      }

    }
  }

  /**
   * 6. posicionEnArray: Busca un número en un array y devuelve la posición (el
   * índice) en la que se encuentra.
   */
  public static int posicionEnArray(int[] arr, int numero) {
    int contador = 0;
    for (int i = 0; i < array.length; i++) {
      if (numero == i) {
        return contador;
      } else {
        contador++;
      }
    }
  }

  /**
   * 7. volteaArrayInt: Le da la vuelta a un array.
   */
  public static int[] volteaArray(int[] arr) {
    int[] a = new int[x.length];

    for (int i = 0; i < x.length; i++) {
      a[x.length - i - 1] = x[i];
    }

    return a;
  }

  /**
   * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
   * array.
   */
  public static int[] rotaDerechaArrayInt(int[] x, int n) {

    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;

    while (n-- > 0) {
      aux = a[a.length - 1];
      for (i = a.length - 1; i > 0; i--) {
        a[i] = a[i - 1];
      }
      a[0] = aux;
    }

    return a;
  }

  /**
   * Devuelve un array rotada <code>n</code> posiciones a la izquierda tomando
   * como referencia el array que se pasa como parámetro. Los números que van
   * saliendo por la izquierda vuelven a entrar por la derecha.
   *
   * @param x array unidimiensional de números enteros
   * @param n número de movimientos (rotaciones hacia la izquierda) a realizar
   * @return array rotada <code>n</code> posiciones a la izquierda
   */
  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {

    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;

    while (n-- > 0) {
      aux = a[0];
      for (i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }

    return a;
  }
}
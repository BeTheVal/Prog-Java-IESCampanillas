public class T6Ejercicio21 {
  public static void main(String[] args) {
    /*
     * Realiza un programa que genere una secuencia de cinco monedas de curso legal
     * lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos, 5
     * céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
     * posiciones posibles son cara y cruz.
     */
    int unCentimo = (int) (Math.random() * 2);
    int dosCentimo = (int) (Math.random() * 2);
    int cincoCentimo = (int) (Math.random() * 2);
    int diezCentimo = (int) (Math.random() * 2);
    int veinteCentimo = (int) (Math.random() * 2);
    int cincuentaCentimo = (int) (Math.random() * 2);
    int unEuro = (int) (Math.random() * 2);
    int dosEuro = (int) (Math.random() * 2);

    // Si una variable es 0 cara y si es 1 cruz
    if (unCentimo == 0) {
      System.out.println("Un centimo  - Cara");
    } else {
      System.out.println("Un centimo  - Cruz");
    }
    if (dosCentimo == 0) {
      System.out.println("Dos centimos  - Cara");
    } else {
      System.out.println("Dos centimos  - Cruz");
    }
    if (cincoCentimo == 0) {
      System.out.println("Cinco centimos - Cara");
    } else {
      System.out.println("Cinco centimos - Cruz");
    }
    if (diezCentimo == 0) {
      System.out.println("Diez centimos  - Cara");
    } else {
      System.out.println("Diez centimos  - Cruz");
    }
    if (veinteCentimo == 0) {
      System.out.println("Veinte centimos  - Cara");
    } else {
      System.out.println("Veinte centimos  - Cruz");
    }
    if (cincuentaCentimo == 0) {
      System.out.println("Cincuenta centimos  - Cara");
    } else {
      System.out.println("Cincuenta centimos  - Cruz");
    }
    if (unEuro == 0) {
      System.out.println("Un Euro  - Cara");
    } else {
      System.out.println("Un Euro  - Cruz");
    }
    if (dosEuro == 0) {
      System.out.println("Dos Euros  - Cara");
    } else {
      System.out.println("Dos euros  - Cruz");
    }
  }
}
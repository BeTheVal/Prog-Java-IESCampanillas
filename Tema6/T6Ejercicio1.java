public class T6Ejercicio1 {
  public static void main(String[] args) {
    /*
     * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
     * también la suma total (los puntos que suman entre los tres dados)
     */
    int aux = 0;
    System.out.println("Tirada de 3 dados y su suma.");
    for (int i = 1; i <= 3; i++) {
      int numero = (int) (Math.random() * 6) + 1;
      System.out.println(numero);
      aux += numero;
    }
    System.out.println("La suma total es : " + aux);
  }

}
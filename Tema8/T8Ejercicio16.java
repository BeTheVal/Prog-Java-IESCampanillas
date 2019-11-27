import matem.Mates;

public class T8Ejercicio16 {
  public static void main(String[] args) {
    /*
     * Muestra los números capicúa que hay entre 1 y 99999.
     */
    for (int i = 1; i < 99999; i++) {
      if (Mates.esCapicua(i)) {
        System.out.println(i);
      }
    }
  }
}
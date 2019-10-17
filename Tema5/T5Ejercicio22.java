
public class T5Ejercicio22 {
  public static void main(String[] args) {
    for (int i = 1; i < 100; i++) {
      int numero = i;
      for (int j = 1; j < numero; j++) {
        if (numero % j == 0) {
          System.out.println(numero);
        } else {
          ;
        }
      }
    }

  }
}
import java.util.HashMap;
import java.util.Scanner;

public class T10Ejercicio16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> paisCapital = new HashMap<>();
    paisCapital.put("España", "Madrid");
    paisCapital.put("Francia", "París");
    paisCapital.put("Portugal", "Lisboa");
    String pais = " ";
    while (!pais.equals("salir")) {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");
      pais = sc.next();
      if (paisCapital.containsKey(pais) && !pais.equals("salir")) {
        System.out.println("La capital de " + pais + " es " + paisCapital.get(pais));
      } else {
        System.out.println("No conozco la respuesta ¿cuál es la capital de " + pais + "? :");
        String capital = sc.next();
        paisCapital.put(pais, capital);
      }
    }
  }

}

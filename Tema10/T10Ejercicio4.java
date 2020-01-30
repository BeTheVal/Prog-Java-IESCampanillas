import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class T10Ejercicio4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> palabras = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      System.out.println("Introduzca la palabra " + (i + 1) + "º");
      palabras.add(sc.nextLine());
    }
    Collections.sort(palabras);
    System.out.println(palabras);
  }
}

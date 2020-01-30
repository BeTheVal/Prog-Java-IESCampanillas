import java.util.ArrayList;
import java.util.Scanner;

public class T10Ejercicio1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> alumnos = new ArrayList<String>();
    for (int i = 0; i < 6; i++) {
      System.out.println("Introduce el nombre del alumno " + i);
      alumnos.add(sc.next());
    }
    for (String alumno : alumnos) {
      System.out.println(alumno);
    }
  }

}

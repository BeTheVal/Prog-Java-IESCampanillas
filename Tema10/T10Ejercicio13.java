import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class T10Ejercicio13 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Disco> discos = new ArrayList<>();
    int opcion = 0;
    do {
      System.out.println("1.Listado");
      System.out.println("2.Alta");
      System.out.println("3.Baja");
      System.out.println("4.Modificar");
      System.out.println("5.Entrada de mercancía");
      System.out.println("6.Salida de mercancía");
      System.out.println("7.Salir");
      System.out.println("Introduzca la opción deseada: ");
      opcion = sc.nextInt();
      switch (opcion) {
        case 1:
          System.out.println(discos);
          break;
        case 2:
          System.out.println("");
          System.out.println("");
          System.out.println("");
          break;
        default:
          break;
      }
    } while (opcion != 7);
  }
}


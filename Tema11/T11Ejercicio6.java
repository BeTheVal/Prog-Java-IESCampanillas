import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class T11Ejercicio6 {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      String linea = "";
      int contador = 0;
      while (linea != null) {
        linea = br.readLine();
        if (linea != null) {
          if (linea.contains(args[1])) {
            contador++;
          }
        }
      }
      System.out.println("La palabra se repite " + contador + " veces");
    } catch (IOException ioe) {
      System.out.println("No se ha encontrado el archivo");
    }
  }
}

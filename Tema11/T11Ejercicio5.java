import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class T11Ejercicio5 {

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Debes introducir al menos un argumento");
      System.exit(-1);
    }
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + "v2.java"));
      String linea = "";
      String comentario = "";
      boolean multilinea = false;
      linea = br.readLine();
      while (linea != null) {
        if (linea.contains("//")) {
          linea = br.readLine();
          continue;
        }
        String chara = "/";
        if (linea.indexOf("/*") != -1) {
          multilinea = true;
        }
        if (linea.indexOf("*/") != -1) {
          multilinea = false;
          linea = br.readLine();


        }
        if (!multilinea) {
          bw.write(linea + "\n");
        }
        linea = br.readLine();
      }
      br.close();
      bw.close();


    } catch (IOException ioe) {
      System.out.println("No se ha podido leer el archivo");
    }

  }

}

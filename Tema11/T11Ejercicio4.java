import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class T11Ejercicio4 {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      String linea = "";
      ArrayList<String> horosco = new ArrayList<>();

      while (linea != null) {
        linea = br.readLine();
        if (linea != null) {
          horosco.add(linea);
        }
      }
      br.close();
      Collections.sort(horosco);
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + "_sort.txt"));
      for (String s : horosco) {
        bw.write(s + "\n");
      }
      bw.close();
    } catch (FileNotFoundException fnfe) {
      System.out.println("No se encuentra el fichero");
    } catch (IOException ioe) {
      System.out.println("No se puede leer el fichero");
    }
  }
}

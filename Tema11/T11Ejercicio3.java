import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class T11Ejercicio3 {

  public static void main(String[] args) {
    //Petición de argumentos
    if (args.length != 3) {
      System.out.println(
          "El programa se ejecuta de la siguiente forma T11Ejercicio3 FICHERO1 FICHERO2 NOMBREMEZCLA");
      System.exit(-1);
    }
    try {
      BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
      BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
      BufferedWriter bw1 = new BufferedWriter(new FileWriter(args[2]));
      String l1 = "";
      String l2 = "";
      // asignacion de lineas del documento
      while (l1 != null || l2 != null) {
        l1 = br1.readLine();
        l2 = br2.readLine();
        //escritura
        if (l1 != null) {
          bw1.write(l1 + "\n");
        }
        if (l2 != null) {
          bw1.write(l2 + "\n");
        }
      }
      br1.close();
      br2.close();
      bw1.close();

    } catch (IOException ioe) {
      System.out.println("Se ha producido un error en el proceso");
    }
  }

}

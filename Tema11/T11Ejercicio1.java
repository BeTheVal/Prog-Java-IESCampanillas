import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class T11Ejercicio1 {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter("primos"));
    for (int i = 0; i < 500; i++) {
      if (esPrimo(i)) {
        bw.write(i + "\n");
      }
    }
    bw.close();
  }

  public static boolean esPrimo(int numero) {
    int contador = 2;
    boolean primo = true;
    while ((primo) && (contador != numero)) {
      if (numero % contador == 0) {
        primo = false;
      }
      contador++;
    }
    return primo;
  }
}

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T10Ejercicio6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> usuariosContraseña = new HashMap<>();
    System.out.println("Introduce un nuevo nombre de usuario");
    String usuario = sc.next();
    System.out.println("Introduce una nueva contraseña");
    String contraseña = sc.next();

    usuariosContraseña.put(usuario, contraseña);
    System.out.println("Usuario");
    String usuarioLogin = sc.next();
    String contraseñaLogin = " ";
    boolean pass = false;
    do {
      System.out.println("Contraseña");
      contraseñaLogin = sc.next();
      if (contraseñaLogin.equals(usuariosContraseña.get(contraseña))) {
        pass = true;
      }

    } while (!pass);

  }
}

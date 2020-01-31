import java.util.ArrayList;
import java.util.Scanner;

public class T10Ejercicio5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Disco> gestor = new ArrayList<Disco>();
    gestor.add(new Disco("GASA", " Duncan Dhu", "Por tierras escocesas", "pop", 120));
    gestor.add(new Disco("GASA1", " Duncan Dhu", "Canciones", "pop", 120));
    gestor.add(new Disco("GASA2", " Duncan Dhu", "El grito del tiempo", "pop", 120));
    int opcion = 0;
    do {
      //Menú principal
      System.out.println("Bienvenido a su gestor de discos.");
      System.out.println("1. Añadir disco");
      System.out.println("2. Mostrar discos almacenados");
      System.out.println("3. Modificar datos");
      System.out.println("4. Borrar disco");
      System.out.println("5. Salir");
      System.out.println("Seleccione una opción: ");
      opcion = sc.nextInt();
      switch (opcion) {
        case 1:
          System.out.println("Introduzca el código del nuevo disco.");
          String codigo = sc.next();
          System.out.println("Introduzca el autor del nuevo disco.");
          String autor = sc.next();
          System.out.println("Introduzca el título del nuevo disco.");
          String titulo = sc.next();

          System.out.println("Introduzca el genero del nuevo disco.");
          String genero = sc.next();

          System.out.println("Introduzca la duración del nuevo disco.");
          long duracion = sc.nextLong();
          gestor.add(new Disco(codigo, autor, titulo, genero, duracion));
          break;
        case 2:
          for (Disco disco : gestor) {
            System.out.println(disco);
          }
          break;
        case 3:
          System.out.println("Introduce el código del album que deseas modificar");
          String codmod = sc.next();
          System.out.println("¿Que deseas modificar?");
          System.out.println("1.Código");
          System.out.println("2.Autor");
          System.out.println("3.Título");
          System.out.println("4.Genero");
          System.out.println("5.Duración");
          int opcionmod = sc.nextInt();
          switch (opcionmod) {
            case 1:
              System.out.println("Introduce el nuevo código");
              String codeToMod = sc.next();
              for (int i = 0; i < gestor.size(); i++) {
                if (gestor.get(i).getCodigo().equals(codmod)) {
                  gestor.get(i).setCodigo(codeToMod);
                  System.out.println("Código editado con éxito.");
                }
              }
              break;

            case 2:
              System.out.println("Inserta el nuevo autor");
              String autorToMod = sc.next();
              for (int i = 0; i < gestor.size(); i++) {
                if (gestor.get(i).getCodigo().equals(codmod)) {
                  gestor.get(i).setCodigo(autorToMod);
                  System.out.println("Autor editado con exito.");
                }
              }
              break;

            case 3:
              System.out.println("Inserta el nuevo Titulo");
              String titleToMod = sc.next();
              for (int i = 0; i < gestor.size(); i++) {
                if (gestor.get(i).getCodigo().equals(codmod)) {
                  gestor.get(i).setCodigo(titleToMod);
                  System.out.println("Autor editado con exito.");
                }
              }

              break;
            case 4:
              System.out.println("Introduce el nuevo género");
              String genreToMod = sc.next();
              for (int i = 0; i < gestor.size(); i++) {
                if (gestor.get(i).getCodigo().equals(codmod)) {
                  gestor.get(i).setCodigo(genreToMod);
                  System.out.println("Género editado con éxito.");
                }
              }
              break;
            case 5:
              System.out.println("Introduce la nueva duración");
              String durToMod = sc.next();
              for (int i = 0; i < gestor.size(); i++) {
                if (gestor.get(i).getCodigo().equals(codmod)) {
                  gestor.get(i).setCodigo(durToMod);
                  System.out.println("Duración editada con éxito.");
                }
              }
              break;
            default:
              break;
          }
          break;
        case 4:
          System.out.println("Introduzca el código del disco que desea borrar: ");
          String codborrar = sc.next();
          for (int i = 0; i < gestor.size(); i++) {
            if (gestor.get(i).getCodigo().equals(codborrar)) {
              gestor.remove(gestor.get(i));
              System.out.println("El álbum ha sido borrado.");
            }
          }
          break;
      }
    }
    while (opcion != 5);
  }

}

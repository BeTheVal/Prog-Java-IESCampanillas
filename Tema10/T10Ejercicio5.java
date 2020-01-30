import T9AOEjercicio3y4.Disco;
import java.util.ArrayList;
import java.util.Scanner;

//TODO Refactorizar, corregir y terminar
public class T10Ejercicio5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Disco> gestor = new ArrayList<Disco>();
    gestor.add(new Disco("GASA", " Duncan Dhu", "Por tierras escocesas", "pop", 120));
    gestor.add(new Disco("GASA1", " Duncan Dhu", "Canciones", "pop", 120));
    gestor.add(new Disco("GASA2", " Duncan Dhu", "El grito del tiempo", "pop", 120));
    int contador = 3;
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
          if (contador >= 100) {
            System.out.println(
                "Actualmente tienes 100 discos, no se pueden almacenar más, debes borrar.");
            break;
          }
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
          if (contador > 0) {
            for (int i = 0; i < contador; i++) {
              if (gestor.get(i).getCodigo().equals("LIBRE")) {
                gestor.add(new Disco(codigo, autor, titulo, genero, duracion));
                System.out.println("Disco: " + gestor.get(i).getTitulo() + " creado con exito.");
                contador++;
                break;
              }
              if (i == contador - 1) {
                gestor[contador] = new Disco(codigo, autor, titulo, genero, duracion);
                System.out.println("Disco: " + gestor[contador].getTitulo() + " creado con exito.");
                contador++;
                break;
              }

            }
          }
          if (contador == 0) {
            gestor[contador] = new Disco(codigo, autor, titulo, genero, duracion);
            System.out.println("Disco: " + gestor[contador].getTitulo() + " creado con exito.");
            contador++;
          }
          break;
        case 2:
          for (int i = 0; i < contador; i++) {
            System.out.println(gestor[i].toString());
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
              System.out.println("Inserta nuevo código");
              String codToEdit = sc.next();
              for (int i = 0; i < contador; i++) {
                if (gestor[i].getCodigo().equals(codmod)) {
                  gestor[i].setCodigo(codToEdit);
                }
              }
              System.out.println("Código editado con exito.");
              break;
            case 2:
              System.out.println("Inserta autor código");
              String autorToEdit = sc.next();
              for (int i = 0; i < contador; i++) {
                if (gestor[i].getCodigo().equals(codmod)) {
                  gestor[i].setAutor(autorToEdit);
                }
              }
              System.out.println("Autor editado con exito.");
              break;
            case 3:
              System.out.println("Inserta nuevo titulo");
              String tituloToEdit = sc.next();
              for (int i = 0; i < contador; i++) {
                if (gestor[i].getCodigo().equals(codmod)) {
                  gestor[i].setTitulo(tituloToEdit);
                }
              }
              System.out.println("Código editado con exito.");
              break;
            case 4:
              System.out.println("Inserta nuevo género");
              String generoToEdit = sc.next();
              for (int i = 0; i < contador; i++) {
                if (gestor[i].getCodigo().equals(codmod)) {
                  gestor[i].setGenero(generoToEdit);
                }
              }
              System.out.println("Genero editado con exito.");
              break;
            case 5:
              System.out.println("Inserta nueva duración");
              long duracionToEdit = sc.nextLong();
              for (int i = 0; i < contador; i++) {
                if (gestor[i].getCodigo().equals(codmod)) {
                  gestor[i].setDuracion(duracionToEdit);
                }
              }
              System.out.println("Código editado con exito.");
              break;
            default:
              break;
          }
          break;
        case 4:
          System.out.println("Introduzca el código del disco que desea borrar: ");
          String codborrar = sc.next();
          for (int i = 0; i < contador; i++) {
            if (gestor[i].getCodigo().equals(codborrar)) {
              gestor[i].setCodigo("LIBRE");
              gestor[i].setAutor(" ");
              gestor[i].setTitulo(" ");
              gestor[i].setGenero(" ");
              gestor[i].setDuracion(0);
            }
          }
          System.out.println("El álbum con código " + codborrar + " ha sido borrado.");
          break;
      }
    } while (opcion != 5);
  }

}

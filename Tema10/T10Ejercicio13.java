import java.util.ArrayList;
import java.util.Scanner;

public class T10Ejercicio13 {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Articulo> articulos = new ArrayList<>();
      int opcion = 0;
      System.out.println("Bienvenido a GESTISIMAL");
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
              System.out.println(articulos);
              break;
          case 2:
              System.out.println("Introduce el código");
              String codeNew = sc.next();
              System.out.println("Introduce la descripcion");
              String DescNew = sc.next();
              System.out.println("Introduce el precio de compra");
              double precioCompNew = sc.nextDouble();
              System.out.println("Introduce el precio de venta");
              double precioVentNew = sc.nextDouble();
              System.out.println("Introduce el stock");
              int stockNew = sc.nextInt();
              articulos.add(new Articulo(codeNew, DescNew, precioCompNew, precioVentNew, stockNew));
              break;
          case 3:
              System.out.println("Introduce el código del artículo que deseas borrar");
              String codeToDelete = sc.next();
              for (int i = 0; i < articulos.size(); i++) {
                  if (articulos.get(i).getCodigo().equals(codeToDelete)) {
                      articulos.remove(i);
                  }
              }
              break;
          case 4:
              break;
          default:
              break;
      }
    } while (opcion != 7);
  }
}


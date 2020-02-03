import java.util.ArrayList;
import java.util.Scanner;

public class T10Ejercicio13 {
//TODO Terminar ejercicio.
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
          System.out.println("Introduce el código del producto a modificar");
          String codToMod = sc.next();
          System.out.println("1. Modificar codigo");
          System.out.println("2. Modificar Descripcion");
          System.out.println("3. Modificar precio de compra");
          System.out.println("4. Modificar precio de venta ");
          System.out.println("5. Modificar Stock");
          System.out.println("¿Que deseas modificar?");
          int opmod = sc.nextInt();
          switch (opmod) {
            case 1:
              System.out.println("Inserte el nuevo código");
              String codToMody = sc.next();
              for (int i = 0; i < articulos.size(); i++) {
                if (articulos.get(i).getCodigo().equals(codToMod)) {
                  articulos.get(i).setCodigo(codToMody);
                }
              }
              break;
            case 2:
              System.out.println("Inserte la nueva descripcion");
              String DescToMody = sc.next();
              for (int i = 0; i < articulos.size(); i++) {
                if (articulos.get(i).getCodigo().equals(codToMod)) {
                  articulos.get(i).setDescripcion(DescToMody);
                }
              }
              break;
            case 3:
              System.out.println("Inserte el nuevo precio de compra");
              double PreComToMody = sc.nextDouble();
              for (int i = 0; i < articulos.size(); i++) {
                if (articulos.get(i).getCodigo().equals(codToMod)) {
                  articulos.get(i).setPrecioCompra(PreComToMody);
                }
              }
              break;
            case 4:
              System.out.println("Inserte el nuevo precio de venta");
              double PreVenToMody = sc.nextDouble();
              for (int i = 0; i < articulos.size(); i++) {
                if (articulos.get(i).getCodigo().equals(codToMod)) {
                  articulos.get(i).setPrecioVenta(PreVenToMody);
                }
              }
              break;
            case 5:
              System.out.println("Inserte la nueva cantidad de Stock");
              int StockToMody = sc.nextInt();
              for (int i = 0; i < articulos.size(); i++) {
                if (articulos.get(i).getCodigo().equals(codToMod)) {
                  articulos.get(i).setStock(StockToMody);
                }
              }
              break;
          }
          break;

        default:
          break;
        case 5:
          System.out.println("Introduce el codigo del artículo a añadir mercancía.");
          String CodToAddStock = sc.next();
          System.out.println("Cantidad de mercancía entrante: ");
          int cantidadMas = sc.nextInt();
          for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getCodigo().equals(CodToAddStock)) {
              articulos.get(i).setStock(articulos.get(i).getStock() + cantidadMas);
            }
          }
          break;
        case 6:
          System.out.println("Introduce el codigo del artículo a restar mercancía.");
          String CodToDeleteStock = sc.next();
          System.out.println("Cantidad de mercancía a restar ");
          int cantidadMenos = sc.nextInt();
          for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getCodigo().equals(CodToDeleteStock)) {
              articulos.get(i).setStock(articulos.get(i).getStock() - cantidadMenos);
            }
          }
          break;

      }
    } while (opcion != 7);
  }
}


package T9AOEjercicio5;

import java.util.Scanner;
//TODO refactorizar con COLLECTIONS.remove()
public class T9AOEjercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a GESTISIMAL");
        int opcion = 0;
        int contador = 0;
        Articulo[] arrArt = new Articulo[20];
        do {
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificar");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.println("Introduzca la opción deseada: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    for (Articulo articulo : arrArt) {
                        articulo.toString();
                    }
                    break;
                case 2:
                    System.out.println("Introduce el código del artículo");
                    String codigoNuevo = sc.next();
                    System.out.println("Introduce la descripción: ");
                    String descripNuevo = sc.next();
                    System.out.println("Introduce el precio de compra");
                    double precioComp = sc.nextDouble();
                    System.out.println("Introduce el precio de venta");
                    double precioVent = sc.nextDouble();
                    if (contador == 0) {
                        arrArt[0].setCodigo(codigoNuevo);
                        arrArt[0].setDescripcion(descripNuevo);
                        arrArt[0].setPrecioCompra(precioComp);
                        arrArt[0].setPrecioVenta(precioVent);
                        contador++;
                        System.out.println("Producto creado con exito");
                    } else {
                        for (int i = 0; i < arrArt.length; i++) {
                            if (arrArt[i].getCodigo().equals("LIBRE")) {
                                arrArt[i].setCodigo(codigoNuevo);
                                arrArt[i].setDescripcion(descripNuevo);
                                arrArt[i].setPrecioCompra(precioComp);
                                arrArt[i].setPrecioVenta(precioVent);
                                contador++;
                                System.out.println("Producto creado con exito");
                            }
                        }
                    }
                    if (contador > 0) {
                        arrArt[contador].setCodigo(codigoNuevo);
                        arrArt[contador].setDescripcion(descripNuevo);
                        arrArt[contador].setPrecioCompra(precioComp);
                        arrArt[contador].setPrecioVenta(precioVent);
                        contador++;
                        System.out.println("Producto creado con exito");
                    }
                    break;
                case 3:
                    System.out.println("Introduce el código del producto que desea dar de baja");
                    String CodToDel = sc.next();
                    for (int i = 0; i < arrArt.length; i++) {
                        if (arrArt[i].getCodigo().equals(CodToDel)) {
                            arrArt[i].setCodigo("LIBRE");
                            arrArt[i].setDescripcion(" ");
                            arrArt[i].setPrecioCompra(0);
                            arrArt[i].setPrecioVenta(0);
                            contador--;
                            System.out.println("Producto borrado con exito.");

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


                    break;
                case 5:
                    System.out.println("Introduce el código del producto de entrada");
                    String codEntrada = sc.next();
                    System.out.println("Introduce la cantidad a añadir");
                    int añadir = sc.nextInt();
                    for (int i = 0; i < arrArt.length; i++) {
                        if (arrArt[i].getCodigo().equals(codEntrada)) {
                            arrArt[i].setStock(arrArt[i].getStock() + añadir);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Introduce el código del producto de salida");
                    String codSalida = sc.next();
                    System.out.println("Introduce la cantidad a restar");
                    int restar = sc.nextInt();
                    for (int i = 0; i < arrArt.length; i++) {
                        if (arrArt[i].getCodigo().equals(codSalida)) {
                            arrArt[i].setStock(arrArt[i].getStock() - restar);
                        }
                    }
                    break;
            }
        }
        while (opcion != 7);

    }
}

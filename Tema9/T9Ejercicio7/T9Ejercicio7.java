package T9Ejercicio7;

import java.util.Scanner;

public class T9Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona(25);
        int opcion1;
        do {
            System.out.println("Bievendo a Expocoches Campanillas.");
            System.out.println("1.Comprar entrada");
            System.out.println("2.¿Cuantas entradas quedan?");
            System.out.println("3.Salir");
            opcion1 = sc.nextInt();
            switch (opcion1) {
                case 1:
                    System.out.println("¿De que zona? \n 1.Principal\n 2.Compra-Venta\n 3.VIP\n");
                    int opcion2 = sc.nextInt();
                    int cantidad;
                    if (opcion2 == 1) {
                        System.out.println("Quedan : " + principal.getEntradasPorVender());
                        System.out.println("¿Cuantas desea?");
                        cantidad = sc.nextInt();
                        principal.vender(cantidad);
                    }
                    if (opcion2 == 2) {
                        System.out.println("Quedan : " + compraventa.getEntradasPorVender());
                        System.out.println("¿Cuantas desea?");
                        cantidad = sc.nextInt();
                        compraventa.vender(cantidad);
                    }
                    if (opcion2 == 3) {
                        System.out.println("Quedan : " + vip.getEntradasPorVender());
                        System.out.println("¿Cuantas desea?");
                        cantidad = sc.nextInt();
                        vip.vender(cantidad);
                    }

                    break;
                case 2:
                    System.out.println("Principal : " + principal.getEntradasPorVender() + "\n" +
                            "Compra-Venta : " + compraventa.getEntradasPorVender() + "\n" +
                            "VIP : " + vip.getEntradasPorVender() + "\n");
                    break;
                default:
                    break;
            }
        } while (opcion1 < 3);
    }
}

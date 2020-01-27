package T9AOEjercicio5;

import java.util.Scanner;

public class T9AOEjercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a GESTISIMAL");
        int opcion = 0;
        int contador = 0;
        Articulo[] arrArt = new Articulo[20];
        do {
            System.out.println("1. Listado");
            for (int i = 0; i < contador; i++) {
                System.out.println(arrArt[i].toString());
            }
            System.out.println("2. Alta");
            System.out.println();

            System.out.println("3. Baja");
            System.out.println("4. Modificar");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.println("Introduzca la opción deseada: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        } while (opcion != 7);

    }
}

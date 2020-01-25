package T9AOEjercicio3;

import java.util.Scanner;

public class T9AOEjercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disco[] gestor = new Disco[100];
        int contador = 0;

        //Menú principal
        System.out.println("Bienvenido a su gestor de discos.");
        System.out.println("1. Añadir disco");
        System.out.println("2.Mostrar discos almacenados");
        System.out.println("3. Borrar disco");
        System.out.println("4. salir");
        System.out.println("Seleccione una opción: ");
        int opcion = sc.nextInt();
        do {
            switch (opcion) {
                case 1:
                    while (contador < 100) {
                        System.out.println("");
                    }
                    System.out.println("No su pueden almacenar más de 100 discos.");
                    break;
                case 2:
                    for (int i = 0; i < contador; i++) {
                        Disco.toString();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;

            }
        } while (opcion != 4);
    }
}
}

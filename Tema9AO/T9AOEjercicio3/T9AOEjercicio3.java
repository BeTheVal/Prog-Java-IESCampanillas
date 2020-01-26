package T9AOEjercicio3;

import java.util.Scanner;

public class T9AOEjercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disco[] gestor = new Disco[100];
        int contador = 0;
        int opcion = 0;
        do {
            //Menú principal
            System.out.println("Bienvenido a su gestor de discos.");
            System.out.println("1. Añadir disco");
            System.out.println("2.Mostrar discos almacenados");
            System.out.println("3. Borrar disco");
            System.out.println("4. salir");
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (contador >= 100) {
                        System.out.println("Actualmente tienes 100 discos, no se pueden almacenar más, debes borrar.");
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
                    gestor[contador] = new Disco(codigo, autor, titulo, genero, duracion);
                    System.out.println("Disco: " + gestor[contador].getTitulo() + " creado con exito.");
                    contador++;
                    break;
                case 2:
                    for (int i = 0; i < contador; i++) {
                        System.out.println(gestor[i].toString());
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

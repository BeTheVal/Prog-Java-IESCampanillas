package T9AOEjercicio3y4;

import java.util.Scanner;

public class T9AOEjercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disco[] gestor = new Disco[100];
        gestor[0] = new Disco("GASA", " Duncan Dhu", "Por tierras escocesas", "pop", 120);
        gestor[1] = new Disco("GASA1", " Duncan Dhu", "Canciones", "pop", 120);
        gestor[2] = new Disco("GASA2", " Duncan Dhu", "El grito del tiempo", "pop", 120);
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
                //TODO Arreglar la creación de discos, solo se guarda el primero.
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
                            if (gestor[i].getCodigo().equals("LIBRE")) {
                                gestor[i] = new Disco(codigo, autor, titulo, genero, duracion);
                                System.out.println("Disco: " + gestor[contador].getTitulo() + " creado con exito.");
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
                            /// setear desde un atributo.???¿¿¿??
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        default:
                            break;
                    }
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

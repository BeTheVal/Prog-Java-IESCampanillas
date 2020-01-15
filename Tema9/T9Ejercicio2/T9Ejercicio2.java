package T9Ejercicio2;

import java.util.Scanner;

public class T9Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo v = new Vehiculo();
        Bicicleta b = new Bicicleta();
        Coche c = new Coche();
        int opcion = 0;
        do {
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta\r\n" + "2. Haz el caballito con la bicicleta\r\n"
                    + "3. Anda con el coche\r\n" + "4. Quema rueda con el coche\r\n"
                    + "5. Ver kilometraje de la bicicleta\r\n" + "6. Ver kilometraje del coche\r\n"
                    + "7. Ver kilometraje total\r\n" + "8. Salir\r\n" + "Elige una opción (1-8):");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("¿Cuantos km recorres con la bicicleta?");
                long kilometrosBici = sc.nextLong();
                Bicicleta.andar(kilometrosBici);
            }
            if (opcion == 2) {
                System.out.println("Has hecho el caballito con éxito");
            }
            if (opcion == 3) {
                System.out.println("¿Cuantos kilometros recorres con el coche?");
                long kilometrosCoche = sc.nextLong();
                Coche.andar(kilometrosCoche);
            }
            if (opcion == 4) {
                Coche.quemarRueda();
            }
            if (opcion == 5) {
              System.out.println("El kilometraje de la bicicleta es " + Bicicleta.getKilometrosRecorridos() + " KM");
            }
            if (opcion == 6) {
              System.out.println("El kilometraje del coche es " + Coche.getKilometrosRecorridos() + " KM");
            }
            if (opcion == 7) {
              System.out.println("El kilometraje total es: " + Vehiculo.getKilometrosTotales() + " KM");
            }
        } while (opcion != 8);
    }
}

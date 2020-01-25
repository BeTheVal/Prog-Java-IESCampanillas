package T9AOEjercicio2;

import java.util.Scanner;

public class T9AOEjercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gato[] arrgato = new Gato[4];
        arrgato[0] = new Gato("Manolo", "Siames", "Macho", "Marrón");
        arrgato[1] = new Gato("Manuel", "Siames", "Hembra", "Gris");
        arrgato[2] = new Gato("Paco", "Siames", "Hembra", "Verde");
        arrgato[3] = new Gato("Pepe", "Siames", "Macho", "Azúl");

        for (int i = 0; i < 4; i++) {
            System.out.println(i + ". " + arrgato[i].toString());
        }

    }
}

package T9AOEjercicio1;

import java.util.Scanner;

public class T9AOEjercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gato[] arrgato = new Gato[4];
        for (int i = 0; i < 4; i++) {
            arrgato[i] = new Gato();
            System.out.println(" Nombre de Gato " + i);
            String nombre = sc.next();
            arrgato[i].setNombre(nombre);

            System.out.println(" Raza de gato " + i);
            String raza = sc.next();
            arrgato[i].setRaza(raza);

            System.out.println(" Sexo de Gato " + i);
            String sexo = sc.next();
            arrgato[i].setSexo(sexo);

            System.out.println("Color de Gato " + i);
            String Color = sc.next();
            arrgato[i].setColor(Color);


        }
        for (int i = 0; i < 4; i++) {
            System.out.println(arrgato[i].toString());
        }

    }
}

import java.util.Scanner;

public class T5Ejercicio21 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que vaya pidiendo números hasta que se introduzca un
         * numero negativo y nos diga cuantos números se han introducido, la media de
         * los impares y el mayor de los pares. El número negativo sólo se utiliza para
         * indicar el final de la introducción de datos pero no se incluye en el
         * cómputo.
         */
        Scanner sc = new Scanner(System.in);
        int aux = 0;

        int i = 0;
        while (i < 0) {
            System.out.println("Inserte número :");
            int num = Integer.parseInt(sc.nextLine());
            if (num % 2 == 0 && num > aux) {
                aux = num;

            }

        }
        sc.close();
    }
}
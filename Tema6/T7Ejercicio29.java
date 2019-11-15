import java.util.Scanner;

import sun.security.provider.JavaKeyStore.CaseExactJKS;

public class T7Ejercicio28 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que muestre la previsión del tiempo para mañana en
         * Málaga. Las temperaturas máxima y mínima se deben generar de forma aleatoria
         * entre los intervalos máximos y mínimos absolutos medidos en las últimas
         * décadas para cada estación. La probabilidad de que esté soleado o nublado en
         * cada estación se proporciona a continuación. Obviamente, la temperatura
         * mínima deberá ser menor o igual que la temperatura máxima.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la estación");

        System.out.println("1 . Primavera");
        System.out.println("2 . Verano");
        System.out.println("3 . Otoño");
        System.out.println("4 . Invierno");
        int estacion = sc.nextInt();
        int tempMaxima;
        int tempoMinima;

        switch (estacion) {
        case 1:

            break;

        case 2:

            break;
        case 3:

            break;
        case 4:

            break;

        default:
            break;
        }

    }
}
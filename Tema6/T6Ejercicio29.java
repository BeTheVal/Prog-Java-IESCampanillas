import java.util.Scanner;

public class T6Ejercicio29 {
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
        int soleadoNublado = (int) ((Math.random() * 100) + 1);

        System.out.println("Previsión del tiempo para mañana: ");
        System.out.println("----------------------------------");

        switch (estacion) {
        case 1:
            tempMaxima = (int) ((Math.random() * 15) + 15);
            tempoMinima = (int) (Math.random() * 15);
            System.out.println("Temperatura mínima = " + tempoMinima + " ºC");
            System.out.println("Temperatura mínima = " + tempMaxima + " ºC");
            if (soleadoNublado <= 40) {
                System.out.println("Nublado");
            } else {
                System.out.println("Soleado");
            }
            break;

        case 2:
            tempMaxima = (int) ((Math.random() * 20) + 25);
            tempoMinima = (int) (Math.random() * 25);
            System.out.println("Temperatura mínima = " + tempoMinima + " ºC");
            System.out.println("Temperatura mínima = " + tempMaxima + " ºC");
            if (soleadoNublado <= 20) {
                System.out.println("Nublado");
            } else {
                System.out.println("Soleado");
            }
            break;
        case 3:
            tempMaxima = (int) ((Math.random() * 10) + 20);
            tempoMinima = (int) (Math.random() * 20);
            System.out.println("Temperatura mínima = " + tempoMinima + " ºC");
            System.out.println("Temperatura mínima = " + tempMaxima + " ºC");
            if (soleadoNublado <= 60) {
                System.out.println("Nublado");
            } else {
                System.out.println("Soleado");
            }

            break;
        case 4:
            tempMaxima = (int) (Math.random() * 25);
            tempoMinima = (int) ((Math.random() * 15) + 15);
            System.out.println("Temperatura mínima = " + tempoMinima + " ºC");
            System.out.println("Temperatura mínima = " + tempMaxima + " ºC");
            if (soleadoNublado <= 80) {
                System.out.println("Nublado");
            } else {
                System.out.println("Soleado");
            }

            break;

        default:
            break;
        }

    }
}
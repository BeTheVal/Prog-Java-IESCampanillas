import java.util.Scanner;

public class T6Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
         * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
         * fallido, el programa dirá cuántas oportunidades quedan y si el número
         * introducido es menor o mayor que el número secreto.
         */
        int intento;
        int contador = 5;
        int numero = ((int) (Math.random() * 100) + 1);
        do {
            System.out.print("Inserte el número: ");
            intento = sc.nextInt();
            if (numero != intento && contador > 0) {
                contador--;
                System.out.println("Te quedan " + contador + " intentos");
            } else {
                System.out.print("Acertaste!!");
                contador = 0;
            }
        } while (contador >= 1);
    }
}
import java.util.Scanner;
public class T5Ejercicio28 {
    public static void main(String[] args) {
        /* Escribe un programa que calcule el factorial de un número entero leído por
        teclado. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número : ");
        int numero = Integer.parseInt(sc.nextLine());
        int aux = numero;
         for (int i = 1; i < numero; i++) {
            aux *= i;
        }
        System.out.println(numero + "! : "+ aux);
    }
}
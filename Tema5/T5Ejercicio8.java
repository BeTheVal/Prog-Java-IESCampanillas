import java.util.Scanner;
public class T5Ejercicio8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Muestra la tabla de multiplicar de un número introducido por teclado.
        System.out.println("Inserta el número para la tababla de multiplicar: ");
        int numero = Integer.parseInt(sc.nextLine());
        sc.close();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        sc.close();
    }
}
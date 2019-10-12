import java.util.Scanner;
public class T5Ejercicio10 {
    public static void main(String[] args) {
    // Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    int contador = 0;
    int acumulador = 0;
     do{
         System.out.println("Introduzca un número entero: ");
         numero = Integer.parseInt(sc.nextLine());
         sc.close();
         acumulador += numero;
         contador ++;
     }while(numero >= 0);
        acumulador -= numero;
        contador -= 1;
        System.out.println("La media es: " + acumulador +" / "+ contador + " = " + acumulador/contador);
    }
} 
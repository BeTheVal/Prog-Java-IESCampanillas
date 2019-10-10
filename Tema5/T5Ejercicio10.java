import java.util.Scanner;
public class T5Ejercicio10 {
    public static void main(String[] args) {
    // Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
    Scanner sc = new Scanner(System.in);
     int numero = 1;
    int contador = 1;
    int acumulador = 0;
     while(numero >= 0) {
        System.out.println("Introduzca el " + contador +"º "+"numero : ");
        numero = Integer.parseInt(sc.nextLine());
        acumulador += numero;
        contador += 1;
            if (numero < 0){
                contador -= 2;
            }
        }
        System.out.println("La media es: " + acumulador +" / "+ contador + " = " + acumulador/contador);
    }
} 
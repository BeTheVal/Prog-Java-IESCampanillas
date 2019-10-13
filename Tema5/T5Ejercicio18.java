import java.util.Scanner;
public class T5Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /** Escribe un programa que obtenga los números enteros comprendidos entre dos
    números introducidos por teclado y validados como distintos, el programa debe
    empezar por el menor de los enteros introducidos e ir incrementando de 7 en
    7. */
    System.out.println("Introduce el primer numero: ");
    int primerNumero = Integer.parseInt(sc.nextLine());
    System.out.println("Introduce el primer numero: ");
    int segundoNumero = Integer.parseInt(sc.nextLine());
    
    
    // Comprobar cual es menor
    int menor;
    int mayor;
    if (primerNumero < segundoNumero) {
        menor = primerNumero;
        mayor = segundoNumero;
    } else {
        menor = segundoNumero;
        mayor = primerNumero;
    
    }


    for (int i = 0 ; i > mayor; i += 7) {
        System.out.println();
    }

    }
}
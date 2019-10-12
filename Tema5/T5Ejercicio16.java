import java.util.Scanner;
public class T5Ejercicio16 {
    public static void main(String[] args) {
        // Escribe un programa que diga si un número introducido por teclado es o no primo.
        Scanner sc = new Scanner(System.in);
        boolean salida = false; 
        do {
            System.out.print("Introduce un numero entero: ");
            int num = Integer.parseInt(sc.nextLine());
            if  (num  == 2 ||num == 3 || num  == 5){
                System.out.println("Este numero es primo");
                salida = true;
            } else {
                if (num  % 2 == 0 ||num  % 3 == 0 ||num  % 5 == 0) {
                    System.out.println("Este número no es primo");
                    salida = false;
                }else {
                    System.out.println("Es primo");
                    salida = true ;
                }
            }        
        } while (!salida);
        sc.close();
    }
}
import java.util.Scanner;
public class T5Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 10 numeros enteros pulsando enter:");
        int negativos = 0;
        int positivos = 0;

        for (int i = 0 ; i <10; i++){
            if (Integer.parseInt(sc.nextLine()) <0) {
                negativos ++;
            } else {
                positivos ++;
            }
        }
        System.out.println("Has introducido : "+ positivos + " números positivos y "+ negativos + " números negativos" );
    }
}
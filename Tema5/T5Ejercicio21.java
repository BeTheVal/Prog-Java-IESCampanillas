import java.util.Scanner;
public class T5Ejercicio21 {
    public static void main(String[] args) {
        /* Realiza un programa que vaya pidiendo números hasta que se introduzca un
        numero negativo y nos diga cuantos números se han introducido, la media de
        los impares y el mayor de los pares. El número negativo sólo se utiliza para
        indicar el final de la introducción de datos pero no se incluye en el cómputo. */
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int aux = 0;
        int almacenamiento = 0; 
        int media= 0;
        int mayorPares = 0;
        while (num >= 0) {
            System.out.println("Inserte número :");
            num = Integer.parseInt(sc.nextLine());           
            if (num %2 != 0){
                for (int i = 0; i == 0; i++) {
                    //Media de los impares
                    almacenamiento += num; 
                    aux ++;
                    media = almacenamiento/aux;
                }
            }
            if (num %2 == 0){
                if (mayorPares < num){
                    mayorPares = num;
                }
            }
        }
        System.out.println("la media de los impares es: " + media + "y el mayor de los pares es: "+ mayorPares);
    }
}
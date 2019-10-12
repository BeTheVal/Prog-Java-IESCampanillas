import java.util.Scanner;
public class T5Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado
        int numeroDeDigitos = 1;
        int n;
        System.out.println("Introduzca un numero entero y te diré la cantidad de digitos");
        int numeroIntroducido = Integer.parseInt(sc.nextLine());
        sc.close();
        n = numeroIntroducido;
        while (n > 10){
            n /=10;
            numeroDeDigitos ++;
        }
        System.out.println(numeroIntroducido +" tiene "+ numeroDeDigitos +" digitos.");
    }
}
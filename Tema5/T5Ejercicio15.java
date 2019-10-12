import java.util.Scanner;
public class T5Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la base: ");
        int base = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el valor del exponente: ");
        int exponente = Integer.parseInt(sc.nextLine());
        sc.close();
        int aux = 0 ;


        // Si el exponente es igual a 0
        if (exponente == 0); {
            System.out.println(base + "^"+ exponente);  
        }
        // si el exponente es igual a 1
        if (exponente == 1); {
            System.out.println(base + "^" + exponente);

        }
        //si el exponente es mayor que 1
        if (exponente > 1) {
        for (int i = 0; i < exponente ; i++){
            aux ++;
            System.out.println(base + "^"+ aux);
        }
        }
        
    }
}
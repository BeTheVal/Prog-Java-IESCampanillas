import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class T10Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca el " + (i + 1) + "º");
            numeros.add(sc.nextInt());
        }
        Collections.sort(numeros);
        System.out.println(numeros);


    }

}

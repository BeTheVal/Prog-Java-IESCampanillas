import java.util.Scanner;
public class T5Ejercicio12 {
    public static void main(String[] args) {
    System.out.println("Introduzca el primer número de la serie:");
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    sc.close();
    if(n == 1){
        System.out.println("0, 1");
    }
    int f1 = 0;
    int f2= 1;
    while (n >=2) {
        int aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print(" " + f2);
        n --;
    }

    }
}
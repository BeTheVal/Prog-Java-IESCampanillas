import java.util.Scanner;
public class T5Ejercicio12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    if(n == 1){
        System.out.println("0, 1");
    }
    int f1 = 0;
    int f2= 1;
    while (n >=2) {
        int aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print("0 ," + f2);
        n --;
    }

    }
}
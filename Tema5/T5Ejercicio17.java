import java.util.Scanner;
public class T5Ejercicio17 {
    public static void main(String[] args) {
    // Realiza un programa que sume los 100 números siguientes a un número entero
    //y positivo introducido por teclado. Se debe comprobar que el dato introducido
    //es correcto (que es un número positivo)
    Scanner sc = new Scanner(System.in);
    int num = 0;
    
    // Crearlo con do-while
    
    
    System.out.println("Introduce un número positivo: ");
    num = Integer.parseInt(sc.nextLine());
    if (num < 0){
    System.out.println("No has introducido un número positivo");
    }
    sc.close();
    int suma;
    for (int i = 0 ; i < 100 ; i ++) {
        suma = num + 1;
        System.out.println(suma);

    }


}
}
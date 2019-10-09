import java.util.Scanner;
public class T5Ejercicio8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Muestra la tabla de multiplicar de un número introducido por teclado.
        int tabla = 0;
        int numero = Integer.parseInt(sc.nextLine());
        for(numero = 0;numero > 10;numero = + 1 )
        resultado = numero*tabla;
        System.out.println(numero + "*"+tabla + "="+ resultado);
        tabla += 1;

    }
}
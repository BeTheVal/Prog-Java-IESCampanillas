public class Ejercicio17{
    public static void main(String[] args) {
     System.out.println("Inroduzca un número entero: ");
     int numero = Integer.parseInt(System.console().readLine());
     System.out.println("Tu número es : " + (numero % 10));
    }
}
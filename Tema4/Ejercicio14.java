public class Ejercicio14{
    public static void main(String[] args) {
        System.out.println("¿Quieres saber si tu número es par o divisible por 5?");
        System.out.println("Introduce tu número: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
       //¿Es par?
        if ((numeroIntroducido % 2) == 0) {
            System.out.println("Tu número es par");
        } else {
            System.out.println("Tu numero es impar");
        //¿Divisible por 5? 
        if ((numeroIntroducido % 5) == 0 ) {
            System.out.println("Tu número es divisible por 5");
        }else{
            System.out.println("Tu número no es divisible por 5");
            }
        }
    }
}
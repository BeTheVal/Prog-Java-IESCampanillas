public class Ejercicio13 {
    public static void main(String[] args) {
        //Ordena de mayor a menor 3 números introducidos
        System.out.println("Hola, soy el ordenador de números, dame 3 números enteros y te los ordenaré de menor a mayor");
        System.out.print("Introduce el primer número :");
        int primerNumero = Integer.parseInt( System.console().readLine());
        System.out.print("Introduce el segundo número");
        int segundoNumero = Integer.parseInt( System.console().readLine());
        System.out.print("Introduce el tercer número");
        int tercerNumero = Integer.parseInt( System.console().readLine());
        int otraVariable;
     if (primerNumero > segundoNumero) {
        otraVariable = primerNumero;
        segundoNumero = otraVariable;
        primerNumero = segundoNumero;
      }
      if (segundoNumero > tercerNumero) {
        otraVariable = segundoNumero;
        tercerNumero = otraVariable;
        segundoNumero = tercerNumero;
      }
      if (primerNumero > segundoNumero) {
        otraVariable = primerNumero;
        segundoNumero = otraVariable;
        primerNumero = segundoNumero;
      }
      System.out.println("Por orden: " + primerNumero + ", " + segundoNumero + " y " + tercerNumero + "."); 
    }
}
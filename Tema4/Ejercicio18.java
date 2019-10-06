public class Ejercicio18 {
    public static void main(String[] args) {
    // Muestra por pantalla la primera cifra de un número de hasta 5 cifras.
    System.out.println("Introduce un número de hasta 5 cifras: ");
    int numero = Integer.parseInt(System.console().readLine());
    // Debido al error: Exception in thread "main" java.lang.Error: Unresolved compilation problem:
    //The local variable primeraCifra may not have been initialized
    // Decido inicializar la variable dandole el valor 0 desde el principio
    int primeraCifra = 0 ;
    
    if ( numero < 10 ) {
         primeraCifra = numero;
      }  
      if (( numero >= 10 ) && ( numero < 100 )) {
         primeraCifra = numero / 10;
      }
      if (( numero >= 100 ) && ( numero < 1000 )) {
         primeraCifra = numero / 100;
      }
      if (( numero >= 1000 ) && ( numero < 10000 )) {
         primeraCifra = numero / 1000;
      }
      if ( numero >= 10000) {
         primeraCifra = numero / 10000;
      }
      System.out.println("La primera cifra es: " + primeraCifra );
    }
}
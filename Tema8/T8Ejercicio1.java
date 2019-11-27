import java.util.Scanner;
import matematicas.Mates;

public class T8Ejercicio1 {
  public static void main(String[] args) {
    /*
     * Crea una biblioteca de funciones matemáticas que contenga las siguientes
     * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
     * Observa bien lo que hace cada función ya que, si las implementas en el orden
     * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
     * resulta trivial teniendo voltea y la función siguientePrimo también es muy
     * fácil de implementar teniendo esPrimo. 1. esCapicua: Devuelve verdadero si el
     * número que se pasa como parámetro es capicúa y falso en caso contrario. 2.
     * esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo
     * y falso en caso contrario. 3. siguientePrimo: Devuelve el menor primo que es
     * mayor al número que se pasa como parámetro. 4. potencia: Dada una base y un
     * exponente devuelve la potencia. 5. digitos: Cuenta el número de dígitos de un
     * número entero. 6. voltea: Le da la vuelta a un número. 7. digitoN: Devuelve
     * el dígito que está en la posición n de un número entero. Se empieza contando
     * por el 0 y de izquierda a derecha. 8. posicionDeDigito: Da la posición de la
     * primera ocurrencia de un dígito dentro de un número entero. Si no se
     * encuentra, devuelve -1. 9. quitaPorDetras: Le quita a un número n dígitos por
     * detrás (por la derecha). 10. quitaPorDelante: Le quita a un número n dígitos
     * por delante (por la izquierda). 11. pegaPorDetras: Añade un dígito a un
     * número por detrás. 12. pegaPorDelante: Añade un dígito a un número por
     * delante. 13. trozoDeNumero: Toma como parámetros las posiciones inicial y
     * final dentro de un número y devuelve el trozo correspondiente. 14.
     * juntaNumeros: Pega dos números para formar uno.
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("Elige lo que quieres hacer : ");
    System.out.println(
        "1.Es Capicua\n2.Es Primo\n3.Siguiente Primo\n4.potencia\n5.Cuenta digitos\n6.Voltea\n7.Digito en\n8.Posicion de digito\n9.Quita por detras\n10.Quita por delante\n11.Pega por detras\n12.Pega por delante\n13.Trozo de Numero\n14.Junta números");
    System.out.print("Introduce número: ");
    int eleccion = sc.nextInt();
    int numero;

    switch (eleccion) {
    case 1:
      System.out.print("Introduce el número para saber si es capicua: ");
      numero = sc.nextInt();
      if (Mates.esCapicua(numero)) {
        System.out.println("El " + numero + " es capicúa");
      } else {
        System.out.println("El " + numero + " no es capicúa");

      }

      break;
    case 2:
      System.out.print("Introduce el número para saber si es primo: ");
      numero = sc.nextInt();
      if (Mates.esPrimo(numero)) {
        System.out.println("El numero " + numero + " es primo.");
      } else {
        System.out.println("El numero " + numero + " no es primo.");
      }

      break;
    case 3:
      System.out.print("Introduce el número y te digo el siguiente primo: ");
      numero = sc.nextInt();
      System.out.println("El siguiente primo es " + Mates.siguientePrimo(numero));

      break;
    case 4:
      System.out.print("Introduce una base : ");
      int base = sc.nextInt();
      System.out.print("Introduce un exponente: ");
      int exponente = sc.nextInt();
      System.out.println("El resultado de la potencia es : " + Mates.potencia(base, exponente));
      break;
    case 5:
      System.out.println("Introduce el número al que contarle los digitos : ");
      numero = sc.nextInt();
      System.out.println("El numero introducido tiene " + Mates.digitos(numero));
      break;
    case 6:
      System.out.println("Introduce el número a voltear: ");
      numero = sc.nextInt();
      System.out.println("El número volteado es: " + Mates.voltea(numero));

      break;
    case 7:
      System.out.print("Introduce el número del que elegir el dígito: ");
      numero = sc.nextInt();
      System.out.print("Introduce la posición: ");
      eleccion = sc.nextInt();
      System.out.println("El digito que está en la posición " + eleccion + " es: " + Mates.digitoN(numero, eleccion));
      break;
    case 8:
      System.out.println("Inserte el número donde buscar: ");
      numero = sc.nextInt();
      System.out.println("Inserte el número que buscar: ");
      int aBuscar = sc.nextInt();
      System.out.println("Está en la posición : " + Mates.posicionDeDigito(numero, aBuscar));

      break;
    case 9:
      System.out.println("Inserte el número a quitar números: ");
      numero = sc.nextInt();
      System.out.println("Inserte la cantidad de numeros que quitar");
      int aQuitar = sc.nextInt();
      System.out.println("El número resultante es: " + Mates.quitaPorDetras(numero, aQuitar));

      break;
    case 10:
      System.out.println("Introduce el número a quitar por delante:");
      numero = sc.nextInt();
      System.out.println("Introduce la cantidad de números a quitar por delante");
      aQuitar = sc.nextInt();
      System.out.println("El número resultante es: " + Mates.quitaPorDelante(numero, aQuitar));

      break;
    case 11:
      System.out.println("Introduce el primer número:");
      numero = sc.nextInt();
      System.out.println("Introduce el número a pegar");
      int aPegar = sc.nextInt();
      System.out.println("El resultado es: " + Mates.pegaPorDetras(numero, aPegar));

      break;
    case 12:
      System.out.println("Introduce el primer número:");
      numero = sc.nextInt();
      System.out.println("Introduce el número a pegar");
      aPegar = sc.nextInt();
      System.out.println("El resultado es: " + Mates.pegaPorDelante(numero, aPegar));
      break;
    case 13:
      System.out.println("Introduce el numero a trocear : ");
      numero = sc.nextInt();
      System.out.println("Introduce la posición inicial: ");
      int inicial = sc.nextInt();
      System.out.println("Introduce la posición final: ");
      int posFinal = sc.nextInt();
      System.out.println("El resultado es: " + Mates.trozoDeNumero(numero, inicial, posFinal));

      break;
    case 14:
      System.out.println("Introduce el primer número a pegar: ");
      numero = sc.nextInt();
      System.out.println("Introduce el segúndo numero a pegar: ");
      aPegar = sc.nextInt();
      System.out.println("El resultado es: " + Mates.juntaNumeros(numero, aPegar));

    default:
      break;
    }
  }
}
import java.util.Scanner;

public class T6Ejercicio14 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
		 * El programa intentará adivinar el número que estás pensando - un número entre
		 * 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
		 * programa debe preguntar si el número que estás pensando es mayor o menor que
		 * el que te acaba de decir.
		 */
		Scanner sc = new Scanner(System.in);
		int numeropensado = 0;
		int contador = 0;
		int adivinarNumero = 1;
		int mayor = 100;
		int menor = 0;
		String mayorOMenor;
		while (numeropensado != adivinarNumero || contador == 5) {
			adivinarNumero = (int) ((Math.random() * 100) + 1);
			System.out.print("¿Tu número es el " + adivinarNumero + " ?" );
			System.out.print("¿Es mayor o menor?");
			mayorOMenor = sc.nextLine()
			contador++;
		}

	}
}
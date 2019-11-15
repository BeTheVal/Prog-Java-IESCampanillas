import java.util.Scanner;

public class T7Ejercicio12 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida 10 números por teclado y que los almacene en un
		 * array. A continuación se mostrará el contenido de ese array junto al índice
		 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
		 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
		 * ambos números están entre 0 y 9. El programa deberá colocar el número de la
		 * posición inicial en la posición final, rotando el resto de números para que
		 * no se pierda ninguno. Al final se debe mostrar el array resultante.
		 */
		Scanner sc = new Scanner(System.in);
		int numero[] = new int[10];
		System.out.println("Introduce 10 numeros (introduce número y pulsa ENTER)");
		for (int i = 0; i < numero.length; i++) {
			numero[i] = sc.nextInt();
		}
		// Mostrando la primera array

		System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		System.out.print("│ Índice ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("│%4d ", i);
		}
		System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
		System.out.print("│ Valor  ");
		for (int i = 0; i < 10; i++) {
			System.out.printf("│%4d ", numero[i]);
		}
		System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
		sc.close();

		// Rotación de números en array
		int inicial = 0;
		int esFinal = 0;
		do {
			System.out.print("Para inicial: ");
			inicial = sc.nextInt();
			System.out.print("Para final : ");
			esFinal = sc.nextInt();
			///////////////////////////////////////////// Excepciones/////////////////////////////////////////////////
			if (inicial == esFinal) {
				System.out.print("Inicial es igual a Final");
			}
			if (inicial > esFinal) {
				System.out.println("Inicial es mayor que final");
			}
			if (inicial >= 10) {
				System.out.println("Inicial mayor o igual a 10");
			}
			if (esFinal >= 10) {
				System.out.println("Final mayor o igual a 10");
			}
			///////////////////////////////////////////// FinalExcepciones/////////////////////////////////////////////////

		} while (inicial == esFinal || inicial > esFinal || inicial >= 10 || esFinal >= 10);
		// Rotacion de los valores en el array
		int auxiliarArr[] = new int[10];
		int posicionesADesplazar = esFinal - inicial;
		for (int i = 0; i < numero.length; i++) {
			auxiliarArr[i] = numero[i];
		}
		System.out.println();

	}
}
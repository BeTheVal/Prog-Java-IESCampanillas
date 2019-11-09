import java.util.Scanner;

public class T7Ejercicio5 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida 10 números por teclado y que luego muestre los
		 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
		 * máximo y del mínimo respectivamente.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int maximo = Integer.MAX_VALUE;
		int minimo = Integer.MIN_VALUE;
		int numeros[] = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce número: ");
			numeros[i] = sc.nextInt();
			if (numeros[i] > minimo) {
				minimo = numeros[i];
			}

			if (numeros[i] < maximo) {
				maximo = numeros[i];
			}

		}
		System.out.println();

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == maximo) {
				System.out.println(numeros[i] + " - Mínimo ");
			} else if (numeros[i] == minimo) {
				System.out.println(numeros[i] + " - Máximo ");
			}
			System.out.println(numeros[i]);
		}
		sc.close();

	}
}
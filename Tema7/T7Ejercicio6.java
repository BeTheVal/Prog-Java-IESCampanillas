import java.util.Scanner;

public class T7Ejercicio6 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea 15 números por teclado y que los almacene en un
		 * array. Rota los elementos de ese array, es decir, el elemento de la posición
		 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
		 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
		 * muestra el contenido del array.
		 */
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int contador = 0;
		int numerosfinal[] = new int[15];
		int numeros[] = new int[15];
		for (i = 0; i < numeros.length; i++) {
			System.out.print("introduce un número: ");
			numeros[i] = sc.nextInt();
			System.out.println(numeros[i]);
		}
		for (int j = 0; j < 14; j++) {
			numerosfinal[j + 1] = numeros[j];
			contador++;
		}
		numerosfinal[0] = numeros[14];

		System.out.println("-------------muestra la array--------------");
		for (int j = 0; j < numerosfinal.length; j++) {
			System.out.println(numerosfinal[j]);

		}
	}
}
import java.util.Scanner;

public class T7Ejercicio19 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que sea capaz de insertar un número en una posición
		 * concreta de un array. En primer lugar, el programa generará un array de 12
		 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
		 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
		 * el programa preguntará por el número que se quiere insertar y por la posición
		 * donde será insertado. Los números del array se desplazan a la derecha para
		 * dejar sitio al nuevo. El último número (el que se encuentra en la posición
		 * 11) siempre se perderá.
		 */
		int[] numero = new int[12];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * 200);
		}
		// Muestra el array
		System.out.println("\nArray Original:");

		System.out.print("\nÍndice ");

		for (int i = 0; i < 12; i++) {
			System.out.printf("%4d ", i);
		}

		System.out.print("\nValor  ");

		for (int i = 0; i < 12; i++) {
			System.out.printf("%4d ", numero[i]);
		}
		System.out.println();
		System.out.print("¿Que número quiere insertar?: ");
		int insertar = sc.nextInt();
		System.out.println("¿En que posición quiere insertar el número?");
		int posicion = sc.nextInt();
		for (int i = 11; i > posicion; i--) {
			numero[i] = numero[i - 1];
		}
		numero[posicion] = insertar;
		// Muestra el array
		System.out.println("\nArray resultado:");

		System.out.print("\nÍndice ");

		for (int i = 0; i < 12; i++) {
			System.out.printf("%4d ", i);
		}

		System.out.print("\nValor  ");

		for (int i = 0; i < 12; i++) {
			System.out.printf("%4d ", numero[i]);
		}
	}
}
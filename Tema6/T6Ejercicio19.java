import java.util.Scanner;

public class T6Ejercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
		 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
		 * luego el máximo de los pares el mínimo de los impares y la media de todos los
		 * números generados
		 */
		int contadorpositivos = 0;
		int media = 0;
		int aleatorio = 0;
		for (int i = 0; i < 50; i++) {
			aleatorio = (int) ((Math.random() * 300) - 101);
			if (i == 49) {
				System.out.print(aleatorio);
			}
			System.out.print(aleatorio + ",");
			if (aleatorio % 2 == 0) {
				contadorpositivos++;
				media += aleatorio;

			}

		}

		System.out.print("Media :" + media / contadorpositivos);

	}
}
import java.util.Scanner;

public class T7BEjercicio2 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida 20 números enteros. Estos números se deben
		 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
		 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
		 * tratara. La suma total debe aparecer en la esquina inferior derecha.
		 */
		Scanner sc = new Scanner(System.in);
		int[][] num = new int[4][5];
		// Pedir los números e introducirlos en la array
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				System.out.print("Inserte número: ");
				num[i][j] = sc.nextInt();
				System.out.println();
			}
		}
		sc.close();
		// Mostrar la array
		int suma = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				System.out.print(" " + num[i][j] + " ");
				suma += num[i][j];
				if (j == 4) {
					System.out.print("Suma = " + suma);
					suma = 0;
				}
			}
			System.out.println();
		}
	}
}
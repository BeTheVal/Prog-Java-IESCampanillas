import java.java.util.Scanner;

public class T7BEjercicio2 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida 20 números enteros. Estos números se deben
		 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
		 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
		 * tratara. La suma total debe aparecer en la esquina inferior derecha.
		 */
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int[][] num = new int[4][5];
		int fila = 0;
		int columna = 0;
		// Pidiendo los números
		for (int i = 0; i < 20; i++) {
			System.out.println("Inserte el numero para: fila  " + (fila + 1) + " columna " + (columna + 1));
			num[fila][columna] = (int) ((Math.random() * 10) + 1); // sc.nextInt();
			columna++;
			if (columna == 5) {
				fila++;
				columna = 0;
			}
		}
		// Pintando los números
		fila = 0;
		columna = 0;
		int contador = 0;
		int[] filaSuma = new int[4];
		int suma = 0;
		for (int i = 0; i < 20; i++) {
			System.out.print(" " + num[fila][columna] + " ");
			suma += num[fila][columna];
			columna++;
			if (columna == 5) {
				System.out.print(" suma = " + suma);
				suma = 0;
				System.out.println();
				fila++;
				columna = 0;
			}
		}
	}
}
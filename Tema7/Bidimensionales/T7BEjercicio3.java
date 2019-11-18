import java.util.Random;

public class T7BEjercicio3 {
	public static void main(String[] args) {
		/*
		 * Modifica el programa anterior de tal forma que los números que se introducen
		 * en el array se generen de forma aleatoria (valores entre 100 y 999).
		 */
		int[][] num = new int[4][5];
		int fila = 0;
		int columna = 0;
		// Pidiendo los números
		for (int i = 0; i < 20; i++) {
			System.out.println("Inserte el numero para: fila  " + (fila + 1) + " columna " + (columna + 1));
			num[fila][columna] = (int) ((Math.random() * 899) + 100);
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
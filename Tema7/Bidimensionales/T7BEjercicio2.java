public class T7BEjercicio2 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida 20 números enteros. Estos números se deben
		 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
		 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
		 * tratara. La suma total debe aparecer en la esquina inferior derecha.
		 */
		int[][] num = new int[4][5];

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i][i]);
			if (contador == 3) {
				contador = 0;

			}
		}

	}
}
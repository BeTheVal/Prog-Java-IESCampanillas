public class T7BEjercicio6 {
	public static void main(String[] args) {
		/*
		 * Modifica el programa anterior de tal forma que no se repita ningún número en
		 * el array.
		 */
		int[][] num = new int[6][10];
		int numeroMayor = 0;
		int numeroMenor = 1001;
		int fila;
		int columna;

		// Genera el contenido del array sin que se repita ningún valor
		boolean repetido;
		int i;
		int j;
		for (fila = 0; fila < 6; fila++) {
			for (columna = 0; columna < 10; columna++) {
				do {
					num[fila][columna] = (int) (Math.random() * 1001);

					// Comprueba si el número generado ya está en el array.
					repetido = false;
					for (i = 0; i < 10 * fila + columna; i++) {
						if (num[fila][columna] == num[i / 10][i % 10]) {
							repetido = true;
						}
					}
				} while (repetido);
			}
		}
		for (i = 0; i < num.length; i++) {
			for (j = 0; j < num[0].length; j++) {
				if (num[i][j] == numeroMayor) {
					System.out.println("El número mayor está en: " + i + "," + j);

				}
			}
		}
		for (i = 0; i < num.length; i++) {
			for (j = 0; j < num[0].length; j++) {
				if (num[i][j] == numeroMenor) {
					System.out.println("El número menor está en: " + i + "," + j);

				}
			}
		}
	}
}
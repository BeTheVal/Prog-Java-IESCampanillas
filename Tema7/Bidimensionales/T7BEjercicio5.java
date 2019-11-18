public class T7BEjercicio5 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
		 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
		 * continuación, el programa deberá dar la posición tanto del máximo como del
		 * mínimo.
		 */

		int[][] num = new int[6][10];
		int numeroMayor = 0;
		int numeroMenor = 1001;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				num[i][j] = (int) (Math.random() * 1000);
				if (num[i][j] > numeroMayor) {
					numeroMayor = num[i][j];
				}
				if (num[i][j] < numeroMenor) {
					numeroMenor = num[i][j];
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				if (num[i][j] == numeroMayor) {
					System.out.println("El número mayor está en: " + i + "," + j);

				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i][j] == numeroMenor) {
					System.out.println("El número menor está en: " + i + "," + j);

				}
			}
		}
	}
}
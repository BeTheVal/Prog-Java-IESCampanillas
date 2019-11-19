public class T7BEjercicio6 {
	public static void main(String[] args) {
		/*
		 * Modifica el programa anterior de tal forma que no se repita ningún número en
		 * el array.
		 */
		int[][] num = new int[6][10];
		int numeroMayor = 0;
		int numeroMenor = 1001;
		boolean esRepetido = false;
		do {
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[0].length; j++) {
					num[i][j] = (int) (Math.random() * 1000);
				}
			}
		} while (!esRepetido);

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				if (num[i][j] > numeroMayor) {
					numeroMayor = num[i][j];
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i][j] < numeroMenor) {
					numeroMenor = num[i][j];
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				if (num[i][j] == numeroMayor) {

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

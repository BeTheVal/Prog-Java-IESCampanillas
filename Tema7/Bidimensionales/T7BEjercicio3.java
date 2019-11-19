public class T7BEjercicio3 {
	public static void main(String[] args) {
		/*
		 * Modifica el programa anterior de tal forma que los números que se introducen
		 * en el array se generen de forma aleatoria (valores entre 100 y 999).
		 */
		int[][] num = new int[4][5];
		// Pedir los números e introducirlos en la array
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				num[i][j] = (int) ((Math.random() * 899) + 100);
			}
		}
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
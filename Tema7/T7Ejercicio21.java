public class T7Ejercicio21 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que rellene un array de 15 elementos con números enteros
		 * comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
		 * array “cincuerizado”, según el siguiente criterio: si el número que hay en
		 * una posición del array es múltiplo de 5, se deja igual, y si no, se cambia
		 * por el siguiente múltiplo de 5 que exista a partir de él.
		 */
		int[] numero = new int[15];
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * 500);

		}
		System.out.println("Array Original");
		for (int i : numero) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		System.out.println("Array Cincuarizada");
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] % 5 == 0) {
				System.out.print(" " + numero[i] + 5 + " ");
			}
			System.out.print(" " + numero[i] + " ");/// PENDIENTE DE CORREGIR///
		}

	}
}
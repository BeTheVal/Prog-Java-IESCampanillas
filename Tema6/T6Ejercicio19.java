public class T6Ejercicio19 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
		 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
		 * luego el máximo de los pares el mínimo de los impares y la media de todos los
		 * números generados
		 */
		int maximoPares = 0;
		int minimoImpares = 0;
		int todosSumados = 0;
		int aleatorio = 0;
		for (int i = 0; i < 50; i++) {
			aleatorio = (int) ((Math.random() * 300) - 101);
			todosSumados += aleatorio;
			System.out.print(aleatorio + ",");
			if (aleatorio % 2 == 0) {
			} else if (aleatorio > maximoPares) {
				maximoPares = aleatorio;
			} else {
				if (aleatorio < minimoImpares)
					minimoImpares = aleatorio;
			}
		}
		System.out.println();
		System.out.println("Media de todos los números :" + todosSumados / 50);
		System.out.println("Mayor de los pares: " + maximoPares);
		System.out.println("Menor de los impares: " + minimoImpares);
	}
}
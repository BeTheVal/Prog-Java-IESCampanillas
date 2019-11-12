public class T7Ejercicio10 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
		 * que los almacene en un array. El programa debe ser capaz de pasar todos los
		 * números pares a las primeras posiciones del array (del 0 en adelante) y todos
		 * los números impares a las celdas restantes. Utiliza arrays auxiliares si es
		 * necesario.
		 */
		int aleatorio[] = new int[20];
		int auxiliar[] = new int[20];
		int contador = 0;
		int control = 19;

		for (int i = 0; i < 20; i++) {
			aleatorio[i] = (int) (Math.random() * 100);
		}
		for (int i = 0; i < aleatorio.length; i++) {
			if (aleatorio[i] % 2 == 0) {
				auxiliar[contador] = aleatorio[i];
				contador++;
			} else {
				auxiliar[control] = aleatorio[i];
				control--;
			}
		}
		System.out.println("-----Numeros pares al principio y resto despues-----");

		for (int i = 0; i < auxiliar.length; i++) {
			System.out.println(auxiliar[i]);

		}

	}
}
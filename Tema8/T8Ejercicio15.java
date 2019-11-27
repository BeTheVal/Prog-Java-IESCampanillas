import matem.Mates;

public class T8Ejercicio15 {
	public static void main(String[] args) {
		/**
		 * Muestra los números primos que hay entre 1 y 1000.
		 */
		for (int i = 0; i < 1000; i++) {
			if (Mates.esPrimo(i)) {
				System.out.println(i + "");
			}
		}
	}
}
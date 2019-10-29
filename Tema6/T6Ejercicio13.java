public class T6Ejercicio13 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que simule la tirada de dos dados. El programa deberá
		 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
		 * dados tengan el mismo valor.
		 */
		int primerDado = 0;
		int segundoDado = 0;
		do {
			primerDado = (int) ((Math.random() * 6) + 1);
			segundoDado = (int) ((Math.random() * 6) + 1);
			System.out.println("Resultado primer dado : " + primerDado + " Resultado del segundo dado : " + segundoDado);
		} while (primerDado != segundoDado);
		//////////////////////////////////

	}
}
public class T6Ejercicio18 {
	public static void main(String[] args) {
		/*
		 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
		 * sustituir el color blanco por colores más alegres. Realiza un programa que
		 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
		 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
		 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
		 * violeta y naranja.
		 */
		int dormitorioPrimero = 0;
		int dormitorioSegundo = 0;
		int dormitorioTercero = 0;
		while (dormitorioPrimero == dormitorioSegundo || dormitorioPrimero == dormitorioTercero
				|| dormitorioSegundo == dormitorioTercero) {
			dormitorioPrimero = (int) ((Math.random() * 6) + 1);
			dormitorioSegundo = (int) ((Math.random() * 6) + 1);
			dormitorioTercero = (int) ((Math.random() * 6) + 1);
		}
		System.out.println("Los colores elegidos son:");
		// Para el primer dormitorio
		switch (dormitorioPrimero) {
		case 1:
			System.out.print("Rojo, ");

			break;
		case 2:
			System.out.print("Azul ,");

			break;
		case 3:
			System.out.print("Verde, ");

			break;
		case 4:
			System.out.print("Amarillo, ");

			break;
		case 5:
			System.out.print("Violeta, ");

			break;
		case 6:
			System.out.print("Naranja , ");

			break;

		default:
		}
		// Para el segundo dormitorio
		switch (dormitorioSegundo) {
		case 1:
			System.out.print("Rojo, ");

			break;
		case 2:
			System.out.print("Azul ,");

			break;
		case 3:
			System.out.print("Verde, ");

			break;
		case 4:
			System.out.print("Amarillo, ");

			break;
		case 5:
			System.out.print("Violeta, ");

			break;
		case 6:
			System.out.print("Naranja ,");

			break;

		default:
		}
		// Para el tercer dormitorio
		switch (dormitorioTercero) {
		case 1:
			System.out.println("Rojo");

			break;
		case 2:
			System.out.println("Azul");

			break;
		case 3:
			System.out.println("Verde ");

			break;
		case 4:
			System.out.println("Amarillo ");

			break;
		case 5:
			System.out.println("Violeta ");

			break;
		case 6:
			System.out.println("Naranja");

			break;

		default:
		}

	}
}
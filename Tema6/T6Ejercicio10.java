public class T6Ejercicio10 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pinte por pantalla diez líneas formadas por
		 * caracteres. El carácter con el que se pinta cada línea se elige de forma
		 * aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben
		 * tener una longitud aleatoria entre 1 y 40 caracteres.
		 */
		int longitudDeLinea = (int) ((Math.random() * 40) + 1);
		for (int j = 0; j < 10; j++) {
			int caracteAleatorio = (int) ((Math.random() * 6) + 1);
			switch (caracteAleatorio) {
			case 1:
				for (int i = 0; i < longitudDeLinea; i++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			case 2:
				for (int i = 0; i < longitudDeLinea; i++) {
					System.out.print("-");
				}
				System.out.println();
				break;
			case 3:
				for (int i = 0; i < longitudDeLinea; i++) {
					System.out.print("=");
				}
				System.out.println();
				break;
			case 4:
				for (int i = 0; i < longitudDeLinea; i++) {
					System.out.print(".");
				}
				System.out.println();
				break;
			case 5:
				for (int i = 0; i < longitudDeLinea; i++) {
					System.out.print("|");
				}
				System.out.println();
				break;
			case 6:
				for (int i = 0; i < longitudDeLinea; i++) {
					System.out.print("@");
				}
				System.out.println();
				break;

			default:
				break;
			}
		}

	}
}
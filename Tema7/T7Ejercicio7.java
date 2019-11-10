import java.util.Scanner;

public class T7Ejercicio7 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
		 * muestre por pantalla separados por espacios. El programa pedirá entonces por
		 * teclado dos valores y a continuación cambiará todas las ocurrencias del
		 * primer valor por el segundo en la lista generada anteriormente. Los números
		 * que se han cambiado deben aparecer entrecomillados.
		 */
		Scanner sc = new Scanner(System.in);

		int numero[] = new int[100];
		for (int i = 0; i < 100; i++) {
			numero[i] = (int) (Math.random() * 20);
		}
		for (int i : numero) {
			System.out.printf(numero[i] + " ");
		}
		System.out.println();
		System.out.print("Introduce el primer valor:");
		int primerValor = sc.nextInt();
		System.out.println();

		System.out.print("Introduce el segundo valor: ");
		int segundoValor = sc.nextInt();
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == primerValor) {
				numero[i] = segundoValor;
				System.out.print("'" + numero[i] + "'" + " ");
			} else {
				System.out.print(numero[i] + " ");
			}

		}
	}
}

import java.util.Scanner;

public class T7Ejercicio13 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que rellene un array de 100 elementos con números enteros
		 * aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación el
		 * programa mostrará el array y preguntará si el usuario quiere destacar el
		 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el
		 * número destacado entre dobles asteriscos.
		 */
		Scanner sc = new Scanner(System.in);
		int numero[] = new int[100];
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * 500);
			System.out.print(numero[i] + " ");
		}
		int maximoNumero = 0;
		System.out.println();
		System.out.print("¿Quieres destacar el máximo?(s o n)");
		String recibirMax = sc.nextLine();

		if (recibirMax.equals("s")) {
			for (int i = 0; i < numero.length; i++) {
				if (numero[i] > maximoNumero) {
					maximoNumero = numero[i];
				}
			}
			for (int i = 0; i < numero.length; i++) {
				System.out.print(numero[i] + " ");
				if (numero[i] == maximoNumero)
					System.out.print("'''''''" + numero[i] + "'''''");
			}

		}
		int minimoNumero = 501;
		System.out.println();
		System.out.print("¿Quieres destacar el minimo?(s o n)");
		String recibirMin = sc.nextLine();
		if (recibirMin.equals("s")) {
			for (int i = 0; i < numero.length; i++) {
				if (numero[i] < maximoNumero) {
					minimoNumero = numero[i];
				}
			sc.close();
			}
			for (int i = 0; i < numero.length; i++) {
				System.out.print(numero[i] + " ");
				if (numero[i] == minimoNumero)
					System.out.print("'''''" + numero[i] + "'''''");
			}

		}

	}
}
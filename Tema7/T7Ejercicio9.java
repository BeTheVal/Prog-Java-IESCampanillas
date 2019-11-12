import java.util.Scanner;

public class T7Ejercicio9 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida 8 números enteros y que luego muestre esos
		 * números junto con la palabra “par” o “impar” según proceda
		 */
		Scanner sc = new Scanner(System.in);
		int numero[] = new int[8];

		System.out.println("Este programa le pide 8 números y le dice si son pares o impares");
		for (int i = 0; i < numero.length; i++) {
			System.out.print("Inserte número: ");
			numero[i] = sc.nextInt();
		}
		sc.close();
		System.out.println();

		for (int j = 0; j < numero.length; j++) {
			if (numero[j] % 2 == 0) {
				System.out.println(numero[j] + " - Par");
			} else {
				System.out.println(numero[j] + " - Impar");
			}

		}
	}
}
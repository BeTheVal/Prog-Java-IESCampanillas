import java.util.Scanner;

public class T7Ejercicio20 {
	public static void main(String[] args) {
		/*
		 * Implementa un programa que calcule la denominación ordinal de los reyes de
		 * una secuencia histórica. El programa solicitará la cantidad de reyes que se
		 * van a introducir, y a continuación recibirá los nombres de los reyes.
		 * Presentará por pantalla dichos nombres, pero colocándoles el ordinal
		 * correspondiente. Así, por ejemplo, si hay dos Felipes en los nombres de los
		 * reyes, el primero debería aparecer como Felipe 1º y el segundo como Felipe
		 * 2º.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("¿cuantos reyes vas a introducir?");
		int cantidad = sc.nextInt();
		String[] rey = new String[cantidad];
		int contador = 2;
		for (int i = 0; i < rey.length; i++) {
			System.out.println("Introduce rey: ");
			rey[i] = sc.next();
		}
		for (int i = 0; i < rey.length; i++) {
			for (int j = 0; j < rey.length; j++) {
				if (rey[i].equals(rey[j])) {
					System.out.println(rey[i] + contador + "º"); // A corregir
					contador++;
				}

			}
			System.out.println(rey[i] + "1º");
		}
	}
}
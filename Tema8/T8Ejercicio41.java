import java.util.Scanner;

public class T8Ejercicio41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la altura: ");
		int altura = sc.nextInt();
		System.out.print("Introduce el carácter de relleno: ");
		String caracter = sc.next();
		pintaTriangulo(altura, caracter);
		sc.close();
	}

	public static void pintaTriangulo(int altur, String carac) {
		int aux = altur;
		for (int i = 0; i < aux; i++) {
			for (int j = 0; j < altur; j++) {
				System.out.print(carac);
			}
			altur--;
			System.out.println();
		}
	}

}

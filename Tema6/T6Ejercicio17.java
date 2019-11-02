import java.util.Scanner;

public class T6Ejercicio17 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
		 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
		 * serán de 4 unidades. No hay que comprobar que los datos se introducen
		 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
		 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
		 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
		 * rectángulo.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la altura de la pecera (mínimo 4) : ");
		int alturaPecera = sc.nextInt();
		System.out.print("Introduzca la anchura de la pecera (mínimo 4) : ");
		int anchuraPecera = sc.nextInt();

		int posicion = 0;
		int posicionPez = (int) (Math.random() * (alturaPecera - 2) * (anchuraPecera - 2));
		/// Esto pinta la parte de arriba
		for (int i = 0; i < anchuraPecera; i++) {
			System.out.print("*");
		}
		System.out.println();
		// Esto pinta la parte central
		for (int i = 2; i < alturaPecera; i++) {
			System.out.print("*"); // Parte izquierda de la pecera
			for (int j = 2; j < anchuraPecera; j++) {
				if (posicion == posicionPez) {
					System.out.print("&");
				} else {
					System.out.print(" ");
				}
				posicion++;
			} // for j
			System.out.println("*"); // parte derecha de la pecera
		} // for i

		// Pinta la parte inferior
		for (int i = 0; i < anchuraPecera; i++) {
			System.out.print("*");
		}

	}
}
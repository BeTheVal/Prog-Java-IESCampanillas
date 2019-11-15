import java.util.Scanner;

public class T6Ejercicio26 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pinte una tableta de turrón con un bocado realizado
		 * de forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El
		 * bocado se da alrededor del turrón, obviamente no se puede dar un bocado por
		 * en medio de la tableta
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la altura de la tableta: ");
		int altura = sc.nextInt();
		System.out.print("Introduce la anchura de la tableta: ");
		int anchura = sc.nextInt();
		int posicionMordisco = (int) ((Math.random()* 2) + (altura -2) * 2);
		int posicion = 0;
		for (int i = 0; i < altura; i++) {
		  for (int j = 0; j < anchura; j++) {
			boolean estaEnBorde = (i == 0) || (i == altura - 1) || (j == 0) || (j == anchura - 1);			
			if ((posicion == posicionMordisco) && estaEnBorde) {
			  System.out.print(" ");
			} else {
			  System.out.print("*");
			}
			
			if (estaEnBorde) {
			  posicion++;
			}
		  }
		  System.out.println();
		}
	}
}
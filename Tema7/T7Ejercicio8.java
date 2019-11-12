import java.util.Scanner;

public class T7Ejercicio8 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
		 * un determinado año y que muestre a continuación un diagrama de barras
		 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
		 * de asteriscos o cualquier otro carácter.
		 */
		Scanner sc = new Scanner(System.in);

		String mes[] = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre",
				"noviembre", "diciembre" };
		double temperatura[] = new double[12];
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("Introduce la temperatura media de " + mes[i] + " :");
			temperatura[i] = sc.nextDouble();

		}
		for (int i = 0; i < 12; i++) {
			System.out.printf("%12s " + "│", mes[i]);
			for (int j = 0; j < temperatura[i]; j++) {
				System.out.print("▄");
			}
			System.out.println(" " + temperatura[i] + "ºC");
		}
		sc.close();
	}
}
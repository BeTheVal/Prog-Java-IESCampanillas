public class T6Ejercicio9 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
		 * y que no termine de generar números hasta que no saque el 24. El programa
		 * deberá decir al final cuántos números se han generado.
		 */
		int numeroAleatorio = 0;
		int contador = 0;
		while (numeroAleatorio != 24) {
			numeroAleatorio = (int) (Math.random() * 51) * 2;
			System.out.println(numeroAleatorio);
			contador++;
		}
		System.out.println("Se han generado: " + contador + " numeros");
	}
}
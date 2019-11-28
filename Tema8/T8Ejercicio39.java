import matematicas.Otros;

public class T8Ejercicio39 {
	public static void main(String[] args) {
		System.out.println(convierteEnPalabras(123));
	}

	/**
	 * Convierte en palabras el numero introducido y lo devuelve como cadena de
	 * carácteres
	 * 
	 * @return
	 */
	public static String convierteEnPalabras(int n) {
		String[] digitos = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };

		String resultado = "";

		int i;
		for (i = 0; i < Otros.digitos(n) - 1; i++) {
			resultado += digitos[Otros.digitoN(n, i)] + ", ";
		}
		resultado += digitos[Otros.digitoN(n, i)];

		return resultado;
	}
}

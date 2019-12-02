import matematicas.Otros;;

public class T8Ejercicio35 {
	public static void main(String[] args) {
		System.out.println(convierteEnPalotes(12345));

	}

	public static String convierteEnPalotes(int n) {
		String resultado = "";
		for (int i = 0; i < Otros.digitos(n); i++) {
			for (int j = 0; j < Otros.digitoN(n, i); j++) {
				resultado += "|";
			}
			if (i < Otros.digitos(n) - 1) {
				resultado += "-";

			}
		}
		return resultado;

	}
}

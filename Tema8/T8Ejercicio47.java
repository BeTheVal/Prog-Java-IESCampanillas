
public class T8Ejercicio47 {
	public static void main(String[] args) {
		int[] inicio = { 1, 2, 3, 4, };
		System.out.println(convierteArrayEnString(inicio));
	}

	public static String convierteArrayEnString(int[] arr) {
		String resultado = " ";
		for (int i = 0; i < arr.length; i++) {
			resultado += arr[i];
		}
		return resultado;
	}

}

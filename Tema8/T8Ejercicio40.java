import matematicas.ArrayUni;
import matematicas.Otros;

public class T8Ejercicio40 {
	public static void main(String[] args) {
		int[] nuevo = { 1, 2, 3, 7, 5, 7, 77 };
		ArrayUni.muestraArray((filtraCon7(nuevo)));

	}

	public static int[] filtraCon7(int[] arr) {
		int numerosCon7 = 0;
		int contador = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Otros.posicionDeDigito(arr[i], 7) >= 0) {
				numerosCon7++;
			}
		}
		int[] con7 = new int[numerosCon7];
		for (int i = 0; i < arr.length; i++) {
			if (Otros.posicionDeDigito(arr[i], 7) >= 0) {
				con7[contador] = arr[i];
				contador++;
			}
		}

		return con7;

	}
}

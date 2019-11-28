import matematicas.ArrayUni;
import matematicas.Otros;

public class T8Ejercicio36 {
	public static void main(String[] args) {
		int[] nuevo = { 1, 2, 3, 4, 5, 7 };
		ArrayUni.muestraArray(filtraPrimos(nuevo));
	}

	public static int[] filtraPrimos(int[] x) {
		int[] almacen = new int[x.length];
		int contador = 0;
		for (int i = 0; i < x.length; i++) {
			if (Otros.esPrimo(x[i])) {
				almacen[contador] = x[i];
				contador++;

			}

		}
		return almacen;
	}
}

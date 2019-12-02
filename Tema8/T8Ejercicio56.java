import matematicas.ArrayBi;
import matematicas.ArrayUni;

public class T8Ejercicio56 {
	public static void main(String[] args) {

		int[][] nueva = new int[3][5];
		for (int i = 0; i < nueva.length; i++) {
			for (int j = 0; j < nueva[0].length; j++) {
				nueva[i][j] = (int) ((Math.random() * 9) + 1);
			}
		}
		ArrayBi.muestraArrayBiInt(nueva);
		ArrayUni.muestraArrayConIndice(corteza(nueva));
	}

	public static int[] corteza(int[][] arrBi) {
		int[] resultado = new int[(arrBi.length * arrBi[0].length - 2)];
		int contador = 0;
		int columna = 0;
		int fila = 0;
		for (int i = 0; i < arrBi[0].length; i++) {
			resultado[contador] = arrBi[fila][columna];
			columna++;
			contador++;
		}
		columna--;
		for (int i = 0; i < arrBi.length; i++) {
			resultado[contador] = arrBi[fila][columna];
			fila++;
			contador++;
		}
		fila--;
		columna--;
		for (int i = 0; i < arrBi.length; i++) {
			resultado[contador] = arrBi[fila][columna];
			columna--;
			contador++;
		}
		for (int i = 3; i < (arrBi[0].length); i++) {
			resultado[contador] = arrBi[fila][columna];
			fila--;
			contador++;
		}

		return resultado;
	}

}
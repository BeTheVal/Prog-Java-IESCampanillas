import matematicas.ArrayUni;

public class Examen {
	public static void main(String[] args) {
		int[] x = ArrayUni.generaArrayInt(10, 0, 200);
		ArrayUni.muestraArrayConIndice(x);
		int cantidadMayor = 0;
		int cantidadMenor = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > 100) {
				cantidadMayor++;
			} else {
				cantidadMenor++;
			}
		}
		int[] ArrMayor = new int[cantidadMayor];
		int[] ArrMenor = new int[cantidadMenor];
		int contadormayor = 0;
		int contadormenor = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > 100) {
				ArrMayor[contadormayor] = x[i];
				contadormayor++;
			} else {
				ArrMenor[contadormenor] = x[i];
				contadormenor++;

			}
		}
		int[] resultado = new int[x.length];
		contadormayor = 0;
		contadormenor = 0;
		for (int i = 1; i < (ArrMayor.length + ArrMenor.length); i++) {
			if (contadormayor >= ArrMayor.length) {
				resultado[i] = ArrMenor[contadormenor];

			}
			if (contadormenor >= ArrMenor.length) {
				resultado[i] = ArrMayor[contadormayor];

			}
			if (i % 2 == 0) {
				resultado[i] = ArrMayor[contadormayor];
				contadormayor++;
			} else {
				resultado[i] = ArrMenor[contadormenor];
				contadormenor++;
			}
		}
		ArrayUni.muestraArrayConIndice(resultado);
	}
}
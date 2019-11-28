package matematicas;

public class ArrayBi {

	/**
	 * Muestra por pantalla el contenido de un array bidimensional de n�meros
	 * enteros.
	 * <p>
	 * Los n�meros se muestran perfectamente tabulados en filas y columnas.
	 *
	 * @param x array bidimiensional de n�meros enteros
	 */
	public static void muestraArrayBiInt(int x[][]) {
		// El tama�o de la columna ser� igual al tama�o del n�mero m�ximo del array
		String formatoNumero = "%" + matematicas.Otros.digitos(maximoArrayBiInt(x)) + "d";

		for (int f = 0; f < x.length; f++) {
			for (int c = 0; c < x[0].length; c++) {
				System.out.printf(formatoNumero + " ", x[f][c]);
			}
			System.out.println();
		}
	}

	/**
	 * Crea un array bidimensional de n�meros enteros y lo rellena con valores
	 * aleatorios dentro de un rango.
	 * <p>
	 * Por ejemplo, <code>generaArrayBiInt(8, 7, 10, 30)</code> devolver�a un array
	 * de 8 filas por 7 columnas relleno con n�meros generados al azar comprendidos
	 * entre 10 y 30.
	 * 
	 * @param filas    n�mero de filas que tendr� el array
	 * @param columnas n�mero de columnas que tendr� el array
	 * @param minimo   l�mite inferior del intervalo de n�meros aleatorios
	 * @param m�ximo   l�mite superior del intervalo de n�meros aleatorios
	 * @return array bidimensional de n�meros enteros rellena con valores aleatorios
	 *         dentro del rango definido por los valores <code>minimo</code> y
	 *         <code>maximo</code>
	 */
	public static int[][] generaArrayBiInt(int filas, int columnas, int minimo, int maximo) {
		int[][] x = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				x[i][j] = (int) (Math.random() * (maximo - minimo) + minimo + 1);
			}
		}

		return x;
	}

	/**
	 * Devuelve el valor m�ximo de un array bidimensional que se pasa como
	 * par�metro.
	 * 
	 * @param x array bidimiensional de n�meros enteros
	 * @return n�mero m�ximo encontrado en el array
	 */
	public static int maximoArrayBiInt(int x[][]) {
		int maximo = Integer.MIN_VALUE;

		for (int f = 0; f < x.length; f++) {
			for (int c = 0; c < x[0].length; c++) {
				if (x[f][c] > maximo) {
					maximo = x[f][c];
				}
			}
		}

		return maximo;
	}

	/**
	 * Devuelve una fila (array unidimensional) de un array bidimensional que se
	 * pasa como par�metro.
	 * 
	 * @param x    array bidimiensional de n�meros enteros
	 * @param fila n�mero de la fila que se quiere extraer del array <code>x</code>
	 * @return fila en forma de array unidimensional extraida del array
	 *         <code>x</code>
	 */
	public static int[] filaDeArrayBiInt(int x[][], int fila) {
		int[] f = new int[x[0].length];

		for (int c = 0; c < x[0].length; c++) {
			f[c] = x[fila][c];
		}

		return f;
	}

	/**
	 * Devuelve una columna (array unidimensional) de un array bidimensional que se
	 * pasa como par�metro.
	 * 
	 * @param x       array bidimiensional de n�meros enteros
	 * @param columna n�mero de la columna que se quiere extraer del array
	 *                <code>x</code>
	 * @return columna en forma de array unidimensional extraida del array
	 *         <code>x</code>
	 */
	public static int[] columnaDeArrayBiInt(int x[][], int columna) {
		int[] c = new int[x.length];

		for (int f = 0; f < x.length; f++) {
			c[f] = x[f][columna];
		}

		return c;
	}

	/**
	 * Devuelve la fila y la columna (en un array con dos elementos) de la primera
	 * ocurrencia de un n�mero dentro de un array bidimensional. Si el n�mero no se
	 * encuentra en el array, la funci�n devuelve -1.
	 * 
	 * @param x array bidimiensional de n�meros enteros
	 * @param n n�mero que se buscar� dentro del array <code>x</code>
	 * @return array unidimensional de dos elementos que indican la fila y la
	 *         columna donde se encuentra <code>n</code> o <code>
	 *          {-1, -1}</code> en caso de que <code>n</code> no se encuentre en
	 *         <code>x</code>
	 */
	public static int[] coordenadasEnArrayBiInt(int x[][], int n) {
		for (int f = 0; f < x.length; f++) {
			for (int c = 0; c < x[0].length; c++) {
				if (x[f][c] == n) {
					int[] coordenadas = { f, c };
					return coordenadas;
				}
			}
		}
		int[] coordenadas = { -1, -1 };
		return coordenadas;
	}

	/**
	 * Dice si un n�mero que se encuentra en una posici�n determinada de una matriz
	 * (un array bidimensional) que se pasa como par�metro es o no punto de silla.
	 * <p>
	 * El punto de silla cumple la condici�n de ser el m�nimo en su fila y m�ximo en
	 * su columna.
	 * 
	 * @param x array bidimiensional de n�meros enteros
	 * @param i fila dentro del array <code>x</code>
	 * @param j columna dentro del array <code>x</code>
	 * @return verdadero si el n�mero que se encuentra en la fila <code>i
	 *          </code> y la columna <code>j</code> es el m�nimo en su fila y el
	 *         m�ximo en su columna.
	 */
	public static boolean esPuntoDeSilla(int x[][], int i, int j) {

		int[] fila = filaDeArrayBiInt(x, i);
		int[] columna = columnaDeArrayBiInt(x, j);

		return ((ArrayUni.minimoArrayInt(fila) == x[i][j]) && (ArrayUni.maximoArrayInt(columna) == x[i][j]));
	}

	/**
	 * Devuelve un array que contiene una de las diagonales del array bidimensional
	 * que se pasa como par�metro.
	 * 
	 * @param x         array bidimiensional de n�meros enteros
	 * @param fila      fila del n�mero que marcar� las dos posibles diagonales
	 *                  dentro del array <code>x</code>
	 * @param columna   columna del n�mero que marcar� las dos posibles diagonales
	 *                  dentro del array <code>x</code>
	 * @param direccion cadena de caracteres que indica cu�l de las dos posibles
	 *                  diagonales se devolver�; la cadena <code>
	 *                  "nose"</code> indica que se elige la diagonal que va del
	 *                  noroeste hacia el sureste, mientras que la cadena
	 *                  <code>"neso"</code> indica que se elige la diagonal que va
	 *                  del noreste hacia el suroeste
	 * @return array unidimensional que contiene una diagonal definida por un n�mero
	 *         determinado por <code>fila
	 *                  </code> y <code>columna</code> y una direcci�n determinada
	 *         por el par�metro <code>direccion
	 *                  </code>
	 */
	public static int[] diagonal(int x[][], int fila, int columna, String direccion) {

		int elementos = 0, i, j;
		int[] diagonalAux = new int[1000];

		for (i = 0; i < x.length; i++) {
			for (j = 0; j < x[0].length; j++) {
				if ((((columna - j) == (fila - i)) && (direccion.equals("nose")))
						|| (((columna - j) == (i - fila)) && (direccion.equals("neso")))) {
					diagonalAux[elementos++] = x[i][j];
				}
			}
		}

		int[] diagonal = new int[elementos];
		for (j = 0; j < elementos; j++) {
			diagonal[j] = diagonalAux[j];
		}

		return diagonal;
	}
}

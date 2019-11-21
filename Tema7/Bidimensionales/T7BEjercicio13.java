public class T7BEjercicio13 {
  public static void main(String[] args) {
    /*
     * Realiza un programa que calcule la estatura media, mínima y máxima en
     * centímetros de personas de diferentes países. El array que contiene los
     * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
     * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
     * array de 4 filas por 10 columnas con números aleatorios generados al azar
     * entre 140 y 210. Los decimales de la media se pueden despreciar. Los nombres
     * de los países se deben mostrar utilizando el array de países (no se pueden
     * escribir directamente).
     */
    String[] pais = { "España", "Rusia", "Japón", "Australia" };
    int[][] estatura = new int[4][10];

    for (int i = 0; i < estatura.length; i++) {
      System.out.print(pais[i] + " : ");
      for (int j = 0; j < estatura[0].length; j++) {
        estatura[i][j] = (int) ((Math.random() * 70) + 140);
        System.out.print(" " + estatura[i][j] + " ");
      }
      System.out.println(" |");
    }

  }
}
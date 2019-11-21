import java.util.Scanner;

public class T7BEjercicio7 {
  public static void main(String[] args) {
    /*
     * Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una
     * casilla de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina
     * cerca!
     */
    Scanner sc = new Scanner(System.in);
    final int VACIO = 0;
    final int MINA = 1;
    final int TESORO = 2;
    final int INTENTO = 3;
    int[][] campoDeBatalla = new int[5][4];
    // Todo vacío
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        campoDeBatalla[i][j] = VACIO;
      }
    }
    // Pone la mina
    int minaX = (int) (Math.random() * 4);
    int minaY = (int) (Math.random() * 3);
    // Pone el tesoro
    int tesoroX;
    int tesoroY;
    do {
      tesoroX = (int) (Math.random() * 4);
      tesoroY = (int) (Math.random() * 3);
    } while (minaX == tesoroX && minaY == tesoroY);
    campoDeBatalla[tesoroX][tesoroY] = TESORO;
    // Juego
    System.out.println("Bienvenido a la Busqueda del tesoro");
    boolean salir = false;
    String c = "";

    do {
      // Pinta el campo de batalla
      for (int y = 3; y >= 0; y--) {
        System.out.print((y + 1) + "┇");
        for (int x = 0; x < 5; x++) {
          if (campoDeBatalla[x][y] == INTENTO) {
            System.out.print("o ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }
      System.out.println("  ┈┈┈┈┈┈┈┈┈┈\n  1 2 3 4 5\n");
      // Pide las coordenadas
      System.out.print("Coordenada x: ");
      int x = sc.nextInt() - 1;
      System.out.print("Coordenada y: ");
      int y = sc.nextInt() - 1;

      // Comprueba el estado de la casilla
      switch (campoDeBatalla[x][y]) {
      case VACIO:
        campoDeBatalla[x][y] = INTENTO;
        if ((Math.abs(x - minaX) < 2) && (Math.abs(y - minaY) < 2)) { // Usando el valor absoluto para detectar la mina
          System.out.println("Atención la mina está cerca!");
        }
        break;
      case MINA:
        System.out.println("Lo siento, has perdido.");
        salir = true;
        break;
      case TESORO:
        System.out.println("Enhorabuena, has encontrado el tesoro.");
        salir = true;
      }
    } while (!salir);

    // Pinta el cuadrante
    for (int y = 3; y >= 0; y--) {
      System.out.print(y + " ");
      for (int x = 0; x < 5; x++) {
        switch (campoDeBatalla[x][y]) {
        case VACIO:
          c = "  ";
          break;
        case MINA:
          c = "^ ";
          break;
        case TESORO:
          c = "€ ";
          break;
        case INTENTO:
          c = "o ";
          break;
        }
        System.out.print(c);
      }
      System.out.println();
    }
    System.out.println("  ┈┈┈┈┈┈┈┈┈┈\n  1 2 3 4 5\n");
    sc.close();

  }
}
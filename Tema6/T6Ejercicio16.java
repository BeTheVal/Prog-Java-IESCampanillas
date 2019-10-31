public class T6Ejercicio16 {
  public static void main(String[] args) {
    /*
     * Realiza un simulador de máquina tragaperras simplificada que cumpla los
     * siguientes requisitos: a) El ordenador mostrará una tirada que consiste en
     * mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante, herradura,
     * campana y limón. b) Si las tres figuras son diferentes se debe mostrar el
     * mensaje “Lo siento, ha perdido”. c) Si hay dos figuras iguales y una
     * diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”. d) Si
     * las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10
     * monedas”.
     */
    int primeraFigura = (int) ((Math.random() * 5) + 1);
    int segundaFigura = (int) ((Math.random() * 5) + 1);
    int terceraFigura = (int) ((Math.random() * 5) + 1);
    switch (primeraFigura) {
    case 1:
      System.out.print("Corazón | ");
      break;
    case 2:
      System.out.print("Diamante | ");
      break;
    case 3:
      System.out.print("Herradura | ");
      break;
    case 4:
      System.out.print("Campana |");
      break;
    case 5:
      System.out.print("Limón |");
      break;
    }
    switch (segundaFigura) {
    case 1:
      System.out.print("Corazón | ");
      break;
    case 2:
      System.out.print("Diamante | ");
      break;
    case 3:
      System.out.print("Herradura | ");
      break;
    case 4:
      System.out.print("Campana |");
      break;
    case 5:
      System.out.print("Limón|");
      break;
    }
    switch (terceraFigura) {
    case 1:
      System.out.println("Corazón | ");
      break;
    case 2:
      System.out.println("Diamante | ");
      break;
    case 3:
      System.out.println("Herradura | ");
      break;
    case 4:
      System.out.println("Campana |");
      break;
    case 5:
      System.out.println("Limón |");
      break;
    }
    if (primeraFigura == segundaFigura && segundaFigura == terceraFigura) {
      System.out.println("Enhorabuena, ha ganado 10 monedas.");
    } else if (primeraFigura == segundaFigura || terceraFigura == primeraFigura || segundaFigura == terceraFigura) {
      System.out.println("Bien, ha recuperado su moneda");
    } else {
      System.out.println("Lo siento, ha perdido");
    }

  }
}
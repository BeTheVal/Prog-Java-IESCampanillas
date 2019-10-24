public class T6Ejercicio2 {
  public static void main(String[] args) {
    /*
     * Realiza un programa que muestre al azar el nombre de una carta de la baraja
     * francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
     * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
     * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A
     * (que sería el 1). Para convertir un número en una cadena de caracteres
     * podemos usar String.valueOf(n) .
     */
    // Generar un palo(aleatorio del 1 al 4)
    // Numero aleatorio para :
    int palo = ((int) (Math.random() * 4) + 1);
    switch (palo) {
    // Caso para picas
    case 1:
        int numPicas = ((int) (Math.random() * 13) + 1);
        if (numPicas == 11) {
          System.out.println("J de Picas");
          break;
        }
        if (numPicas == 12) {
          System.out.println("Q de Picas");
          break;
        }
        if (numPicas == 13) {
          System.out.println("K de Picas");
          break;
        }
        if (numPicas == 1) {
          System.out.println("A de Picas");
          break;
        }
        System.out.println(numPicas + " de Picas");
        break;
      // Caso para corazones
        case 2:
        int numCorazones = ((int) (Math.random() * 13) + 1);
        if (numCorazones == 11) {
          System.out.println("J de Corazones");
          break;
        }
        if (numCorazones == 12) {
          System.out.println("Q de Corazones");
          break;
        }
        if (numCorazones == 13) {
          System.out.println("K de Corazones");
          break;
        }
        if (numCorazones == 1) {
          System.out.println("A de Corazones");
          break;
        }
        System.out.println(numCorazones + " de Corazones");
        break;
      
      // caso para diamantes
      case 3:
        int numDiamantes = ((int) (Math.random() * 13) + 1);
        if (numDiamantes == 11) {
          System.out.println("J de Diamantes");
          break;
        }
        if (numDiamantes == 12) {
          System.out.println("Q de Diamantes");
          break;
        }
        if (numDiamantes == 13) {
          System.out.println("K de Diamantes");
          break;
        }
        if (numDiamantes == 1) {
          System.out.println("A de Diamantes");
          break;
        }
        System.out.println(numDiamantes + " de Diamantes");
        break;
      // caso para tréboles
      case 4:
      int numtreboles = ((int) (Math.random() * 13) + 1);
        if (numtreboles == 11) {
          System.out.println("J de treboles");
          break;
        }
        if (numtreboles == 12) {
          System.out.println("Q de treboles");
          break;
        }
        if (numtreboles == 13) {
          System.out.println("K de treboles");
          break;
        }
        if (numtreboles == 1) {
          System.out.println("A de treboles");
          break;
        }
        System.out.println(numtreboles + " de treboles");
        break;

    }
  }
}

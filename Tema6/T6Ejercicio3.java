public class T6Ejercicio3 {
  public static void main(String[] args) {
    /*
     * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la
     * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
     */
    int palo = ((int) (Math.random() * 4) + 1);
    switch (palo) {
    // Caso para oros
    case 1:
        int numPicas = ((int) (Math.random() * 10) + 1);
        if (numPicas == 8) {
          System.out.println("Sota de Oros");
          break;
        }
        if (numPicas == 9) {
          System.out.println("Caballo de Oros");
          break;
        }
        if (numPicas == 10) {
          System.out.println("Rey de Oros");
          break;
        }
        if (numPicas == 1) {
          System.out.println("As de Oros");
          break;
        }
        System.out.println(numPicas + " de Oros");
        break;
      // Caso para bastos
        case 2:
        int numCorazones = ((int) (Math.random() * 10) + 1);
        if (numCorazones == 8) {
          System.out.println("Sota de Bastos");
          break;
        }
        if (numCorazones == 9) {
          System.out.println("Caballo de Bastos");
          break;
        }
        if (numCorazones == 10) {
          System.out.println("Rey de Bastos");
          break;
        }
        if (numCorazones == 1) {
          System.out.println("As de Bastos");
          break;
        }
        System.out.println(numCorazones + " de Bastos");
        break;
      
      // caso para espadas
      case 3:
        int numDiamantes = ((int) (Math.random() * 10) + 1);
        if (numDiamantes == 8) {
          System.out.println("Sota de Espadas");
          break;
        }
        if (numDiamantes == 9) {
          System.out.println("Caballo de Espadas");
          break;
        }
        if (numDiamantes == 10) {
          System.out.println("Rey de Espadas");
          break;
        }
        if (numDiamantes == 1) {
          System.out.println("As de Espadas");
          break;
        }
        System.out.println(numDiamantes + " de Espadas");
        break;
      // caso para copas
      case 4:
      int numtreboles = ((int) (Math.random() * 10) + 1);
        if (numtreboles == 8) {
          System.out.println("Sota de Copas");
          break;
        }
        if (numtreboles == 9) {
          System.out.println("Caballo de Copas");
          break;
        }
        if (numtreboles == 10) {
          System.out.println("Rey de Copas");
          break;
        }
        if (numtreboles == 1) {
          System.out.println("As de Copas");
          break;
        }
        System.out.println(numtreboles + " de Copas");
        break;
      }

  }
}
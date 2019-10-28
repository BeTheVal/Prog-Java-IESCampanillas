public class T6Ejercicio11 {
  public static void main(String[] args) {
    /*
     * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
     * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
     * final aparecerá el número de suspensos, el número de suficientes, el número
     * de bienes, etc.
     */
    int numeroSuspenso = 0;
    int numeroSuficiente = 0;
    int numeroBien = 0;
    int numeroNotable = 0;
    int numeroSobresaliente = 0;

    for (int i = 0; i < 20; i++) {
      int notas = (int) ((Math.random() * 10) + 1);
      if (notas < 4) {
        System.out.println("suspenso");
        numeroSuspenso++;
      }
      switch (notas) {
      case 5:
        System.out.println("Suficiente");
        numeroSuficiente++;
        break;
      case 6:
        System.out.println("Bien");
        numeroBien++;
        break;
      case 7:
        System.out.println("Notable");
        numeroNotable++;
        break;
      case 8:
        System.out.println("Notable");
        numeroNotable++;
        break;
      case 9:
        System.out.println("Sobresaliente");
        numeroSobresaliente++;
      case 10:
        System.out.println("Sobresaliente");
        numeroSobresaliente++;
        break;
      default:
        break;
      }
    }
    System.out.println("Cantidad sobresalientes : " + numeroSobresaliente);
    System.out.println("Cantidad notables : " + numeroNotable);
    System.out.println("Cantidad bien : " + numeroBien);
    System.out.println("Cantidad suficientes : " + numeroSuficiente);
    System.out.println("Cantidad suspensos : " + numeroSuspenso);
  }
}
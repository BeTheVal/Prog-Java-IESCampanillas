import java.util.Scanner;

public class T6Ejercicio31 {
  public static void main(String[] args) {
    /*
     * Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
     * el carácter “|”. La anchura del sendero siempre es la misma, los dos
     * caracteres del borde más cuatro caracteres en medio, en total 6 caracteres
     * (incluyendo espacios). A cada metro, el sendero puede continuar recto, girar
     * un carácter a la izquierda o girar un carácter a la derecha, por supuesto de
     * forma aleatoria. Por cada metro de sendero - representado por una línea -
     * puede que haya un obstáculo o puede que no, la probabilidad es del 50%. La
     * posición del obstáculo es aleatoria dentro de la línea. En caso de existir un
     * obstáculo en un metro de sendero (en una línea), puede ser una planta
     * (carácter *) o una piedra (carácter O), la probabilidad de que salga uno u
     * otro es la misma. Recuerda que nunca habrá más de un obstáculo por metro de
     * sendero, habrá uno o ninguno.
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la cantidad de metros que tiene el sendero: ");
    int metros = sc.nextInt();
    String obstaculo = "*";
    for (int i = 0; i < metros; i++) {
      int espaciosAntesdePintar = (int) ((Math.random() * 2) + 1);
      for (int j = 0; j < espaciosAntesdePintar; j++) {
        System.out.print(" "); // Pinta los desplazamientos del carril
      }
      System.out.print("|");
      int espacioInterno = (int) ((Math.random() * 4));
      for (int j = 0; j < espacioInterno; j++) {
        System.out.print(" ");
      }
      if (espacioInterno == 4) {
        System.out.print(" ");
      }
      System.out.print(obstaculo);
      for (int j = 0; j < 4 - espacioInterno; j++) {
        System.out.print(" ");
      }
      System.out.println("|");
    }
  }
}
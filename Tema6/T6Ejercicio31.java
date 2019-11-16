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
    int espaciosDentro = (int) ((Math.random() * 3) + 1);

    for (int i = 0; i < metros; i++) {
      int obstaculo = (int) (Math.random() * 3);
      int tipoObstaculo = (int) (Math.random() * 3);
      for (int j = 0; j < 1; j++) {
        for (int j2 = 0; j2 < obstaculo; j2++) {
          System.out.print(" ");
        }
        System.out.print("|");
        for (int j2 = 0; j2 < espaciosDentro; j2++) {
          System.out.print(" ");
        }
        // Imprimimos tipo de obstaculo
        if (tipoObstaculo == 0) {
          System.out.print("*");
        } else if (tipoObstaculo == 1) {
          System.out.print("o");
        } else {
          System.out.print(" ");
        }
        System.out.println("|");
      }

    }
  }
}
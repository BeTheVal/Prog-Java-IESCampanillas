import java.util.Scanner;

public class T6Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*
     * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
     * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
     * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
     * pueda admitir. El ancho de la cuba no varía.
     */
    System.out.print("Introduce la capacidad de la cuba : ");
    int cantidadMaxima = sc.nextInt();
    int auguaEnLaCuba = (int) (Math.random() * cantidadMaxima + 1);
    for (int i = 0; i < cantidadMaxima; i++) {
      if (i < (cantidadMaxima - auguaEnLaCuba)) {
        System.out.println("#    #");
      } else {
        System.out.println("#====#");
      }
    }
    System.out
        .println("La cuba tiene una capacidad de " + cantidadMaxima + " y " + auguaEnLaCuba + "L cotiene ahora mismo.");

  }
}
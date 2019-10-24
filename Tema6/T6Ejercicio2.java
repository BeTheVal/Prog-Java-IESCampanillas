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
      int numPicas = ((int) (Math.random() * 14) + 1);
      if (numPicas == 11) {

      }
      if (numPicas == 12) {

      }
      if (numPicas == 13) {

      }
      if (numPicas == 14) {

      }

      // Caso para corazones
      // caso para diamantes
      // caso para tréboles
    }
  }
}

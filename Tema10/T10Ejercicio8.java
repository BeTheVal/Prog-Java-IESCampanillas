import java.util.ArrayList;

public class T10Ejercicio8 {

  public static void main(String[] args) {
    ArrayList<Carta> baraja = new ArrayList<>();
    ArrayList<String> palo = new ArrayList<>();
    palo.add("espadas");
    palo.add("oros");
    palo.add("copas");
    palo.add("bastos");

    baraja.add(new Carta(1));
    baraja.add(new Carta(2));
    baraja.add(new Carta(3));
    baraja.add(new Carta(4));
    baraja.add(new Carta(5));
    baraja.add(new Carta(6));
    baraja.add(new Carta(7));
    baraja.add(new Carta(8));
    baraja.add(new Carta(9));
    baraja.add(new Carta(10));
    baraja.add(new Carta(11));
    baraja.add(new Carta(12));

    for (int i = 0; i < 10; i++) {
      System.out.println(baraja.get((int) ((Math.random() * 10))) + " de " + palo
          .get((int) ((Math.random() * 4))));
    }

  }

}

import java.util.ArrayList;
import java.util.Collections;

public class T10Ejercicio8y9 {

    public static void main(String[] args) {
        ArrayList<Carta> baraja = new ArrayList<>();
        baraja.add(new Carta(1, "Oros"));
        baraja.add(new Carta(2, "Oros"));
        baraja.add(new Carta(3, "Oros"));
        baraja.add(new Carta(4, "Oros"));
        baraja.add(new Carta(5, "Oros"));
        baraja.add(new Carta(6, "Oros"));
        baraja.add(new Carta(7, "Oros"));
        baraja.add(new Carta(8, "Oros"));
        baraja.add(new Carta(9, "Oros"));
        baraja.add(new Carta(10, "Oros"));
        baraja.add(new Carta(11, "Oros"));
        baraja.add(new Carta(12, "Oros"));

        baraja.add(new Carta(1, "Espadas"));
        baraja.add(new Carta(2, "Espadas"));
        baraja.add(new Carta(3, "Espadas"));
        baraja.add(new Carta(4, "Espadas"));
        baraja.add(new Carta(5, "Espadas"));
        baraja.add(new Carta(6, "Espadas"));
        baraja.add(new Carta(7, "Espadas"));
        baraja.add(new Carta(8, "Espadas"));
        baraja.add(new Carta(9, "Espadas"));
        baraja.add(new Carta(10, "Espadas"));
        baraja.add(new Carta(11, "Espadas"));
        baraja.add(new Carta(12, "Espadas"));

        baraja.add(new Carta(1, "Copas"));
        baraja.add(new Carta(2, "Copas"));
        baraja.add(new Carta(3, "Copas"));
        baraja.add(new Carta(4, "Copas"));
        baraja.add(new Carta(5, "Copas"));
        baraja.add(new Carta(6, "Copas"));
        baraja.add(new Carta(7, "Copas"));
        baraja.add(new Carta(8, "Copas"));
        baraja.add(new Carta(9, "Copas"));
        baraja.add(new Carta(10, "Copas"));
        baraja.add(new Carta(11, "Copas"));
        baraja.add(new Carta(12, "Copas"));

        baraja.add(new Carta(1, "Bastos"));
        baraja.add(new Carta(2, "Bastos"));
        baraja.add(new Carta(3, "Bastos"));
        baraja.add(new Carta(4, "Bastos"));
        baraja.add(new Carta(5, "Bastos"));
        baraja.add(new Carta(6, "Bastos"));
        baraja.add(new Carta(7, "Bastos"));
        baraja.add(new Carta(8, "Bastos"));
        baraja.add(new Carta(9, "Bastos"));
        baraja.add(new Carta(10, "Bastos"));
        baraja.add(new Carta(11, "Bastos"));
        baraja.add(new Carta(12, "Bastos"));
        ArrayList<Carta> resultado = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int aleat = (int) (Math.random() * 48);
            if (baraja.get(aleat).equals(resultado)) {

            } else {
                resultado.add(baraja.get(aleat));
            }
        }
        //TODO Ordenar AL Resultado

    }

}

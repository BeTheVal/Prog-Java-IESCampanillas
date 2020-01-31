import java.util.Objects;

public class Carta {
    int numero;
    String palo;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return numero == carta.numero &&
                Objects.equals(palo, carta.palo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, palo);
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}

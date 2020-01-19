package T9Ejercicio8;

public class Terminal {
    private String numero;
    private long cantidadSegundos;

    //Constructor
    public Terminal(String numero) {
        this.numero = numero;
    }

    public void llama(Terminal t, long segundos) {
        this.cantidadSegundos = this.cantidadSegundos + segundos;
        t.cantidadSegundos = t.cantidadSegundos + segundos;
    }

    @Override
    public String toString() {
        return "Nº " + numero + " - " + cantidadSegundos + "s de conversación.";
    }
}

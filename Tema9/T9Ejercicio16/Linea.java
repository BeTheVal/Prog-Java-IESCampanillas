package T9Ejercicio16;

public class Linea {
    private Punto a;
    private Punto b;

    public Linea(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Linea formada por los puntos (" +
                "a = " + a.getCorX() +
                " , " + a.getCorY() +
                ")" + " y " + " ( " + b.getCorY() + " , " + b.getCorX() + " )";
    }
}

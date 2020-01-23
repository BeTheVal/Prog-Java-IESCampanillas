package T9Ejercicio17;

public class Rectangulo {
    private int altura;
    private int base;
    private static int rectanguloscreados;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
        rectanguloscreados++;
    }

    @Override
    public String toString() {
        String cadena = "";

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                cadena += '*';
            }
            cadena += '\n';
        }
        return cadena;
    }

    public static int getRectangulosCreados() {
        return rectanguloscreados;
    }
}

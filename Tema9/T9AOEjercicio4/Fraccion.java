package T9AOEjercicio4;

public class Fraccion {
    private int numerador;
    private int denominador;

    //Constructor
    public Fraccion(int numerador, int denominador) {
        super();
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void simplifica(int n) {
        if (this.numerador % n == 0 && this.denominador % n == 0) {
            numerador /= n;
            denominador /= n;

        } else {
            System.out.println("No se puede simplificar");
        }
    }


    /**
     * @param b Segunda fracción
     * @return
     */
    public double multiplica(Fraccion b) {
        double result = this.numerador * b.numerador / this.denominador * b.denominador;
        return result;

    }

    /**
     * Devuelve el resultado de la división de dos fracciones.
     */
    public double divide(Fraccion b) {
        double result = this.numerador * b.denominador / this.denominador * b.numerador;
        return result;

    }

    /**
     * Devuelve el resultado de la inversión de dos fracciones
     */
    public double invierte(Fraccion b) {
        int aux;
        aux = b.denominador;
        b.denominador = b.numerador;
        b.numerador = aux;
        double result = this.denominador * b.denominador / this.numerador * b.numerador;
        return result;

    }

    @Override
    public String toString() {
        return "Fraccion{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }
}

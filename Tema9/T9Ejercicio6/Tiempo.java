package T9Ejercicio6;

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    //Constructor
    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    void suma(Tiempo TiempoASumar) {
        if (this.segundos > 60) {

        }

    }

    void resta(Tiempo TiempoARestar) {

    }

    @Override
    public String toString() {
        return horas + "h" + " " + minutos + "m" + " " + segundos + "s" + " ";
    }
}

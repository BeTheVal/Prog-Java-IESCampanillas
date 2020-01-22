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
        this.horas = this.horas + TiempoASumar.horas;
        this.minutos = this.minutos + TiempoASumar.minutos;
        this.segundos = this.segundos + TiempoASumar.segundos;
        diferenciapositiva();

    }
    //TODO Terminar la resta

    void resta(Tiempo TiempoARestar) {
        this.horas = this.horas - TiempoARestar.horas;
        this.minutos = this.minutos - TiempoARestar.minutos;
        this.segundos = this.segundos - TiempoARestar.segundos;
        if (this.horas < 0) {
            int diferencia = this.horas - Math.abs(this.horas);
            this.minutos = diferencia * 60;
        }
        if (this.minutos < 0) {
            int diferencia = this.minutos - Math.abs(this.minutos);
            this.segundos = diferencia * 60;
        }
        diferenciapositiva();

    }

    private void diferenciapositiva() {
        if (this.segundos >= 60) {
            int diferencia = this.segundos - 60;
            this.minutos++;
            this.segundos = diferencia;
        }
        if (this.minutos >= 60) {
            int diferencia = this.minutos - 60;
            this.horas++;
            this.minutos = diferencia;
        }
    }

    @Override
    public String toString() {
        return horas + "h" + " " + minutos + "m" + " " + segundos + "s" + " ";
    }
//TODO REFACTORIZAR!
}

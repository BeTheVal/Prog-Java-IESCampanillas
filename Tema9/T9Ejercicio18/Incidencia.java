package T9Ejercicio18;

public class Incidencia {
    private int codigo;
    private int puesto;
    private String problema;
    private String solucion = " ";
    private String estado;
    private static int pendientes;

    public Incidencia(int puesto, String problema) {
        this.puesto = puesto;
        this.problema = problema;
        this.estado = "Pendiente";
        this.pendientes++;
        this.codigo++;
    }

    public void resuelve(String solucion) {
        this.estado = "Resuelto";
        this.pendientes--;
        this.solucion = solucion;
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        return "Incidencia" + codigo + " - Puesto " + puesto + "- " + problema + " - " + estado + " - " + solucion;
    }
}

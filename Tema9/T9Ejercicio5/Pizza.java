package T9Ejercicio5;

public class Pizza {
    private String tipo;
    private String tamaño;
    private String estado;
    private static int TotalPedidas;
    private static int TotalServidas;

    //Constructor
    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        estado = "pedida";
        TotalPedidas++;
    }

    public void sirve() {
        if (this.estado == "servida") {
            System.out.println("Esta pizza ya está servida.");
        } else {
            this.estado = "servida";
            TotalServidas++;
        }
    }

    //Getters
    public static int getTotalPedidas() {
        return TotalPedidas;
    }

    public static int getTotalServidas() {
        return TotalServidas;
    }
    //ToString

    @Override
    public String toString() {
        return "Pizza" + " " + tipo + " " + tamaño + " " + estado;
    }
}

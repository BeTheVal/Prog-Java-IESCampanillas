package T9AOEjercicio2;

public class Gato {
    private String nombre;
    private String raza;
    private String sexo;
    private String color;

    public Gato(String nombre, String raza, String sexo, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", sexo='" + sexo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

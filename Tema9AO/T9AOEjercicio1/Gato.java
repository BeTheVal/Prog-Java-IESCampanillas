package T9AOEjercicio1;

public class Gato {
    private String nombre;
    private String raza;
    private String sexo;
    private String color;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

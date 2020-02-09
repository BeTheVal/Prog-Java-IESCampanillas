import java.util.Objects;

public class Elemento {

  private String nombre;
  private double precio;
  private int cantidad;

  //Constructor
  public Elemento(String nombre, double precio, int cantidad) {
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
  }
  //getter and setter

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    return nombre + " PVP: " + precio + " Unidades: " + cantidad + " Subtotal : "
        + precio * cantidad + "\n";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Elemento elemento = (Elemento) o;
    return Objects.equals(nombre, elemento.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre);
  }
}

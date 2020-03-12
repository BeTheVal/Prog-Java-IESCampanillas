public class Article {

  private String nombre;
  private int cantidad;

  public Article(String nombre, int cantidad) {
    this.nombre = nombre;
    this.cantidad = cantidad;

  }

  @Override
  public String toString() {
    return nombre + ", " + cantidad + " unid.\n";
  }
}

import java.util.ArrayList;

public class Carrito {

  ArrayList<Elemento> contenidoCarrito = new ArrayList<>();
  private int numerodelementos;
  private double importetotal;

  public void agrega(Elemento elemento) {
    if (this.contenidoCarrito.contains(elemento)) {
      int posicion = this.contenidoCarrito.indexOf(elemento);
      int unidadesExistentes = this.contenidoCarrito.get(posicion).getCantidad();
      this.contenidoCarrito.get(posicion).setCantidad(unidadesExistentes + elemento.getCantidad());
    } else {
      this.contenidoCarrito.add(elemento);
    }
  }


  public int numeroDeElementos() {
    return numerodelementos;
  }

  public double importeTotal() {
    return importetotal;
  }

  @Override
  public String toString() {
    String resultado = "Contenido del carrito\n=====================\n";
    for (Elemento e : contenidoCarrito) {
      resultado += e.toString();
    }
    return resultado;
  }
}

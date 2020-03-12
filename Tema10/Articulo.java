import java.util.Objects;

public class Articulo {

    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    //Constructor
    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta,
        int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public Articulo(String codigo) {
        this.codigo = codigo;
    }
    // ToString

    @Override
    public String toString() {
      return codigo + descripcion + " Precio de Compra " + precioCompra + " Euros " +
          " Precio de venta " + precioVenta + " Euros " + " Stock " + stock;
    }
    //GETTER AND SETTER


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Articulo articulo = (Articulo) o;
        return Objects.equals(codigo, articulo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}

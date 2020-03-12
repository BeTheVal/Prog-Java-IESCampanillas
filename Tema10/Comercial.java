import java.util.ArrayList;

public class Comercial extends Persona implements Cliente {

  //su nombre, correo electrónico, cargo que ocupa y los artículos que ha
//vendido, es decir, una lista con los nombres de los artículos que ha vendido
  private String nombre;
  private String correo;
  private String cargo;
  private ArrayList<Article> listaVendidos = new ArrayList<>();
//Constructor

  public Comercial(String nombre, String correo, String cargo) {
    this.nombre = nombre;
    this.correo = correo;
    this.cargo = cargo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }


  public void setListaVendidos(Article añadir) {
    this.listaVendidos.add(añadir);
  }

  @Override
  public String toString() {
    return nombre + '\n' + correo + "\n" + cargo + '\n' + "Ventas realizadas\n" + "============\n"
        + listaVendidos;
  }
}

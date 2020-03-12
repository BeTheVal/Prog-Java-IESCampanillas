public class Empresa implements Cliente {

  // CIF, su nombre y su teléfono
  private String cif;
  private String nombre;
  private String telefono;

  //Constructor

  public Empresa(String cif, String nombre, String telefono) {
    this.cif = cif;
    this.nombre = nombre;
    this.telefono = telefono;
  }
}

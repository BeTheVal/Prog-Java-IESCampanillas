public class Usuario extends Persona implements Cliente {

  ///nombre, su correo electrónico y su teléfono
  private String nombre;
  private String correo;
  private String telefono;

  //Constructor
  public Usuario(String nombre, String correo, String telefono) {
    this.nombre = nombre;
    this.correo = correo;
    this.telefono = telefono;
  }
}

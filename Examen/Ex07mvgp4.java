public class Ex07mvgp4 {

  // Autor: Miguel Valerio Gutiérrez Pardo
//Modelo B
// Fecha 10/02/2020
  //El objeto artículo original ahora es article debido al que en el ejercicio anterior tambien existe una clase articulo
  public static void main(String[] args) {
    Usuario pepe = new Usuario("Pepe", "pepe@yahoo.com", "555 123456");
    Usuario pablo = new Usuario("Pablo", "pablo@gmail.com", "555 112233");
    Empresa ofiMalaga = new Empresa("B123456", "Ofi Málaga", "555 654321");
    Comercial juan = new Comercial("Juan", "juan@hotmail.com", "jefe de ventas");
    Comercial luis = new Comercial("Luis", "luis@gmail.com", "coordinador de ventas");
    pepe.compra(juan, new Article("Impresora Láser", 1));
    ofiMalaga.compra(juan, new Article("Impresora Láser", 2));
    pepe.compra(juan, new Article("Paquete de folios", 10));
    pablo.compra(luis, new Article("Clasificador anillas", 12));
    pepe.compra(luis, new Article("Paquete de folios", 50));
    pablo.compra(luis, new Article("Mesa escritorio", 6));
    pepe.compra(juan, new Article("Paquete de folios", 5));
    System.out.println(juan);
    System.out.println(luis);
  }
}

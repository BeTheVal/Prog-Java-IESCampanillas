public interface Cliente {

  default void compra(Comercial comer, Article art) {
    comer.setListaVendidos(art);

  }
}

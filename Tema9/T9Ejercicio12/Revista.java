package T9Ejercicio12;

public class Revista extends Publicacion {
    private int numero;

    public Revista(String isbn, String titulo, int añoPublicacion, int numero) {
        super(isbn, titulo, añoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ISBN: " + this.getIsbn() + " Titulo : " + this.getTitulo() + ", año de publicacion " + this.getAnoPublicacion();
    }
}

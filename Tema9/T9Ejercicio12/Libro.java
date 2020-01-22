package T9Ejercicio12;

public class Libro extends Publicacion {
    private boolean prestado;

    public Libro(String isbn, String titulo, int añoPublicacion) {
        super(isbn, titulo, añoPublicacion);
    }

    public void presta() {
        prestado = true;
    }

    public void devuelve() {
        prestado = false;
    }

    public boolean estaPrestado() {
        if (prestado) ;
        return true;
    }

    @Override
    public String toString() {
        return "ISBN: " + this.getIsbn() + " Titulo : " + this.getTitulo() + ", año de publicacion " + this.getAnoPublicacion();
    }
}

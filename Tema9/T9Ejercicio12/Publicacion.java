package T9Ejercicio12;

public abstract class Publicacion {
    private String isbn;
    private String titulo;
    private int anoPublicacion;

    public Publicacion(String isbn, String titulo, int añoPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoPublicacion = añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }
}


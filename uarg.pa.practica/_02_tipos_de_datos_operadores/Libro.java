public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int cantidadPaginas;

                        //contructor
public Libro(String titulo, String autor, int anioPublicacion, int cantidadPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.cantidadPaginas = cantidadPaginas;
}
        public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public int getCantidadPaginas() {
        return this.cantidadPaginas;
    }
    public boolean esReciente() {
        return this.anioPublicacion > 2010;
    }
}

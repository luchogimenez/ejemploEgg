/*
 Crear el método  para mostrar la información relativa al libro con el siguiente formato:
“El libro con ISBN creado por el autor tiene páginas”.
En el fichero main, crear 5 objetos Libro (los valores que se quieran), validando que el campo ISBN de valor numerico y solo permita 10 digitos
listarlos sin que pueda haber dos libros con el mismo ISBN  y mostrarlos por pantalla.
Por último, indicar cuál de los 2 tiene más páginas.
 */
package libro;

import java.util.Comparator;

public class Libro {

    private long isbn;
    private String titulo;
    private String autor;
    private Integer numPaginas;

    public Libro() {
    }

    public Libro(long isbn, String titulo, String autor, Integer numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    //  Mostrar => El libro con ISBN creado por el autor tiene páginas
    @Override
    public String toString() {
        return "El libro " + titulo + " con ISBN " + isbn + " creado por " + autor
                + " tiene " + numPaginas + " páginas.";
    }

    public static Comparator<Libro> compararCantidadPaginasDesc = new Comparator<Libro>() {

        @Override
        public int compare(Libro l1, Libro l2) {
            return l1.getNumPaginas().compareTo(l2.getNumPaginas());
        }

    };
    public static Comparator<Libro> compararCantidadPaginasAsc = new Comparator<Libro>() {

        @Override
        public int compare(Libro l1, Libro l2) {
            return l2.getNumPaginas().compareTo(l1.getNumPaginas());
        }

    };
}

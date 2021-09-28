/*
 * Crear el método  para mostrar la información relativa al libro con el siguiente formato:
“El libro con ISBN creado por el autor tiene páginas”.
En el fichero main, crear 5 objetos Libro (los valores que se quieran), validando que el campo ISBN de valor numerico y solo permita 10 digitos
listarlos sin que pueda haber dos libros con el mismo ISBN  y mostrarlos por pantalla.
Por último, indicar cuál de los 2 tiene más páginas.
 */
package libro.servicio;

import java.util.HashMap;
import java.util.Optional;
import libro.Libro;

public class Libro_Servicio {

    Libro libro;
    HashMap<String, Libro> mapLibro;

    public Libro_Servicio() {
        //libro = new Libro();
        mapLibro = new HashMap();
    }

    public void crearLibro(long isbn, String titulo, String autor, Integer numPaginas) throws Exception {
        try {

            if (!verificarIsbn(isbn)) {
                throw new Exception("Error: El ISBN " + isbn + " debe contener 10 digitos y no tener caracteres (solo numeros del 0 al 9)");
            }
            if (duplicidadIsbn(isbn)) {
                throw new Exception("El ISBN " + isbn + " ya existe en la lista de libros.");
            }
            libro = new Libro();
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setNumPaginas(numPaginas);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        agregarLibros(libro);
    }

    public Boolean verificarIsbn(long isbn) {

        return (Long.toString(isbn).matches("\\d{10}"));
    }

    public Boolean duplicidadIsbn(long isbn) throws Exception {

        return (mapLibro.containsKey(String.valueOf(isbn)));

    }

    public void agregarLibros(Libro libro) throws Exception {

        mapLibro.put(String.valueOf(libro.getIsbn()), libro);

    }

    public void mostrarLibros() {
        System.out.println("--------------Lista de libros (sin ordenar)--------------------");
        mapLibro.forEach((key, value) -> System.out.println(value));
        System.out.print("\n");
    }

    public void mostrarListaOrdenada() {
        System.out.println("--------------Lista de libros ordenada por precio--------------------");
        mapLibro.values().stream()
                .sorted(Libro.compararCantidadPaginasAsc)
                .forEach((value) -> System.out.println(value));
        System.out.print("\n");
    }

    public void libroConMasPaginas() {
        System.out.println("--------------Libro con mayor precio--------------------");
        Optional<Libro> optional = mapLibro.values().stream().max(Libro.compararCantidadPaginasDesc);
        Libro libroMasPaginas = optional.get();
        System.out.println(libroMasPaginas);
        System.out.print("\n");
    }

}

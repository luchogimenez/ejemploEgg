package libro.principal;

import libro.servicio.Libro_Servicio;

public class Libro_Principal {

    public static void main(String[] args) {

        Libro_Servicio libroService = new Libro_Servicio();
        try {
            libroService.crearLibro(1234567890L, "Libro1", "Autor1", 120);
            libroService.crearLibro(1234567891L, "Libro2", "Autor2", 240);
            libroService.crearLibro(1234567892L, "Libro3", "Autor3", 100);
            libroService.crearLibro(1123456789L, "Libro4", "Autor4", 360);
            libroService.crearLibro(1234764534L, "Libro5", "Autor5", 80);
            libroService.crearLibro(1123456790L, "Libro6", "Autor6", 300);
            libroService.mostrarLibros();
            libroService.mostrarListaOrdenada();
            libroService.libroConMasPaginas();
        } catch (Exception e) {
            e.getMessage();
        }

    }

}

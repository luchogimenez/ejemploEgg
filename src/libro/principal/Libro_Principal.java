package libro.principal;

import libro.Libro;
import libro.servicio.Libro_Servicio;

public class Libro_Principal {

    public static void main(String[] args) throws Exception {

        Libro_Servicio libro = new Libro_Servicio();

        libro.crearLibro(1234567890L, "Libro1", "Autor1", 120);
        libro.crearLibro(1234567891L, "Libro2", "Autor2", 240);
        libro.crearLibro(1234545414L, "Libro3", "Autor3", 100);
        libro.crearLibro(1123456789L, "Libro4", "Autor4", 360);
        libro.crearLibro(1234764534L, "Libro5", "Autor5", 80);
        libro.crearLibro(1123456790L, "Libro6", "Autor6", 360);
        libro.mostrarLibros();
        libro.libroConMasPaginas();

        }
        
    }


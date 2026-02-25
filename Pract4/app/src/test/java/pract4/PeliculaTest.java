package pract4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PeliculaTest {

    @Test
    void testConstructorAndGetters() {
        Pelicula pelicula = new Pelicula("El Señor de los Anillos", "Peter Jackson", 2001, "Fantasía", 178);

        assertEquals("El Señor de los Anillos", pelicula.getTitulo());
        assertEquals("Peter Jackson", pelicula.getDirector());
        assertEquals(2001, pelicula.getAnio());
        assertEquals("Fantasía", pelicula.getGenero());
        assertEquals(178, pelicula.getDuracion());
    }

    @Test
    void testGetInformacion() {
        Pelicula pelicula = new Pelicula("Forrest Gump", "Robert Zemeckis", 1994, "Drama", 142);
        String info = pelicula.getInformacion();

        assertEquals("Título: Forrest Gump, Director: Robert Zemeckis, Año: 1994, Género: Drama, Duración: 142 min.", info);
    }

    @Test
    void testToString() {
        Pelicula pelicula = new Pelicula("Matrix", "Lana Wachowski", 1999, "Ciencia Ficción", 136);
        String str = pelicula.toString();

        assertEquals("Pelicula [Título: Matrix, Director: Lana Wachowski, Año: 1999, Género: Ciencia Ficción, Duración: 136 min. | ¿Es clásica?: Sí]", str);
    }
}
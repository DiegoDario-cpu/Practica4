package pract4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CatalogoTest {

    private Catalogo catalogo;
    private Pelicula pelicula1;
    private Pelicula pelicula2;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        catalogo = new Catalogo();
        pelicula1 = new Pelicula("El Señor de los Anillos", "Peter Jackson", 2001, "Fantasía", 178);
        pelicula2 = new Pelicula("Forrest Gump", "Robert Zemeckis", 1994, "Drama", 142);
    }


    @Test
    void testAgregarPelicula() {
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);

        assertTrue(catalogo.getPeliculasList().contains(pelicula1));
        assertTrue(catalogo.getPeliculasList().contains(pelicula2));
        assertEquals(2, catalogo.getPeliculasList().size());
    }

    @Test
    void testBuscarPeliculaPorTitulo() {
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);

        String resultado = catalogo.buscarPeliculaPorTitulo("Forrest Gump");
        assertTrue(resultado.contains("Forrest Gump"));
        assertTrue(resultado.contains("1994"));
    }

    @Test
    void testGetPeliculas() {
        catalogo.agregarPelicula(pelicula1);

        String resultado = catalogo.getPeliculas();
        assertTrue(resultado.contains("El Señor de los Anillos"));
    }

    @Test
    void testToString() {
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);

        String resultado = catalogo.toString();
        assertTrue(resultado.contains("Total de películas registradas: 2"));
    }
}
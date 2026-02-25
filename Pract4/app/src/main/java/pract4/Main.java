package pract4;

public class Main {
    public static void main(String[] args) {
        
        // 1. Instanciamos el catálogo
        Catalogo miCatalogo = new Catalogo();

        // 2. Creamos los objetos Pelicula
        Pelicula p1 = new Pelicula("Una pelicula de huevos", "Gabriel Riva Palacio Alatriste", 2006, "Comedia", 118);
        Pelicula p2 = new Pelicula("Otra pelicula de huevos", "Gabriel Riva Palacio Alatriste", 2009, "Comedia", 124);
        Pelicula p3 = new Pelicula("Un gallo con muchos huevos", "Rodolfo Riva Palacio Alatriste", 2015, "Comedia", 98);

        // 3. Agregamos las películas al catálogo
        miCatalogo.agregarPelicula(p1);
        miCatalogo.agregarPelicula(p2);
        miCatalogo.agregarPelicula(p3);

        // 4. Mostramos la lista
        System.out.println("--- LISTA DE PELÍCULAS ---");
        // Asumiendo que getPeliculas() devuelve una lista o un String formateado
        System.out.println(miCatalogo.getPeliculas());

        // 5. Búsqueda
        System.out.println("\n--- BÚSQUEDA DE PELÍCULA ---");
        miCatalogo.buscarPeliculaPorTitulo("Una pelicula de huevos");
        
        // 6. Pruebas de toString
        System.out.println("\n--- DETALLES (toString) ---");
        System.out.println(p1.toString());
        System.out.println(miCatalogo.toString()); 
    }
}
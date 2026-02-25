public class Main {
    public static void main(String[] args) {
        
        Catalogo miCatalogo = new Catalogo();

    
        Pelicula p1 = new Pelicula("Una pelicula de huevos", "Gabriel Riva Palacio Alatriste", 2006, "Comedia", 118);
        Pelicula p2 = new Pelicula("Otra pelicula de huevos", "Gabriel Riva Palacio Alatriste", 2009, "Comedia", 124);
        Pelicula p3 = new Pelicula("Un gallo con muchos huevos", "Rodolfo Riva Palacio Alatriste", 1972, "Comedia", 120);

        
        miCatalogo.agregarPelicula(p1);
        miCatalogo.agregarPelicula(p2);
        miCatalogo.agregarPelicula(p3);

        
        System.out.println(" LISTA DE PELÍCULAS ");
        System.out.println(miCatalogo.getPeliculas());

        
        System.out.println("BÚSQUEDA DE PELÍCULA");
        miCatalogo.buscarPeliculaPorTitulo("Una pelicula de huevos");
        
       
        
        System.out.println(p1.toString());
        System.out.println(miCatalogo.toString()); 
    }
}


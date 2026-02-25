package pract4;

import java.util.ArrayList;

public class Catalogo {

    private final ArrayList<Pelicula> peliculas;

    public Catalogo() {
        this.peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public String getPeliculas() {
        StringBuilder lista = new StringBuilder();
        for (Pelicula p : peliculas) {
            lista.append(p.getInformacion()).append("\n");
        }
        return lista.toString();
    }

    public String buscarPeliculaPorTitulo(String titulo) {
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                return "Película encontrada: " + p.getInformacion();
            }
        }
        return "No se encontró ninguna película con el título: " + titulo;
    }

    @Override
    public String toString() {
        return "Objeto Catalogo [Total de películas registradas: " + peliculas.size() + "]";
    }

    // Getter para pruebas unitarias
    public java.util.List<Pelicula> getPeliculasList() {
        return peliculas;
    }
}
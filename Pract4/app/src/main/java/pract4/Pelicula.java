package pract4;

public class Pelicula {
    
    private final String titulo;
    private final String director;
    private final int añoEstreno;
    private final String genero;
    private final int duracion;

    public Pelicula(String titulo, String director, int añoEstreno, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.añoEstreno = añoEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getInformacion(){
        return "Título: " + titulo + ", Director: " + director + 
               ", Año: " + añoEstreno + ", Género: " + genero + 
               ", Duración: " + duracion + " min.";
    }
    public boolean esClasico(){
        int añoActual=2026;
        return (añoActual - añoEstreno)>25;
    }

    public String getTitulo(){
        return titulo;
    }

    
    @Override
    public String toString() {
        return "Pelicula [" + getInformacion() + " | ¿Es clásica?: " + (esClasico() ? "Sí" : "No") + "]";
    }

    public String getDirector() {
        return director;
    }

    public int getAnio() {
        return añoEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }
    }



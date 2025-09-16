package TP2;

import java.util.Scanner;

public class ClasePelicula {
    private String titulo;
    private int duracion;
    private String genero;
    private int anioEstreno;
    private String director;
    private double calificacion;

    public ClasePelicula(String titulo, int duracion, String genero, int anioEstreno, String director, double calificacion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.anioEstreno = anioEstreno;
        this.director = director;
        this.calificacion = calificacion;
    }
    public String getTitulo() {
        return titulo;
    }
     public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAnioEstreno() {
        return anioEstreno;
    }
    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", anioEstreno=" + anioEstreno +
                ", director='" + director + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Ingresar título:"); 
        String titulo = sn.nextLine();

            System.out.println("Ingresar duración:");
            int duracion = sn.nextInt();
            sn.nextLine(); // Limpiar buffer

                System.out.println("Ingresar género:");
                String genero = sn.nextLine();

                    System.out.println("Ingresar año de estreno:");
                    int anioEstreno = sn.nextInt();
                    sn.nextLine();
         
                            System.out.println("Ingresar el nombre del director");
                            String director = sn.nextLine();

                                System.out.println("Ingresar la calificacion");
                                double calificacion = sn.nextDouble();
                                sn.nextLine();

                                    ClasePelicula p1 = new ClasePelicula(titulo, duracion, genero, anioEstreno, director, calificacion);

                                        System.out.println(p1);

                                            sn.close();
    }
}
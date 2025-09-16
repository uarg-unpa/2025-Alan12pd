package TP2;

import java.util.Scanner;

public class Cancion {
    private String titulo;
    private int duracion;
    private String genero;
    private String autor;
    private int anioEstreno;

    public Cancion(String titulo, int duracion, String genero,  String autor, int anioEstreno) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.anioEstreno = anioEstreno;
        this.autor = autor;

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
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void esReciente() {
    if (this.anioEstreno >= 2020) {
        System.out.println("Es reciente");
    } else {
        System.out.println("No es reciente");
    }

}

            
            public String toString() {
            return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", anioEstreno=" + anioEstreno +
                ", autor='" + autor + '\'' +
                '}';
            }
                public static void main(String[] args) {
                    Scanner sn = new Scanner(System.in);

                    System.out.println("Ingresar título:"); 
                    String titulo = sn.nextLine();
                    sn.nextLine();

                    System.out.println("Ingresar duración:");
                    int duracion = sn.nextInt();
                    sn.nextLine(); 

                    System.out.println("Ingresar género:");
                    String genero = sn.nextLine();
                    sn.nextLine();

                    System.out.println("Ingresar año de estreno:");
                    int anioEstreno = sn.nextInt();
                    sn.nextLine(); 

                    System.out.println("Ingresar autor:");
                    String autor = sn.nextLine();
                    sn.nextLine();

                    
                    Cancion ca1 = new Cancion(titulo, duracion, genero, autor, anioEstreno);

                        System.out.println(ca1);
                        ca1.esReciente();

                        sn.close();
                    
    }
}
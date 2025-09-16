package TP2;

public class Departamento {
    private String nombre;
    private int piso;

    public Departamento(String nombre, int piso) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Desconocido"; 
        }

        if (piso > 0) {
            this.piso = piso;
        } else {
            this.piso = 1; 
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getPiso() {
        return this.piso;
    }

    public boolean esCompleto() {
        return nombre != null && !nombre.isEmpty() && piso > 0;
    }

    @Override
    public String toString() {
        return nombre + " " + piso;
    }
}

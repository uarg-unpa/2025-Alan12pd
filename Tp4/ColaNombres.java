package Tp4;

public class ColaNombres {
    private String[] elementos;
    private int frente;
    private int fin;
    private int max = 10;
    private int cantidad;
    
    public ColaNombres () {
        elementos = new String[max];
        frente = 0;
        fin = -1;
        cantidad = 0;
    }
    public boolean estaVacia() {
        return cantidad == 0;
    }
    public boolean estaLlena () {
        return cantidad == max;
    }
public boolean encolar(String nombre) {
    if (estaLlena()) {
        return false;
    }
    fin = (fin + 1) % max;
    elementos[fin] = nombre;
    cantidad++;
    return true;
}

public String desencolar() {
    if (estaVacia()) {
        return null;
    }
    String nombre = elementos[frente];
    elementos[frente] = null;
    frente = (frente + 1) % max;
    cantidad--;
    return nombre;
}


public String peek() {
    if (estaVacia()) {
        return null;
    }
    
    return elementos[frente];
}

}
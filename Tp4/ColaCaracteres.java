package Tp4;

public class ColaCaracteres {
    private char[] elementos;
    private int frente;
    private int fin;
    private int max = 10;

    public ColaCaracteres() {
        elementos = new char[max];
        frente = 0;
        fin = -1;
    }

    public boolean estaVacia() {
        return fin < frente;
    }

    public boolean estaLlena() {
        return fin == max;
    }

    public boolean encolar(char c) {
        if (estaLlena()) {
            return false;
        }
        fin++;
        elementos[fin] = c;
        return true;
    }

    public Character desencolar() {
        if (estaVacia()) {
            return null;
        }
        char eliminado = elementos[frente];
        for (int i = frente; i < fin; i++) {
            elementos[i] = elementos[i + 1];
        }
        fin--;
        return eliminado;
    }

    
    public Character peek() {
        if (estaVacia()) {
            return null;
        }
        
        return Character.valueOf(elementos[frente]);
    }
}
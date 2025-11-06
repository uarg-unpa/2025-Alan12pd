package Tp4;

public class Cola8 {
    private final int MAX = 100;
    private int frente, ultimo;
    private char[] elementos;

    public Cola8() {
        frente = 0;
        ultimo = -1;
        elementos = new char[MAX];
    }

    public boolean estaVacia() {
        return frente > ultimo;
    }

    public boolean estaLlena() {
        return ultimo == MAX - 1;
    }

    public void insertar(char elem) {
        if (!estaLlena()) {
            elementos[++ultimo] = elem;
        }
    }

    public char borrar() {
        if (!estaVacia()) {
            return elementos[frente++];
        }
        return '\0';
    }
}
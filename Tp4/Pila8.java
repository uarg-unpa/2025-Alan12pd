package Tp4;

public class Pila8 {
     private char[] elementos;
    private int cima;
    private final int MAX = 100;

    public Pila8() {
        elementos = new char[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return (cima == -1);
    }

    public boolean estaLlena() {
        return (cima == MAX - 1);
    }

    public void meter(char elem) {
        cima++;
        elementos[cima] = elem;
    }

    public char sacar() {
        char elem = elementos[cima];
        cima--;
        return elem;
    }
}
package Tp3;

public class Pila{
    private int[] elementos;
    private int cima;
    private final int MAX = 10;

    public Pila() {
        elementos = new int[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return (cima == -1);
    }

    public boolean estaLlena() {
        return (cima == MAX - 1);
    }

    public void meter(int elem) {
        cima++;
        elementos[cima] = elem;
    }

    public int sacar() {
        int elem = elementos[cima];
        cima--;
        return elem;
    }

    
    public int cantidadElementos() {
        return cima + 1; 
    }

    public int capacidadRestante() {
        return MAX - (cima + 1);
    }
}

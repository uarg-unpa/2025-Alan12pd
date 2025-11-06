package Tp3;

public class Pila6 {
    private final int maxPilas = 100;
    private int[] elementos;
    private int cima;

    public Pila6() {
        elementos = new int[maxPilas];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == maxPilas - 1;
    }

    public void meter(int x) {
        if (!estaLlena()) {
            cima++;
            elementos[cima] = x;
        }
    }

    public int sacar() {
        int x = -1;
        if (!estaVacia()) {
            x = elementos[cima];
            cima--;
        }
        return x;
    }

    public int segundoDesdeSuperiorQuitandoDos() {
        Pila aux = new Pila();
        int x = -1;

        
        aux.meter(this.sacar());
        
        x = this.sacar();
        
        return x;
    }

    public int segundoDesdeSuperiorSinModificar() {
        Pila aux = new Pila();
        int x = -1;
        aux.meter(this.sacar());
        x = this.sacar();
        this.meter(x);
        this.meter(aux.sacar());

        return x;
    }
}
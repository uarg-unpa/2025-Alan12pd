package Tp3;

public class Palabra {
    private char[]elements;
    private int cima;
    private final int MAX = 30;

    public Palabra(){
        elements = new char[MAX];
        cima = -1;
    }

    public boolean estaVacía(){
    return (cima == -1);
    }
  
    public boolean estaLlena() {
        return (cima == MAX - 1);
    }

    
    public void meter(char elem) {
        cima++;
        elements[cima] = elem;
    }

    public int sacar() {
        int elem = elements[cima];
        cima--;
        return elem;
    }
}


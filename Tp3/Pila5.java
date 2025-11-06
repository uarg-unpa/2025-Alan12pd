package Tp3;

public class Pila5 {
    private int[] elementos; 
    private int cima;
    private final int MAX = 10; 

    public Pila5(){
        elementos = new int[MAX];
        cima = -1;
    }
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
    public int elementoCima(){
        if(!estaVacia()){
            return elementos[cima];
        }
            return -1;
        }

    }
}





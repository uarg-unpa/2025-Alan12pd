package Tp3;

public class Pila5 {
    private int[] elementos; 
    private int cima;
    private final int MAX = 10; 

    public Pila5(){
        elementos = new int[MAX];
        cima = -1;
    }
    public boolean estavacia(){
        return (cima == -1);
    }
    public boolean estaLlena(){
        return (cima == MAX - 1);
    }
    public void meter(int elemento){
        if (!estaLlena()) {
            cima++;
            elementos[cima] = elemento;
        }
    }
    public int sacar(){
        if (!estavacia()) {
            int elem = elementos[cima];
            elementos[cima] = 0;
            cima--;
            return elem;
        }
        return -1; 
        }
        public int elementoCima(){
            if(!estavacia()){
                return elementos[cima];
            }
            return -1;
        }

}





package Practica;

public class ColaMovible {
    private final int maxcola=5;
    private int frente, ultimo;
    private int []elementos;
    
        public ColaMovible(){
            frente=0;
            ultimo=0;
            elementos=new int[maxcola];
        }
        private int siguiente(int subind){
            if (subind == maxcola - 1){
            return 0;
            }else{
            return ++subind;
            }

        }
        public boolean estaVacia(){
            return (ultimo==frente);
        }
        public boolean estaLlena(){
            int sigultimo = siguiente(ultimo);
            return (sigultimo==frente);


        }
        public void insertar(int numero){
            ultimo=siguiente(ultimo);
            elementos[ultimo]=numero;
        }
        public int borrar(){
            frente=siguiente(frente);
            return elementos[frente];
        }
}


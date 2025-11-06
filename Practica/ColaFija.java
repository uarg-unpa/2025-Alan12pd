package Practica;

public class ColaFija {
    private final int maxcola=5;
    private int ultimo;
    private int []elementos;

         public ColaFija(){
        ultimo = 0;
        elementos = new int[maxcola];
        }

        private int siguiente(int subind) {
            return subind + 1;
        }

        public boolean estaVacia() {
            return ultimo == 0;
        }

        public boolean estaLlena() {
            return ultimo == maxcola;
        }
        public void insertar(int numero){
            

        }
        public int borrar(){

        }
}

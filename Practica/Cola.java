package Practica;

public class Cola{
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 100;

            public Cola(){
            elementos = new int [MAX];
            frente=0;
            fin=0;
            }
            private int siguiente(int subind){
                if (subind == MAX - 1)
                    return 0;
                else
                    return ++subind;

            }
            public boolean estaVacia(){
                return fin== 0;

            }
            public boolean estaLlena(){
                return fin == MAX;
            }
            public void insertar(int numero){
                fin = siguiente(fin);
                elementos[fin]= numero;
            }
            public int borrar(){
                if (estaVacia())
                    return -1;
                else{
                    frente = siguiente(frente);
                    return elementos[frente];
            }
            }
        }
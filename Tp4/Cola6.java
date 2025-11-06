package Tp4;

public class Cola6 {
     private final int MAX = 10;
    private int[] elementos;
    private int frente;
    private int ultimo;

        public Cola6() {
            elementos = new int[MAX];
            frente = 0;
            ultimo = 0;
        }

            public boolean estaVacia() {
                return (ultimo == frente);
            }

                public boolean estaLlena() {
                    int sigUltimo = siguiente(ultimo);
                    return (sigUltimo == frente);
                }

                    private int siguiente(int subind) {
                        if (subind == MAX - 1)
                            return 0;
                        else
                            return ++subind;
                    }

                        public void encolar(int elem) {
                            if (!estaLlena()) {
                            ultimo = siguiente(ultimo);
                            elementos[ultimo] = elem;
                            }
                        }

                            public int desencolar() {
                                if (!estaVacia()) {
                                frente = siguiente(frente);
                                return elementos[frente];
                                }
                                return -1; 
                            }

                                public int contar() {
                                if (ultimo >= frente) {
                                    return ultimo - frente;
                                } else {
                                    return (MAX - frente) + ultimo;
                                }
                            }
                                    public boolean esIgual(Cola6 otra) {
                                        if (this.contar() != otra.contar()) return false;

                                        Cola6 aux1 = new Cola6();
                                        Cola6 aux2 = new Cola6();
                                        boolean iguales = true;

                                        while (!this.estaVacia()) {
                                            int elem1 = this.desencolar();
                                            int elem2 = otra.desencolar();

                                            if (elem1 != elem2) {
                                                iguales = false;
                                            }

                                            aux1.encolar(elem1);
                                            aux2.encolar(elem2);
                                        }

                                        
                                        while (!aux1.estaVacia()) {
                                            this.encolar(aux1.desencolar());
                                        }
                                        while (!aux2.estaVacia()) {
                                            otra.encolar(aux2.desencolar());
                                        }

                                        return iguales;
                                    }
}

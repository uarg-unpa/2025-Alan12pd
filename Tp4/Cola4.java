package Tp4;

public class Cola4 {
    private final int MAX = 5;     
    private int frente;
    private int ultimo;            
    private int[] elementos;

    public Cola4() {
        frente = 0;
        ultimo = 0;
        elementos = new int[MAX];
    }
    public boolean estaVacia() {
        return ultimo == 0;
    }

    public boolean estaLlena() {
        return ultimo == MAX;
    }
    public void insertar(int numero) {
        if (estaLlena()) {
            System.out.println("Cola llena. No se puede insertar.");
        } else {
            elementos[ultimo] = numero;
            ultimo++;
        }
    }

    public int borrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía. No se puede borrar.");
            return -1;
        } else {
            int eliminado = elementos[0];
            for (int i = 0; i < ultimo - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            ultimo--;
            return eliminado;
        }
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía.");
        } else {
            System.out.print("Cola: ");
            for (int i = 0; i < ultimo; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }

    public int contar() {
        return (ultimo - frente + MAX) % MAX;
    }
}


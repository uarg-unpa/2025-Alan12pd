package Tp4;

public class Cola7 {
    private final int MAX = 10;
    private int frente, ultimo;
    private int[] elementos;

    public Cola7() {
        frente = 0;
        ultimo = -1;
        elementos = new int[MAX];
    }

    public boolean estaVacia() {
        return frente > ultimo;
    }

    public boolean estaLlena() {
        return ultimo == MAX - 1;
    }

    public void insertar(int dato) {
        if (!estaLlena()) {
            elementos[++ultimo] = dato;
        } else {
            System.out.println("Cola llena, no se puede insertar " + dato);
        }
    }

    public int borrar() {
        if (!estaVacia()) {
            return elementos[frente++];
        } else {
            System.out.println("Cola vacía, no se puede borrar");
            return -1;
        }
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
        } else {
            for (int i = frente; i <= ultimo; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}


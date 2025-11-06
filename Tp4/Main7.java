package Tp4;


public class Main7 {
    public static void main(String[] args) {
        Pila7 pila = new Pila7();
        Cola7 cola = new Cola7();

        
        pila.meter(7);
        pila.meter(4);
        pila.meter(9);
        pila.meter(2);
        pila.meter(6);

        System.out.println("Pila original:");
        pila.mostrar();

        
        pasarParesACola(pila, cola);

        System.out.println("\nCola con los pares:");
        cola.mostrar();

        System.out.println("\nPila restaurada:");
        pila.mostrar();
    }

    
    public static void pasarParesACola(Pila7 pila, Cola7 cola) {
        Pila7 aux = new Pila7();

        while (!pila.estaVacia()) {
            int elemento = pila.sacar();

            if (elemento % 2 == 0) {
                cola.insertar(elemento);
            }

            aux.meter(elemento);
        }

        
        while (!aux.estaVacia()) {
            pila.meter(aux.sacar());
        }
    }
}

package Tp3;

public class TestcopiaPila {
        public static void main(String[] args) {
        Pila7 p1 = new Pila7();
        p1.meter(10);
        p1.meter(20);
        p1.meter(30);

        Pila p2 = p1.copiar();

        System.out.println("Pila original:");
        while (!p1.estaVacia()) {
            System.out.println(p1.sacar());
        }

        System.out.println("Pila copia:");
        while (!p2.estaVacia()) {
            System.out.println(p2.sacar());
        }
    }
}

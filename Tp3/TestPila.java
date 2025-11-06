package Tp3;

import java.util.Scanner;

public class TestPila {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pila pila = new Pila();

        int opcion;
        do {
            System.out.println("\n--- MENU PILA ---");
            System.out.println("1. Meter elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    if (!pila.estaLlena()) {
                        System.out.print("Ingrese el número a meter: ");
                        int valor = entrada.nextInt();
                        pila.meter(valor);
                        System.out.println("Elemento " + valor + " agregado correctamente.");
                    } else {
                        System.out.println("La pila está llena. No se pueden agregar más elementos.");
                    }
                    break;

                case 2:
                    if (!pila.estaVacia()) {
                        int eliminado = pila.sacar();
                        System.out.println("Elemento " + eliminado + " eliminado de la pila.");
                    } else {
                        System.out.println("La pila está vacía. No se pueden sacar elementos.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            // Mostrar estado actual de la pila
            System.out.println("→ Elementos en la pila: " + pila.cantidadElementos());
            System.out.println("→ Lugares disponibles: " + pila.capacidadRestante());

        } while (opcion != 3);

        entrada.close();
    }
}
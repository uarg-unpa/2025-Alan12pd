package Tp4;

import java.util.Scanner;

public class MainColaNombres {
    public static void main(String[] args) {
        ColaNombres cola = new ColaNombres();
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Encolando 8 nombres:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese un nombre: ");
            String nombre = sc.nextLine();
            if (cola.encolar(nombre)) {
                System.out.println("Encolado: " + nombre);
            } else {
                System.out.println("Cola llena, no se pudo encolar.");
            }
        }
        cola.mostrarCola();

        
        System.out.println("\nDesencolando 3 nombres:");
        for (int i = 0; i < 3; i++) {
            String desencolado = cola.desencolar();
            if (desencolado != null) {
                System.out.println("Desencolado: " + desencolado);
            } else {
                System.out.println("Cola vacía, no se pudo desencolar.");
            }
        }
        cola.mostrarCola();

        
        System.out.println("\nNombre en el frente (peek): " + cola.peek());

        // Mostrar estado de la cola
        System.out.println("¿Cola vacía? " + cola.estaVacia());
        System.out.println("¿Cola llena? " + cola.estaLlena());

        sc.close();
    }
}
package Tp4;

import java.util.Scanner;

public class MainColaCaracteres {
    public static void main(String[] args) {
        ColaCaracteres cola = new ColaCaracteres();
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Encolando 5 comandos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un comando (char): ");
            char c = sc.next().charAt(0);
            cola.encolar(c);
        }
        cola.mostrarCola();

        
        System.out.println("\nDesencolando 2 comandos:");
        for (int i = 0; i < 2; i++) {
            Character desencolado = cola.desencolar();
            System.out.println("Desencolado: " + desencolado);
        }
        cola.mostrarCola();

        
        System.out.println("\nEncolando hasta llenar la cola:");
        while (!cola.estaLlena()) {
            System.out.print("Ingrese un comando (char): ");
            char c = sc.next().charAt(0);
            cola.encolar(c);
        }
        cola.mostrarCola();

        
        System.out.println("\nComando en el frente (peek): " + cola.peek());

        
        System.out.println("¿Cola vacía? " + cola.estaVacia());
        System.out.println("¿Cola llena? " + cola.estaLlena());

        sc.close();
    }
}
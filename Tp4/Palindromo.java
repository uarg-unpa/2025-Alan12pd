package Tp4;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();
        sc.close();

        Pila8 pila = new Pila8();
        Cola8 cola = new Cola8();

        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                c = Character.toLowerCase(c);
                pila.meter(c);
                cola.insertar(c);
            }
        }

        boolean esPalindromo = true;
        while (!pila.estaVacia() && !cola.estaVacia()) {
            char dePila = pila.sacar();
            char deCola = cola.borrar();

            if (dePila != deCola) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La cadena ES un palíndromo.");
        } else {
            System.out.println("La cadena NO es un palíndromo.");
        }
    }
}

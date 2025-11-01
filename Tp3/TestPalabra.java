package Tp3;

import java.util.Scanner;

public class TestPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        
        
        Palabra Palabra = new Palabra();
        
       
        for (int i = 0; i < palabra.length(); i++) {
            if (!Palabra.estaLlena()) {
                Palabra.meter(palabra.charAt(i));
            }
        }
        
        
        System.out.print("La palabra al revés es: ");
        while (!Palabra.estaVacía()) {
            System.out.print(Palabra.sacar());
        }
        System.out.println(); 
        
        scanner.close();
    }
}

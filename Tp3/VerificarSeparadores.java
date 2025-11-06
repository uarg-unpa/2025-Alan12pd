package Tp3;

import java.util.Scanner;

public class VerificarSeparadores {

    public static boolean separadoresCorrectos(String expresion) {
        Pila9 pila = new Pila9();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            
            if (c == '(' || c == '{' || c == '[') {
                pila.meter(c);
            }

            
            else if (c == ')' || c == '}' || c == ']') {
                if (pila.estaVacia()) {
                    return false; 
                }

                char apertura = pila.sacar();

                
                if ((c == ')' && apertura != '(') ||
                    (c == '}' && apertura != '{') ||
                    (c == ']' && apertura != '[')) {
                    return false; 
                }
            }
        }

        
        return pila.estaVacia();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una expresión: ");
        String expresion = sc.nextLine();

        if (separadoresCorrectos(expresion)) {
            System.out.println(" La expresión es correcta.");
        } else {
            System.out.println(" La expresión es incorrecta.");
        }
        sc.close();
    }
}
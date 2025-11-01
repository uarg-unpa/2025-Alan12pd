
package Tp3;

import java.util.Scanner;

public class TestPila {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
    System.out.print("Ingresar elemento: ");
    String Pila = Sc.nextLine();

        Pila P1 = new Pila ();

        System.out.println("Pila creada. Cantidad: " + P1.cantidad() + ", faltan: " + P1.faltan());

        
        P1.meter(5);
        P1.meter(10);

        System.out.println("Después de meter 2 elementos -> Cantidad: " + P1.cantidad() + ", faltan: " + P1.faltan());

        Sc.close();
    }
}



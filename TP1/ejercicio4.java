import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 números enteros:");
        int Nro1 = sc.nextInt();
        int Nro2 = sc.nextInt();
        int Nro3 = sc.nextInt();

        if (Nro1 > Nro2 && Nro1 > Nro3) {
            System.out.println("El número mayor es: " + Nro1);
        } else if (Nro2 > Nro1 && Nro2 > Nro3) {
            System.out.println("El número mayor es: " + Nro2);
        } else {
            System.out.println("El número mayor es: " + Nro3);
        }
        sc.close();
        }
}


import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int Num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int Num2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int Num3 = sc.nextInt();

        int producto = Num1 * Num2 * Num3;
        int suma = Num1 + Num2 + Num3;

        System.out.println("El producto es: " + producto);
        System.out.println("La suma es: " + suma);

        sc.close();
    }
}
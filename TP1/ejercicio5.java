import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un dia de la semana");
        String dia = scanner.nextLine().toUpperCase();
        switch (dia) {
            case "M":
            case "I":
            case "J":
             System.out.println("HOY TENGO RESOLUCIÓN");
                break;
            case "L":
            case "V":
            case "S":
            case "D":
                System.out.println("Hoy no tengo resolución");
                break;
            default:
                System.out.println("Día inválido");
                break;
        }

        scanner.close();
    }
}

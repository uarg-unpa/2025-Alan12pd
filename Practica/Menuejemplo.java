package Practica;

public class Menuejemplo {
    import java.util.Scanner;
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        PilaEnteros pila = new PilaEnteros();  // usamos la clase que ya tenés
        int opcion;

        do {
            System.out.println("\n--- MENU DE PILA ---");
            System.out.println("1. Meter elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Ver cantidad de elementos");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    if (!pila.estaLlena()) {
                        System.out.print("Ingrese el número a meter: ");
                        int num = sn.nextInt();
                        pila.meter(num);
                    } else {
                        System.out.println("La pila está llena.");
                    }
                    break;

                case 2:
                    if (!pila.estaVacia()) {
                        int sacado = pila.sacar();
                        System.out.println("Elemento desapilado: " + sacado);
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;

                case 3:
                    System.out.println("Cantidad actual: " + pila.getCantidad());
                    System.out.println("Faltan " + pila.getFaltantes() + " para llenarse.");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);

        sn.close();
    }
}

}

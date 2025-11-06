public class ejercicio3 {
public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;

        System.out.println("Valores iniciales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C);

          int aux = C;
          B = A;
          C = A;
          A = aux;

          System.out.println("\nValores finales:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C);
    }
  }
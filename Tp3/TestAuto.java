package Tp3;

import java.util.Scanner;

public class TestAuto {
    public static void main(String[] args) {

      Estacionamiento e = new Estacionamiento("La esquina");
      Scanner sc = new Scanner(System.in);
      char op;
      do {
         System.out.print("Ingrese: e para entrar s para sacar: ");
         String line = sc.nextLine();
         op = (line.length() > 0) ? line.charAt(0) : '\0';
         if (op == 'e') {
            System.out.print("Ingrese patente: ");
            String p = sc.nextLine();
            Auto a = new Auto(p);
            if (!e.ingresar(a))
               System.out.println("NO HAY LUGAR");
         } else if (op == 's') {
            System.out.print("Ingrese patente: ");
            String p = sc.nextLine();
            Auto aut = e.egresar(p);
            if (aut != null) {
               System.out.println("Auto afuera: " + aut.getPatente());
               System.out.println("Auto afuera: " + aut.getCont());
            } else
               System.out.println("No se encuentra el auto");
         }

      } while (op == 'e' || op == 's');
      sc.close();
   }

}

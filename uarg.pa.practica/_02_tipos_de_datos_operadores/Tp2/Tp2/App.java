package Tp2;

public class App {
         public static void main(String[] args) {
                receta receta1, receta2;
                receta1 = new receta ("tarta de manzana", 45, "media", 5);
                receta2 = new receta ("pizza casera", 90, "media", 7) ;
                System.out.println("el nombre de la receta es: " + receta1.getNombre());
                System.out.println("el tiempo de la receta es: " + receta1.getTiempo());
                System.out.println("la dificultad de la receta es: " + receta1.getDificultad());
                System.out.println("la cantidad de ingredientes de la receta es: " + receta1.getCantIngredientes());
                System.out.println(receta1.esTiempo());
                receta1.aumentarTiempo(20);
                System.out.println("el nuevo tiempo de la receta es: " + receta1.getTiempo());
                System.out.println(receta1.esTiempo());

                System.out.println("el nombre de la receta es: " + receta2.getNombre());
                System.out.println("el tiempo de la receta es: " + receta2.getTiempo());
                System.out.println("la dificultad de la receta es: " + receta2.getDificultad());
                System.out.println("la cantidad de ingredientes de la receta es: " + receta2.getCantIngredientes());
                System.out.println(receta2.esTiempo());
                receta1.aumentarTiempo(0);
                System.out.println("el nuevo tiempo de la receta es: " + receta2.getTiempo());
                System.out.println(receta2.esTiempo());
         }
}
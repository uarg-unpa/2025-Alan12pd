package Tp3;

import java.util.Scanner;

public class TestPalabra {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Palabra p=new Palabra();
        char Letra;
        char x;
        Palabra aux=new Palabra();

        System.out.println("Ingrese una palabra");
        Letra=sc.next().charAt(0);
        while(!p.estaVacía()){
            x=(char)p.sacar();
            if (!aux.estaLlena()){
                aux.meter(x);
            }

        }


    }
    
}

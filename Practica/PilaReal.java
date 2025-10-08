package Practica;

public class PilaReal {
    private double[] elementos; 
    private int cima;
    private final int MAX = 10; 

   
    public PilaReal() {
           elementos = new double[MAX];
        cima = -1;
       
    }

    public boolean estaVacía(){
    return (cima == -1);
    }
    
    
}
package Tp4;

public class Pila7 {
    final int maxpila=10;
	int [] elementos;
	int cima;
	
	public Pila7() {
		elementos = new int[maxpila];
		cima = -1;
	}
	
	public boolean estaVacia() {
		return (cima == -1);
	}
	
	public boolean estaLlena() {
		return (cima == maxpila-1);
	}
	
	public void meter(int e) {     
		   cima = cima+1;	
         elementos[cima]=e;           			
	}
	
	public int sacar() {		      
		int aux = elementos[cima];
		cima = cima - 1;    
		return aux;
	}
    public void mostrar(){
        Pila7 aux = new Pila7 ();
        int elemento;

        while (!estaVacia()){
            elemento = sacar ();
            System.out.println (elemento);
            if (!aux.estaLlena()){
                aux.meter (elemento);
            }
            while (!aux.estaVacia()){
                if (!estaLlena()){
                    meter (aux.sacar ());
                }
            }
        }
    }
}

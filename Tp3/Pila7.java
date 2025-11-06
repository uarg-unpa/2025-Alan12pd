package Tp3;

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

			public Pila copiar() {
			Pila aux = new Pila();   
			Pila copia = new Pila(); 

			
			while (!this.estaVacia()) {
				int elem = this.sacar();
				aux.meter(elem);
			}

			
			while (!aux.estaVacia()) {
				int elem = aux.sacar();
				this.meter(elem);    
				copia.meter(elem);   
			}

			return copia;
			}
	}


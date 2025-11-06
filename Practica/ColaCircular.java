package Practica;

class ColaCircular{
	private final int maxcola=10;
	private int[] elementos;
	private int frente, ultimo;
	
	public ColaCircular()
	{
		elementos = new int[maxcola];
		frente=0;
		ultimo=0;
	}
	
	public boolean estaVacia(){
		int sigultimo = siguiente(ultimo);
		if (sigultimo == frente){
			return true;
		}else{
			return false;
		}
	}
   
	public boolean estaLlena(){
		int sigultimo = siguiente(ultimo);
		return (sigultimo==frente);
	}
	
	private int siguiente(int subind){
		if (subind == maxcola -1){
			return 0;
		}else{
			return ++subind;
		}
	}
	
	public void insertar(int elem){		
		ultimo=siguiente(ultimo);
		elementos[ultimo]=elem;	
	}
	
	public int borrar(){
		frente=siguiente(frente);
		return elementos[frente];
	}
}  
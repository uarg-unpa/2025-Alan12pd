package Practica;

public class ColaInt1 {
       
   private final int maxcola=5;
   private int elementos[];
   private int ultimo;
   
   public ColaInt1() {
      elementos=new int[maxcola];
      ultimo = -1;   
   }
   
   public boolean estaVacia() {
      return (ultimo==-1);
   }
   
   public boolean estaLlena() {
      return (ultimo==maxcola-1);
   }
   
   public void insertar(int elem) {      
      if (!this.estaLlena()){
         ultimo++;
         elementos[ultimo]=elem;         
      }
   }
   
   public int borrar() {
      aux=elementos[0];
      for (int i=0; i<ultimo; i++) 
         elementos[i] = elementos[i+1];
      ultimo--;     
      return aux;
   }
   
}
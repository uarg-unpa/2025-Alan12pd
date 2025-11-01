package Tp3;

public class Pila {
    private int[] elementos; 
    private final int MAX = 10; 

    public Pila(){
        elementos = new int[MAX];
    }
    public boolean estavacia(){
        return (elementos[0]==0);
    }
    public boolean estallena(){
        return (elementos[MAX - 1]!=0);
    }
    public void meter(int elementos){
        for (int i = 0; i < MAX; i++) {
            if (this.elementos[i]==0){
                this.elementos[i]=elementos;
                break;
            }
        }
    }
    public int sacar(){
        for (int i = MAX - 1; i >= 0; i--) {
            if (this.elementos[i]!=0){
                int elem=this.elementos[i];
                this.elementos[i]=0;
                return elem;
            }
        }
        return 0;
    }
    
    public int cantidad(){
        int cnt = 0;
        for (int i = 0; i < MAX; i++){
            if (this.elementos[i] != 0) cnt++;
        }
        return cnt;
    }

    public int faltan(){
        return MAX - cantidad();
    }
    

}

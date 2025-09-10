package TP2;

public class Departamento {
        private String nombre;
       private int piso;

            public Departamento (String nombre, int piso){
            if(nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
                    }
    if (piso > 0){
    this.piso = piso;
           }
         public void setNombre (String Nombre){
         this.nombre = nombre;
      } 
      public String nombre (){
            return this.nombre;
            }
             public void setPiso (int Piso){
            this.piso = piso;
        }
            public int piso (){
             return this.piso;
         }
                                  public boolean esCompleto (){
              if(!nombre.isEmpty() && piso > 0){
                  return true;
              }else{
                  return false;
              }
              }
              public String toString (){
              return nombre + " " + piso;
    }

package TP2;

import java.util.Scanner;

public class Empleado {
    private int legajo;
    private double sueldo;
    private Departamento departamento;
    private String apellido;
    private String cargo;



    public empleado (int legajo, double sueldo, departamento departamento, string apellido, string cargo) {
        this.legajo;
        this.sueldo;
        this.departamento;
        this.apellido;
        this.cargo;
    }

        public void setlegajo (int legajo){
            this.legajo;
        }
        public void getlegajo (int legajo){
            return this.legajo;
        }
        public void setsueldo (double sueldo){
            this.sueldo;
        }
        public void getsueldo (double sueldo){
            return this.sueldo;
        }
        public void setdepartamento (String departamento){
            this.departamento;
        }
        public void getdepartamento (String departamento){
            return this.departamento;
        }
        public void setapellido (String apellido){
            this.apellido;
        }
        public void getapellido (String apellido){
            return this.apellido;
        }
        public void setcargo (String Cargo){
            this.Cargo;
        }
        public void getcargo (String cargo){
            return this.cargo
        }
        public esJefe (){
            if(this.cargo == "Jefe"){
                return true;
            } else {
            return false;
            }
             public void aumentarSueldo (double aumento){
                if(aumento > 0 ){
                this.sueldo = this.sueldo + aumento;
                }
                 public double calcularBono (double porcentaje){
                    if (porcentaje > 0){
                        return this.sueldo * (porcentaje);
                    } else{
                        return 0;
                    }
                 }
                 public String toString (); {
                    return "Empleado [legajo" + legajo +", sueldo" + sueldo + ", departamento" + departamento + ", apellido" + apellido + ", cargo" + cargo + "]"; 
                 }
             }
             public static void main (String[] args) {
                Departamento d1=new Departamento (e1, e2)
                Departamento d2=new Departamento

                  Scanner sc = new Scanner(System.in);
                  System.out.println("ingrese legajo");
                  int legajo = sc.nextInt();
                  sc.nextInt();

                   System.out.println("ingrese sueldo");
                   double sueldo = sc.nextInt();
                   sc.nextInt();

                   System.out.println("ingrese departamento");
                   Departamento departamento = sc.nextLine();
                   sc.nextLine();

                   System.out.println("ingrese apellido");
                   String apellido = sc.nextLine();
                   sc.nextLine();

                   System.out.println("ingrese cargo");
                   String cargo = sc.nextLine();
                   sc.nextLine();

                   Empleado e1= new Empleado (legajo, sueldo, departamento, apellido, cargo);
                   System.out.println()


             }





    }
}

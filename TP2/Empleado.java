package TP2;

import java.util.Scanner;

public class Empleado {
    private int legajo;
    private double sueldo;
    private Departamento departamento;
    private String apellido;
    private String cargo;

    public Empleado (int legajo, double sueldo, Departamento departamento, String apellido, String cargo){
        this.legajo=legajo;
        this.sueldo=sueldo;
        this.departamento=departamento;
        this.apellido=apellido;
        this.cargo= cargo;
    }
        public void setLegajo ( int legajo){
            this.legajo = legajo;
        }
        public int getLegajo (){
            return this.legajo;
        }
        public void setSueldo (double sueldo){
            this.sueldo = sueldo;
        }
        public double getSueldo (){
            return this.sueldo;
        }
        public void setDepartamento (Departamento departamento){
            this.departamento = departamento;
        }
        public Departamento getDepartamento (){
            return this.departamento;
        }
        public void setApellido (String apellido){
            this.apellido = apellido;
        }
        public String getApellido (){
            return this.apellido;
        }
        public void setCargo (String cargo){
            this.cargo = cargo;
        }
        public String getCargo (){
            return this.cargo;
        }

            public boolean esJefe(){
                if (this.cargo == "jefe"){
                    return true;
                }else{
                    return false;
                }
            }
                    public void aumentarSueldo (double aumento){
                        if (aumento  > 0){
                            this.sueldo= this.sueldo + aumento;
                        }
                    }
                        public double calcularBono (double porcentaje){
                            if (porcentaje > 0){
                                return this.sueldo * (porcentaje);
                            } else {
                                return 0;
                            }
                        }
                            public String toString (){
                                return "Empleado [legajo=" + legajo + ", sueldo=" + sueldo + ", departamento= " + departamento + ", apellido= " + apellido + ", cargo= " + cargo + "]";

                            }
                                public static void main (String arg[]){
                                    Departamento d1= new Departamento ("RR HH", 3);
                                    Departamento d2= new Departamento ("contabilidad", 2);
                                    
                                    Scanner sc = new Scanner (System.in);

                                    System.out.println("ingrese legajo");
                                    int legajo = sc.nextInt ();
                                    sc.nextLine();

                                    System.out.println("ingrese sueldo");
                                    double sueldo = sc.nextDouble();
                                    sc.nextLine();
                                    
                                    System.out.println("ingrese departamento");
                                    System.out.println("1 para RR HH, 2 para contabilidad");
                                    Departamento departamento;
                                    int dep = sc.nextInt();
                                    if (dep== 1){
                                        departamento = d1;
                                    } else {
                                        departamento = d2;
                                    }
                                    sc.nextLine();

                                    System.out.println("ingrese apellido");
                                    String apellido = sc.nextLine();
                                    sc.nextLine();  

                                    System.out.println("ingrese cargo");
                                    String cargo = sc.nextLine();
                                    sc.nextLine();
                                    
                                    Empleado e1= new Empleado (legajo, sueldo, departamento, apellido, cargo);
                                    System.out.println(e1);
                                    System.out.println("es jefe? " + e1.esJefe());
                                    System.out.println("ingrese aumento");
                                    double aumento = sc.nextDouble();
                                    e1.aumentarSueldo(aumento);
                                    System.out.println("su nuevo sueldo es " + e1.getSueldo());
                                    System.out.println("ingrese porcentaje de bono");
                                    double porcentaje = sc.nextDouble();
                                    System.out.println("su bono es " + e1.calcularBono(porcentaje));
                                    sc.nextLine();

                                    System.out.println("ingrese legajo");
                                    legajo = sc.nextInt ();
                                    sc.nextLine();

                                    System.out.println("ingrese sueldo");
                                    sueldo = sc.nextDouble();
                                    sc.nextLine();
                                    
                                    System.out.println("ingrese departamento");
                                    System.err.println("1 para RR HH, 2 para contabilidad");
                                    Departamento departamento2;
                                    int depto = sc.nextInt();
                                    if (depto== 1){
                                        departamento2 = d1;
                                    } else {
                                        departamento2 = d2;
                                    }
                                    sc.nextLine();

                                    System.out.println("ingrese apellido");
                                    apellido = sc.nextLine();
                                    sc.nextLine();  

                                    System.out.println("ingrese cargo");
                                    cargo = sc.nextLine();
                                    sc.nextLine();
                                    
                                    Empleado e2 = new Empleado (legajo, sueldo, departamento2, apellido, cargo);
                                    System.out.println(e2);
                                    
                                    sc.close();

                                    
                                }
    }
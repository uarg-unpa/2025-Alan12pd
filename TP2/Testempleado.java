package TP2;

import java.util.Scanner;

public class Testempleado {
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

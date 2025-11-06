package Practica;

import java.util.Scanner;

public class PruebaPersona{

 public static void main (String[] args){
  Scanner scanner = new Scanner(System.in);
  


  
  System.out.println("Ingrese los datos de la primer Persona");
  System.out.println("Ingrese el nombre completo");
  String apellido=scanner.nextLine();
  
  System.out.println("Ingrese la edad");
  int edad=scanner.nextInt();
  System.out.println("Ingrese el documento");
  int dni=scanner.nextInt();
  scanner.nextLine();
  System.out.println("Ingrese el sexo: 'M' masculino o 'F' femenino");
  char sexo=scanner.next().charAt(0);
  scanner.nextLine();
  System.out.println("Ingrese el peso");
  double peso=scanner.nextDouble();
  System.out.println("Ingrese la altura");
  double altura=scanner.nextDouble();
  scanner.nextLine();
  Persona p1 = new Persona(apellido,edad,dni,sexo,peso,altura);
  
  System.out.println("Peso ideal: 0.");
  System.out.println("Bajo peso: -1. ");
  System.out.println("Sobrepeso: 1. ");
  if(p1.calcularIMC()==1)
    System.out.print("Sobrepeso");
    else if(p1.calcularIMC()==-1)
            System.out.print("Bajopeso");
         else
         System.out.print("Peso Ideal");   
  
  
  System.out.println("Datos de la persona: ");
  System.out.println(p1.toString());

  scanner.close();
  }
  
}

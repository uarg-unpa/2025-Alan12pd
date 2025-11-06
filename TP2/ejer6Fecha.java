package TP2;

import java.util.Scanner;

public class ejer6Fecha {
    private int dia;
    private int mes;
    private int anio;

    public ejer6Fecha(int dia, int mes, int anio){
        if (esFechaValida(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            System.out.println(" Fecha inválida. Se asigna 01/01/2013");
            this.dia = 1;
            this.mes = 1;
            this.anio = 2013;
        }
    }
        public int getDia(){
        return dia;
        }
            public void setDia(int dia){
                if (esFechaValida(dia, this.mes, this.anio)) {
                this.dia = dia;
            }
        }
            public int getMes(){
                return mes;
            }
            public void setMes(int mes){
                if (esFechaValida(this.dia, mes, this.anio)) {
                this.mes = mes;
                }
            }
            public int getAnio(){
                return anio;
            }
            public void setAnio(int anio){
                if (esFechaValida(this.dia, this.mes, anio)) {
                this.anio = anio;
                }
            }
            private boolean esFechaValida(int dia, int mes, int anio) {
                if (anio < 1) return false;
                if (mes < 1 || mes > 12) return false;

                int[] diasPorMes = {0,31,28,31,30,31,30,31,31,30,31,30,31};

                
                if (dia < 1 || dia > diasPorMes[mes]) return false;

                return true; 
                }
                
                public String tosString(){
                        return "Fecha (Dia: " + dia + ", Mes: " + mes + ", año: " + anio + ")" ;
                     }
                

                     public static void main(String[] args) {
                        Scanner sn = new Scanner(System.in);
                            System.out.println("ingrese un mes del año");
                                String mes = sn.nextLine().toUpperCase();
                                    switch (mes) {
                                        case"1": 
                                        System.out.println("Enero");
                                        break;   
                                        
                                        case"2": 
                                        System.out.println("Febrero");
                                        break;

                                        case"3": 
                                        System.out.println("Marzo");
                                        break;

                                        case"4": 
                                        System.out.println("Abril");
                                        break;

                                        case"5": 
                                        System.out.println("Mayo");
                                        break;
                                        
                                        case"6": 
                                        System.out.println("Junio");
                                        break;

                                        case"7": 
                                        System.out.println("Julio");
                                        break;

                                        case"8": 
                                        System.out.println("Agosto");
                                        break;

                                        case"9": 
                                        System.out.println("Septiembre");
                                        break;

                                        case"10": 
                                        System.out.println("Octubre");
                                        break;

                                        case"11": 
                                        System.out.println("Noviembre");
                                        

                                        case"12": 
                                        System.out.println("Diciembre");
                                        break;
                                        default:
                                            System.out.println("Día inválido");
                                            break;
                                         }






                                    }
} 

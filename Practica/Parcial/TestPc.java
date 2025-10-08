package Practica.Parcial;

import java.util.Scanner;

public class TestPc{
    private String marca;
    private String procesador;
    private double precio;
    private int ram;

    public TestPc(){

    }
    public to String(){
        return "Marca: " + this.marca + ", Procesador: " + this.procesador + ", Precio: $" + this.precio + ", RAM: " + this.ram + "GB";

    }

        public void main(String[] args){
                        Scanner sn = new Scanner (System.in);
                            System.out.println("ingrese la marca de la pc");
                            String marca = sn.nextLine();
                            sn.nextLine();
                                
                                System.out.println("ingrese el procesador de la pc");
                                String procesador = sn.nextLine();
                                sn.nextLine();
                                    
                                    System.out.println("ingrese el precio de la pc");
                                    double precio = sn.nextDouble();
                                    sn.nextLine();

                                        System.out.println("ingrese la ram de la pc");
                                        int ram = sn.nextInt();
                                        sn.nextLine();

                                            Pc pc1 = new Pc("Dell", "Intel i5", 1200.0, 12);
                                            Pc pc2 = new Pc("HP", "AMD Ryzen 5", 1600.0, 16);

                                            System.out.println(pc1.mostrarInformacion());
                                            System.out.println(pc2.mostrarInformacion());

                                            pc1.actualizarRam(5);
                                            System.out.println("RAM actualizada de pc2: " + pc2.getRam() + "GB");

                                            pc2.aplicarDescuento(10);
                                            System.out.println("Precio con descuento de pc1: $" + pc1.getPrecio());

                                            int mayorRam = pc1.mayorRam(pc2);
                                            System.out.println("Mayor RAM entre pc1 y pc2: " + mayorRam + "GB");

                                            System.out.println(pc1);
                                            System.out.println(pc2);

                                            sn.close();
    
    
                                        }
                                    }

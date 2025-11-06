package Practica.Parcial;

import java.util.Scanner;

public class Pc{
    private String marca;
    private String procesador;
    private double precio;
    private int ram;

    public Pc(String marca, String procesador, double precio, int ram){
        this.marca = marca;
        this.procesador = procesador;
        this.precio = 
        this.ram = ram;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
    public double getPrecio() {
        return precio;
    }
    public void setProcesador(double precio){
        this.precio = precio;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public int actualizarRam(int ram){
        this.ram += ram;
        return this.ram;
    }
    public double aplicarDescuento(double porcentaje){
        if(porcentaje < 0 || porcentaje > 100){
            return this.precio;
        } else {
            double descuento = (porcentaje / 100) * this.precio;
            this.precio -= descuento;
            return this.precio;
            }
        }
            public String mostrarInformacion(){
                return "Marca: " + this.marca + ", Procesador: " + this.procesador + ", Precio: $" + this.precio + ", RAM: " + this.ram + "GB";
            }

                public int mayorRam(Pc p){
                    if(this.ram >= p.getRam()){
                        return this.ram;
                    } else {
                        return p.getRam();
                    }
                }
                  public void main(String[] args){

                    Pc pc1 = new Pc();
                    Pc pc2 = new Pc();
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

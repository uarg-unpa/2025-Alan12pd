package TP2;


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
                        }
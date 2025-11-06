public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private String genero;
    private double peso;
    private double altura;
    private Domicilio domicilio; 

    
    public Persona(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
        this.domicilio = new Domicilio("", 0); 
    }

    // Constructor completo
    public Persona(String nombre, int edad, String dni, String genero, double peso, double altura, Domicilio domicilio) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }

        if (edad >= 0) {
            this.edad = edad;
        }

        if (dni != null && !dni.trim().isEmpty()) {
            this.dni = dni;
        }

        if (comprobarGenero(genero)) {
            this.genero = genero;
        }

        if (peso >= 0) {
            this.peso = peso;
        }

        if (altura >= 0) {
            this.altura = altura;
        }

        this.domicilio = domicilio; 
    }

    
    public boolean esMayorDeEdad() {
        return edad >= 18; 
    }

    
     private boolean comprobarGenero(String genero) {
        if (genero.equalsIgnoreCase("Hombre")) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarGenero() {
        if (comprobarGenero(this.genero)) {
            System.out.println("Es hombre");
        } else {
            System.out.println("Es mujer");
        }
}

    
    
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + dni +
               ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + ", domicilio=" + domicilio + "]";
    }

   
    public String infoDomicilio() {
        return "Domicilio de " + nombre + ": " + domicilio + ". ¿Completo? " + domicilio.esCompleto();
    }
}
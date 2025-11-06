public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Franco", "Hernandez", 42, "42456784");
        Persona persona2 = new Persona("Felipe", "Cortez", 36, "36854987");

        System.out.println("Persona 1: " + persona1.getNombre() + " " + persona1.getApellido());
        System.out.println("Edad: " + persona1.getEdad() + " | DNI: " + persona1.getDni());
        System.out.println("¿Es mayor de edad? " + persona1.mayorDeEdad());

        System.out.println();

        System.out.println("Persona 2: " + persona2.getNombre() + " " + persona2.getApellido());
        System.out.println("Edad: " + persona2.getEdad() + " | DNI: " + persona2.getDni());
        System.out.println("¿Es mayor de edad? " + persona2.mayorDeEdad());
    }
}
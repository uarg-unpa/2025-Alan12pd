package TP2;

public class Testhora {
    public static void main(String[] args) {
        // Crear un objeto válido
        Hora h1 = new Hora(12, 30, 45);
        System.out.println("Hora 1: " + h1.mostrarHora());

        // Crear un objeto inválido
        Hora h2 = new Hora(25, 80, -5);
        System.out.println("Hora 2: " + h2.mostrarHora());

        // Cambiar valores
        h2.setHora(23);
        h2.setMinutos(59);
        h2.setSegundos(59);
        System.out.println("Hora 2 corregida: " + h2.mostrarHora());

        // Hora en minutos
        System.out.println("Hora 1 en minutos: " + h1.horaEnMinutos());
    }
}
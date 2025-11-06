package Tp3;

public class Cadena {
    private String texto;

    public Cadena(String texto) {
        this.texto = texto;
    }
    public boolean esPalindromo() {
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        Pila pila = new Pila();

        for (int i = 0; i < limpio.length(); i++) {
            pila.meter(limpio.charAt(i));
        }
        String invertido = "";
        while (!pila.estaVacia()) {
            invertido += (char)pila.sacar();
        }
        return limpio.equals(invertido);
    }
}
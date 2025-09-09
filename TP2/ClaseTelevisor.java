package TP2;

    public class ClaseTelevisor {
    private boolean encendido;
    private int canal;
    private int volumen;

    private final int VOLUMEN_MAXIMO = 100;
    private final int VOLUMEN_MINIMO = 0;
    private final int CANAL_MAXIMO = 999;
    private final int CANAL_MINIMO = 1;

    public ClaseTelevisor() {
        this.encendido = false;
        this.canal = 1; // canal por defecto
        this.volumen = 10; // volumen por defecto
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Televisor encendido.");
        } else {
            System.out.println("El televisor ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("Televisor apagado.");
        } else {
            System.out.println("El televisor ya está apagado.");
        }
    }

    public void subirVolumen() {
        if (encendido) {
            if (volumen < VOLUMEN_MAXIMO) {
                volumen++;
                System.out.println("Volumen: " + volumen);
            } else {
                System.out.println("Volumen al máximo.");
            }
        } else {
            System.out.println("Enciende el televisor primero.");
        }
    }

    public void bajarVolumen() {
        if (encendido) {
            if (volumen > VOLUMEN_MINIMO) {
                volumen--;
                System.out.println("Volumen: " + volumen);
            } else {
                System.out.println("Volumen al mínimo.");
            }
        } else {
            System.out.println("Enciende el televisor primero.");
        }
    }

    public void cambiarCanal(int nuevoCanal) {
        if (encendido) {
            if (nuevoCanal >= CANAL_MINIMO && nuevoCanal <= CANAL_MAXIMO) {
                canal = nuevoCanal;
                System.out.println("Canal cambiado a: " + canal);
            } else {
                System.out.println("Canal fuera de rango (" + CANAL_MINIMO + "-" + CANAL_MAXIMO + ").");
            }
        } else {
            System.out.println("Enciende el televisor primero.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado del Televisor:");
        System.out.println("Encendido: " + (encendido ? "Sí" : "No"));
        System.out.println("Canal actual: " + canal);
        System.out.println("Volumen actual: " + volumen);
    }
}


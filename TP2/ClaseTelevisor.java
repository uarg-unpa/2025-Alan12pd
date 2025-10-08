package TP2;

public class ClaseTelevisor {
    private static final int VOLUMEN_MINIMO = 0;
    private static final int VOLUMEN_MAXIMO = 100;
    private static final int CANAL_MINIMO = 1;
    private static final int CANAL_MAXIMO = 999;
    private boolean encendido;
    private int canal;
    private int canalAnterior;
    private int volumen;

    public ClaseTelevisor(boolean encendido, int canal, int volumen) {
        this.encendido = encendido;
        this.canal = (canal >= CANAL_MINIMO && canal <= CANAL_MAXIMO) ? canal : 1;
        this.volumen = (volumen >= VOLUMEN_MINIMO && volumen <= VOLUMEN_MAXIMO) ? volumen : 10;
        this.canalAnterior = this.canal;
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
                canalAnterior = canal; // guardamos el actual
                canal = nuevoCanal;
                System.out.println("Canal cambiado a: " + canal);
            } else {
                System.out.println("Canal fuera de rango (" + CANAL_MINIMO + "-" + CANAL_MAXIMO + ").");
            }
        } else {
            System.out.println("Enciende el televisor primero.");
        }
    }

    public void volverCanalAnterior() {
        if (encendido) {
            int temp = canal;
            canal = canalAnterior;
            canalAnterior = temp;
            System.out.println("Volviste al canal: " + canal);
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

    public boolean isEncendido() {
        return encendido;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setCanal(int canal) {
        if (canal >= CANAL_MINIMO && canal <= CANAL_MAXIMO) {
            this.canal = canal;
        }
    }

    public void setVolumen(int volumen) {
        if (volumen >= VOLUMEN_MINIMO && volumen <= VOLUMEN_MAXIMO) {
            this.volumen = volumen;
        }
    }
}
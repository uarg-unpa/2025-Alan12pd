package TP2;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    
    public Hora(int hora, int minutos, int segundos) {
        if (hora >= 0 && hora <= 23 &&
            minutos >= 0 && minutos <= 59 &&
            segundos >= 0 && segundos <= 59) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        }
    }


    public int horaEnMinutos() {
        return hora * 60 + minutos;
    }

    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
}
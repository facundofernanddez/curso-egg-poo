package Entidades;

/**
 *
 * @author Facundo
 */
public class CafeteraEntidades {
    
    private int capacidadMaxima;
    private int capacidadActual;

    public CafeteraEntidades() {
    }

    public CafeteraEntidades(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
}

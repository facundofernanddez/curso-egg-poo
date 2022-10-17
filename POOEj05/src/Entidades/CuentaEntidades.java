package Entidades;

/**
 *
 * @author Facundo
 */
public class CuentaEntidades {
    
    private int numeroCuenta;
    private int dni;
    private double saldoActual;

    public CuentaEntidades(int numeroCuenta, int dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public CuentaEntidades() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
}

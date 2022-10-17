package Servicios;

import Entidades.CuentaEntidades;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class CuentaServicios {
    
    public Scanner leer = new Scanner(System.in);
    
    public CuentaEntidades crearCuenta(){
        System.out.println("Escriba numero de cuenta");
        int numCuenta = leer.nextInt();
        
        System.out.println("Escriba su numero de dni");
        int dni = leer.nextInt();
        
        System.out.println("Escriba su saldo");
        double saldo = leer.nextInt();
        
        return new CuentaEntidades(numCuenta, dni, saldo);
    }
    
    public void ingresar(CuentaEntidades ingreso){
        System.out.println("Cuanto desea ingresar?");
        double numero = leer.nextDouble();
        double saldo = ingreso.getSaldoActual() + numero;
        
        ingreso.setSaldoActual(saldo);
        System.out.println("Su saldo ahora es de: " + ingreso.getSaldoActual());
    }
    
    public void retirar(CuentaEntidades retiro){
        System.out.println("Cuanto desea retirar?");
        double numero = leer.nextDouble();
        double saldo = retiro.getSaldoActual() - numero;
        if (saldo < 0) saldo = 0;
        
        retiro.setSaldoActual(saldo);
        System.out.println("Su saldo ahora es de: " + retiro.getSaldoActual());
    }
    
    public void extraccionRapida(CuentaEntidades dinero){
        System.out.println("Cuanto desea retirar?");
        double numero = leer.nextDouble();
        double veinte = dinero.getSaldoActual() * 0.2;
        if (numero > veinte) System.out.println("El dinero que desea retirar supera el 20%. Solo puede hacer una extraccion del 20%.");
        else dinero.setSaldoActual(dinero.getSaldoActual() - numero);
        System.out.println("Su saldo ahora es de: " + dinero.getSaldoActual());
    }
    
    public void consultarSaldo(CuentaEntidades num){
        System.out.println("El saldo disponible de su cuenta es: " + num.getSaldoActual());
    }
    
    public void consultarDatos(CuentaEntidades num){
        System.out.println("Los datos de su cuenta son: Numero de cuenta: " + num.getNumeroCuenta() + ", DNI: " + num.getDni() + ", y su saldo actual es: " + num.getSaldoActual());
    }
}

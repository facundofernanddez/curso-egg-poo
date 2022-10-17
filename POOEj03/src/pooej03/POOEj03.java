/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package pooej03;

import Entidades.Entidades_Operaciones;
import Servicios.Servicios_Operaciones;

/**
 *
 * @author Facundo
 */
public class POOEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicios_Operaciones services = new Servicios_Operaciones();
        Entidades_Operaciones opNueva = services.crearOperacion();

        int suma = services.sumar(opNueva);
        int resta = services.restar(opNueva);
        int multiplicacion = services.multiplicar(opNueva);
        int division = services.dividir(opNueva);

        System.out.println("El resultado de las distintas operacines es: suma " + suma + ", resta " + resta + ", multiplicacion " + multiplicacion + ", división " + division);
    }

}

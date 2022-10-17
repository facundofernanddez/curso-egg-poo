/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Entidades_Operaciones;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Servicios_Operaciones {
    
    Scanner leer = new Scanner(System.in);
    
    public Entidades_Operaciones crearOperacion(){
        System.out.println("Escriba el primer número");
        int numero1 = leer.nextInt();
        
        System.out.println("Escriba el segundo número");
        int numero2 = leer.nextInt();
        
        return new Entidades_Operaciones(numero1, numero2);
    }
    
    public int sumar(Entidades_Operaciones op1){
        int suma = (op1.getNumero1() + op1.getNumero2());
        
        return suma;
    }
    
    public int restar(Entidades_Operaciones op1){
        int resta = (op1.getNumero1() - op1.getNumero2());
        
        return resta;
    }
    
    public int multiplicar(Entidades_Operaciones op1){
        int mult;
        
        if (op1.getNumero1() == 0 || op1.getNumero2() == 0){
            System.out.println("No se puede realizar la multiplicación");
            mult = 0;
        } else {
            mult = op1.getNumero1() * op1.getNumero2();
        }
        
        return mult;
    }
    
    public int dividir(Entidades_Operaciones op1){
        int div;
        
        if (op1.getNumero1() == 0 || op1.getNumero2() == 0){
            System.out.println("No se puede realizar la división");
            div = 0;
        } else {
            div = op1.getNumero1() / op1.getNumero2();
        }
        
        return div;
    }
}

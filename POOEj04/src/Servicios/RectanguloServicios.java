/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.RectanguloEntidades;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class RectanguloServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public RectanguloEntidades crearRectangulo(){
        System.out.println("Escriba la longitud de base");
        int base = leer.nextInt();
        
        System.out.println("Escriba una altura");
        int altura = leer.nextInt();
        
        return new RectanguloEntidades(base, altura);
    }
    
    public int superficie(RectanguloEntidades rect){
        int sup = (rect.getBase() * rect.getAltura());
        
        return sup;
    }
    
    public int perimetro(RectanguloEntidades rect){
        int peri = (rect.getBase() + rect.getAltura()) * 2;
        
        return peri;
    }
    
    public void dibujarRectangulo (RectanguloEntidades rect){
        int base = rect.getBase();
        int altura = rect.getAltura();
        String aux = "";
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i == 0 || i == altura - 1) aux = "*"; 
                else {
                    if(j == 0 || j == base - 1) aux = "*";
                    if(j != 0 && j != base - 1) aux = " ";
                }
                System.out.print(aux);
            }
            System.out.println("");
        }
        
        
    }
    
}

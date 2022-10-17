/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = pi ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ pi ∗ radio).
 */
package pooej02;

import Entidades.Circunferencia;
import Servicios.Circunferencia_Servicios;

/**
 *
 * @author Facundo
 */
public class POOEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia_Servicios serv = new Circunferencia_Servicios();
        Circunferencia newCirc = serv.crearCircunferencia();
        
        double area_newCirc = serv.area(newCirc);
        double peri_newCirc = serv.perimetro(newCirc);
        
        System.out.println("El área de la circunferencia es " + area_newCirc + " y el perimetro es " + peri_newCirc);
    }
    
}

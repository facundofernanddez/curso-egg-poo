/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package pooej04;

import Entidades.RectanguloEntidades;
import Servicios.RectanguloServicios;

/**
 *
 * @author Facundo
 */
public class POOEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicios services = new RectanguloServicios();
        RectanguloEntidades rect1 = services.crearRectangulo();
        
        int superficie = services.superficie(rect1);
        int perimetro = services.perimetro(rect1);
        
        System.out.println("La superficie del rectangulo es: " + superficie + ", y el perímetro del rectangulo es: " + perimetro);
        
        services.dibujarRectangulo(rect1);
        
    }
    
}

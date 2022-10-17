package Servicios;

import Entidades.CafeteraEntidades;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class CafeteraServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public CafeteraEntidades crearCafetera(){
        System.out.println("Indique la capacidad total de la cafetera");
        int total = leer.nextInt();
        
        return new CafeteraEntidades(total, 0);
    }
    
    public void llenarCafetera(CafeteraEntidades cafetera){
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Se ha llenado la cafetera");
    }
    
    public void servirTaza(CafeteraEntidades cafetera){
        System.out.println("Ingrese el tamaño de la taza");
        int size = leer.nextInt();
        
        if(cafetera.getCapacidadActual() < size) {
            System.out.println("La taza no se ha llenado y ha quedado por llenar: " + (size - cafetera.getCapacidadActual()));
            cafetera.setCapacidadActual(0); 
        }
        else {
            cafetera.setCapacidadActual(cafetera.getCapacidadActual() - size);
            System.out.println("Se ha llenado la taza y queda un restante de café de: " + cafetera.getCapacidadActual());
        }
    }
    
    public void vaciarCafetera(CafeteraEntidades cafetera){
        cafetera.setCapacidadActual(0);
        System.out.println("Se ha vaciado la cafetera");
    }
    
    public void agregarCafé(CafeteraEntidades cafetera){
        System.out.println("Cuanto café quiere agregar?");
        int cantidad = leer.nextInt();
        int actual = cafetera.getCapacidadActual() + cantidad;
        
        if(cafetera.getCapacidadMaxima() < actual){
            System.out.println("No se puede agregar mas café que la capacidad máxima, solo puedes agregar hasta: " + (cafetera.getCapacidadMaxima() - cafetera.getCapacidadActual()));
        }
        else cafetera.setCapacidadActual(cafetera.getCapacidadActual() + cantidad);
    }
    
}

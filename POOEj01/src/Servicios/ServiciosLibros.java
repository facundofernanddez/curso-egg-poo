/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libros;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class ServiciosLibros {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libros crearLibro() {
        System.out.println("Ingrese numero de ISBN");
        int ISBN = leer.nextInt();
        
        System.out.println("Ingrese el titulo");
        String titulo = leer.next();
        
        System.out.println("Ingrese el autor");
        String autor = leer.next();
        
        System.out.println("Ingrese el numero de paginas");
        int numPag = leer.nextInt();
        
        return new Libros(ISBN, titulo, autor, numPag);
    }
    
    public void mostrarLibro(Libros libro1) {
        
        int a = libro1.getISBN();
        String b = libro1.getTitulo();
        String c = libro1.getAutor();
        int d = libro1.getNumPag();
        
        System.out.println("El ISBN del libro es " + a + ", el titulo es " + b + ", el autor es " + c + ", el numero de paginas es " + d);
    }
}

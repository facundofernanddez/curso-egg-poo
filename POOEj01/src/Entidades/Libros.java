/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Facundo
 */
public class Libros {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPag;

    public Libros() {
    }

    public Libros(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPag() {
        return numPag;
    }

    @Override
    public String toString() {
        return "Libros{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }
    
    
    
}

package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Libro {

    private String isbn;
    private String titulo;
    private ArrayList<Ejemplar> ejemplares = new ArrayList<>();

    public Libro(String titulo, String isbn){
        this.titulo = titulo;
        this.isbn = isbn;
    }  
    
    public void crearEjemplar(String isbn) {
        Ejemplar nuevo = new Ejemplar(isbn, this); 
        ejemplares.add(nuevo);
    }
    public String getTitulo(){
        return this.titulo;
    }

}

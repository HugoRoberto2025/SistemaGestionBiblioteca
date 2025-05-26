/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

import java.util.*;

/**
 *
 * @author juanc
 */
public class AdminLibro {
    
    /**
     * lista que usaremos para guardar los libros
     */
    List<Libro> libros = new ArrayList<>();
    
    /**
     * metodo que agrega libros la lista de libros
     * @param libro libro
     */
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    
    /**
     * metodo que genera y agrega libros a la lista
     */
    public void generarLibros(){
        //creamos los libros
        Libro libro_1 = new Libro("Cien Años De Soledad","Gabriel Garcia Marquez","1967","Colombia","Disponible");
        Libro libro_2 = new Libro("Don Quijote De La Mancha","Miguel de Cervantes","1615","España","Disponible");
        Libro libro_3 = new Libro("Crimen Y Castigo","Fiodor Dostoyevski","1866","Rusia","Disponible");
        Libro libro_4 = new Libro("Orgullo Y Prejuicio","Jane Austen","1813","Inglaterra","Disponible");
        Libro libro_5 = new Libro("El Señor De Los Anillos","J.R.R Tolkien","1955","Inglaterra","Disponible");
        Libro libro_6 = new Libro("La Sombra Del Viento","Carlos Ruiz Zafon","2001","España","Disponible");
        Libro libro_7 = new Libro("El Diario De Ana Frank","Ana Frank","1947","Paises Bajos","Disponible");
        Libro libro_8 = new Libro("Moby-Dick","Herman Melville","1851","EE.UU","Disponible");
        
        //agregamos los libros7
        agregarLibro(libro_1);
        agregarLibro(libro_2);
        agregarLibro(libro_3);
        agregarLibro(libro_4);
        agregarLibro(libro_5);
        agregarLibro(libro_6);
        agregarLibro(libro_7);
        agregarLibro(libro_8);
    }

    /**
     * metodos de acceso
     * @return lista de libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    
    
}

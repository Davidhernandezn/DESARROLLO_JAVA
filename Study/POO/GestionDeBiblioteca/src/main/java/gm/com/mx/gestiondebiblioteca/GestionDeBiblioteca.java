/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gm.com.mx.gestiondebiblioteca;

import gm.com.mx.gestiondebiblioteca.entity.Book;

/**
 *
 * @author Davidhernandezn
 * 
Ejercicio: Sistema de Gestión de Biblioteca
Descripción: Crea una pequeña aplicación para gestionar libros en una biblioteca. La aplicación debe permitir:
* 
Crear libros con un título y un autor.
Mostrar la información de los libros.
Llevar un registro del número total de libros creados.*/

public class GestionDeBiblioteca {

    public static void main(String[] args) {
    // Crear (instancia) algunos libros
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");
        
        // Mostrar información de los libros
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        
        // Mostrar el número total de libros
        System.out.println("Total number of books: " + Book.getBookCount());
    }
}

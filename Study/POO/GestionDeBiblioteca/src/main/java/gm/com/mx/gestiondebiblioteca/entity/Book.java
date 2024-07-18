/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gm.com.mx.gestiondebiblioteca.entity;

/**
 *
 * @author Davidhernandezn
 */
public class Book {
    // Atributos
    private String title;
    private String author;
    private static int bookCount = 0;

    //CONSTRUCTOR
    /*Inicializa los atributos title y author cuando se crea un nuevo objeto Book.
Incrementa bookCount en uno cada vez que se crea un nuevo libro.*/
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;
    }
    
    
    //GETTER AND SETTER
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public static void setBookCount(int bookCount) {
        Book.bookCount = bookCount;
    }
    
    
    //PARA MOSTRAR INFORMACION DEL LIBRO
    public void displayInfo(){
        System.out.println("Title: "+title+"\n Author:"+author);
    }
}

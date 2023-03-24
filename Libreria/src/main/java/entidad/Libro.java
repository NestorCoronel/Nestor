/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos:
 * ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
 * atributos pasados por parámetro y un constructor vacío. Crear un método para 
 * cargar un libro pidiendo los datos al usuario y luego informar mediante otro método 
 * el número de ISBN, el título, el autor del libro y el número de páginas.

 * @author Paty
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroDePagina;
    
    public Libro (String isbn, String titulo,String autor,int numeroDePagina) {
    this.isbn=isbn;
    this.titulo=titulo;
    this.autor=autor;
    this.numeroDePagina=numeroDePagina;
    
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePagina() {
        return numeroDePagina;
    }

    public void setNumeroDePagina(int numeroDePagina) {
        this.numeroDePagina = numeroDePagina;
    }
    
}

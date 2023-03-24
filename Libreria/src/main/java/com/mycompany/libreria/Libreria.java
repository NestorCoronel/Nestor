/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.libreria;

import entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Paty
 */
public class Libreria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese El Isbn Del libro");
        String isbn = teclado.nextLine();
        System.out.println("Ingrese El Titulo ");
        String titulo = teclado.nextLine();
        System.out.println("El Nombre del Autor");
        String autor = teclado.nextLine();
        System.out.println("Cantidad de paginas");
        int numeroDePagina = teclado.nextInt();

        Libro libro1 = new Libro(isbn,titulo,autor,numeroDePagina);
        
        System.out.println("Isbn : " +libro1.getIsbn());
        System.out.println("Titulo : " +libro1.getTitulo());
        System.out.println("Autor : " +libro1.getAutor());
        System.out.println("Numero de Paginas " +libro1.getNumeroDePagina());
              
    }
}

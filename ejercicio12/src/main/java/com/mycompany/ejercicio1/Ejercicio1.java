/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Paty
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num ;
        int num2 ;
        System.out.println("Ingrese los número a sumar ");
        num = leer.nextInt();
        num2 = leer.nextInt();
       int suma = num + num2 ;
        System.out.println("El resultado de la suma es  " + suma );
          
        System.out.println("" );
        
        System.out.println("Como te llamas " );
       String Nombre = "";
       Nombre = leer.next() ;
       System.out.println ("Hola " + Nombre ); 
       
    }
}

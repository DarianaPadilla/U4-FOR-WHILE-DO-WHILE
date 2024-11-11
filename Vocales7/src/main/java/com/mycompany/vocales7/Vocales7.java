/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vocales7;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Vocales7 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        char letra;
        
        System.out.println("Ingresa letras y te diré si son vocales o consonantes. Ingresa un espacio para salir.");
        
        while (true) {
            System.out.print("Ingresa una letra: ");
            letra = scanner.next().toLowerCase().charAt(0);
            
            if (letra == ' ') {
                System.out.println("Programa terminado.");
                
            }
            
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("Es una vocal.");
            } else if (Character.isLetter(letra)) {
                System.out.println("Es una consonante.");
            } else {
                System.out.println("No es una letra válida.");
            }       }  }}
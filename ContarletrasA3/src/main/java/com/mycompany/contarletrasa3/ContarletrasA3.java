/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarletrasa3;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class ContarletrasA3 {
//que cuente cuántas veces aparece la letra 'a' en una palabra ingresada por el usuario
    public static void main(String[] args) {
        String palabra;
        int contador=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        palabra = teclado.nextLine();
        palabra = palabra.toLowerCase();
        for (int i=0; i< palabra.length(); i++){
        if (palabra.charAt(i) == 'a') {
                contador++; // Incrementar el contador si el carácter es 'a'
            }
        }
                System.out.println("La letra 'a' aparece " + contador + " veces ");

    }
}

     
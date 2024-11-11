/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contador5;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Contador5 {

    public static void main(String[] args) {
       int contador, numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        numero = teclado.nextInt();
        
        numero = Math.abs(numero);
          contador = 0;
       
        if (numero == 0) {
            contador = 1;
        } else {
            
            while (numero > 0) {
                numero /= 10; 
                contador++;    
            }
        }
        System.out.println("El número tiene " + contador + " dígitos.");
    }}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialdeunnumero1;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class FACTORIALDEUNNUMERO1 {

    public static void main(String[] args) {
        int n;
        int factorial =1;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        n = teclado.nextInt();
        
        for (int i= 1; i<=n; i++){
            factorial = factorial *i; 
        }
         System.out.println("El resultado del factorial es: " + factorial);
    }
}

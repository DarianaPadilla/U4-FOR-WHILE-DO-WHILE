/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dowhile12;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class DOWHILE12 {

    public static void main(String[] args) {
        int numeroinicial, numerofinal, diferencia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor inicial: ");
        numeroinicial=teclado.nextInt();
        System.out.println("Ingresa el valor final: ");
        numerofinal=teclado.nextInt();
        System.out.println("Ingresa la diferencia ");
        diferencia=teclado.nextInt();
        
        do{
            System.out.println(numeroinicial);
        numeroinicial = numeroinicial + diferencia;
        } while (numeroinicial <= numerofinal);
    }
}

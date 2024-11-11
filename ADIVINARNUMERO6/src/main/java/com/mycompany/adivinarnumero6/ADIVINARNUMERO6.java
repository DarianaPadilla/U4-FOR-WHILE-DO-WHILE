/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinarnumero6;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class ADIVINARNUMERO6 {

    public static void main(String[] args) {
        int numeroAleatorio, intento;
        numeroAleatorio = (int) (Math.random() * 100) + 1;
        Scanner teclado = new Scanner(System.in);
        intento = 0;
        
        System.out.println("¡Adivina el número entre 1 y 100!");
        while (intento != numeroAleatorio) {
            System.out.print("Ingresa tu suposición: ");
            intento = teclado.nextInt();
            
            if (intento < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta nuevamente.");
            } else if (intento > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta nuevamente.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        }}}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conteodenumeros2;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class Conteodenumeros2 {

    public static void main(String[] args) {
        double cantidad;
        int numeros, contador1=0, contador2 =0, contador3 = 0;
      Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros que deseas ingresar: ");
        cantidad = teclado.nextDouble();
        //l final se debera de imprimir cuantos numeros son mayores que 0, menores que 0 e iguales a 0
        
        for (int i=1; i<=cantidad; i++){
        System.out.println("Ingresa el numero: ");
        numeros = teclado.nextInt();
        
        if (numeros>0){
        contador1 =contador1 + 1;
        }
        else if ( numeros==0){
        contador2= contador2 + 1;
        }
        else {
        contador3 = contador3 + 1;}
        }
        System.out.println(" Hay " + contador1 + " numeros mayores que 0");
        System.out.println(" Hay " + contador2 + " numeros iguales que 0");
        System.out.println(" Hay " + contador3 + " numeros menores que 0");
    }
}

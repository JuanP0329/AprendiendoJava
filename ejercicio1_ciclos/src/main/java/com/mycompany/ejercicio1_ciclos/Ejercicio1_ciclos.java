/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_ciclos;

import java.util.Scanner;

/**
 1) Hacer un programa que me imprima todos los numeros impares entre 2 numeros ingresados
 por consola
 */
public class Ejercicio1_ciclos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inicio, fin;
        int contador = 0;
        
        System.out.print("Digite el numero con el cual va a empezar el ciclo: ");
        inicio = entrada.nextInt();
        System.out.print("Digite el numero con el que va a finalizar el ciclo: ");
        fin = entrada.nextInt();
        
        for(int i = inicio;i <= fin; i++){
            if(i % 2 != 0){
                System.out.println(i);
                contador ++;    
            }
        }
        System.out.println("La cantidad de numeros impares que hay en este ciclo es: "+ contador);
    }
}

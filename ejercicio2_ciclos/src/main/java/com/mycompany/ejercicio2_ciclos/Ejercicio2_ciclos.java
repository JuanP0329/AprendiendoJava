/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_ciclos;

import java.util.Scanner;

/**
 2) Hacer un programa que imprima en consola la tabla de multiplicar(hasta n*12) de un numero
 ingresado por consola
 */
public class Ejercicio2_ciclos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, multiplicacion;
        
        System.out.print("Digite un numero: ");
        numero = entrada.nextInt();
        
        System.out.println("Tabla de multiplicar del numero: "+ numero);
        
        for(int i = 1; i <= 12; i++){
            multiplicacion = numero * i;
            
            System.out.println(numero +" x "+ i + " = "+ multiplicacion);
        }
    }
}

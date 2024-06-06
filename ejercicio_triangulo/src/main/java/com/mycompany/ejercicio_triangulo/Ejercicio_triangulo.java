/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_triangulo;

import java.util.Scanner;

/**
 1) Hacer un programa que calcule el area de un triangulo, teniendo en cuenta que la base y la altura se deben ingresar por consola.
 */
public class Ejercicio_triangulo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double base, altura, area;
        
        System.out.print("Cual es la medida de la base del triangulo: ");
        base = sc.nextDouble();
        System.out.print("Cual es la medida de la altura del triangulo: ");
        altura = sc.nextDouble();
        
        area = (base * altura) / 2;
        
        System.out.println("La base es: " + base + " cm");
        System.out.println("La altura es: " + altura + "cm");
        System.out.println("El area del triangulo es: " + area + "cm2");
        
    }
}

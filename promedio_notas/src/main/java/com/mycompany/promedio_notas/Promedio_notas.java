/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio_notas;

import java.util.Scanner;

/**
 Hacer un programa que calcule el promedio de 3 notas de un estudiante(0-5), teniendo en cuenta que
 las notas se deben ingresar por consola.
 */
public class Promedio_notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, promedio;
        
        System.out.print("Digite la primer nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite la segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite la tercer nota: ");
        nota3 = sc.nextDouble();
        
        promedio = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("su primer nota es: "+ nota1);
        System.out.println("su segunda nota es: "+ nota2);
        System.out.println("su tercer nota es: "+ nota3);
        System.out.println("su promedio es: "+ promedio);
        
    }
}

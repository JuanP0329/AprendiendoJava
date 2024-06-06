/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.permiso_entrada;

import java.util.Scanner;

/**
 Hacer un programa que determine si una persona puede entrar o no a una fiesta teniendo en cuenta 
 las siguientes condiciones.(CASA)
 
 * Entradas por consola: Edad, genero y si es o no estrangero
 
 * condiciones:
 * Si tiene menos de 18 años, no es extrangero y es hombre o mujer. NO ENTRA
 * Si tiene menos de 18 años pero mas de 16, es extrangero y es hombre. ENTRA
 * Si tiene mas de 20 años, es extrangero y es mujer. ENTRA
 * Cualquier otro caso. NO ENTRA
 */
public class Permiso_entrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte edad;
        String genero, esExtrangero;
        
        
        System.out.print("¿Cual es su genero?(Masculino/Femenino): ");
        genero = sc.nextLine();
        System.out.print("¿Es extrangero?(Si/No): ");
        esExtrangero = sc.nextLine();
        System.out.print("¿Cuantos años tienes?: ");
        edad = sc.nextByte();
        
        if(edad < 18 && esExtrangero.equals("No") && (genero.equals("Masculino") || genero.equals("Femenino"))){
            System.out.println("NO ENTRA");       
        }else if(edad < 18 && edad >= 16 && esExtrangero.equals("Si") && genero.equals("Masculino")){
            System.out.println("ENTRA");          
        }else if(edad > 20 && esExtrangero.equals("Si") && genero.equals("Femenino")){
            System.out.println("ENTRA");
        }else{
            System.out.println("NO ENTRA");
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Arreglos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Crear arreglo, recorrerlo y sacar el promedio
        int[] notas = new int[5];
        notas[0]=1;
        notas[1]=4;
        notas[2]=5;
        notas[3]=3;
        notas[4]=1;
        float promedio = 0;
        
        for(int i=0;i < 5; i++){
           promedio += notas[i];
        }
        
        System.out.println(promedio/5);
        */
        
        float[] notas = new float[5];
        int contador = 0;
        
        do{
            System.out.print("Ingrese el numero "+ (contador+1) + ": ");
            float nota = scan.nextFloat();
            if(nota <= 5 && nota >= 0){
                notas[notas.length-(5-contador)] = nota;
                contador++;
            }else{
                System.out.println("Por favor ingrese un numero valido");
            }     
        }while(contador<5);
        
        
        for(int i=0;i <5; i++){
            System.out.println("numero en la "+ (i+1) +" posicion "+ notas[i]+":");
        }
        
    }
}

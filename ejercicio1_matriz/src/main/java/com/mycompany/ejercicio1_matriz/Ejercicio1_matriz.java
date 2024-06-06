/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_matriz;

import java.util.Scanner;

/**
Crea una matriz cuadrada de n filas y n columnas(se den+be pedir por consola). rellenarlo con numeros aleatorios entre 0 - 20

A partir de la matriz anteriormente creada

- imprimir la matriz
- mostrar en consola el promedio de la amtriz
- mostrar en consola el numero mayor y la cantidad de veces que este se repite
- mostrar en consola todos los numeros impares
- mostrar en consola todos los numeros pares
- mostrar en consola la suma de las diagonales
- mostrar en consola la suma de la ultima fila
 */
public class Ejercicio1_matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa el numero de filas y columnas(Recuerda que debe ser numeros enteros positivos): ");
        int n = entrada.nextInt();
        
        if(n<= 0){
            System.out.println("Error: El tamaño de la matriz debe ser un numero entero positivo");
        }else{
            int[][] matrizAleatoria = new int[n][n];
        
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    matrizAleatoria[i][j] = (int) (Math.random()* 21);
                }
            }
            
            // 1) Imprimir la matriz
            System.out.println("Matriz");
            for(int i = 0;i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matrizAleatoria[i][j] + " ");
                }
                System.out.println("");
                }
            
            // 2) Promedio de la Matriz.
            int sumaMatriz = 0;
            int elementosTotales = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j< n; j++){
                    sumaMatriz += matrizAleatoria[i][j];
                    elementosTotales++;
                }
            }
            double promedio = (double) sumaMatriz / elementosTotales;
            System.out.println("\nEl promedio de la matriz es: " + promedio);
            
            // 3) Numero mayor y la cantidad que se repite.
            int numeroMayor = matrizAleatoria[0][0];
            int repeticionesMayor = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(matrizAleatoria[i][j] > numeroMayor){
                        numeroMayor = matrizAleatoria[i][j];
                        repeticionesMayor = 1;
                    } else if(matrizAleatoria[i][j] == numeroMayor){
                        repeticionesMayor++;
                    }
                }
            }
            System.out.println("\nEl numero mayor de la matriz es el: " + numeroMayor + " Y se repite: "+repeticionesMayor + "  veces");
            
            // 4) Numeros impares en la matriz
            System.out.println("\nNumeros Impares: ");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(matrizAleatoria[i][j] % 2 != 0){
                        System.out.println(matrizAleatoria[i][j] + " ");
                    }
                }
            }
            
            // 5) Numeros pares en la matriz
            System.out.println("\nNumeros Pares: ");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(matrizAleatoria[i][j] % 2 == 0){
                        System.out.println(matrizAleatoria[i][j]);
                    }
                }
            }
            
            // 6) Suma de las diagonales
            int sumaDiagonalPrincipal = 0;
            int sumaDiagonalInversa = 0;    
            for(int i = 0; i < n; i++){
                sumaDiagonalPrincipal += matrizAleatoria[i][i];
                sumaDiagonalInversa += matrizAleatoria[n - 1 - i][i];                
            }
            System.out.println("La suma de la diagonal principal es: " + sumaDiagonalPrincipal);
            System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa);
            
            // 7) Suma de la ultima fila
            int sumaUltimaFila = 0;
            for(int j = 0; j < n; j++){
                sumaUltimaFila += matrizAleatoria[n - 1][j];
            }
            System.out.println("La suma de la ultima fila es: " + sumaUltimaFila);
            }
       
    }
}

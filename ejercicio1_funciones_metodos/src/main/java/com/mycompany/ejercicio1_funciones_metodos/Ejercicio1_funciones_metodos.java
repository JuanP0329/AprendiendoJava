/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_funciones_metodos;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio1_funciones_metodos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa el numero de filas y columnas(Recuerda que debe ser numeros enteros positivos): ");
        int n = entrada.nextInt();
        
        if(n<= 0){
            System.out.println("Error: El tamaño de la matriz debe ser un numero entero positivo");
     
        }else{
            int[][] matrizAleatoria = generarMatrizAleatoria(n);
            
            // Imprimir la matriz
            imprimirMatriz(matrizAleatoria);

            // Promedio de la Matriz
            double promedio = calcularPromedio(matrizAleatoria);
            System.out.println("\nEl promedio de la matriz es: " + promedio);

            // Numero mayor y la cantidad que se repite
            int[] resultadoMayor = hallarNumeroMayor(matrizAleatoria);
            System.out.println("El número mayor de la matriz es el: " + resultadoMayor[0] + " y se repite: " + resultadoMayor[1] + " veces");

            // Numeros impares en la matriz
            hallarNumerosImpares(matrizAleatoria);

            // Numeros pares en la matriz
            hallarNumerosPares(matrizAleatoria);

            // Suma de las diagonales
            int[] resultadoDiagonales = calcularSumaDiagonales(matrizAleatoria);
            System.out.println("La suma de la diagonal principal es: " + resultadoDiagonales[0]);
            System.out.println("La suma de la diagonal inversa es: " + resultadoDiagonales[1]);

            // Suma de la última fila
            int sumaUltimaFila = calcularSumaUltimaFila(matrizAleatoria);
            System.out.println("La suma de la última fila es: " + sumaUltimaFila);

        }        
    }
    
    private static int[][] generarMatrizAleatoria(int n){
        int[][] matrizAleatoria = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrizAleatoria[i][j] = (int)(Math.random()*21);
            }
        }
        return matrizAleatoria; 
        
        }
    
    // 1) Metodo para Imprimir la matriz
    private static void imprimirMatriz(int[][] matriz){
        System.out.println("Matriz");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");    
            }
            System.out.println("");
        }
    }
    
    // 2) Metodo para sacar el Promedio de la Matriz.
    private static double calcularPromedio(int[][] matriz) {
        int sumaMatriz = 0;
        int elementosTotales = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaMatriz += matriz[i][j];
                elementosTotales++;
            }
        }
        
        return (double) sumaMatriz / elementosTotales;
    }
    
    // 3) Metodo para hallar el numero mayor y la cantidad de veces que se repite.
    private static int[] hallarNumeroMayor(int[][]matriz){
        int numeroMayor = matriz[0][0];
        int repeticionesMayor = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] > numeroMayor){
                    numeroMayor = matriz[i][j];
                    repeticionesMayor = 1;
                }else if(matriz[i][j] == numeroMayor){
                    repeticionesMayor++;
                }
            }
        }
        return new int[]{numeroMayor, repeticionesMayor};
    }
    
    // 4) Mertodo para hallar los numeros impares en la matriz
    private static void hallarNumerosImpares(int[][] matriz) {
        System.out.println("\nNumeros Impares: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 != 0){
                    System.out.println(matriz[i][j] + " ");
                }
            }
        }  
    }
    
    // 4) Mertodo para hallar los numeros pares en la matriz
    private static void hallarNumerosPares(int[][] matriz) {
        System.out.println("\nNumeros Pares: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0){
                    System.out.println(matriz[i][j] + " ");
                }
            }
        }  
    }
    
    // 6) Suma de las diagonales
    private static int[] calcularSumaDiagonales(int[][] matriz) {
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalInversa = 0;

        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalInversa += matriz[matriz.length - 1 - i][i];
        }

        return new int[]{sumaDiagonalPrincipal, sumaDiagonalInversa};
    }
    
    // 7) Suma de la ultima fila
    private static int calcularSumaUltimaFila(int[][] matriz) {
        int sumaUltimaFila = 0;
        for (int j = 0; j < matriz.length; j++) {
            sumaUltimaFila += matriz[matriz.length - 1][j];
        }

        return sumaUltimaFila;
    }
}

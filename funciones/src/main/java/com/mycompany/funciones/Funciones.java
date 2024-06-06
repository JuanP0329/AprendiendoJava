/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funciones;

/**
 *
 * @author HP
 */
public class Funciones {  //METODOS

    public static void main(String[] args) {
        int [][] matriz1 = new int[5][5];
        //int numero1 = 52, numero2 = 25, numero3 = 7;
        //int suma = sumar(numero1, numero2, numero3);
        //System.out.println("El promedio de los numeros es: "+ (suma/3));
        imprimirMatriz(matriz1);
        llenarMatriz(matriz1);
        imprimirMatriz(matriz1);
        
        
    }
    
    public static void llenarMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random()* 21);
                }
            }
    }
    
    public static void imprimirMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "|");
                }
            System.out.println("");
            }
    }
    
    public static int sumar(int numero1, int numero2, int numero3){
        int sumar = numero1 + numero2 + numero3;
        return sumar;  
    }
}

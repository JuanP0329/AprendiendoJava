/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrices;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Matrices {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] notasEstudiantes = new String[3][5];
        
        for(int i=0; i<3; i++){
            System.out.println("Ingres el nombre del estudiante"+ (i+1) + ":");
            notasEstudiantes[i][0] = scan.nextLine();
        }
        
        for(int i=0; i<3; i++){
            int contador = 1;
            do{
                System.out.println("Ingrese la nota "+ contador+ " del estudiante "+ notasEstudiantes[i][0] + ":");
                String nota = scan.nextLine();
                if(Float.parseFloat(nota)>= 0 && Float.parseFloat(nota)<=5){
                    notasEstudiantes[i][(notasEstudiantes[0].length)-(5-contador)] = nota;
                    contador++;
                }
                
            }while(contador<4);
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(notasEstudiantes[i][j]+ " ");
            }
            System.out.println("");
        }
        
    }
}

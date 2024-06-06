/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_parqueaderoll;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BuscarVehiculoPlaca {
    public static void buscarVehiculo(List<Vehiculo> vehiculos){
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Ingrese la placa del vehiculo que va a buscar: ");
        String placa = entrada.nextLine().toUpperCase();
        
        boolean validar = false;
        for(int i = 0; i < vehiculos.size(); i++){
            if(vehiculos.get(i).getPlaca().equals(placa)){
                validar = true;
                System.out.println("\nVehiculo con " + placa + " encontrado!!!");
                System.out.println();
                System.out.println(vehiculos.get(i));
                
            }
        }
        if(!validar){
            System.out.println("\nNo se encontro ningun vehiculo con placa: " + placa);
            
        }
        
    }
}

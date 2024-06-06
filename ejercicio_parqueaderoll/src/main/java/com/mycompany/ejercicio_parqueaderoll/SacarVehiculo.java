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
public class SacarVehiculo {
    public static void eliminarVehiculo(List<Vehiculo> vehiculos){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Placa del carro a eliminar: ");
        String placa = entrada.nextLine().toUpperCase();
        
        boolean vehiculoEncontrado = false;
        for(int i = 0; i < vehiculos.size(); i++){
            if(vehiculos.get(i).getPlaca().equalsIgnoreCase(placa)){
                vehiculos.remove(i);
                vehiculoEncontrado = true;
                break;
            }
        }
        
        if(vehiculoEncontrado){
            System.out.println("\nVehiculo " + placa + " eliminado exitosamente!.");
        }else{
            System.out.println("\nNo se encontro ningun vehiculo con placa: " + placa);
            System.out.println();
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_parqueaderoll;

import java.util.List;

/**
 *
 * @author HP
 */
public class ListaVehiculos {
    public static void imprimirListaVehiculos(List<Vehiculo> vehiculos) {
        System.out.println("\nLista de vehículos:");
        System.out.println();
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}

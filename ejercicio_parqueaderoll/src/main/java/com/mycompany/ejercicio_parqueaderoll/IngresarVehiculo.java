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
public class IngresarVehiculo {
    public static void ingresarVehiculo(List<Vehiculo> vehiculos){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar Vehiculo");

        System.out.print("Tipo de vehiculo(carro, moto, bicicleta): ");
        String tipoVehiculo = entrada.nextLine();
        
        int parqueaderosDisponibles = 0;
        if (tipoVehiculo.equalsIgnoreCase("carro")) {
            parqueaderosDisponibles = 6 - contarVehiculosPorTipo(vehiculos, "carro");
        } else if (tipoVehiculo.equalsIgnoreCase("moto")) {
            parqueaderosDisponibles = 5 - contarVehiculosPorTipo(vehiculos, "moto");
        } else if (tipoVehiculo.equalsIgnoreCase("bicicleta")) {
            parqueaderosDisponibles = 4 - contarVehiculosPorTipo(vehiculos, "bicicleta");
        }

        if (parqueaderosDisponibles == 0) {
            System.out.println("\nEl parqueadero para " + tipoVehiculo + " se encuentra lleno.");
            return;
        }

        System.out.print("Placa: ");
        String placa = entrada.nextLine().toUpperCase();
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.getPlaca().equals(placa)){
                System.out.println("\nERROR..... La placa ya existe"); 
                return;
            }
        }

        System.out.print("Fecha y Hora de ingreso: ");
        String horaEntrada = entrada.nextLine();

        Vehiculo vehiculoNuevo = new Vehiculo(tipoVehiculo, placa, horaEntrada);

        vehiculos.add(vehiculoNuevo);
        System.out.println("\nVehiculo ingresado exitosamente!.");
        System.out.println();
    }
    
    public static int contarVehiculosPorTipo(List<Vehiculo> vehiculos, String tipoVehiculo) {
        int contador = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getTipoVehiculo().equalsIgnoreCase(tipoVehiculo)) {
                contador++;
            }
        }
        return contador;
    } 
}

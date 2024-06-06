/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_parqueadero;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Parqueadero {

    public static void ingresarVehiculo(List<Vehiculo> vehiculos) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar Vehiculo");
        System.out.print("Tipo de evehiculo(Carro, Moto, Bicicleta): ");
        String tipoVehiculo = entrada.nextLine();

        int parqueaderosDisponibles = 0;
        if (tipoVehiculo.equalsIgnoreCase("carro") || tipoVehiculo.equalsIgnoreCase("Carro") || tipoVehiculo.equalsIgnoreCase("CARRO")) {
            parqueaderosDisponibles = 6 - contarVehiculosPorTipo(vehiculos, tipoVehiculo);
            
        } else if (tipoVehiculo.equalsIgnoreCase("moto") || tipoVehiculo.equalsIgnoreCase("Moto") || tipoVehiculo.equalsIgnoreCase("MOTO")) {
            parqueaderosDisponibles = 5 - contarVehiculosPorTipo(vehiculos, tipoVehiculo);
            
        } else if (tipoVehiculo.equalsIgnoreCase("bicicleta") || tipoVehiculo.equalsIgnoreCase("Bicicleta") || tipoVehiculo.equalsIgnoreCase("BICICLETA")) {
            parqueaderosDisponibles = 4 - contarVehiculosPorTipo(vehiculos, "bicicleta");
        }

        if (parqueaderosDisponibles == 0) {
            System.out.println("\nEl parqueadero para " + tipoVehiculo + " se encuentra lleno.");
            return;
        }

        System.out.print("Placa: ");
        String placa = entrada.nextLine().toUpperCase();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                System.out.println("\nERROR..... La placa ya existe");
                return;
            }
        }

        System.out.print("Fecha y Hora de ingreso: ");
        String horaEntrada = entrada.nextLine();

        Vehiculo vehiculoNuevo = null;
        if (tipoVehiculo.equalsIgnoreCase("carro") || tipoVehiculo.equalsIgnoreCase("Carro") || tipoVehiculo.equalsIgnoreCase("CARRO")) {
            System.out.print("Modelo: ");
            String modelo = entrada.nextLine();

            System.out.print("Color: ");
            String color = entrada.nextLine();

            System.out.print("Combustible: ");
            String combustible = entrada.nextLine();

            System.out.print("Numero de puertas: ");
            int numeroPuertas = entrada.nextInt();

            System.out.print("Cilindraje: ");
            int cilindraje = entrada.nextInt();

            vehiculoNuevo = new Carro(modelo, color, numeroPuertas, cilindraje, combustible, placa, horaEntrada);
        
        } else if (tipoVehiculo.equalsIgnoreCase("moto") || tipoVehiculo.equalsIgnoreCase("Moto") || tipoVehiculo.equalsIgnoreCase("MOTO")) {
            System.out.print("Modelo: ");
            String modelo = entrada.nextLine();
            
            System.out.print("Numero de llantas: ");
            int numeroLlantas = entrada.nextInt();
            
            System.out.print("Color: ");
            String color = entrada.nextLine();
            
            System.out.print("Cilindraje: ");
            int cilindraje = entrada.nextInt();
            
            System.out.print("Combustible: ");
            String combustible = entrada.nextLine();
            
            vehiculoNuevo = new Moto(modelo, numeroLlantas, color, cilindraje, combustible, placa, horaEntrada);
        
        } else if (tipoVehiculo.equalsIgnoreCase("bicicleta") || tipoVehiculo.equalsIgnoreCase("Bicicleta") || tipoVehiculo.equalsIgnoreCase("BICICLETA")) {
            System.out.print("Color: ");
            String color = entrada.nextLine();
            
            System.out.print("Marca: ");
            String marca = entrada.nextLine();
            
            System.out.print("Es electrica: ");
            boolean esElectrica = entrada.nextBoolean();
            
            vehiculoNuevo = new Bicicleta(color, marca, esElectrica, placa, horaEntrada);
        }

        if (vehiculoNuevo != null) {
            vehiculos.add(vehiculoNuevo);
            System.out.println("\nVehiculo ingresado exitosamente!.");
            System.out.println();
        } else {
            System.out.println("\nERROR, hemos presentado un problema en nuestro servicio!.");
            System.out.println();
        }
    }

    public static void eliminarVehiculo(List<Vehiculo> vehiculos) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Placa del carro a eliminar: ");
        String placa = entrada.nextLine().toUpperCase();

        boolean vehiculoEncontrado = false;
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getPlaca().equalsIgnoreCase(placa)) {
                vehiculos.remove(i);
                vehiculoEncontrado = true;
                break;
            }
        }

        if (vehiculoEncontrado) {
            System.out.println("\nVehiculo con placa " + placa + " eliminado exitosamente!.");
        } else {
            System.out.println("\nNo se encontro ningun vehiculo con placa: " + placa);
            System.out.println();
        }

    }

    public static void imprimirListaVehiculos(List<Vehiculo> vehiculos) {
        System.out.println("\nLista de vehículos:");
        System.out.println();
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    public static void buscarVehiculo(List<Vehiculo> vehiculos) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la placa del vehiculo que va a buscar: ");
        String placa = entrada.nextLine().toUpperCase();

        boolean validar = false;
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getPlaca().equals(placa)) {
                validar = true;
                System.out.println("\nVehiculo con placa " + placa + " encontrado!!!");
                System.out.println();
                System.out.println(vehiculos.get(i));

            }
        }
        if (!validar) {
            System.out.println("\nNo se encontro ningun vehiculo con placa: " + placa);

        }

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

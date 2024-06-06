/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio_parqueadero;

import com.mycompany.ejercicio_parqueadero.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_parqueadero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<>();
        int opcion;
        vehiculos.addAll(CrearVehiculo.crearVehiculosAleatorios(2));

        do {
            menuOpciones();

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    Parqueadero.ingresarVehiculo(vehiculos);
                    continue;
                case 2:
                    Parqueadero.eliminarVehiculo(vehiculos);
                    continue;
                case 3:
                    Parqueadero.imprimirListaVehiculos(vehiculos);
                    continue;
                case 4:
                    Parqueadero.buscarVehiculo(vehiculos);
                    continue;
                case 0:
                    System.out.println("Saliendo del Menu de opciones......");
                    break;
                default:
                    System.out.println("Opcion no valida. Ingrese un numero entero y valido del menu de Opciones.");
            }

        } while (opcion != 0);

    }
    
     public static void menuOpciones(){
        System.out.println("\n Menu de Opciones:");
        System.out.println("1. Ingresar vehiculo.");
        System.out.println("2. Sacar vehiculo.");
        System.out.println("3. Lista de vehiculos");
        System.out.println("4. Buscar vehiculo por placa.");
        System.out.println("0. Salir del Menu de Opciones.");
        System.out.println();
    }
    
    public static void menuOpcionesVehiculo(){
        System.out.println("\n Seleccione el Tipo de vehiculo:");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Bicicleta");
    }

}

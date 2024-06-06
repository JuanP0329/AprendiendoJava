/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_parqueaderoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio_parqueaderoll {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<>();
        int opcion;

        List<Vehiculo> vehiculosAleatorios = CrearVehiculo.crearVehiculosAleatorios(2);
        

        for(Vehiculo vehiculo : vehiculosAleatorios){
            vehiculos.add(vehiculo);   
        }
        
        do{
            MenuOpciones.menuOpciones();
            
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1:
                    IngresarVehiculo.ingresarVehiculo(vehiculos);
                    continue;
                case 2:
                    SacarVehiculo.eliminarVehiculo(vehiculos);
                    continue;
                case 3:
                    ListaVehiculos.imprimirListaVehiculos(vehiculos);
                    continue;
                case 4:
                    BuscarVehiculoPlaca.buscarVehiculo(vehiculos);
                    continue;
                case 0:
                    System.out.println("Saliendo del Menu de opciones......");
                    break;
                default:
                    System.out.println("Opcion no valida. Ingrese un numero entero y valido del menu de Opciones.");
            }
            
            
        }while(opcion!= 0);
        
    }    
}

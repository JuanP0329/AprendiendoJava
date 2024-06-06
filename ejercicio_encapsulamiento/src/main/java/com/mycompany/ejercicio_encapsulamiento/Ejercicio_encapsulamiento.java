/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_encapsulamiento;
import com.mycompany.ejercicio_encapsulamiento.Automovil;
import java.util.List;
import java.util.Random;

/**
 1) Crear la clase automovil con minimo 8 atributos y 5 metodos.
 2) Crear en otra clase, una lista de automoviles que asigne los atributos de forma aleatoria.
 
 implementar encapsulamiento al ejercicio anterior y implementar el método 
 toString para la clase vehículo.
 */
public class Ejercicio_encapsulamiento {

    public static void main(String[] args) {
        String[] marcas = {"Toyota"};
        String[] referencias = {"Hilux", "Fortuner", "Corola", "Yaris Cross", "4Runner"};
        String[] modelos = {"2020", "2021", "2022", "2023","2024"};
        String[] colores = {"Negro", "Blanco", "Gris", "Rojo", "Azul"};
        Automovil[] automoviles = new Automovil[5];
        
        crearAutomovilAleatorio(automoviles, marcas, referencias, modelos, colores);
        for(int i = 0; i < automoviles.length; i++){
            System.out.print(automoviles[i]);
            System.out.println("---------------");
        }
        
        Automovil miAutomovil = new Automovil("Hilux", "Toyota", "2024", "Gris Oscuro", "ABC456");
        
        miAutomovil.setNumeroPuertas(4);
        miAutomovil.setCilindraje(2400);
        miAutomovil.setCombustible("DIESEL");
        miAutomovil.informacionAutomovil();
        System.out.println();
        miAutomovil.acelerar();
        miAutomovil.arrancar();
        miAutomovil.frenar();
        miAutomovil.girar();
        miAutomovil.reversar();
        
        System.out.println("------");
        System.out.println(miAutomovil);
        System.out.println("----------------");
        
     
    }
    
    public static void crearAutomovilAleatorio(Automovil[] automoviles, String[] marcas, String[] referencias, String[] modelos, String[] colores){
        Random random = new Random();
        for(int i = 0; i < automoviles.length; i++){
            automoviles[i] = new Automovil(marcas[random.nextInt(marcas.length)], referencias[random.nextInt(referencias.length)], modelos[random.nextInt(modelos.length)], colores[random.nextInt(colores.length)]);
        }
    }
}

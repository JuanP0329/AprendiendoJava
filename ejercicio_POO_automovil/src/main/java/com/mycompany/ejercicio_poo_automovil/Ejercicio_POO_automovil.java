/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_poo_automovil;
import com.mycompany.ejercicio_poo_automovil.Automovil;
import java.util.List;

/**
 1) Crear la clase automovil con minimo 8 atributos y 5 metodos.
 2) Crear en otra clase, una lista de automoviles que asigne los atributos de forma aleatoria.
 * 
 */
public class Ejercicio_POO_automovil {

    public static void main(String[] args) {
        Automovil miAutomovil = new Automovil("Hilux", "Toyota", "2024", "Gris Oscuro", "ABC456", 4, 2400, "DIESEL");
        
        miAutomovil.informacionAutomovil();
        System.out.println();
        miAutomovil.acelerar();
        miAutomovil.arrancar();
        miAutomovil.frenar();
        miAutomovil.girar();
        miAutomovil.reversar();
        
        System.out.println("------");
        
        List<Automovil> automovilesAleatorios = CrearAutomovil.generarAutomovilesAleatorios(5);
        
        for(Automovil automovil : automovilesAleatorios){
            automovil.mostrarAutomovilAleatorio();
            System.out.println("---------");
        }
    }
}

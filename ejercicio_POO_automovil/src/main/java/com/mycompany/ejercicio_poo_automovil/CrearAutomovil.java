/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_poo_automovil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author HP
 */
public class CrearAutomovil {
    
    static String[] marcas = {"Toyota"};
    static String[] referencias = {"Hilux", "Fortuner", "Corola", "Yaris Cross", "4Runner"};
    static String[] modelos = {"2020", "2021", "2022", "2023","2024"};
    static String[] colores = {"Negro", "Blanco", "Gris", "Rojo", "Azul"};
    
    public static List<Automovil> generarAutomovilesAleatorios(int cantidad){
        List<Automovil> automoviles = new ArrayList<>();
        Random random = new Random();
        
        for(int i = 0; i < cantidad; i++){
            String marca = marcas[random.nextInt(marcas.length)];
            String referencia = referencias[random.nextInt(referencias.length)];
            String modelo = modelos[random.nextInt(modelos.length)];
            String color = colores[random.nextInt(colores.length)];
            
            Automovil automovil = new Automovil(marca, referencia, modelo, color);
            automoviles.add(automovil);
            
        }
        
        return automoviles;
    }
    
}

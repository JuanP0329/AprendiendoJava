/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_herenciamultinivel;
import com.mycompany.ejercicio2_herenciamultinivel.*;

/**
 *
 * @author HP
 */
public class Ejercicio2_herenciaMultinivel {

    public static void main(String[] args) {
        Avion avion = new Avion("ABC123", "2022", "Blanco-Rojo", "Airbus", "Jet A");
        System.out.println(avion);
        avion.volar();
        System.out.println("----------------");
        
        AvionComercial avionComercial = new AvionComercial("A320", 37.57f, (byte)2, 3000, 1061, 11.76f, "ABC123", "2022", "Blanco-Rojo", "Airbus", "Jet A");
        System.out.println(avionComercial);
        avionComercial.volar();
        System.out.println("----------------");
        
        AvionPasajeros avionPasajeros = new AvionPasajeros(100, 105, "Ejecutivo, Normal", "Si", "Nacionales e Internacionales", "A320", 37.57f, (byte)2, 3000, 1061, 11.76f, "ABC123", "2022", "Blanco-Rojo", "Airbus", "Jet A");
        System.out.println(avionPasajeros);
        avionPasajeros.volar();
        
        
    }
}

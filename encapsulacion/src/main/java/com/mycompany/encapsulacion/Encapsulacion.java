/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulacion;
import com.mycompany.encapsulacion.Persona;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Encapsulacion {

    public static void main(String[] args) {
        
        String[] nombres = {"Juan", "Pedro", "Ana", "Diana", "Vane"};
        String[] nacionalidades = {"Colombiana", "Español", "Argentina", "Frances", "Nigeriana"};
        boolean[] generos = {true, false};
        Persona[] personas = new Persona[5];
        crearPersonasAleatorias(personas, nombres, nacionalidades, generos);
        for(int i = 0; i < personas.length; i++){
            System.out.println(personas[i]);
            System.out.println("-----------------");
        }
            
        Persona persona1 = new Persona("Juan Juarez", "Mexicano", false);
        persona1.setEstatura(160);
        persona1.setEtnia("Indio");
        persona1.setPeso(70f);
        System.out.println(persona1);
        System.out.println("--------------");
        
    }
    
    public static void crearPersonasAleatorias(Persona[] personas, String[] nombres, String[] nacionalidades, boolean[] generos){
        Random random = new Random();
        for(int i = 0; i < personas.length; i++){
            personas[i] = new Persona(nombres[random.nextInt(nombres.length)], nacionalidades[random.nextInt(nacionalidades.length)], generos[random.nextInt(generos.length)]);
        }
    }
    
}

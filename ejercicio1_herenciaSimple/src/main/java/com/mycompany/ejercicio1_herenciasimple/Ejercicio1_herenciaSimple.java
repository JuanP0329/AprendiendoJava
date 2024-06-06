/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_herenciasimple;
import com.mycompany.ejercicio1_herenciasimple.*;

/**
 *
 * @author HP
 */
public class Ejercicio1_herenciaSimple {

    public static void main(String[] args) {
        Animal animal = new Animal("Agata", 2, "Gato", (byte)4, "carnivoro");
        System.out.println(animal);
        animal.cazar();
        System.out.println("------------");
        
        Gato gato = new Gato("Angora", "Cafe-Negro", 'M', "Grises", "Agata", 2, "Gato", (byte)4, "carnivoro");
        System.out.println(gato);
        gato.cazar();
        
        
    }
}

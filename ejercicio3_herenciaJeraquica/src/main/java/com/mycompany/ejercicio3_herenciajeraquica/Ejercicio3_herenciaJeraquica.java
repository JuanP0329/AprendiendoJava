/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3_herenciajeraquica;
import com.mycompany.ejercicio3_herenciajeraquica.*;

/**
 *
 * @author HP
 */
public class Ejercicio3_herenciaJeraquica {

    public static void main(String[] args) {
        Animal animal = new Animal("Canelo", 10, "Caballo", (byte)4, "Herbivoro");
        System.out.println(animal);
        animal.avanzar();
        System.out.println("----------------");
        
        Canario canario = new Canario("Cantor Ruso", "Amarillo", "Si", 'H', "Negros", "Toño", 1, "Canario", (byte)2, "Herbivoro");
        System.out.println(canario);
        canario.avanzar();
        System.out.println("----------------");
        
        Pez pez = new Pez("Payaso", "Naranja-Blanco-Negro", (byte)4, 'M', "Negros", "Nemo", 3, "Pez", (byte)0, "Omnivoro");
        System.out.println(pez);
        pez.avanzar();
        System.out.println("----------------");
        
        Gato gato = new Gato("Angora", "Cafe-Negro", 'M', "Grises", "Agata", 2, "Gato", (byte)4, "carnivoro");
        System.out.println(gato);
        gato.avanzar();
        System.out.println("-----------------");
    }
}

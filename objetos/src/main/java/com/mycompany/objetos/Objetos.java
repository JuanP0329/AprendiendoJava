/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objetos;
import com.mycompany.objetos.Persona;

/**
 *
 * @author HP
 */
public class Objetos {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Juarez", "Mexicano", false);
        Persona persona2 = new Persona("Fernanda Osorio", "Argentina", true);
        persona1.estatura = 160;
        persona1.etnia = "Indio";
        persona1.peso = 70f;
        persona2.estatura = 180;
        persona2.etnia = "Meztiza";
        persona2.peso = 80f;
        persona1.presentarse();
        persona2.presentarse(); 
        System.out.println("--------------");
        cambiarPeso(persona2, 75f);
        persona2.presentarse();
        
    }
    
    public static void cambiarPeso(Persona persona, float peso){
        persona.peso = peso;
    }
}

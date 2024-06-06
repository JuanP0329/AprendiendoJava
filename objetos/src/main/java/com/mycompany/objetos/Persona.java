/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

/**
 *
 * @author HP
 */
public class Persona {
    String nombre;
    String etnia;
    int estatura;
    float peso;
    String nacionalidad;
    boolean genero;
    
    public Persona(String nombre, String nacionalidad, boolean genero){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }
    
    public void presentarse(){
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi nacionalidad es: " + nacionalidad);
        System.out.println("Mi estatura es: " + estatura + " cm");
        System.out.println("Mi peso es: " + peso + " kg");
        System.out.println("Mi genero es: " + genero + ((genero)?"Femenino":"Masculino"));
        System.out.println("Mi etnia es: " + etnia);
    }
}

    

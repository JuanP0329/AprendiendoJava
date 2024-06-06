/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_herenciasimple;
import com.mycompany.ejercicio1_herenciasimple.Animal;

/**
 *
 * @author HP
 */
public class Gato extends Animal{
    
    private String raza;
    private String color;
    private char sexo;
    private String colorOjos;

    public Gato(String raza, String color, char sexo, String colorOjos, String nombre, int edad, String especie, byte numeroPatas, String orden) {
        super(nombre, edad, especie, numeroPatas, orden);
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.colorOjos = colorOjos;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public void cazar() {
        System.out.println("Estoy cazando un Raton"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    @Override
    public String toString() {
        return "Gato: \n" 
                + "Raza: " + this.raza + ".\n" 
                + "Color: " + this.color + ".\n" 
                + "Sexo: " + this.sexo + ".\n" 
                + "Color de Ojos: " + this.colorOjos + ".";
    }

    
    
    
}

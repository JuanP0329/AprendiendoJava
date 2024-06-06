/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3_herenciajeraquica;
import com.mycompany.ejercicio3_herenciajeraquica.Animal;

/**
 *
 * @author HP
 */
public class Canario extends Animal{
    private String raza;
    private String color;
    private String alas;
    private char sexo;
    private String colorOjos;

    public Canario(String raza, String color, String alas, char sexo, String colorOjos, String nombre, int edad, String especie, byte numeroPatas, String orden) {
        super(nombre, edad, especie, numeroPatas, orden);
        this.raza = raza;
        this.color = color;
        this.alas = alas;
        this.sexo = sexo;
        this.colorOjos =  colorOjos;
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

    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
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
    public void avanzar() {
        System.out.println("Yo me desplazo en el aire con mis alas."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    @Override
    public String toString() {
        return "Canario: \n" 
                + "Raza: " + this.raza + ".\n"
                + "Color: " + this.color + ".\n"
                + "Alas: " + this.alas + ".\n"
                + "Sexo: " + this.sexo + ".\n"
                + "Color de Ojos: " + this.colorOjos + ".\n"
                + "Especie: " + super.getEspecie() + ".";
    }
    
    
    
    
}

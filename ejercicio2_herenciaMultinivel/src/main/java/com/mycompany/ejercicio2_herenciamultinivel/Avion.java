/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_herenciamultinivel;

/**
 *
 * @author HP
 */
public class Avion {
    private String matricula;
    private String modelo;
    private String color;
    private String fabricante;
    private String combustible;

    public Avion(String matricula, String modelo, String color, String fabricante, String combustible) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.fabricante = fabricante;
        this.combustible = combustible;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
    public void volar(){
        System.out.println("El avion esta volando.");
    }

    @Override
    public String toString() {
        return "Avion: \n"
                + "Matricula: " + this.matricula + ".\n" 
                + "Modelo: " + this.modelo + ".\n" 
                + "Color: " + this.color + ".\n" 
                + "Fabricante: " + this.fabricante + ".\n" 
                + "Combustible: " + this.combustible + ".";
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3_herenciajeraquica;

/**
 *
 * @author HP
 */
public class Animal {
    private String nombre;
    private int edad;
    private String especie;
    private byte numeroPatas;
    private String orden;

    public Animal(String nombre, int edad, String especie, byte numeroPatas, String orden) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.numeroPatas = numeroPatas;
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public byte getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(byte numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }
    
    public void avanzar(){
        System.out.println("Yo me desplazo en tierra con mis 4 patas.");
    }

    @Override
    public String toString() {
        return "Animal: \n" 
                + "Nombre: " + this.nombre + ".\n"
                + "Edad: " + this.edad + ".\n"
                + "Especie: " + this.especie + ".\n"
                + "Numero de Patas: " + this.numeroPatas + ".\n"
                + "Orden: " + this.orden + ".";
    }
    
    
    
}

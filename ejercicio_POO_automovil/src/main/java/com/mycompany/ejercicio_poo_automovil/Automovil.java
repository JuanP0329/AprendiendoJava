/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_poo_automovil;

/**
 *
 * @author HP
 */
public class Automovil {
    String referencia;
    String marca;
    String modelo;
    String color;
    String placa;
    int numeroPuertas;
    int cilindraje;
    String combustible;
    
    public Automovil(String referencia, String marca, String modelo, String color, String placa, int numeroPuertas, int cilindraje, String combustible){
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.numeroPuertas = numeroPuertas;
        this.cilindraje = cilindraje;
        this.combustible = combustible;
    }
    
    public Automovil(String marca, String referencia, String modelo, String color){
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
        this. color = color;
        
    }
    
    
    public void mostrarAutomovilAleatorio(){
        System.out.println("Ficha Automovil Aleatorio");
        System.out.println("Marca: " + marca);
        System.out.println("Referencia: " + referencia);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
    }
    
    
    public void informacionAutomovil(){
        System.out.println("Ficha del Automovil");
        System.out.println("Referencia: " + referencia);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Placa: " + placa);
        System.out.println("Numero de puertas: "+ numeroPuertas);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Combustible: " + combustible);
    }
    
    public void acelerar(){
        System.out.println("El automovil: " + marca + " " + referencia + " " + modelo + " esta acelerando.");
    }
    
    public void arrancar(){
       System.out.println("El automovil: " + marca + " " + referencia + " " + modelo + " esta arrancando."); 
    }
    
    public void frenar(){
       System.out.println("El automovil: " + marca + " " + referencia + " " + modelo + " esta frenando."); 
    }
    
    public void girar(){
        System.out.println("El automovil: " + marca + " " + referencia + " " + modelo + " esta girando a la derecha.");
    }
    
    public void reversar(){
        System.out.println("El automovil: " + marca + " " + referencia + " " + modelo + " va a reversar");
    }
    
}



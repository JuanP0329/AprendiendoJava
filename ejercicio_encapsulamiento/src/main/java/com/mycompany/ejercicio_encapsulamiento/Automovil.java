/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_encapsulamiento;

/**
 *
 * @author HP
 */
public class Automovil {
    private String referencia;
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private int numeroPuertas;
    private int cilindraje;
    private String combustible;
    
    public Automovil(String referencia, String marca, String modelo, String color, String placa){
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
    }
    
    public Automovil(String marca, String referencia, String modelo, String color){       
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
        this.color = color;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
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

    @Override
    public String toString() {
        return "La referencia es: " + this.referencia + ".\n" 
                + "La marca es: " + this.marca + ".\n"
                + "El Modelo es: " + this.modelo + ".\n"
                + "El color es: " + this.color + ".\n"
                + "La placa es: " + this.placa + ".\n"
                + "El numero de puertas es: " + this.numeroPuertas + ".\n"
                + "El cilindraje es: " + this.cilindraje + ".\n"
                + "El combustible es: " + this.combustible + ".\n";
    }
    
    
    
    
}

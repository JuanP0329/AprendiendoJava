/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author HP
 */
public class Carro extends Vehiculo{
    private String combustible;
    private short numeroPuertas;
    private String modelo;

    public Carro(String combustible, short numeroPuertas, String modelo, String marca, int cilindraje, short capacidadPasajeros) {
        super(marca, capacidadPasajeros, cilindraje);
        this.combustible = combustible;
        this.numeroPuertas = numeroPuertas;
        this.modelo = modelo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public short getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(short numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

    @Override
    public String toString() {
        return "Carro{" + "combustible=" + combustible + ", numeroPuertas=" + numeroPuertas + ", modelo=" + modelo + '}';
    }
    
    
    
    
    
    
}

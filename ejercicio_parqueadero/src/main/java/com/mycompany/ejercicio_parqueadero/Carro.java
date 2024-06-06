/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_parqueadero;

/**
 *
 * @author HP
 */
public class Carro extends Vehiculo{
    private String modelo;
    private String color;
    private int numeroPuertas;
    private int cilindraje;
    private String combustible;
    
    public Carro(String modelo, String color, int numeroPuertas, int cilindraje,String combustible, String placa, String horaIngreso) {
        super(placa, horaIngreso);
        this.modelo = modelo;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.cilindraje = cilindraje;
        this.combustible = combustible;
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

    @Override
    public String toString() {
        return super.toString()
                + "Modelo: " + this.modelo + ".\n"
                + "Color: " + this.color + ".\n"
                + "Numero de Puertas: " + this.numeroPuertas + ".\n"
                + "Cilindraje: " + this.cilindraje + ".\n"
                + "Combustible: " + this.combustible + ".\n";
    }

    @Override
    public String getTipoVehiculo() {
        return "Carro";
    }
    
    
}

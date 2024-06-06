/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_parqueadero;

/**
 *
 * @author HP
 */
public class Moto extends Vehiculo{
    private String modelo;
    private int numeroLlantas;
    private String color;
    private int cilindraje;
    private String combustible;

    public Moto(String modelo, int numeroLlantas, String color, int cilindraje, String combustible, String placa, String horaIngreso) {
        super(placa, horaIngreso);
        this.modelo = modelo;
        this.numeroLlantas = numeroLlantas;
        this.color = color;
        this.cilindraje = cilindraje;
        this.combustible = combustible;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                + "Numero de llantas: " + this.numeroLlantas + ".\n"
                + "Color: " + this.color + ".\n"
                + "Cilindraje: " + this.cilindraje + ".\n"
                + "Combustible: " + this.combustible + ".\n";
    }

    @Override
    public String getTipoVehiculo() {
        return "Moto";
    }
    
}

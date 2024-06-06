/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_parqueadero;

/**
 *
 * @author HP
 */
public class Bicicleta extends Vehiculo{
    private String color;
    private String marca;
    private boolean esElectrica;

    public Bicicleta(String color, String marca, boolean esElectrica, String placa, String horaIngreso) {
        super(placa, horaIngreso);
        this.color = color;
        this.marca = marca;
        this.esElectrica = esElectrica;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Color: " + this.color + ".\n"
                + "Marca: " + this.marca + ".\n"
                + "Es Electrica: " + this.esElectrica + ".\n";
    }

    @Override
    public String getTipoVehiculo() {
        return "Bicicleta";
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author HP
 */
public class Vehiculo {
    private String marca;
    private String placa;
    private String tipoMotor;
    private String color;
    private short velMaxima;
    private int cilindraje;
    private short capacidadPasajeros;

    public Vehiculo(String marca, short capacidadPasajeros, int cilindraje) {
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(short velMaxima) {
        this.velMaxima = velMaxima;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public short getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(short capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
    public void estacionar(Vehiculo vehiculo){
        if(vehiculo instanceof Moto){
            System.out.println("Estacionando moto.");
        }else if(vehiculo instanceof Carro){
            System.out.println("Estacionando un carro.");
        }else if(vehiculo instanceof Camion){
            System.out.println("Estacionando un camion");
        }else if(vehiculo instanceof Vehiculo){
            System.out.println("Estacionando vehiculo");
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", placa=" + placa + ", tipoMotor=" + tipoMotor + ", color=" + color + ", velMaxima=" + velMaxima + ", cilindraje=" + cilindraje + ", capacidadPasajeros=" + capacidadPasajeros + '}';
    }
    
    
    
}

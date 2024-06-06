/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author HP
 */
public class Camion extends Vehiculo{
    private int capacidadCarga;
    private short capacidadCombustible;
    private short numeroEjes;

    public Camion(int capacidadCarga, short capacidadCombustible, short numeroEjes, String marca, int cilindraje, short capacidadPasajeros) {
        super(marca, capacidadPasajeros, cilindraje);
        this.capacidadCarga = capacidadCarga;
        this.capacidadCombustible = capacidadCombustible;
        this.numeroEjes = numeroEjes;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public short getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(short capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public short getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(short numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "Camion{" + "capacidadCarga=" + capacidadCarga + ", capacidadCombustible=" + capacidadCombustible + ", numeroEjes=" + numeroEjes + '}';
    }
    
    
    
}

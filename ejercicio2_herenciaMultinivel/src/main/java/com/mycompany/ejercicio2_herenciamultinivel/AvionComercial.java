/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_herenciamultinivel;
import com.mycompany.ejercicio2_herenciamultinivel.Avion;

/**
 *
 * @author HP
 */
public class AvionComercial extends Avion{
    private String referencia;
    private float longitud;
    private byte numeroMotores;
    private int alcance;
    private int velocidadMaxima;
    private float alturaMaxima;

    public AvionComercial(String referencia, float longitud, byte numeroMotores, int alcance, int velocidadMaxima, float alturaMaxima, String matricula, String modelo, String color, String fabricante, String combustible) {
        super(matricula, modelo, color, fabricante, combustible);
        
        this.referencia = referencia;
        this.longitud = longitud;
        this.numeroMotores = numeroMotores;
        this.alcance = alcance;
        this.velocidadMaxima = velocidadMaxima;
        this.alturaMaxima = alturaMaxima;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public byte getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(byte numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public float getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(float alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public void volar() {
        System.out.println("Soy un avion comercial y en este momento me encuentro volando"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    @Override
    public String toString() {
        return "Avion Comercial: \n" 
                + "Referencia: " + this.referencia + ".\n" 
                + "Longitud: " + this.longitud + " metros.\n" 
                + "Numero de Motores: " + this.numeroMotores + ".\n" 
                + "Alcance: " + this.alcance + " millas nauticas.\n" 
                + "Velocidad Maxima: " + this.velocidadMaxima + "km/h.\n" 
                + "Altura Maxima:" + this.alturaMaxima + " metros.";
    }
    
    
    
}

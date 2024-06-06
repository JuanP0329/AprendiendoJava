/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_herenciamultinivel;
import com.mycompany.ejercicio2_herenciamultinivel.AvionComercial;

/**
 *
 * @author HP
 */
public class AvionPasajeros extends AvionComercial{
    private int cantidadPasajeros;
    private int cantidadAsientos;
    private String clasificaciones;
    private String servicioComidas;
    private String tipoVuelos;

    public AvionPasajeros(int cantidadPasajeros, int cantidadAsientos, String clasificaciones, String servicioComidas, String tipoVuelos, String referencia, float longitud, byte numeroMotores, int alcance, int velocidadMaxima, float alturaMaxima, String matricula, String modelo, String color, String fabricante, String combustible) {
        super(referencia, longitud, numeroMotores, alcance, velocidadMaxima, alturaMaxima, matricula, modelo, color, fabricante, combustible);
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadAsientos = cantidadAsientos;
        this.clasificaciones = clasificaciones;
        this.servicioComidas = servicioComidas;
        this.tipoVuelos = tipoVuelos;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(String clasificaciones) {
        this.clasificaciones = clasificaciones;
    }

    public String getServicioComidas() {
        return servicioComidas;
    }

    public void setServicioComidas(String servicioComidas) {
        this.servicioComidas = servicioComidas;
    }

    public String getTipoVuelos() {
        return tipoVuelos;
    }

    public void setTipoVuelos(String tipoVuelos) {
        this.tipoVuelos = tipoVuelos;
    }
    
    

    @Override
    public void volar() {
        System.out.println("Este avion comercial de pasajeros se encuentra volando con " +this.cantidadPasajeros + " pasajeros abordo."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    @Override
    public String toString() {
        return "Avion Pasajeros: \n" 
                + "Cantidad de Pasajeros: " + this.cantidadPasajeros + ".\n" 
                + "Cantidad de Asientos: " + this.cantidadAsientos + ".\n" 
                + "Clasificaciones: " + this.clasificaciones + ".\n" 
                + "Servicio de Comidas: " + this.servicioComidas + ".\n" 
                + "Tipo de vuelo: " + this.tipoVuelos + ".";
    }
       
}

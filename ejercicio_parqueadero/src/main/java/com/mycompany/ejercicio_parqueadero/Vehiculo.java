/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_parqueadero;

/**
 *
 * @author HP
 */
public abstract class Vehiculo {
    private String placa;
    private String horaIngreso;
    
    public Vehiculo(String placa, String horaIngreso) {
        this.placa = placa;
        this.horaIngreso = horaIngreso;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }
    
    public abstract String getTipoVehiculo();

    @Override
    public String toString() {
        return "Vehiculo: \n" 
                + "Tipo de vehiculo: " + this.getTipoVehiculo() + ".\n"
                + "Placa: " + placa + ".\n"
                + "Hora de Ingreso: " + horaIngreso + ".\n";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_parqueaderoll;

/**
 *
 * @author HP
 */
public class Vehiculo {
    private String tipoVehiculo;
    private String placa;
    private String horaIngreso;

    public Vehiculo(String tipoVehiculo, String placa, String horaIngreso) {
        this.tipoVehiculo = tipoVehiculo;
        this.placa = placa;
        this.horaIngreso = horaIngreso;
    }
    
    public Vehiculo(String placa){
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
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

    @Override
    public String toString() {
        return "Vehiculo: \n" 
                + "Tipo de vehiculo: " + tipoVehiculo + ".\n"
                + "Placa: " + placa + ".\n"
                + "Hora de Ingreso: " + horaIngreso + ".\n";
    }
}

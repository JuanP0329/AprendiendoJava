/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author HP
 */
public class Moto extends Vehiculo{
    private short numeroCilindros;
    private String tipoSuspencion;
    private boolean tieneABS;

    public Moto(short numeroCilindros, String tipoSuspencion, boolean tieneABS, String marca, int cilindraje, short capacidadPasajeros) {
        super(marca, capacidadPasajeros, cilindraje);
        this.numeroCilindros = numeroCilindros;
        this.tipoSuspencion = tipoSuspencion;
        this.tieneABS = tieneABS;
    }

    public short getNumeroCilindros() {
        return numeroCilindros;
    }

    public void setNumeroCilindros(short numeroCilindros) {
        this.numeroCilindros = numeroCilindros;
    }

    public String getTipoSuspencion() {
        return tipoSuspencion;
    }

    public void setTipoSuspencion(String tipoSuspencion) {
        this.tipoSuspencion = tipoSuspencion;
    }

    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    @Override
    public String toString() {
        return "Moto{" + "numeroCilindros=" + numeroCilindros + ", tipoSuspencion=" + tipoSuspencion + ", tieneABS=" + tieneABS + '}';
    }
    
    
    
}

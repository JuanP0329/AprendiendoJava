/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;
import com.mycompany.herencia.*;

/**

 */
public class Ingeniero extends Empleado {

    public Ingeniero(String tipo, int tarjetaProfesional, boolean tieneComputador, String areaTrabajo, int codigoEmpleado, String cargo, int salario, String nombre, String numeroDocumento, byte edad, char genero, String telefono) {
        super(areaTrabajo, codigoEmpleado, cargo, salario, nombre, numeroDocumento, edad, genero, telefono);
        this.tipo = tipo;
        this.tarjetaProfesional = tarjetaProfesional;
        this.tieneComputador = tieneComputador;
    }
    
    private String tipo;
    private int tarjetaProfesional;
    private boolean tieneComputador;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(int tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public boolean isTieneComputador() {
        return tieneComputador;
    }

    public void setTieneComputador(boolean tieneComputador) {
        this.tieneComputador = tieneComputador;
    }

    @Override
    public void caminar() {
        System.out.println("Los ingenieros no caminamos"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "Ingeniero{" + "tipo=" + tipo + ", tarjetaProfesional=" + tarjetaProfesional + ", tieneComputador=" + tieneComputador + '}';
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;
import com.mycompany.herencia.Persona;

/**
 *
 * @author HP
 */
public class Empleado extends Persona {
    
    String areaTrabajo;
    int codigoEmpleado;
    String cargo;
    int salario;

    public Empleado(String areaTrabajo, int codigoEmpleado, String cargo, int salario, String nombre, String numeroDocumento, byte edad, char genero, String telefono) {
        super(nombre, numeroDocumento, edad, genero, telefono);
        this.areaTrabajo = areaTrabajo;
        this.codigoEmpleado = codigoEmpleado;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void trabajar(){
        System.out.println("Estoy trabajando");
    }

    @Override
    public void caminar() {
        System.out.println("Estoy caminando al trabajo"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
       

    @Override
    public String toString() {
        return "Empleado{" + "areaTrabajo=" + areaTrabajo + ", codigoEmpleado=" + codigoEmpleado + ", cargo=" + cargo + ", salario=" + salario + '}';
    }
    
    
    
    
    
}

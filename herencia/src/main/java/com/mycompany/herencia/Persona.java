/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author HP
 */
public class Persona {
    private String nombre;
    private String numeroDocumento;
    private byte edad;
    private char genero;
    private String telefono;

    public Persona(String nombre, String numeroDocumento, byte edad, char genero, String telefono) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.genero = genero;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void caminar(){
        System.out.println("Estoy caminando");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", numeroDocumento= " + numeroDocumento + ", edad= " + edad + ", genero= " + genero + ", telefono= " + telefono + '}';
    }
    
    
}

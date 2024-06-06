/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulacion;

/**
 *
 * @author HP
 */
public class Persona {
    private String nombre;
    private String etnia;
    private int estatura;
    private float peso;
    private String nacionalidad;
    private boolean genero;
    
    public Persona(String nombre, String nacionalidad, boolean genero){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }
    
    public void presentarse(){
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi nacionalidad es: " + nacionalidad);
        System.out.println("Mi estatura es: " + estatura + " cm");
        System.out.println("Mi peso es: " + peso + " kg");
        System.out.println("Mi genero es: " + ((genero)?"Femenino":"Masculino"));
        System.out.println("Mi etnia es: " + etnia);
    }

    @Override
    public String toString() {
        return "Mi nombre es: " + this.nombre + ".\n" 
                + "Mi nacionalidad es: " + this.nacionalidad + ".\n"
                + "Mi estatura es: " + this.estatura + " cm.\n"
                + "Mi peso es: " + this.peso + " kg.\n"
                + "Mi genero es: " + ((this.genero)?"Femenino":"Masculino") + ".\n"
                + "Mi etnia es: " + this.etnia + ".\n";
    }
    
    
    
}

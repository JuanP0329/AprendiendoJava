/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;
import com.mycompany.herencia.*;

/**
 *
 * @author HP
 */
public class Herencia {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan Benjumea", "545422123", (byte)28, 'M', "325879452");
        System.out.println(persona);
        persona.caminar();
        System.out.println("--------------");
        Empleado empleado = new Empleado("Contabilidad", 1, "Contador", 3000000,"Juan Benjumea", "545422123", (byte)28, 'M', "325879452");
        System.out.println(empleado);
        empleado.caminar();
        System.out.println("--------------");
        Ingeniero ingeniero = new Ingeniero("Desarrollador Backend", 1234568, true, "Ingenieria", 1, "Ingeniero", 3000000,"Juan Benjumea", "545422123", (byte)28, 'M', "325879452");
        System.out.println(ingeniero);
        ingeniero.caminar();
    }
}

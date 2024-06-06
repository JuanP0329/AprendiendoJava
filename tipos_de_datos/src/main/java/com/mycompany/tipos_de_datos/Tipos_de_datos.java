/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tipos_de_datos;

/**
 *
 * @author HP
 */
public class Tipos_de_datos {

    public static void main(String[] args) {
        String nombre = "Juan";
        String tipoDatoNombre = ((Object)nombre).getClass().getSimpleName();
        
        byte diasSemana = 7;
        String tipoDatoDiasSemana = ((Object)diasSemana).getClass().getSimpleName();
                
        short capacidadEstadioEnvigado = 11000;
        String tipoDatoCapacidadEstadio = ((Object)capacidadEstadioEnvigado).getClass().getSimpleName();
                
        int poblacion = 1000000;
        String tipoDatoPoblacion =((Object)poblacion).getClass().getSimpleName();
                
        long celular = 3204596875L;
        String tipoDatoCelular = ((Object)celular).getClass().getSimpleName();
                
        double pi = 3.141592;
        String tipoDatoPi = ((Object)pi).getClass().getSimpleName();
                
        float flotante = 10.3f;
        String tipoDatoFlotante = ((Object)flotante).getClass().getSimpleName();
                
        char inicialNombre = 'J'; 
        String tipoDatoInicialNombre = ((Object)inicialNombre).getClass().getSimpleName();
                
        boolean esMayor = true;
        String tipoDatoEsMayor = ((Object)esMayor).getClass().getSimpleName();
        
        System.out.println("nombre es un tipo de dato: "+ tipoDatoNombre);
        System.out.println("diasSemana es un tipo de dato: "+ tipoDatoDiasSemana);
        System.out.println("capacidadEstadioEnvigado es un tipo de dato: "+ tipoDatoCapacidadEstadio);
        System.out.println("poblacion es un tipo de dato: "+ tipoDatoPoblacion);
        System.out.println("celular es un tipo de dato: "+ tipoDatoCelular);
        System.out.println("pi es un tipo de dato: "+ tipoDatoPi);
        System.out.println("flotante es un tipo de dato: "+ tipoDatoFlotante);
        System.out.println("inicialNombre es un tipo de dato: "+ tipoDatoInicialNombre);
        System.out.println("esMayor es un tipo de dato: "+ tipoDatoEsMayor);
        
        
       
    }
}

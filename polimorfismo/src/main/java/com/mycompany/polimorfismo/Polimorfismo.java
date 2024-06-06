/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;
import com.mycompany.polimorfismo.*;

/**
 *
 * @author HP
 */
public class Polimorfismo {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("boeing", (short)100, 10000);
        Carro carro = new Carro("gasolina", (short)4, "2022", "Renault", 2000, (short)5);
        Camion camion = new Camion(2000, (short)80, (short)3, "Mercedez", 7000, (short)3);
        Moto moto = new Moto((short)3, "Invertida", true, "Kawasaki", 1000, (short)2);
        
        vehiculo.estacionar(vehiculo);
        vehiculo.estacionar(carro);
        vehiculo.estacionar(camion);
        vehiculo.estacionar(moto);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_parqueadero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 *
 * @author HP
 */
public class CrearVehiculo {

    static String[] carros = {"carro"};
    static String[] motos = {"moto"};
    static String[] bicicletas = {"bicicleta"};
    static String[] placas = {"ABC123", "RTY258", "ASG875", "HGJ296", "QAZ469", "MLO138", "DHK528", "TUI763", "THL147", "RIL882"};
    static String[] horaEntradas = {"2023-04-23 11:20", "2023-04-23 9:32", "2023-04-23 8:00", "2023-04-23 12:40", "2023-04-23 10:17", "2023-04-23 11:02", "2023-04-23 11:20"};

    public static List<Vehiculo> crearVehiculosAleatorios(int cantidad) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        Random random = new Random();
        HashSet<String> placasUsadas = new HashSet<>();

        for (int i = 0; i < cantidad; i++) {
            String placa;
            do {
                placa = placas[random.nextInt(placas.length)];
            } while (placasUsadas.contains(placa));

            String horaEntrada = horaEntradas[random.nextInt(horaEntradas.length)];

            Vehiculo carro = new Carro(
                    "Chevrolet",
                    "Rojo",
                    4,
                    1600,
                    "Gasolina",
                    placa,
                    horaEntrada
            );
            vehiculos.add(carro);
            placasUsadas.add(placa);

        }

        for (int i = 0; i < cantidad; i++) {
            String placa;
            do {
                placa = placas[random.nextInt(placas.length)];
            } while (placasUsadas.contains(placa));

            String horaEntrada = horaEntradas[random.nextInt(horaEntradas.length)];

            Vehiculo moto = new Moto(
                    "2012",
                    2,
                    "Rojo",
                    125,
                    "Gasolina",
                    placa,
                    horaEntrada
            );
            vehiculos.add(moto);
            placasUsadas.add(placa);

        }

        for (int i = 0; i < cantidad; i++) {
            String placa;
            do {
                placa = placas[random.nextInt(placas.length)];
            } while (placasUsadas.contains(placa));

            String horaEntrada = horaEntradas[random.nextInt(horaEntradas.length)];

            Vehiculo bicileta = new Bicicleta(
                    "Verde",
                    "GW",
                    true,
                    placa,
                    horaEntrada
            );
            vehiculos.add(bicileta);
            placasUsadas.add(placa);

        }

        return vehiculos;
    }

}

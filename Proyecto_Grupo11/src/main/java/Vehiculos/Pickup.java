/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Leonardo
 */
public class Pickup extends Vehiculo {

    //public Pickup() {}

    public Pickup(String codigo, String marca, String modelo,
                  String color, int anioFabricacion, double precioBase) {

        super(codigo, marca, modelo, color, anioFabricacion,
              "Pick-up", precioBase,EstadoVehiculo.DISPONIBLE);
    }
}

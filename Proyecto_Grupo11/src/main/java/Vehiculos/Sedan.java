/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Leonardo
 */
public class Sedan extends Vehiculo {

    public Sedan(String codigo, String marca, String modelo,
                 String color, int anioFabricacion, double precioBase) {

        super(codigo, marca, modelo, color, anioFabricacion,
              "Sedán", precioBase,EstadoVehiculo.DISPONIBLE);
    }
}
// La parte "Diponible" ya no es texto sino que esta conectanda al enum,
// asi se podra manejar si esta disponible de verdad o no por el administrador

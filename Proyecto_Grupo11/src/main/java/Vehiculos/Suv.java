/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Leonardo
 */
public class Suv extends Vehiculo {


    public Suv(String codigo, String marca, String modelo,
               String color, int anioFabricacion, double precioBase) {

        super(codigo, marca, modelo, color, anioFabricacion,
              "SUV", precioBase,EstadoVehiculo.DISPONIBLE);
    }
}//Disponible ya que el vehiculo cuando ingresa por el adminsitrador 
//siempre estara disponible en primera instancia
//Ahora ya no se enviaria un texto de disponible sino el objeto de EstadoVehiculo por el constructor SUV

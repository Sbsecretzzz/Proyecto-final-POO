/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;
import Interfaz.Impresion;
import Vehiculos.EstadoVehiculo;
/**
 *
 * @author Leonardo
 */
//Se creo una clase abstracta que sirve como molde para los vehiculos registrados
public abstract class Vehiculo implements Impresion{
    private String codigo;
    private String marca;
    private String modelo;
    private String color;
    private int anioFabricacion;
    private String tipo;
    private double precioBase;
    //private String estado;
    private EstadoVehiculo estado;

    public Vehiculo(String codigo, String marca, String modelo, String color, int anioFabricacion, String tipo, double precioBase, EstadoVehiculo estado) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anioFabricacion = anioFabricacion;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }
    // Se coloco los get and set del import de EstadoVehiculo
     //Interfaz
    @Override
    public String generarImpresion(){
        return "VEHÍCULO: " + marca + " " + modelo + " (" + anioFabricacion + ") - " + estado + " - S/ " + precioBase;
    }
    
}

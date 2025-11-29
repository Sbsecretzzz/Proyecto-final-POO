package Ventas;

import Personas.Cliente;
import Personas.Vendedor;
import Vehiculos.Vehiculo;

public abstract class Comprobante {

    private String numero;
    private String fechaHora;   // texto
    private Cliente cliente;
    private Vendedor vendedor;
    private Vehiculo vehiculo;

    private double precioBase;
    private double descuento;
    private double totalPagado;

    public Comprobante() {
    }

    public Comprobante(String numero, Venta venta) {
        this.numero = numero;
        this.fechaHora = venta.getFechaHora();
        this.cliente = venta.getCliente();
        this.vendedor = venta.getVendedor();
        this.vehiculo = venta.getVehiculo();
        this.precioBase = venta.getTotalVenta();
        this.descuento = venta.getCotizacion().getDescuento();
        this.totalPagado = venta.getTotalPagado();
    }

    public abstract String generarDetalle();

    // Getters y setters

    public String getNumero() {
        return numero;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }
}

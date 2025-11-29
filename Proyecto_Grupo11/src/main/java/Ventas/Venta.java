package Ventas;

import Interfaz.Impresion;
import Personas.Cliente;
import Personas.Vendedor;
import Vehiculos.Vehiculo;
import Vehiculos.EstadoVehiculo;
import Pagos.Pago;

import java.util.ArrayList;
import java.util.List;

public class Venta implements Impresion{

    private String codigoVenta;
    private Cotizacion cotizacion;
    private Cliente cliente;
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private String fechaHora;       // fecha y hora en texto (ej: "2025-11-16 15:30")

    private double totalVenta;
    private double totalPagado;
    private double saldoPendiente;

    private List<Pago> listaPagos;

    public Venta() {
        listaPagos = new ArrayList<>();
    }

    public Venta(String codigoVenta, Cotizacion cotizacion, String fechaHora) {
        this();
        this.codigoVenta = codigoVenta;
        this.cotizacion = cotizacion;
        this.cliente = cotizacion.getCliente();
        this.vendedor = cotizacion.getVendedor();
        this.vehiculo = cotizacion.getVehiculo();
        this.totalVenta = cotizacion.getTotal();
        this.totalPagado = 0;
        this.saldoPendiente = totalVenta;
        this.fechaHora = fechaHora;
        marcarVehiculoVendido();
    }

    public void registrarPago(Pago pago) {
        if (pago != null) {
            listaPagos.add(pago);
            totalPagado += pago.getMonto();
            actualizarSaldo();
        }
    }

    public void actualizarSaldo() {
        saldoPendiente = totalVenta - totalPagado;
        if (saldoPendiente < 0) {
            saldoPendiente = 0;
        }
    }

    public boolean estaPagada() {
        return saldoPendiente <= 0;
    }

    private void marcarVehiculoVendido() {
        if (vehiculo != null) {
            vehiculo.setEstado(EstadoVehiculo.VENDIDO);
        }
    }

    // Getters y setters

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
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

    public String getFechaHora() {
        return fechaHora;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public double getSaldoPendiente() {
        return saldoPendiente;
    }

    public List<Pago> getListaPagos() {
        return listaPagos;
    }
    //Interfaz
    @Override
    public String generarImpresion() {
        return "VENTA " + codigoVenta + " | Fecha: " + fechaHora + " | Monto: " + cotizacion.getTotal();
    }
    
    
}

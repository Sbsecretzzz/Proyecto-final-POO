package Pagos;

import java.time.LocalDate;
import Ventas.Venta;

public abstract class Pago {
    
    private String codigoPago;       // Identificador único
    private double monto;            // Monto abonado
    private String metodo;           // EFECTIVO, TARJETA, TRANSFERENCIA
    
    private Venta venta;             // A qué venta pertenece

    public Pago(String codigoPago, double monto, String metodo,
                 Venta venta) {
        this.codigoPago = codigoPago;
        this.monto = monto;
        this.metodo = metodo;
        
        this.venta = venta;
    }

    // Getters y setters
    public String getCodigoPago() {
        return codigoPago;
    }

    public void setCodigoPago(String codigoPago) {
        this.codigoPago = codigoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }


    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
}

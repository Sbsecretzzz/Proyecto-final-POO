package Pagos;

import Ventas.Venta;

public class PagoEfectivo extends Pago {

    private double montoRecibido;   
    private double vuelto;          

    public PagoEfectivo(String codigoPago, double monto, String metodo, Venta venta, double montoRecibido) {
        super(codigoPago, monto, metodo, venta);
        this.montoRecibido = montoRecibido;
        calcularVuelto();
    }

    private void calcularVuelto() {
        if (montoRecibido >= getMonto()) {
            this.vuelto = montoRecibido - getMonto();
        } else {
            this.vuelto = 0; 
        }
    }   

    public double getMontoRecibido() {
        return montoRecibido;
    }

    public void setMontoRecibido(double montoRecibido) {
        this.montoRecibido = montoRecibido;
        calcularVuelto();
    }

    public double getVuelto() {
        return vuelto;
    }
}

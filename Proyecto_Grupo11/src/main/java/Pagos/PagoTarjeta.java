/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

import Ventas.Venta;

public class PagoTarjeta extends Pago {

    private String numeroTarjeta;
    private String tipoTarjeta; // VISA, MASTERCARD, etc.

    public PagoTarjeta(String codigoPago, double monto,
                       Venta venta, String numeroTarjeta, String tipoTarjeta) {
        super(codigoPago, monto, "TARJETA",  venta);
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    
}

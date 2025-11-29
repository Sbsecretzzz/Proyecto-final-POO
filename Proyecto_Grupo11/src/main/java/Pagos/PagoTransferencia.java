/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

import Ventas.Venta;

/**
 *
 * @author Leonardo
 */
public class PagoTransferencia extends Pago{
    private String banco;
    private String numeroOperacion;

    public PagoTransferencia(String banco, String numeroOperacion, String codigoPago, double monto, String metodo, Venta venta) {
        super(codigoPago, monto, metodo, venta);
        this.banco = banco;
        this.numeroOperacion = numeroOperacion;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(String numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }
    
    
}

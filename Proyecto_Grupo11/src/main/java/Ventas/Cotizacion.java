package Ventas;

import Personas.Cliente;
import Personas.Vendedor;
import Promociones.Promocion;
import Vehiculos.Vehiculo;
import Vehiculos.EstadoVehiculo;
import Ventas.EstadoCotizacion;
public class Cotizacion {

    private String codigo;
    private Cliente cliente;
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private Promocion promocion;  // puede ser null
    //Falta algregar fecha

    private double precioBase;
    private double descuento;
    private double total;
    private EstadoCotizacion estado;  // "PENDIENTE", "APROBADA", "RECHAZADA"


    public Cotizacion(String codigo, Cliente cliente, Vendedor vendedor,
                      Vehiculo vehiculo, Promocion promocion) {
        if(vehiculo.getEstado()!= EstadoVehiculo.DISPONIBLE){ // En caso no se encuentra autos
            System.out.println("ERROR : Autos no disponibles para la cotizacion");
        }
        this.codigo = codigo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.promocion = promocion;
        this.estado = EstadoCotizacion.PENDIENTE;
        calcularTotal();
    }

    public void calcularTotal() {
        if (vehiculo != null) {
            precioBase = vehiculo.getPrecioBase();
        } else {
            this.precioBase = 0;
        }

        if (promocion != null && promocion.estaVigente()) {
            descuento = promocion.calcularDescuento(precioBase);
        } else {
            descuento = 0;
        }

        this.total = precioBase - descuento;
        if (this.total < 0) {
            this.total = 0;
        }
    }

    public void aprobar() {
        this.estado = EstadoCotizacion.APROBADO;
    }

    public void rechazar() {
        this.estado = EstadoCotizacion.RECHAZADO;
    }

    // Getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return total;
    }

    public EstadoCotizacion getEstado() {
        return estado;
    }
//Para usar solo el setter se utiliza el void
    public void setEstado(EstadoCotizacion estado ) {
        this.estado = estado;
    }

    
    
    
}

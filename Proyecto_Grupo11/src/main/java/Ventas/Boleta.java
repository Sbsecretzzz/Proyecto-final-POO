package Ventas;

public class Boleta extends Comprobante {

    public Boleta(String numero, Venta venta) {
        super(numero, venta);
    }

    @Override
    public String generarDetalle() {
        String texto = "";
        texto += "BOLETA N°: " + getNumero() + "\n";
        texto += "Fecha y hora: " + getFechaHora() + "\n\n";
        texto += "Cliente: " + getCliente().getNombres() + " " 
                           + getCliente().getApellidoPaterno() + "\n";
        texto += "Vendedor: " + getVendedor().getNombres() + " " 
                            + getVendedor().getApellidoPaterno() + "\n\n";
        texto += "Vehículo: " + getVehiculo().getMarca() + " " 
                              + getVehiculo().getModelo() + "\n";
        texto += "Precio base: " + getPrecioBase() + "\n";
        texto += "Descuento: " + getDescuento() + "\n";
        texto += "Total pagado: " + getTotalPagado() + "\n";
        return texto;
    }
}

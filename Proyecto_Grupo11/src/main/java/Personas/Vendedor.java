package Personas;

import Promociones.Promocion;
import Vehiculos.Vehiculo;
import Ventas.Cotizacion;
import Vehiculos.EstadoVehiculo;

public class Vendedor extends Empleado {

    public Vendedor(String dni, String nombres, String apellidoPaterno,
                    String apellidoMaterno, String direccion, String telefono,
                    String correo, String usuario, String contrasena) {

        
        super(dni, nombres, apellidoPaterno, apellidoMaterno, direccion,
              telefono, correo, usuario, contrasena, "VENDEDOR");
    }

    
    public Cotizacion crearCotizacion(Cliente cliente,
                                      Vehiculo vehiculo,
                                      Promocion promocion) {

        
        if (vehiculo == null) {
            throw new IllegalArgumentException("Debe seleccionar un vehículo.");
        }

        if (vehiculo.getEstado() != EstadoVehiculo.DISPONIBLE) {
            throw new IllegalArgumentException("El vehículo no está disponible para cotizar.");
        }

       
        String codigo = generarCodigoCotizacion();

        
        Cotizacion cotizacion = new Cotizacion(codigo, cliente, this, vehiculo, promocion);

        
        return cotizacion;
    }

    
    private String generarCodigoCotizacion() {
        return "COT-" + System.currentTimeMillis();
    }
}

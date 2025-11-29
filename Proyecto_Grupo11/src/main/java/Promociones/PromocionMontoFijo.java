package Promociones;

public class PromocionMontoFijo extends Promocion {

    public PromocionMontoFijo(String nombre, double monto,
                              String fechaInicio, String fechaFin) {

        super(nombre, TipoPromocion.MONTO_FIJO, monto,
              fechaInicio, fechaFin);
    }

    @Override
    public double calcularDescuento(double precioBase) {
        return Math.min(getValor(), precioBase);
    }
    
    
}

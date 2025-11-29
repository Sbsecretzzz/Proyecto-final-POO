package Promociones;

public class PromocionPorcentaje extends Promocion {

    public PromocionPorcentaje(String nombre, double porcentaje,
                               String fechaInicio, String fechaFin) {

        super(nombre, TipoPromocion.PORCENTAJE, porcentaje,
              fechaInicio, fechaFin);
    }

    @Override
    public double calcularDescuento(double precioBase) {
        return precioBase * (getValor() / 100.0);
    }
}

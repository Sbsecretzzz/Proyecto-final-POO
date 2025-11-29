package Promociones;

public abstract class Promocion {

    private String nombre;
    private TipoPromocion tipo;
    private double valor;           
    private String fechaInicio;    
    private String fechaFin;        

    public Promocion() {}

    public Promocion(String nombre, TipoPromocion tipo, double valor,
                     String fechaInicio, String fechaFin) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    
    public boolean estaVigente() {
        return true;  
    }

    
    public abstract double calcularDescuento(double precioBase);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPromocion getTipo() {
        return tipo;
    }

    public void setTipo(TipoPromocion tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    
}

package Personas;

public class Cliente extends Persona {

    private int cantidadCompras;

//Para la clase cliente se agrego telefono y correo    
    public Cliente(String dni, String nombres, String apellidoPaterno,
                   String apellidoMaterno, String direccion,
                   String telefono, String correo) {

        super(dni, nombres, apellidoPaterno, apellidoMaterno, direccion,
              telefono, correo);

        this.cantidadCompras = 0;
    }

    public void incrementarCompras() {
        cantidadCompras++;
    }

    public boolean esFrecuente() {
        return cantidadCompras >= 3;
    }

    public int getCantidadCompras() {
        return cantidadCompras;
    }

    public void setCantidadCompras(int cantidadCompras) {
        this.cantidadCompras = cantidadCompras;
    }

    
}

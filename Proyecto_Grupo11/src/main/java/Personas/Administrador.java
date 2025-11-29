package Personas;

public class Administrador extends Empleado {

    

    public Administrador(String dni, String nombres, String apellidoPaterno,
                         String apellidoMaterno, String direccion,
                         String telefono, String correo,
                         String usuario, String contrasena) {

        super(dni, nombres, apellidoPaterno, apellidoMaterno, direccion,
              telefono, correo, usuario, contrasena, "ADMINISTRADOR");
    }

}

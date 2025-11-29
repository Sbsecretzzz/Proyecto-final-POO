package Personas;

public  class Empleado extends Persona {

    private String usuario;
    private String contrasena;
    private String rol; 

    
//Para la clase empleado , se agrego un extra que es su usuario , constraseña y rol
    //Tener en cuenta que esta en abstracta y no en clase normal (HIja)
    public Empleado(String dni, String nombres, String apellidoPaterno,
                    String apellidoMaterno, String direccion, String telefono,
                    String correo, String usuario, String contrasena,
                    String rol) {

        super(dni, nombres, apellidoPaterno, apellidoMaterno, direccion,
              telefono, correo);

        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
    
  
    public boolean esAdministrador() {
        return "ADMINISTRADOR".equalsIgnoreCase(rol);
    }

    public boolean esVendedor() {
        return "VENDEDOR".equalsIgnoreCase(rol);
    }

   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import Personas.*;
import Vehiculos.*;
import Ventas.*;
import Promociones.*;
/**
 *
 * @author sebas
 */
public class GestionReportes1 {
    //Arreglos fijos para maximo 100 casillas
    private static Vehiculo[] listaVehiculos = new Vehiculo[200];
    private static Empleado[] listaEmpleados = new Empleado[25];
    private static Cliente[] listaClientes = new Cliente[150];
    private static Venta[] listaVentas = new Venta[1000];
    private static Cotizacion[] listaCotizaciones = new Cotizacion[100];
    private static Promocion[] listaPromociones = new Promocion[30];
    
    //Arreglos vacios
    private static int contVehiculos = 0;
    private static int contEmpleados = 0;
    private static int contClientes = 0;
    private static int contVentas = 0;
    private static int contCotizaciones = 0;
    private static int contPromociones = 0;
    
    //Metodos para buscar al empleado , modificar y eleminar que hara el vendedor en el clinete
    public static Empleado buscarEmpleado(String usuario, String contrasena) {
        // OJO AQUÍ: El bucle va desde 0 hasta 'contEmpleados' (NO hasta el final)
        for (int i = 0; i < contEmpleados; i++) {
            if (listaEmpleados[i].getUsuario().equals(usuario) && 
                listaEmpleados[i].getContrasena().equals(contrasena)) {
                return listaEmpleados[i]; // Encontrado
            }
        }
        return null; // No encontrado
    }
    //Eliminar clinete
    public static boolean eliminarCliente(String dni){
        int espacio = -1; //Para encontrar la posicion
        for(int i=0; i < contClientes;i++){
            if(listaClientes[i].getDni().equals(dni)){
                espacio=i;
                break;
            }
        }
        if(espacio == -1) return false; //En caso de no encontrarse
        //Mueve los elementos para eliminar el espacio vacio que hay y disminuye el contador de clientes en 1
        for(int i = espacio;i<contClientes-1;i++){
            listaClientes[i]=listaClientes[i+1];
        }
        listaClientes[contClientes -1]=null;
        contClientes--;
        return true;
    }
    
    //Para el administrador promociones para modifcar o eliminar
    public static Promocion BuscarPromo(String nombrePromocion){
        for(int i=0;i<contPromociones ; i++){
            if(listaPromociones[i].getNombre().equalsIgnoreCase(nombrePromocion)){// Se registra sin importar las mayusculas ni minusculas
                return listaPromociones[i];
            }
        }
        return null;
    }
    //Para eliminar Promocion
    public static boolean eliminarPromo(String nombrePromocion){
        int espacio =-1;
        for(int i = 0; i < contPromociones; i++) {
            if (listaPromociones[i].getNombre().equalsIgnoreCase(nombrePromocion)) {
                espacio = i;
                break;
            }
        }
        if (espacio == -1) return false;
        
        for (int i = espacio; i < contPromociones - 1; i++) {
            listaPromociones[i] = listaPromociones[i + 1];
        }
        listaPromociones[contPromociones - 1] = null;
        contPromociones--;    
        return true;
    }
    
    

    
    //Metodos para agregar vehiculos , empleados , clientes , ventas , promociones,cotizaciones,pagos
    //Luego se colocara que controla cada uno del admin o vendedor
    public static void agregarEmpleado(Empleado empleado) {
        if (contEmpleados < listaEmpleados.length) {
            listaEmpleados[contEmpleados] = empleado; // Se guarda  en la posición actual
            contEmpleados++; // Aumenta el contador de numeros de empleados, asi es con los otros
        }
    }
    public static void agregarVehiculos(Vehiculo carro) {
        if (contVehiculos < listaVehiculos.length) {
            listaVehiculos[contVehiculos] = carro; 
            contVehiculos++; 
        }
    }
    public static void agregarClientes(Cliente persona) {
        if (contClientes < listaClientes.length) {
            listaClientes[contClientes] = persona; 
            contClientes++; // 
        }
    }
    public static void agregarVentas(Venta ventas) {
        if (contVentas < listaVentas.length) {
            listaVentas[contVentas] = ventas; 
            contVentas++; 
        }
    }
    public static void agregarPromociones(Promocion promo) {
        if (contPromociones < listaPromociones.length) {
            listaPromociones[contPromociones] = promo; 
            contPromociones++; 
        }
    }
    
    public static void agregarCotizaciones(Cotizacion coti) {
        if (contCotizaciones < listaCotizaciones.length) {
            listaCotizaciones[contCotizaciones] = coti; 
            contCotizaciones++; 
        }
    }
    
    //Solo gettes ya que los mantendra guardados , los sett los reemplazaria afectando el sistema

    public static Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }

    public static Empleado[] getListaEmpleados() {
        return listaEmpleados;
    }

    public static Cliente[] getListaClientes() {
        return listaClientes;
    }

    public static Venta[] getListaVentas() {
        return listaVentas;
    }

    public static Cotizacion[] getListaCotizaciones() {
        return listaCotizaciones;
    }

    public static Promocion[] getListaPromociones() {
        return listaPromociones;
    }

    public static int getContVehiculos() {
        return contVehiculos;
    }

    public static int getContEmpleados() {
        return contEmpleados;
    }

    public static int getContClientes() {
        return contClientes;
    }

    public static int getContVentas() {
        return contVentas;
    }

    public static int getContCotizaciones() {
        return contCotizaciones;
    }

    public static int getContPromociones() {
        return contPromociones;
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.daoAlumnos;

/**
 *
 * @author halld
 */
public class clsClientes {
  private String codigo_cliente;
    private String nombre_cliente;
    private String direccion_cliente;
    private String telefono_cliente;
    private String codigo_vendedor;
    private String estatus_cliente;
    
    public clsClientes(){
    }
    
    public clsClientes(String codigo_cliente){
        this.codigo_cliente = codigo_cliente;
    }    
    
    public clsClientes(String nombre_cliente, String direccion_cliente, String telefono_cliente ,String codigo_vendedor ,String estatus_cliente) {
        this.nombre_cliente = nombre_cliente;
        this.direccion_cliente= direccion_cliente;
        this.telefono_cliente = telefono_cliente;
        this.codigo_vendedor = codigo_vendedor;
        this.estatus_cliente = estatus_cliente;
    }
        

    public String getnombre_cliente() {
        return nombre_cliente;
    }

    public void setnombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getdireccion_cliente() {
        return direccion_cliente;
    }

    public void setdireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String gettelefono_cliente() {
        return telefono_cliente;
    }

    public void settelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }
    
    public String getcodigo_vendedor() {
        return codigo_vendedor;
    }

    public void setcodigo_vendedor(String codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }
    
    public String getestatus_cliente() {
        return estatus_cliente;
    }

    public void setestatus_cliente(String estatus_cliente) {
        this.estatus_cliente = estatus_cliente;
 
    }
    
    @Override
    public String toString() {
        return "clsAlumnos{" + "nombre_cliente=" + nombre_cliente + ", direccion_cliente=" + direccion_cliente + ", telefono_cliente=" + telefono_cliente + ", codigo_vendedor=" + codigo_vendedor + ", estatus_cliente=" + estatus_cliente  +  '}';
    }
    //Metodos de acceso a la capa controlador
    public clsClientes getBuscarInformacionAlumnoPorNombre(clsClientes cliente)
    {
        daoAlumnos daoalumnos = new daoAlumnos();
        return daoalumnos.consultaAlumnoPorNombre(cliente);
    }
    public clsClientes getBuscarInformacionAlumnoPorcarnet(clsClientes cliente)
    {
        daoAlumnos daoalumnos = new daoAlumnos();
        return daoAlumnos.consultaAlumnoPorNombre(cliente);
    }    
    public List<clsClientes> getListadoAlumno()
    {
        daoAlumnos daoalumnos = new daoAlumnos();
        List<clsClientes> listadoAlumnos = daoalumnos.consultaAlumnos();
        return listadoAlumnos;
    }
    public int setBorrarAlumno(clsClientes cliente)
    {
        daoAlumnos daoalumnos = new daoAlumnos();
        return daoalumnos.borrarAlumno(cliente);
    }          
    public int setIngresarAlumno(clsClientes cliente)
    {
        daoClientes daoclientes = new daoclientes();
        return daoClientes.ingresaAlumno(cliente);
    }              
    public int setModificarAlumno(clsClientes cliente)
    {
        daoClientes daoclientes = new daoclientes();
        return daoClientes.actualizaAlumno(cliente);
    }              
}   
    
}

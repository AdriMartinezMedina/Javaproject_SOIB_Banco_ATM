/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClasses;

import java.sql.Date;

/**
 *
 * @author Youssef
 */
public class Cliente {

    private int id;
    private String nombre;
    private String apellidos;
    private Date f_nacimiento;
    private String dni;
    private String direccion;
    private String poblacion;
    private String usuario;
    private String contrasena;
    private String f_cr;

    public Cliente(int id, String nombre, String apellidos, Date f_nacimiento, String dni, String direccion, String poblacion, String usuario, String contrasena, String f_cr) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.f_nacimiento = f_nacimiento;
        this.dni = dni;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.f_cr = f_cr;
    }

    public Cliente() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(Date f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
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

    public String getF_cr() {
        return f_cr;
    }

    public void setF_cr(String f_cr) {
        this.f_cr = f_cr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", f_nacimiento=" + f_nacimiento + ", dni=" + dni + ", direccion=" + direccion + ", poblacion=" + poblacion + ", usuario=" + usuario + ", contrasena=" + contrasena + ", f_cr=" + f_cr + '}';
    }
    
    

}

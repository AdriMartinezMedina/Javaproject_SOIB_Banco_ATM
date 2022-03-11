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

    /**
     * Metodo que regresa el nombre del cliente
     *
     * @return Regresa el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente
     *
     * @param nombre nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa los apellidos del cliente
     *
     * @return Regresa los apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del cliente
     *
     * @param apellidos apellidos del cliente
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Metodo que regresa fecha de nacimiento del cliente
     *
     * @return Regresa fecha de nacimiento
     */
    public Date getF_nacimiento() {
        return f_nacimiento;
    }

    /**
     * Establece fecha de nacimiento del cliente
     *
     * @param f_nacimiento fecha de nacimiento del cliente
     */
    public void setF_nacimiento(Date f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    /**
     * Metodo que regresa DNI del cliente
     *
     * @return Regresa DNI del cliente
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece DNI del cliente
     *
     * @param dni DNI del cliente
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Metodo que regresa la dirección del cliente
     *
     * @return Regresa dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece Dirección del cliente
     *
     * @param direccion Dirección del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo que regresa la población del cliente
     *
     * @return Regresa población del cliente
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * Establece Población del cliente
     *
     * @param poblacion Población del cliente
     */
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    /**
     * Metodo que regresa el usuario del cliente
     *
     * @return Regresa usuario del cliente
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece usuario del cliente
     *
     * @param usuario usuario del cliente
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Metodo que regresa la contraseña del cliente
     *
     * @return Regresa la contraseña del cliente
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Establece contraseña encriptada del cliente
     *
     * @param contrasena contraseña del cliente
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Metodo que regresa la fecha de creación del cliente
     *
     * @return Regresa la fecha de creación del usuario del cliente
     */
    public String getF_cr() {
        return f_cr;
    }

    /**
     * Establece fecha de creación del cliente
     *
     * @param f_cr fecha de creación del cliente
     */
    public void setF_cr(String f_cr) {
        this.f_cr = f_cr;
    }

    /**
     * Metodo que regresa el ID del cliente
     *
     * @return Regresa el ID del cliente
     */
    public int getId() {
        return id;
    }

    /**
     * Establece ID del cliente
     *
     * @param id ID del cliente
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", f_nacimiento=" + f_nacimiento + ", dni=" + dni + ", direccion=" + direccion + ", poblacion=" + poblacion + ", usuario=" + usuario + ", contrasena=" + contrasena + ", f_cr=" + f_cr + '}';
    }

}

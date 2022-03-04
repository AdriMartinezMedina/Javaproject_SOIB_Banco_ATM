/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClasses;

/**
 *
 * @author Youssef
 */
class Transaccion {

    private int id;
    private boolean tipo_transaccion; //false = ingresar dinero, true = sacar dinero
    private double cantidad_transaccion;
    private int id_tarjeta;
    private int id_cuenta_corriente;
    private int id_cliente;

    public Transaccion(int id, boolean tipo_transaccion, double cantidad_transaccion, int id_tarjeta, int id_cuenta_corriente, int id_cliente) {
        this.id = id;
        this.tipo_transaccion = tipo_transaccion;
        this.cantidad_transaccion = cantidad_transaccion;
        this.id_tarjeta = id_tarjeta;
        this.id_cuenta_corriente = id_cuenta_corriente;
        this.id_cliente = id_cliente;
    }

    public Transaccion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(boolean tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    public double getCantidad_transaccion() {
        return cantidad_transaccion;
    }

    public void setCantidad_transaccion(double cantidad_transaccion) {
        this.cantidad_transaccion = cantidad_transaccion;
    }

    public int getId_tarjeta() {
        return id_tarjeta;
    }

    public void setId_tarjeta(int id_tarjeta) {
        this.id_tarjeta = id_tarjeta;
    }

    public int getId_cuenta_corriente() {
        return id_cuenta_corriente;
    }

    public void setId_cuenta_corriente(int id_cuenta_corriente) {
        this.id_cuenta_corriente = id_cuenta_corriente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "id=" + id + ", tipo_transaccion=" + tipo_transaccion + ", cantidad_transaccion=" + cantidad_transaccion + ", id_tarjeta=" + id_tarjeta + ", id_cuenta_corriente=" + id_cuenta_corriente + ", id_cliente=" + id_cliente + '}';
    }
    
    
}

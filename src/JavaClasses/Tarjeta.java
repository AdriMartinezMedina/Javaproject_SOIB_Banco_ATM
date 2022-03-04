package JavaClasses;


import java.sql.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xescp
 */
public class Tarjeta {
    
    private int id;
    private String num_tarjeta;
    private Date caducidad;
    private int cvv;
    private int cuenta_corriente;
    
    public Tarjeta(int id,String num_tarjeta,Date caducidad,int cvv,int cuenta_corriente){
        this.id = id;
        this.num_tarjeta = num_tarjeta;
        this.caducidad = caducidad;
        this.cvv = cvv;
        this.cuenta_corriente= cuenta_corriente;
    }
    
    public Tarjeta(){
        
    }

    public int getId() {
        return id;
    }

    public String getNum_tarjeta() {
        return num_tarjeta;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public int getCvv() {
        return cvv;
    }

    public int getCuenta_corriente() {
        return cuenta_corriente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNum_tarjeta(String num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setCuenta_corriente(int cuenta_corriente) {
        this.cuenta_corriente = cuenta_corriente;
    }
    
    
}

package JavaClasses;

import java.sql.Date;

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

    public Tarjeta(int id, String num_tarjeta, Date caducidad, int cvv, int cuenta_corriente) {
        this.id = id;
        this.num_tarjeta = num_tarjeta;
        this.caducidad = caducidad;
        this.cvv = cvv;
        this.cuenta_corriente = cuenta_corriente;
    }

    public Tarjeta() {

    }
/**
     * Método que regresa id
     *
     * @return Número de la tarjeta
     */
    public int getId() {
        return id;
    }
/**
     * Método que regresa número de la tarjeta
     *
     * @return Número de la tarjeta
     */
    public String getNum_tarjeta() {
        return num_tarjeta;
    }
/**
     * Método que regresa caducidad de la tarjeta
     *
     * @return caducidad de la cuenta corriente
     */
    public Date getCaducidad() {
        return caducidad;
    }
/**
     * Método que regresa CVV de la tarjeta
     *
     * @return CVV de la cuenta corriente
     */
    public int getCvv() {
        return cvv;
    }
    /**
     * Método que regresa la tarjeta
     *
     * @return Cuenta corriente de la tarjeta
     */
    public int getCuenta_corriente() {
        return cuenta_corriente;
    }

    /**
     * Establece el id de la tarjeta
     *
     * @param id Id que se le asignará a la tarjeta
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Establece número de la tarjeta
     *
     * @param num_tarjeta num_tarjeta que se le asignará a la tarjeta
     */
    public void setNum_tarjeta(String num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    /**
     * Establece fecha de caducidad de la tarjeta
     *
     * @param caducidad caducidad que se le asignará a la tarjeta
     */
    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    /**
     * Establece cvv de la tarjeta
     *
     * @param cvv cvv que se le asignará a la tarjeta
     */
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    /**
     * Establece cuenta corriente de la tarjeta
     *
     * @param cuenta_corriente cuenta corriente que se le asignará a la tarjeta
     */
    public void setCuenta_corriente(int cuenta_corriente) {
        this.cuenta_corriente = cuenta_corriente;
    }

}

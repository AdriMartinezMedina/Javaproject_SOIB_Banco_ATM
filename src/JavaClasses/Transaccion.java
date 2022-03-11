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

    /**
     * Método que regresa id de la transacción
     *
     * @return ID de la transacción
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la transacción
     *
     * @param id ID de la transacción que se le asignará a la transacción
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método que regresa tipo de la transacción
     *
     * @return Tipo de la transacción
     */
    public boolean isTipo_transaccion() {
        return tipo_transaccion;
    }

    /**
     * Establece el tipo de la transacción
     *
     * @param tipo_transaccion Tipo de la transacción que se le asignará a la
     * transacción
     */
    public void setTipo_transaccion(boolean tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    /**
     * Método que regresa cantidad de la transacción
     *
     * @return Cantidad de la transacción
     */
    public double getCantidad_transaccion() {
        return cantidad_transaccion;
    }

    /**
     * Establece la cantidad de la transacción
     *
     * @param cantidad_transaccion Cantidad de la transacción que se le asignará
     * a la transacción
     */
    public void setCantidad_transaccion(double cantidad_transaccion) {
        this.cantidad_transaccion = cantidad_transaccion;
    }

    /**
     * Método que regresa ID de la tarjeta de la transacción
     *
     * @return ID de la tarjeta de la transacción
     */
    public int getId_tarjeta() {
        return id_tarjeta;
    }

    /**
     * Establece el id de la tarjeta
     *
     * @param id_tarjeta id de la tarjeta que se le asignará a la transacción
     */
    public void setId_tarjeta(int id_tarjeta) {
        this.id_tarjeta = id_tarjeta;
    }

    /**
     * Método que regresa iD de la cuenta corriente de la transacción
     *
     * @return ID cuenta corriente de la transacción
     */
    public int getId_cuenta_corriente() {
        return id_cuenta_corriente;
    }

    /**
     * Establece el id de la cuenta corriente
     *
     * @param id_cuenta_corriente id de la cuenta corriente que se le asignará a
     * la transacción
     */
    public void setId_cuenta_corriente(int id_cuenta_corriente) {
        this.id_cuenta_corriente = id_cuenta_corriente;
    }

    /**
     * Método que regresa ID del cliente de la transacción
     *
     * @return ID cliente de la transacción
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * Establece el id del cliente
     *
     * @param id_cliente id del cliente que se le asignará a la transacción
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "id=" + id + ", tipo_transaccion=" + tipo_transaccion + ", cantidad_transaccion=" + cantidad_transaccion + ", id_tarjeta=" + id_tarjeta + ", id_cuenta_corriente=" + id_cuenta_corriente + ", id_cliente=" + id_cliente + '}';
    }

}

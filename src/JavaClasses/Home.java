/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prueba prueba otra prueba
 */
public class Home extends javax.swing.JFrame {

    static Home register;
    Connection con;
    ResultSet rs;
    Statement st;
    String nombre;
    Cliente cliente;
    static double balance = 0;
    static int id_cuenta_corriente = 0;

    /**
     * Creates new form Register_Window
     */
    public Home(Cliente cliente) {

        initComponents();
        this.nombre = cliente.getNombre();
        this.cliente = cliente;

        BienvenidoLabel.setText(BienvenidoLabel.getText() + ", " + cliente.getNombre());
        balance = getBalance(cliente.getId());

        jLabelBalance.setText(String.valueOf(balance) + "€");

        //mostramos transacciones
        mostrarTransacciones(getTransacciones(cliente.getId()));

        //ponemos en medio la ventana
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        BalanceLabel = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        CerrarSesionButton = new javax.swing.JButton();
        BienvenidoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransaccionesTable = new javax.swing.JTable();
        EnviarButton = new javax.swing.JButton();
        ExtraerButton = new javax.swing.JButton();
        AñadirButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imagenenviar = new javax.swing.JLabel();
        Imagenextraer = new javax.swing.JLabel();
        imagenañadir = new javax.swing.JLabel();
        iconbalance = new javax.swing.JLabel();
        Imagenmanos = new javax.swing.JLabel();
        jLabelBalance = new javax.swing.JLabel();
        jButtonAbrirTarjetas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainPanel.setBackground(Variables.principal);

        BalanceLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BalanceLabel.setText("Balance:");
        BalanceLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ExitButton.setBackground(new java.awt.Color(255, 204, 204));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Cerrar.png"))); // NOI18N
        ExitButton.setToolTipText("Salir");
        ExitButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        CerrarSesionButton.setBackground(new java.awt.Color(255, 204, 204));
        CerrarSesionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-salida-30.png"))); // NOI18N
        CerrarSesionButton.setToolTipText("Salir");
        CerrarSesionButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CerrarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionButtonActionPerformed(evt);
            }
        });

        BienvenidoLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        BienvenidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BienvenidoLabel.setText("BIENVENIDO");

        TransaccionesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Cantidad", "SALDO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TransaccionesTable);

        EnviarButton.setBackground(new java.awt.Color(255, 204, 204));
        EnviarButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnviarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-euro-30.png"))); // NOI18N
        EnviarButton.setText("Enviar");
        EnviarButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ExtraerButton.setBackground(new java.awt.Color(255, 204, 204));
        ExtraerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ExtraerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-euro-30.png"))); // NOI18N
        ExtraerButton.setText("Extraer");
        ExtraerButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ExtraerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraerButtonActionPerformed(evt);
            }
        });

        AñadirButton.setBackground(new java.awt.Color(255, 204, 204));
        AñadirButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AñadirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-euro-30.png"))); // NOI18N
        AñadirButton.setText("Añadir");
        AñadirButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        AñadirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-historia-de-la-actividad-30.png"))); // NOI18N
        jLabel1.setText("Historial de Transacciones");

        imagenenviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-money-30.png"))); // NOI18N

        Imagenextraer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-money-30_2.png"))); // NOI18N

        imagenañadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-money-30_1.png"))); // NOI18N

        iconbalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-balance-30.png"))); // NOI18N

        Imagenmanos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-apreton-de-manos-corazon-30.png"))); // NOI18N

        jLabelBalance.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelBalance.setText("jLabel2");

        jButtonAbrirTarjetas.setBackground(new java.awt.Color(255, 204, 204));
        jButtonAbrirTarjetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-card-30.png"))); // NOI18N
        jButtonAbrirTarjetas.setText("Tarjetas");
        jButtonAbrirTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirTarjetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconbalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BalanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBalance)
                .addGap(120, 120, 120))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(CerrarSesionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 753, Short.MAX_VALUE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(imagenenviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(BienvenidoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(Imagenmanos))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(EnviarButton)
                                .addGap(45, 45, 45)
                                .addComponent(Imagenextraer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExtraerButton)
                                .addGap(43, 43, 43)
                                .addComponent(imagenañadir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AñadirButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAbrirTarjetas)))
                .addContainerGap())
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(CerrarSesionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BienvenidoLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(Imagenmanos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(iconbalance)
                        .addGap(8, 8, 8))
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BalanceLabel)
                        .addComponent(jLabelBalance)))
                .addGap(25, 25, 25)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAbrirTarjetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExtraerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AñadirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagenextraer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagenañadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagenenviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EnviarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        EnviarButton.setVisible(false);
        imagenenviar.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionButtonActionPerformed
        cliente = null;

        //cambiamos de ventana
        Login_Window login = new Login_Window();
        login.setVisible(true);
        try {
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_CerrarSesionButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void AñadirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirButtonActionPerformed

        //añadir dinero
        String cantidad = "";
        cantidad = JOptionPane.showInputDialog("Dinero que desea ingresar");

        try {
            //cogemos la cuenta corriente donde tenemos que ingresar o sacar dinero
            int id_cuenta_corriente = Home.get_id_cuenta_corriente_by_id_cliente(cliente.getId());
            int id_cliente = cliente.getId();

            //quitamos las letras, o comas o €
            cantidad = cantidad.replace(',', '.');
            cantidad = cantidad.replace("€", "");
            cantidad = cantidad.replaceAll("[A-z]", "");

            //Ingresamos o sacamos dinero
            insertarDinero(cantidad, id_cuenta_corriente, id_cliente, false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //mostramos las transacciones
        mostrarTransacciones(getTransacciones(cliente.getId()));

    }//GEN-LAST:event_AñadirButtonActionPerformed

    private void jButtonAbrirTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirTarjetasActionPerformed
        ListadoTarjetas tarjetas = new ListadoTarjetas(cliente);

        tarjetas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAbrirTarjetasActionPerformed

    private void ExtraerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraerButtonActionPerformed

        //sacar dinero
        String cantidad = "";
        cantidad = JOptionPane.showInputDialog("Dinero que desea sacar");

        try {
            //cogemos la cuenta corriente donde tenemos que ingresar o sacar dinero
            int id_cuenta_corriente = Home.get_id_cuenta_corriente_by_id_cliente(cliente.getId());
            int id_cliente = cliente.getId();

            //quitamos las letras, o comas o €
            cantidad = cantidad.replace(',', '.');
            cantidad = cantidad.replace("€", "");
            cantidad = cantidad.replaceAll("[A-z]", "");

            insertarDinero(cantidad, id_cuenta_corriente, id_cliente, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //mostramos las transacciones
        mostrarTransacciones(getTransacciones(cliente.getId()));
    }//GEN-LAST:event_ExtraerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Home(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AñadirButton;
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JLabel BienvenidoLabel;
    private javax.swing.JButton CerrarSesionButton;
    private javax.swing.JButton EnviarButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ExtraerButton;
    private javax.swing.JLabel Imagenextraer;
    private javax.swing.JLabel Imagenmanos;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTable TransaccionesTable;
    private javax.swing.JLabel iconbalance;
    private javax.swing.JLabel imagenañadir;
    private javax.swing.JLabel imagenenviar;
    private javax.swing.JButton jButtonAbrirTarjetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBalance;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * Coge el balance del cliente
     *
     * @param id Balance del cliente
     * @return Regresa el balance
     */
    public static double getBalance(int id) {
        balance = 0;

        try {
            //nos conectamos
            String dato = "jdbc:mysql://" + Variables.servidor + ":3306/" + Variables.bbdd;
            String usuarioBbdd = Variables.usuarioServidor;
            String contrasenyaBbdd = Variables.contrasenyaServidor;
            Connection con;

            if (contrasenyaBbdd.equals("null")) {
                con = DriverManager.getConnection(dato, usuarioBbdd, "");
            } else {
                con = DriverManager.getConnection(dato, usuarioBbdd, contrasenyaBbdd);
            }

            //cogemos el balance del cliente
            Statement st = con.createStatement();
            String query = "SELECT * FROM `cuentas_corrientes` where id_cliente = " + id + ";";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                balance = rs.getInt("balance");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return balance;
    }

    /**
     * Inserta dinero en la cuenta corriente del cliente
     *
     * @param cantidad Cantidad del dinero
     * @param id_cuenta_corriente ID de la cuenta corriente
     * @param id_cliente ID del cliente
     * @param ingresar_sacar Boolean para saber si ingresa o saca dinero
     */
    private void insertarDinero(String cantidad, int id_cuenta_corriente, int id_cliente, boolean ingresar_sacar) {

        double cant = Double.parseDouble(cantidad);
        try {
            String dato = "jdbc:mysql://" + Variables.servidor + ":3306/" + Variables.bbdd;
            String usuarioBbdd = Variables.usuarioServidor;
            String contrasenyaBbdd = Variables.contrasenyaServidor;
            Connection con;

            if (contrasenyaBbdd.equals("null")) {
                con = DriverManager.getConnection(dato, usuarioBbdd, "");
            } else {
                con = DriverManager.getConnection(dato, usuarioBbdd, contrasenyaBbdd);
            }
            //añadimos la transaccion
            PreparedStatement ps = con.prepareStatement("INSERT INTO `transacciones` (`id`, `tipo_transaccion`, `cantidad_transaccion`, `id_tarjeta`, `id_cuenta_corriente`, `id_cliente`) VALUES (NULL, " + ingresar_sacar + ", ?, NULL, ?, ?)");

            ps.setDouble(1, cant);
            ps.setInt(2, id_cuenta_corriente);
            ps.setInt(3, id_cliente);

            ps.executeUpdate();

            if (ingresar_sacar) {
                balance -= cant;
            } else {
                balance += cant;
            }

            // Actualizamos el balance de la cuenta corriente
            PreparedStatement ps2 = con.prepareStatement("UPDATE `cuentas_corrientes` SET `balance` = ? WHERE `cuentas_corrientes`.`id` = ?");

            ps2.setDouble(1, balance);
            ps2.setInt(2, id_cuenta_corriente);

            ps2.executeUpdate();
            ps2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Coge el id de la cuenta corriente del cliente
     *
     * @param id ID del cliente
     * @return Regresa id de la cuenta corriente
     */
    public static int get_id_cuenta_corriente_by_id_cliente(int id) {

        try {
            String dato = "jdbc:mysql://" + Variables.servidor + ":3306/" + Variables.bbdd;
            String usuarioBbdd = Variables.usuarioServidor;
            String contrasenyaBbdd = Variables.contrasenyaServidor;
            Connection con;

            if (contrasenyaBbdd.equals("null")) {
                con = DriverManager.getConnection(dato, usuarioBbdd, "");
            } else {
                con = DriverManager.getConnection(dato, usuarioBbdd, contrasenyaBbdd);
            }

            Statement st = con.createStatement();
            String query = "SELECT * FROM `cuentas_corrientes` where id_cliente = " + id + ";";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                id_cuenta_corriente = rs.getInt("id");
                balance = rs.getDouble("balance");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return id_cuenta_corriente;

    }

    /**
     * Muestra transacciones del cliente
     *
     * @param trans Transacciones del cliente
     */
    private void mostrarTransacciones(ArrayList<Transaccion> trans) {

        DefaultTableModel model = (DefaultTableModel) TransaccionesTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < trans.size(); i++) {
            String tipo = "";
            if (trans.get(i).isTipo_transaccion()) {
                tipo = "SACAR";
            } else {
                tipo = "INGRESAR";
            }
            model.addRow(new Object[]{tipo, trans.get(i).getCantidad_transaccion() + "€", balance + "€"});
        }

        jLabelBalance.setText(balance + "€");
    }

    /**
     * Consigue transacciones del cliente
     *
     * @param id ID del cliente
     * @return Regresa las transacciones
     */
    private ArrayList<Transaccion> getTransacciones(int id) {

        //creamos una pila de transacciones
        ArrayList<Transaccion> transacciones = new ArrayList<>();

        try {
            String dato = "jdbc:mysql://" + Variables.servidor + ":3306/" + Variables.bbdd;
            String usuarioBbdd = Variables.usuarioServidor;
            String contrasenyaBbdd = Variables.contrasenyaServidor;
            Connection con;

            if (contrasenyaBbdd.equals("null")) {
                con = DriverManager.getConnection(dato, usuarioBbdd, "");
            } else {
                con = DriverManager.getConnection(dato, usuarioBbdd, contrasenyaBbdd);
            }

            //cogemos las transacciones
            Statement st = con.createStatement();
            String query = "SELECT * FROM `transacciones` where id_cliente = " + id + " ORDER BY id DESC;";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                //añadimos la transaccion
                Transaccion trans = new Transaccion(rs.getInt("id"), rs.getBoolean("tipo_transaccion"), rs.getDouble("cantidad_transaccion"), rs.getInt("id_tarjeta"), rs.getInt("id_cuenta_corriente"), rs.getInt("id_cliente"));
                transacciones.add(trans);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return transacciones;

    }

}

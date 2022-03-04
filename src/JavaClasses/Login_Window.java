/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClasses;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Login_Window extends javax.swing.JFrame {

    /**
     * Creates new form Login_Window
     */
    static Login_Window login;
    //String fnamez;
    //int balancz;
    //int operation;
    Connection con;
    ResultSet rs;
    Statement st;
    Cliente cliente;
    static Home home;

    public Login_Window() {
        initComponents();

        setLocationRelativeTo(null);
        //iniciarSesion("youssef", "12345678");
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
        Icono = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        UserIcon = new javax.swing.JLabel();
        PasswordIcon = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jPasswordFieldContrasena = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        MainPanel.setBackground(Variables.principal);

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/logo_icono.png"))); // NOI18N

        LoginLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        LoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLabel.setText("LOGIN");

        UserLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UserLabel.setText("Usuario:");

        jTextFieldUser.setToolTipText("DNI");

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PasswordLabel.setText("Contraseña:");

        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Usuario.png"))); // NOI18N

        PasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Contraseña.png"))); // NOI18N

        LoginButton.setBackground(new java.awt.Color(255, 204, 204));
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-enter-direction-arrow-towards-rightward-orientation-pointer-30.png"))); // NOI18N
        LoginButton.setText("Acceder");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        RegisterButton.setBackground(new java.awt.Color(255, 204, 204));
        RegisterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-task-30.png"))); // NOI18N
        RegisterButton.setText("Registrarse");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(255, 204, 204));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Cerrar.png"))); // NOI18N
        ExitButton.setToolTipText("Salir");
        ExitButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/icons8-acerca-de-30.png"))); // NOI18N
        jButton1.setText("Acerca De");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(PasswordIcon))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(UserIcon)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(UserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jTextFieldUser))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                        .addComponent(LoginButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RegisterButton))
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jPasswordFieldContrasena)))))
                        .addGap(167, 167, 167))
                    .addComponent(LoginLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Icono)
                            .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        MainPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {PasswordLabel, UserLabel});

        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginLabel)
                .addGap(71, 71, 71)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(UserIcon))
                    .addComponent(jTextFieldUser))
                .addGap(66, 66, 66)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(PasswordIcon))
                    .addComponent(jPasswordFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(Icono)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed

        try {
            // instanciamos un objeto de la clase Register_Window.java
            Register_Window registro = new Register_Window();

            //hacemos visible el formulario  
            registro.setVisible(true);

            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        //aquí llamamos al método para iniciar sesión
        String usuario = jTextFieldUser.getText();
        String contrasenya = String.valueOf(jPasswordFieldContrasena.getPassword());

        System.out.println("usuario: " + usuario + " contraseña: " + contrasenya);
        
        if (usuario.equals("admin") && contrasenya.equals("admin")) {
            // instanciamos un objeto de la clase Register_Window.java
            Opciones opciones = new Opciones();
            //hacemos visible el formulario  
            opciones.setVisible(true);
            this.setVisible(false);
            try {
                this.setVisible(false);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            Cliente cliente = iniciarSesion(usuario, contrasenya);
            System.out.println(cliente.toString());

            if (usuario.equals("")) {
                JOptionPane.showMessageDialog(null, "El campo usuario está vacío", "Error al iniciar sesión", JOptionPane.ERROR_MESSAGE);
            } else if (cliente.getNombre() == null) {
                JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectos", "Error al iniciar sesión", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Hola " + cliente.getNombre(), "BIEN al iniciar sesión", JOptionPane.INFORMATION_MESSAGE);

                // instanciamos un objeto de la clase Register_Window.java
                Home home = new Home(cliente);

                //hacemos visible el formulario  
                home.setVisible(true);
                this.setVisible(false);
                try {
                    this.setVisible(false);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AcercaDe acercade = new AcercaDe();
        acercade.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                login = new Login_Window();
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel Icono;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel PasswordIcon;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField jPasswordFieldContrasena;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables

    private Cliente iniciarSesion(String usuario, String contrasenya) {
//        System.out.println("usuario " + usuario + " contraseña: " + contrasenya);
        //aqui iniciamos sesión
        cliente = new Cliente();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
            st = con.createStatement();
            String query = "SELECT * FROM clientes where usuario = \"" + usuario + "\" and contrasena = \"" + contrasenya + "\"";
            System.out.println(query);
            rs = st.executeQuery(query);
            while (rs.next()) {
                cliente = new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"), rs.getDate("f_nacimiento"), rs.getString("dni"), rs.getString("direccion"), rs.getString("poblacion"), rs.getString("usuario"), rs.getString("contrasena"), rs.getString("f_cr"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cliente;
    }

}

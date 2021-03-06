/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd_mensajeria.GUI;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sd_conexion_bd.Servicios;
import sd_mensajeria.usuario;


/*Librerias para Seguridad*/
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.*;
import java.util.ArrayList;

import javax.crypto.*;
import javax.crypto.interfaces.*;
import javax.crypto.spec.*;
import org.apache.commons.codec.digest.DigestUtils;
import sd_activeMQ.Receiver;
import sd_activeMQ.ReceiverGrupo;


/**
 *
 * @author Kattya Desiderio
 */
public class Inicio_Sesion extends javax.swing.JFrame {
    ArrayList <Chat> chatsActivos= new ArrayList <Chat> ();
    
    /**
     * Creates new form Inicio_Sesion
     */
    public Inicio_Sesion() {
        super("Java Chat");
        initComponents();        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        btn_registro = new javax.swing.JButton();
        txt_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("JavaChat ");

        btn_login.setBackground(new java.awt.Color(51, 153, 255));
        btn_login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_login.setText("Log In");
        btn_login.setActionCommand("btn_login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_registro.setBackground(new java.awt.Color(0, 204, 102));
        btn_registro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_registro.setText("Registro");
        btn_registro.setActionCommand("btn_registro");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });

        txt_user.setText("joyce-adri");
        txt_user.setName("txt_usuario"); // NOI18N
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Contraseña:");

        txt_password.setText("adri-123");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btn_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(109, 109, 109))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public String getHash(String pass) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        String hash;

        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = algorithm.digest(pass.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
          hexString.append(String.format("%02X", 0xFF & b));
        }
        //Obtiene el hash de la contraseña
        hash = hexString.toString();
        

      return hash;
    }
    
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
       
        
        final Servicios s = new Servicios(); 
        final usuario UsuarioInfo = new usuario();
        if(txt_user.getText().equals("") || txt_password.getPassword() == null){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "No ha ingresado datos", JOptionPane.ERROR_MESSAGE);
        }else{
            if(txt_user.getText().matches("([a-z]|[A-Z]|[_]|[-])+") == false){
                JOptionPane.showMessageDialog(null, "Ingrese simbolos validos", "Error en ingreso de datos", JOptionPane.ERROR_MESSAGE);
            }else{
                    String pass = txt_password.getText();
                    String user = txt_user.getText();
                    //buscar en los user el nombre del usuario                 
                    String semilla="2016";
                    String encript=DigestUtils.sha1Hex(pass+semilla);
                
                try {
                    if(s.validar_userName(user,encript, UsuarioInfo)){
                    //if(s.validar_userName(user,pass, UsuarioInfo)){
                        this.setVisible(false);
                        try {
                            // TODO add your handling code here:
                            Receiver r = new Receiver(user, chatsActivos); // id+username del usuario que inicia sesión
                            ReceiverGrupo rg = new ReceiverGrupo(user, chatsActivos); // id+username del usuario que inicia sesión
                        } catch (Exception ex) {
                            Logger.getLogger(Inicio_Sesion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        final String datos = UsuarioInfo.getNombre() +" " +UsuarioInfo.getApellido();
                        JOptionPane.showMessageDialog(null, "Bienvenid@!! " + datos,"Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                try {
                                    new Principal(s, datos, UsuarioInfo, chatsActivos).setVisible(true);
                                } catch (IOException ex) {
                                    Logger.getLogger(Inicio_Sesion.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        });
                    }else{//user incorrecto
                        JOptionPane.showMessageDialog(null, "CREDENCIALES INCORRRECTAS", "Error en los datos", JOptionPane.ERROR_MESSAGE);
                        txt_user.setText("");
                        txt_password.setText("");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Inicio_Sesion.class.getName()).log(Level.SEVERE, null, ex);
                }
 
            }
        }                                     
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
       this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Registro().setVisible(true);                         
                        }
                    }); 
    }//GEN-LAST:event_btn_registroActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}

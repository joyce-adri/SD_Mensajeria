/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd_mensajeria.GUI;

import java.awt.Image;
import javax.swing.ImageIcon;
import sd_conexion_bd.Servicios;
import sd_mensajeria.usuario;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author User
 */
public class Principal extends javax.swing.JFrame {
    Servicios s;
    int u_id;
    /**
     * Creates new form Principal
     */
    public Principal(Servicios serv, String datos, usuario UserInfo) {
        super("JavaChat");
        initComponents();
        this.setLocationRelativeTo(null);
        String userName = UserInfo.getUser();
        u_id=UserInfo.getID();
        ImageIcon o = UserInfo.getFoto();
        User_name_label1.setText(UserInfo.getNombre()+UserInfo.getApellido());
        User_name_label1.setText(userName.toUpperCase());
        User_foto.setIcon(o);
        this.s=serv;
        s.cargar_contactos(contactos_lista, userName, u_id);
        contactos_lista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane_contactos.setViewportView(contactos_lista);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        User_name_label1 = new javax.swing.JLabel();
        User_foto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        User_name_label2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel_contactos = new javax.swing.JPanel();
        jScrollPane_contactos = new javax.swing.JScrollPane();
        contactos_lista = new javax.swing.JList();
        Panel_chats = new javax.swing.JPanel();
        chat_lista = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        m_buscar = new javax.swing.JMenuItem();
        m_agregar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        m_five = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        User_name_label1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        User_name_label1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        User_name_label1.setMinimumSize(new java.awt.Dimension(143, 60));

        User_foto.setBackground(new java.awt.Color(0, 204, 255));
        User_foto.setName("User_foto"); // NOI18N
        User_foto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                User_fotoFocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("JavaChat");

        User_name_label2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        User_name_label2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        User_name_label2.setMinimumSize(new java.awt.Dimension(143, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(User_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(User_name_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(349, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(196, 196, 196)
                    .addComponent(User_name_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(User_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14)
                        .addComponent(User_name_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(User_name_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        User_foto.getAccessibleContext().setAccessibleName("User_foto");

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(893, 494));

        contactos_lista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contactos_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactos_listaMouseClicked(evt);
            }
        });
        jScrollPane_contactos.setViewportView(contactos_lista);

        javax.swing.GroupLayout Panel_contactosLayout = new javax.swing.GroupLayout(Panel_contactos);
        Panel_contactos.setLayout(Panel_contactosLayout);
        Panel_contactosLayout.setHorizontalGroup(
            Panel_contactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_contactosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_contactos, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_contactosLayout.setVerticalGroup(
            Panel_contactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_contactosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_contactos, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("         CONTACTOS         ", Panel_contactos);

        chat_lista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chat_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chat_listaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_chatsLayout = new javax.swing.GroupLayout(Panel_chats);
        Panel_chats.setLayout(Panel_chatsLayout);
        Panel_chatsLayout.setHorizontalGroup(
            Panel_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
            .addGroup(Panel_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_chatsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(chat_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Panel_chatsLayout.setVerticalGroup(
            Panel_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(Panel_chatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_chatsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(chat_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("                CHATS             ", Panel_chats);

        jMenu5.setText("Perfil");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu1.setText("Contacto");

        m_buscar.setText("Buscar Contacto");
        m_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_buscarActionPerformed(evt);
            }
        });
        jMenu1.add(m_buscar);

        m_agregar.setText("Agregar Contacto");
        m_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_agregarActionPerformed(evt);
            }
        });
        jMenu1.add(m_agregar);
        jMenu1.add(jSeparator1);

        m_five.setText("Top Five");
        m_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_fiveActionPerformed(evt);
            }
        });
        jMenu1.add(m_five);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Grupo");

        jMenuItem1.setText("Crear Grupo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Modificar Grupo");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("About");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void User_fotoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_User_fotoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_User_fotoFocusGained

    private void chat_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chat_listaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_chat_listaMouseClicked

    private void contactos_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactos_listaMouseClicked
        // TODO add your handling code here:
        String info = (String)contactos_lista.getSelectedValue();
        //verificar si existe chat anterior si es asi abrirlo
        //sino mostrar una nueva ventana para el chat entre ellos
        //obtener estado del contacto
        if (evt.getClickCount() == 2){
            try {
                new Chat(info, this.u_id ,this.s);
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_contactos_listaMouseClicked

    private void m_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_buscarActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Buscar_Contacto().setVisible(true);                         
                        }
                    }); 
    }//GEN-LAST:event_m_buscarActionPerformed

    private void m_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_agregarActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Agregar_Contacto().setVisible(true);                         
                        }
                    }); 
    }//GEN-LAST:event_m_agregarActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Perfil().setVisible(true);                         
                        }
                    }); 
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Crear_Grupo(s, contactos_lista, u_id).setVisible(true);                         
                        }
                    }); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void m_fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_fiveActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Top_Five(s, u_id).setVisible(true);                         
                        }
                    }); 
// TODO add your handling code here:
    }//GEN-LAST:event_m_fiveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_chats;
    private javax.swing.JPanel Panel_contactos;
    private javax.swing.JLabel User_foto;
    private javax.swing.JLabel User_name_label1;
    private javax.swing.JLabel User_name_label2;
    private javax.swing.JList chat_lista;
    private javax.swing.JList contactos_lista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane_contactos;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem m_agregar;
    private javax.swing.JMenuItem m_buscar;
    private javax.swing.JMenuItem m_five;
    // End of variables declaration//GEN-END:variables

    private Image createImageIcon(String resourcesjava_iconpng, String java) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

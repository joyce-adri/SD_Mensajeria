/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd_mensajeria.GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sd_conexion_bd.Servicios;
import sd_mensajeria.usuario;

/**
 *
 * @author Kattya Desiderio
 */
public class Crear_Grupo extends javax.swing.JFrame {
    Servicios s;
    int creadorID;
    DefaultListModel modelo;
    JList contactosDelUsuario;
    /**
     * Creates new form Crear_Grupo
     */
    public Crear_Grupo(Servicios serv, JList contactos_lista, int userID) {
        super("Java Chat");
        initComponents();
        this.setLocationRelativeTo(null);
        this.s=serv;
        this.creadorID=userID;
        this.contactosDelUsuario = contactos_lista;
        List_contactos.setVisible(false);
        jList_contactos.setVisible(false);
        modelo= new DefaultListModel();
        integrantes_lista.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        List_contactos = new javax.swing.JScrollPane();
        jList_contactos = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombre_grupo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion_grupo = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        integrantes_lista = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        tipiar_integrante = new javax.swing.JTextField();
        agregar_btn = new javax.swing.JButton();
        guardar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(893, 533));
        setPreferredSize(new java.awt.Dimension(893, 533));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Crear Grupo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 294, 58);

        jList_contactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_contactosMouseClicked(evt);
            }
        });
        List_contactos.setViewportView(jList_contactos);

        getContentPane().add(List_contactos);
        List_contactos.setBounds(570, 140, 210, 90);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Grupo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        nombre_grupo.setName("txt_ngrupo"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Detalle:");

        descripcion_grupo.setColumns(10);
        descripcion_grupo.setRows(5);
        descripcion_grupo.setTabSize(3);
        descripcion_grupo.setToolTipText("");
        descripcion_grupo.setWrapStyleWord(true);
        descripcion_grupo.setAutoscrolls(false);
        jScrollPane1.setViewportView(descripcion_grupo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_grupo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 110, 401, 300);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Integrantes Grupo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        integrantes_lista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        integrantes_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                integrantes_listaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(integrantes_lista);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(470, 190, 380, 220);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Integrante:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 110, 81, 17);

        tipiar_integrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipiar_integranteActionPerformed(evt);
            }
        });
        tipiar_integrante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tipiar_integranteKeyReleased(evt);
            }
        });
        getContentPane().add(tipiar_integrante);
        tipiar_integrante.setBounds(570, 110, 210, 30);

        agregar_btn.setText("+");
        agregar_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agregar_btn.setBorderPainted(false);
        agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(agregar_btn);
        agregar_btn.setBounds(790, 100, 40, 40);

        guardar_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        guardar_btn.setText("Guardar");
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(guardar_btn);
        guardar_btn.setBounds(330, 430, 150, 37);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipiar_integranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipiar_integranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipiar_integranteActionPerformed

    private void agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_btnActionPerformed
        // TODO add your handling code here:
        if(!tipiar_integrante.getText().equals("")){
            modelo.addElement(tipiar_integrante.getText());
            tipiar_integrante.setText("");
            List_contactos.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "No ha ingresado el nombre de su contacto","Dato de Contacto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregar_btnActionPerformed

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        // TODO add your handling code here:
        String nombre=nombre_grupo.getText();
        String desc = descripcion_grupo.getText();
        if(integrantes_lista.getModel().getSize()==0 || nombre.equals("") || desc.equals("")){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios","Error de Ingreso de Datos", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                //enviar datos a la base
                if(s.registrar_grupo(nombre,desc,integrantes_lista, creadorID)){
                    JOptionPane.showMessageDialog(null, "Se ha creado el grupo: " +nombre,"Java Chat - Información", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No pudo ser creado el grupo" + nombre,"JAVA CHAT - INFORMATION", JOptionPane.ERROR_MESSAGE);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Crear_Grupo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_guardar_btnActionPerformed

    private void tipiar_integranteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipiar_integranteKeyReleased
        // TODO add your handling code here:
        JTextField j =(JTextField)evt.getSource();
        String str1;
        String str2 = j.getText();
        DefaultListModel model = new DefaultListModel();
        if(!j.getText().equals("")){
            for(int i=0; i<contactosDelUsuario.getModel().getSize(); i++){
                str1 = (String)contactosDelUsuario.getModel().getElementAt(i);
                if(str1.toLowerCase().contains(str2.toLowerCase())){
                    model.addElement(str1);
                }
            }
            if(!model.isEmpty()){
                jList_contactos.setModel(model);
                List_contactos.setVisible(true);
                jList_contactos.setVisible(true);
            }
        }else{
            List_contactos.setVisible(false);
        }
    }//GEN-LAST:event_tipiar_integranteKeyReleased

    private void jList_contactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_contactosMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2){
            String str=(String)jList_contactos.getSelectedValue();
            tipiar_integrante.setText(str);
            List_contactos.setVisible(false);
        }
    }//GEN-LAST:event_jList_contactosMouseClicked

    private void integrantes_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_integrantes_listaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_integrantes_listaMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane List_contactos;
    private javax.swing.JButton agregar_btn;
    private javax.swing.JTextArea descripcion_grupo;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JList integrantes_lista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList_contactos;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nombre_grupo;
    private javax.swing.JTextField tipiar_integrante;
    // End of variables declaration//GEN-END:variables
}

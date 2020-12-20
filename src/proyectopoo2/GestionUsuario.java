/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo2;

import java.awt.Dimension;
import javax.swing.JComponent;

/**
 *
 * @author spayd
 */
public class GestionUsuario extends javax.swing.JInternalFrame {

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
    private Dimension dimBarra = null;
    
    public void ocultarBarraTitulo()
    {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0,0);
        Barra.setPreferredSize(new Dimension(0,0));
        repaint();
    }
    public GestionUsuario() {
        initComponents();
        this.ocultarBarraTitulo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLIdentificacion = new javax.swing.JLabel();
        TfIdentificacion = new javax.swing.JTextField();
        BtVaciarCampos = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        BtModificar = new javax.swing.JButton();
        BtEliminar = new javax.swing.JButton();
        LbContraseña = new javax.swing.JLabel();
        TfNick = new javax.swing.JTextField();
        PfContraseña = new javax.swing.JPasswordField();
        TfNombre = new javax.swing.JTextField();
        LbNick1 = new javax.swing.JLabel();
        LbContraseña1 = new javax.swing.JLabel();
        TfNick1 = new javax.swing.JTextField();
        PfContraseña1 = new javax.swing.JPasswordField();
        LbNick2 = new javax.swing.JLabel();
        BtVaciarCampos1 = new javax.swing.JButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setFont(new java.awt.Font("Century Schoolbook", 1, 30)); // NOI18N
        jLTitulo.setText("Gestion Usuarios");
        getContentPane().add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 19, 280, -1));

        jLNombre.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLNombre.setText("Nombre :");
        getContentPane().add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 125, -1, 40));

        jLIdentificacion.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLIdentificacion.setText("Identificacion : ");
        getContentPane().add(jLIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 79, -1, 40));

        TfIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfIdentificacionActionPerformed(evt);
            }
        });
        getContentPane().add(TfIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 135, 180, 30));

        BtVaciarCampos.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        BtVaciarCampos.setText("Vaciar Campos");
        BtVaciarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVaciarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(BtVaciarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 237, 160, 41));

        BtBuscar.setBackground(new java.awt.Color(153, 153, 153));
        BtBuscar.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 87, 160, 41));

        BtModificar.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        BtModificar.setText("Modificar");
        BtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtModificarActionPerformed(evt);
            }
        });
        getContentPane().add(BtModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 137, 160, 40));

        BtEliminar.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        BtEliminar.setText("Eliminar");
        BtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 187, 160, 41));

        LbContraseña.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        LbContraseña.setText("Contraseña :");
        getContentPane().add(LbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 261, -1, 20));

        TfNick.setEditable(false);
        TfNick.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNickActionPerformed(evt);
            }
        });
        getContentPane().add(TfNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 296, 180, -1));

        PfContraseña.setEditable(false);
        PfContraseña.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        PfContraseña.setToolTipText("");
        getContentPane().add(PfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 256, 180, 30));

        TfNombre.setEditable(false);
        getContentPane().add(TfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 87, 180, 30));

        LbNick1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        LbNick1.setText("Nombre Usuario :");
        getContentPane().add(LbNick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 301, -1, 20));

        LbContraseña1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        LbContraseña1.setText("Espacialidad");
        getContentPane().add(LbContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 181, -1, 20));

        TfNick1.setEditable(false);
        TfNick1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfNick1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNick1ActionPerformed(evt);
            }
        });
        getContentPane().add(TfNick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 216, 180, -1));

        PfContraseña1.setEditable(false);
        PfContraseña1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        PfContraseña1.setToolTipText("");
        getContentPane().add(PfContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 176, 180, 30));

        LbNick2.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        LbNick2.setText("Años Experiencia");
        getContentPane().add(LbNick2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 221, -1, 20));

        BtVaciarCampos1.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        BtVaciarCampos1.setText("Volver");
        BtVaciarCampos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVaciarCampos1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtVaciarCampos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 385, 160, 41));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfIdentificacionActionPerformed

    private void BtVaciarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVaciarCamposActionPerformed
        
    }//GEN-LAST:event_BtVaciarCamposActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void BtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtModificarActionPerformed
        
    }//GEN-LAST:event_BtModificarActionPerformed

    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed

    }//GEN-LAST:event_BtEliminarActionPerformed

    private void TfNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNickActionPerformed

    private void TfNick1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNick1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNick1ActionPerformed

    private void BtVaciarCampos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVaciarCampos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtVaciarCampos1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtEliminar;
    private javax.swing.JButton BtModificar;
    private javax.swing.JButton BtVaciarCampos;
    private javax.swing.JButton BtVaciarCampos1;
    private javax.swing.JLabel LbContraseña;
    private javax.swing.JLabel LbContraseña1;
    private javax.swing.JLabel LbNick1;
    private javax.swing.JLabel LbNick2;
    private javax.swing.JPasswordField PfContraseña;
    private javax.swing.JPasswordField PfContraseña1;
    private javax.swing.JTextField TfIdentificacion;
    private javax.swing.JTextField TfNick;
    private javax.swing.JTextField TfNick1;
    private javax.swing.JTextField TfNombre;
    private javax.swing.JLabel jLIdentificacion;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTitulo;
    // End of variables declaration//GEN-END:variables
}

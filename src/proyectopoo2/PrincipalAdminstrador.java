/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo2;

import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
    

public class PrincipalAdminstrador extends javax.swing.JFrame {
    
    public PrincipalAdminstrador() {
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

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btonRegistrarUser = new javax.swing.JButton();
        BtonRegistrarIng = new javax.swing.JButton();
        btonRegistrarAdministrador = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        btonGestionarIngeniero = new javax.swing.JButton();
        btonConsultarProyectos = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 64, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(45, 64, 89));
        jButton1.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar Proyecto");
        jButton1.setMargin(new java.awt.Insets(0, 14, 0, 14));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, 30));

        btonRegistrarUser.setBackground(new java.awt.Color(45, 64, 89));
        btonRegistrarUser.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btonRegistrarUser.setForeground(new java.awt.Color(255, 255, 255));
        btonRegistrarUser.setText("Usuario Ingeniero");
        btonRegistrarUser.setMargin(new java.awt.Insets(0, 14, 0, 14));
        btonRegistrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonRegistrarUserActionPerformed(evt);
            }
        });
        jPanel1.add(btonRegistrarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 30));

        BtonRegistrarIng.setBackground(new java.awt.Color(45, 64, 89));
        BtonRegistrarIng.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        BtonRegistrarIng.setForeground(new java.awt.Color(255, 255, 255));
        BtonRegistrarIng.setText("Registrar Ingeniero");
        BtonRegistrarIng.setMargin(new java.awt.Insets(0, 14, 0, 14));
        BtonRegistrarIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonRegistrarIngActionPerformed(evt);
            }
        });
        jPanel1.add(BtonRegistrarIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 30));

        btonRegistrarAdministrador.setBackground(new java.awt.Color(45, 64, 89));
        btonRegistrarAdministrador.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btonRegistrarAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btonRegistrarAdministrador.setText("Usuario Adminstrador");
        btonRegistrarAdministrador.setMargin(new java.awt.Insets(0, 14, 0, 14));
        btonRegistrarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonRegistrarAdministradorActionPerformed(evt);
            }
        });
        jPanel1.add(btonRegistrarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 30));

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, -1, -1));
        btonGestionarIngeniero.setBackground(new java.awt.Color(45, 64, 89));
        btonGestionarIngeniero.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btonGestionarIngeniero.setForeground(new java.awt.Color(255, 255, 255));
        btonGestionarIngeniero.setText("Gestionar Ingeniero");
        btonGestionarIngeniero.setMargin(new java.awt.Insets(0, 14, 0, 14));
        btonGestionarIngeniero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonGestionarIngenieroActionPerformed(evt);
            }
        });
        jPanel1.add(btonGestionarIngeniero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, 30));

        btonConsultarProyectos.setBackground(new java.awt.Color(45, 64, 89));
        btonConsultarProyectos.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btonConsultarProyectos.setForeground(new java.awt.Color(255, 255, 255));
        btonConsultarProyectos.setText("Consultar Proyectos");
        btonConsultarProyectos.setMargin(new java.awt.Insets(0, 14, 0, 14));
        btonConsultarProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonConsultarProyectosActionPerformed(evt);
            }
        });
        jPanel1.add(btonConsultarProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 220, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 710));

        escritorio.setPreferredSize(new java.awt.Dimension(1000, 500));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 990, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtonRegistrarIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonRegistrarIngActionPerformed
        AbrirPanel(new RegistrarIngeniero());   
    }//GEN-LAST:event_BtonRegistrarIngActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AbrirPanel(new RegistroProyecto());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btonRegistrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonRegistrarUserActionPerformed
        AbrirPanel(new RegistroUsuarioIngenieroForm());
    }//GEN-LAST:event_btonRegistrarUserActionPerformed

    private void btonRegistrarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonRegistrarAdministradorActionPerformed
        AbrirPanel(new RegistroUsuarioIngenieroForm());
    }//GEN-LAST:event_btonRegistrarAdministradorActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        AbrirFormulario(new LoginForm());
    }//GEN-LAST:event_BtnSalirActionPerformed
    private void btonGestionarIngenieroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonGestionarIngenieroActionPerformed
        this.AbrirPanel(new GestionarIngeniero());
    }//GEN-LAST:event_btonGestionarIngenieroActionPerformed

    private void btonConsultarProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonConsultarProyectosActionPerformed
        this.AbrirPanel(new ConsultaProyectos());
    }//GEN-LAST:event_btonConsultarProyectosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtonRegistrarIng;
    private javax.swing.JButton btonConsultarProyectos;
    private javax.swing.JButton btonGestionarIngeniero;
    private javax.swing.JButton btonRegistrarAdministrador;
    private javax.swing.JButton btonRegistrarUser;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void AbrirPanel(JInternalFrame formularioInterno)
    {
        PrincipalAdminstrador.escritorio.removeAll();
        PrincipalAdminstrador.escritorio.add(formularioInterno);
        formularioInterno.setVisible(true);
    }
    public void AbrirFormulario(Frame formulario)
    {
        formulario.setVisible(true);
        this.dispose();
    }
}

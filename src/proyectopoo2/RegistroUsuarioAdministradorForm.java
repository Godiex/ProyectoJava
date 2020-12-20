/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo2;

import Clases.Ingeniero;
import Clases.Persona;
import Clases.Respuesta;
import Clases.Usuario;
import Logica.ServicioPersona;
import Logica.ServicioUsuario;
import java.awt.Dimension;
import javax.swing.JComponent;

public class RegistroUsuarioAdministradorForm extends javax.swing.JInternalFrame {

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
    public RegistroUsuarioAdministradorForm() {
        initComponents();
        this.ocultarBarraTitulo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        LbContraseña = new javax.swing.JLabel();
        LbNombre = new javax.swing.JLabel();
        LbNick = new javax.swing.JLabel();
        TfCedula = new javax.swing.JTextField();
        TfNombre = new javax.swing.JTextField();
        TfNombreUsuario = new javax.swing.JTextField();
        PfContraseña = new javax.swing.JPasswordField();
        LbCedula1 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelTitulo1 = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        LbNombre1 = new javax.swing.JLabel();
        TfEdad = new javax.swing.JTextField();
        LbNick1 = new javax.swing.JLabel();
        TfApellidos = new javax.swing.JTextField();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        jLabelTitulo.setText("Datos del Usuario :");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        LbContraseña.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbContraseña.setText("Apellidos :");
        getContentPane().add(LbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        LbNombre.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbNombre.setText("Nombre :");
        getContentPane().add(LbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        LbNick.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbNick.setText("Nombre Usuario :");
        getContentPane().add(LbNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 20));

        TfCedula.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfCedula.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TfCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(TfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 170, 30));

        TfNombre.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 170, -1));

        TfNombreUsuario.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TfNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 170, 30));

        PfContraseña.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        PfContraseña.setToolTipText("");
        getContentPane().add(PfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 170, -1));

        LbCedula1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbCedula1.setText("Identificacion :");
        getContentPane().add(LbCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 620, -1, -1));

        BtnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1000, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 10));

        jLabelTitulo1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabelTitulo1.setText("Registrar Usuario Administrador");
        getContentPane().add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabelTitulo2.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        jLabelTitulo2.setText("Datos Personales :");
        getContentPane().add(jLabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        LbNombre1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbNombre1.setText("Edad :");
        getContentPane().add(LbNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        TfEdad.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfEdadActionPerformed(evt);
            }
        });
        getContentPane().add(TfEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 60, -1));

        LbNick1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbNick1.setText("Contraseña :");
        getContentPane().add(LbNick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, 20));

        TfApellidos.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(TfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 170, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfCedulaActionPerformed

    private void TfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNombreActionPerformed

    private void TfNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNombreUsuarioActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed

    }//GEN-LAST:event_CancelarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        RegistrarUsuario();
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void TfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfEdadActionPerformed

    private void TfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfApellidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel LbCedula1;
    private javax.swing.JLabel LbContraseña;
    private javax.swing.JLabel LbNick;
    private javax.swing.JLabel LbNick1;
    private javax.swing.JLabel LbNombre;
    private javax.swing.JLabel LbNombre1;
    private javax.swing.JPasswordField PfContraseña;
    private javax.swing.JTextField TfApellidos;
    private javax.swing.JTextField TfCedula;
    private javax.swing.JTextField TfEdad;
    private javax.swing.JTextField TfNombre;
    private javax.swing.JTextField TfNombreUsuario;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    public Persona CrearPersona()
    {
        String nombre = TfNombre.getText();
        String apellido = TfApellidos.getText();
        String edad = TfEdad.getText();
        String cedula = TfCedula.getText();
        Persona persona = new Persona(cedula, nombre, apellido, edad);
        return persona;
    }

    public void RegistrarUsuario()
    {
        ServicioUsuario servicioUsuario =  new ServicioUsuario();
        Usuario usuario = CrearUsuario();
        Mensaje.MostrarNotificacion(servicioUsuario.GuardarUsuario(usuario));
    }
    
    public Usuario CrearUsuario()
    {
        String nombreUsuario = TfNombreUsuario.getText();
        String contraseña = PfContraseña.getText();
        Persona persona = CrearPersona();
        return new Usuario("Administrador", contraseña, nombreUsuario, persona);
    }
}

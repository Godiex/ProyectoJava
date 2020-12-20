/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo2;

import Logica.*;
import Clases.*;
import java.awt.Frame;
import javax.swing.JInternalFrame;

public class LoginForm extends javax.swing.JFrame {

    ServicioUsuario sUsuario = new ServicioUsuario();
    public LoginForm() {
        initComponents();
        this.setVisible(true);
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

        jLabel2 = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        jLContraseña = new javax.swing.JLabel();
        TfUsuario = new javax.swing.JTextField();
        PfContreseña = new javax.swing.JPasswordField();
        BtnIngresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(535, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 328, -1, -1));

        jLUsuario.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLUsuario.setText("Usuario:");
        getContentPane().add(jLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 110, 30));
        jLUsuario.getAccessibleContext().setAccessibleName("Usuario: ");

        jLContraseña.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLContraseña.setText("Contraseña :");
        getContentPane().add(jLContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));
        getContentPane().add(TfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 280, 30));
        getContentPane().add(PfContreseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 280, 30));

        BtnIngresar.setText("INICIAR SESION");
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 180, 40));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed

       Respuesta respuesta = sUsuario.Buscar(TfUsuario.getText(), PfContreseña.getText());
       if(!respuesta.isError())
       {
           Mensaje.MostrarNotificacion(respuesta.getMensaje());
           this.AbrirFormulario(new PrincipalAdminstrador());
       }   
       Mensaje.MostrarNotificacion(respuesta.getMensaje());
    }//GEN-LAST:event_BtnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JPasswordField PfContreseña;
    private javax.swing.JTextField TfUsuario;
    private javax.swing.JLabel jLContraseña;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
    public void AbrirFormulario(Frame formulario)
    {
        formulario.setVisible(true);
        this.dispose();
    }

}

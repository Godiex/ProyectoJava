
package proyectopoo2;

import java.awt.Dimension;
import javax.swing.JComponent;
import Clases.*;
import Logica.*;

public class RegistroProyecto extends javax.swing.JInternalFrame {
    Proyecto proyecto = new Proyecto("");
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
    public RegistroProyecto() {
        initComponents();
        this.ocultarBarraTitulo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnEnviarPostulacion = new javax.swing.JButton();
        LbPropuesta1 = new javax.swing.JLabel();
        TfFechaLimite = new javax.swing.JTextField();
        TfDuracionProyecto = new javax.swing.JTextField();
        TfNombreProyecto = new javax.swing.JTextField();
        LbTipoContrato1 = new javax.swing.JLabel();
        LbTipoContrato4 = new javax.swing.JLabel();
        BtnAgregarPdf = new javax.swing.JButton();
        LbTipoContrato5 = new javax.swing.JLabel();
        LbTipoContrato6 = new javax.swing.JLabel();
        TfFechaInicio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEstudiantes = new javax.swing.JTable();
        LbPropuesta2 = new javax.swing.JLabel();
        TfDuracionTarea = new javax.swing.JTextField();
        LbTipoContrato2 = new javax.swing.JLabel();
        TfNombreTarea = new javax.swing.JTextField();
        LbTipoContrato7 = new javax.swing.JLabel();
        CmbTipoTarea = new javax.swing.JComboBox<>();
        LbTipoContrato3 = new javax.swing.JLabel();
        LbTipoContrato8 = new javax.swing.JLabel();
        CmbFase = new javax.swing.JComboBox<>();
        LbPropuesta3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnEnviarPostulacion.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        BtnEnviarPostulacion.setText("Registrar Proyecto");
        BtnEnviarPostulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarPostulacionActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEnviarPostulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 170, 30));

        LbPropuesta1.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
        LbPropuesta1.setText("Registrar Proyecto");
        getContentPane().add(LbPropuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        TfFechaLimite.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfFechaLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfFechaLimiteActionPerformed(evt);
            }
        });
        getContentPane().add(TfFechaLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 166, 30));

        TfDuracionProyecto.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        getContentPane().add(TfDuracionProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 160, -1));

        TfNombreProyecto.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        getContentPane().add(TfNombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 160, -1));

        LbTipoContrato1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato1.setText("Nombre Del Proyecto:");
        getContentPane().add(LbTipoContrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, -1));

        LbTipoContrato4.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato4.setText("Duracion del ´Proyecto:");
        getContentPane().add(LbTipoContrato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 174, -1));

        BtnAgregarPdf.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        BtnAgregarPdf.setText("Calcular Fechas");
        BtnAgregarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarPdfActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregarPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 170, 30));

        LbTipoContrato5.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato5.setText("Fecha Limite");
        getContentPane().add(LbTipoContrato5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 166, -1));

        LbTipoContrato6.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato6.setText("Fecha de Inicio");
        getContentPane().add(LbTipoContrato6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 166, -1));

        TfFechaInicio.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfFechaInicioActionPerformed(evt);
            }
        });
        getContentPane().add(TfFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 166, 30));

        TablaEstudiantes.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        TablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaEstudiantes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, 100));

        LbPropuesta2.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        LbPropuesta2.setText("Agregar Tareas");
        getContentPane().add(LbPropuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        TfDuracionTarea.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        getContentPane().add(TfDuracionTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 160, -1));

        LbTipoContrato2.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato2.setText("Tipo de Tarea :");
        getContentPane().add(LbTipoContrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 139, -1));

        TfNombreTarea.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        getContentPane().add(TfNombreTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 160, -1));

        LbTipoContrato7.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato7.setText("Duracion de la Tarea :");
        getContentPane().add(LbTipoContrato7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 174, -1));

        CmbTipoTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarea Basica", "Tarea Complementaria" }));
        CmbTipoTarea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbTipoTareaItemStateChanged(evt);
            }
        });
        getContentPane().add(CmbTipoTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 170, 30));

        LbTipoContrato3.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato3.setText("Nombre Tarea :");
        getContentPane().add(LbTipoContrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 130, -1));

        LbTipoContrato8.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato8.setText("Fase del Proyecto :");
        getContentPane().add(LbTipoContrato8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 139, -1));

        CmbFase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analisis", "Diseño", "Implementacion", "Depliege", "Mantenimiento" }));
        CmbFase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbFaseItemStateChanged(evt);
            }
        });
        getContentPane().add(CmbFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 170, 30));

        LbPropuesta3.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        LbPropuesta3.setText("Datos Del Proyecto :");
        getContentPane().add(LbPropuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 10));

        jButton1.setText("Agregar Tarea ");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 10, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEnviarPostulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarPostulacionActionPerformed
      
    }//GEN-LAST:event_BtnEnviarPostulacionActionPerformed

    private void TfFechaLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfFechaLimiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfFechaLimiteActionPerformed

    private void BtnAgregarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarPdfActionPerformed
      
    }//GEN-LAST:event_BtnAgregarPdfActionPerformed

    private void TfFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfFechaInicioActionPerformed

    private void CmbTipoTareaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbTipoTareaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbTipoTareaItemStateChanged

    private void CmbFaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbFaseItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbFaseItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarPdf;
    private javax.swing.JButton BtnEnviarPostulacion;
    private javax.swing.JComboBox<String> CmbFase;
    private javax.swing.JComboBox<String> CmbTipoTarea;
    private javax.swing.JLabel LbPropuesta1;
    private javax.swing.JLabel LbPropuesta2;
    private javax.swing.JLabel LbPropuesta3;
    private javax.swing.JLabel LbTipoContrato1;
    private javax.swing.JLabel LbTipoContrato2;
    private javax.swing.JLabel LbTipoContrato3;
    private javax.swing.JLabel LbTipoContrato4;
    private javax.swing.JLabel LbTipoContrato5;
    private javax.swing.JLabel LbTipoContrato6;
    private javax.swing.JLabel LbTipoContrato7;
    private javax.swing.JLabel LbTipoContrato8;
    private javax.swing.JTable TablaEstudiantes;
    private javax.swing.JTextField TfDuracionProyecto;
    private javax.swing.JTextField TfDuracionTarea;
    private javax.swing.JTextField TfFechaInicio;
    private javax.swing.JTextField TfFechaLimite;
    private javax.swing.JTextField TfNombreProyecto;
    private javax.swing.JTextField TfNombreTarea;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables


    public void CrearProyecto()
    {
        proyecto.setNombre(TfNombreProyecto.getText());
    }
}

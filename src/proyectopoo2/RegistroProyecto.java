
package proyectopoo2;

import java.awt.Dimension;
import javax.swing.JComponent;
import Clases.*;
import Logica.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class RegistroProyecto extends javax.swing.JInternalFrame {
    Proyecto proyecto = new Proyecto("");
    ArrayList<Tarea> tareas = new ArrayList<>();
    Ingeniero ingeniero;
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
    private Dimension dimBarra = null;
    DefaultTableModel modeloTabla;
    
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
        this.CrearModeloDeTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGuardarProyecto = new javax.swing.JButton();
        LbPropuesta1 = new javax.swing.JLabel();
        TfFechaLimite = new javax.swing.JTextField();
        TfNombreProyecto = new javax.swing.JTextField();
        LbTipoContrato1 = new javax.swing.JLabel();
        LbTipoContrato5 = new javax.swing.JLabel();
        LbTipoContrato6 = new javax.swing.JLabel();
        TfFechaInicio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ttarea = new javax.swing.JTable();
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
        BtnCalcularFechaTarea = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        LbTipoContrato9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        LbContraseña = new javax.swing.JLabel();
        LbNombre = new javax.swing.JLabel();
        TfCedula = new javax.swing.JTextField();
        TfNombre = new javax.swing.JTextField();
        LbCedula1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabelTitulo2 = new javax.swing.JLabel();
        LbContraseña1 = new javax.swing.JLabel();
        LbNombre1 = new javax.swing.JLabel();
        TfEdad = new javax.swing.JTextField();
        TfApellidos = new javax.swing.JTextField();
        TfEspecialidad = new javax.swing.JTextField();
        TfFechaLimiteTarea = new javax.swing.JTextField();
        LbTipoContrato10 = new javax.swing.JLabel();
        LbTipoContrato11 = new javax.swing.JLabel();
        TfFechaInicioTarea = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        BtnAgregarTarea = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        LbTipoContrato4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TaDescripcionTarea = new javax.swing.JTextArea();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnGuardarProyecto.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        BtnGuardarProyecto.setText("Registrar Proyecto");
        BtnGuardarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarProyectoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 170, 30));

        LbPropuesta1.setFont(new java.awt.Font("Century", 1, 30)); // NOI18N
        LbPropuesta1.setText("Registrar Proyecto");
        getContentPane().add(LbPropuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        TfFechaLimite.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfFechaLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfFechaLimiteActionPerformed(evt);
            }
        });
        getContentPane().add(TfFechaLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 166, 30));

        TfNombreProyecto.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        getContentPane().add(TfNombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 350, -1));

        LbTipoContrato1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato1.setText("Nombre Del Proyecto:");
        getContentPane().add(LbTipoContrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, -1));

        LbTipoContrato5.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato5.setText("Fecha Limite");
        getContentPane().add(LbTipoContrato5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 166, -1));

        LbTipoContrato6.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato6.setText("Fecha de Inicio");
        getContentPane().add(LbTipoContrato6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 166, -1));

        TfFechaInicio.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfFechaInicioActionPerformed(evt);
            }
        });
        getContentPane().add(TfFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 166, 30));

        Ttarea.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        Ttarea.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Ttarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 540, 100));

        LbPropuesta2.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        LbPropuesta2.setText("Tareas :");
        getContentPane().add(LbPropuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        TfDuracionTarea.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        getContentPane().add(TfDuracionTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 160, -1));

        LbTipoContrato2.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato2.setText("Descripcion :");
        getContentPane().add(LbTipoContrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 139, -1));

        TfNombreTarea.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        getContentPane().add(TfNombreTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 160, -1));

        LbTipoContrato7.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato7.setText("Duracion de la Tarea :");
        getContentPane().add(LbTipoContrato7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 174, -1));

        CmbTipoTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarea Basica", "Tarea Complementaria" }));
        CmbTipoTarea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbTipoTareaItemStateChanged(evt);
            }
        });
        getContentPane().add(CmbTipoTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 170, 30));

        LbTipoContrato3.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato3.setText("Tareas :");
        getContentPane().add(LbTipoContrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 130, -1));

        LbTipoContrato8.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato8.setText("Fase del Proyecto :");
        getContentPane().add(LbTipoContrato8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 139, -1));

        CmbFase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Analisis", "Diseño", "Implementacion", "Depliege", "Mantenimiento" }));
        CmbFase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbFaseItemStateChanged(evt);
            }
        });
        getContentPane().add(CmbFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 170, 30));

        LbPropuesta3.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        LbPropuesta3.setText("Datos Del Proyecto :");
        getContentPane().add(LbPropuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        BtnCalcularFechaTarea.setText("Ver Fecha");
        BtnCalcularFechaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularFechaTareaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCalcularFechaTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 120, 30));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 10, 610));

        LbTipoContrato9.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato9.setText("Nombre Tarea :");
        getContentPane().add(LbTipoContrato9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 130, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 590, 10));

        LbContraseña.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbContraseña.setText("Apellidos :");
        getContentPane().add(LbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        LbNombre.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbNombre.setText("Nombre :");
        getContentPane().add(LbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        TfCedula.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfCedula.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TfCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(TfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 170, 30));

        TfNombre.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 170, -1));

        LbCedula1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbCedula1.setText("Identificacion :");
        getContentPane().add(LbCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jButton2.setText("Buscar");
        jButton2.setBorder(null);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 50, 30));

        jLabelTitulo2.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        jLabelTitulo2.setText("Asignar Ingeniero");
        getContentPane().add(jLabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        LbContraseña1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbContraseña1.setText("Especialidad :");
        getContentPane().add(LbContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        LbNombre1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbNombre1.setText("Edad :");
        getContentPane().add(LbNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        TfEdad.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfEdadActionPerformed(evt);
            }
        });
        getContentPane().add(TfEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 60, -1));

        TfApellidos.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(TfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 170, 30));

        TfEspecialidad.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(TfEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 170, 30));

        TfFechaLimiteTarea.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfFechaLimiteTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfFechaLimiteTareaActionPerformed(evt);
            }
        });
        getContentPane().add(TfFechaLimiteTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 166, 30));

        LbTipoContrato10.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato10.setText("Fecha Limite Tarea :");
        getContentPane().add(LbTipoContrato10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 166, -1));

        LbTipoContrato11.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato11.setText("Fecha de Inicio Tarea :");
        getContentPane().add(LbTipoContrato11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 166, -1));

        TfFechaInicioTarea.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfFechaInicioTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfFechaInicioTareaActionPerformed(evt);
            }
        });
        getContentPane().add(TfFechaInicioTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 166, 30));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 410, 10));

        BtnAgregarTarea.setText("Agregar Tarea ");
        BtnAgregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarTareaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 160, 30));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 410, 10));

        LbTipoContrato4.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato4.setText("Tipo de Tarea :");
        getContentPane().add(LbTipoContrato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 139, -1));

        TaDescripcionTarea.setColumns(20);
        TaDescripcionTarea.setRows(5);
        jScrollPane2.setViewportView(TaDescripcionTarea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 380, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarProyectoActionPerformed
      this.CrearProyecto();
    }//GEN-LAST:event_BtnGuardarProyectoActionPerformed

    private void TfFechaLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfFechaLimiteActionPerformed
        
    }//GEN-LAST:event_TfFechaLimiteActionPerformed

    private void TfFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfFechaInicioActionPerformed

    private void CmbTipoTareaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbTipoTareaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbTipoTareaItemStateChanged

    private void CmbFaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbFaseItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbFaseItemStateChanged

    private void TfCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfCedulaActionPerformed

    private void TfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BuscarIngeniero();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfEdadActionPerformed

    private void TfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfApellidosActionPerformed

    private void TfEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfEspecialidadActionPerformed

    private void TfFechaLimiteTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfFechaLimiteTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfFechaLimiteTareaActionPerformed

    private void TfFechaInicioTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfFechaInicioTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfFechaInicioTareaActionPerformed

    private void BtnCalcularFechaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularFechaTareaActionPerformed
        MostrarFechaCalculadaTarea();
    }//GEN-LAST:event_BtnCalcularFechaTareaActionPerformed

    private void BtnAgregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarTareaActionPerformed
        AgregarTarea();
    }//GEN-LAST:event_BtnAgregarTareaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarTarea;
    private javax.swing.JButton BtnCalcularFechaTarea;
    private javax.swing.JButton BtnGuardarProyecto;
    private javax.swing.JComboBox<String> CmbFase;
    private javax.swing.JComboBox<String> CmbTipoTarea;
    private javax.swing.JLabel LbCedula1;
    private javax.swing.JLabel LbContraseña;
    private javax.swing.JLabel LbContraseña1;
    private javax.swing.JLabel LbNombre;
    private javax.swing.JLabel LbNombre1;
    private javax.swing.JLabel LbPropuesta1;
    private javax.swing.JLabel LbPropuesta2;
    private javax.swing.JLabel LbPropuesta3;
    private javax.swing.JLabel LbTipoContrato1;
    private javax.swing.JLabel LbTipoContrato10;
    private javax.swing.JLabel LbTipoContrato11;
    private javax.swing.JLabel LbTipoContrato2;
    private javax.swing.JLabel LbTipoContrato3;
    private javax.swing.JLabel LbTipoContrato4;
    private javax.swing.JLabel LbTipoContrato5;
    private javax.swing.JLabel LbTipoContrato6;
    private javax.swing.JLabel LbTipoContrato7;
    private javax.swing.JLabel LbTipoContrato8;
    private javax.swing.JLabel LbTipoContrato9;
    private javax.swing.JTextArea TaDescripcionTarea;
    private javax.swing.JTextField TfApellidos;
    private javax.swing.JTextField TfCedula;
    private javax.swing.JTextField TfDuracionTarea;
    private javax.swing.JTextField TfEdad;
    private javax.swing.JTextField TfEspecialidad;
    private javax.swing.JTextField TfFechaInicio;
    private javax.swing.JTextField TfFechaInicioTarea;
    private javax.swing.JTextField TfFechaLimite;
    private javax.swing.JTextField TfFechaLimiteTarea;
    private javax.swing.JTextField TfNombre;
    private javax.swing.JTextField TfNombreProyecto;
    private javax.swing.JTextField TfNombreTarea;
    private javax.swing.JTable Ttarea;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables

    
    public void CrearModeloDeTabla ()
    {
        modeloTabla= new DefaultTableModel();
        modeloTabla.addColumn("nombre");
        modeloTabla.addColumn("tipo");
        modeloTabla.addColumn("Fase");
        modeloTabla.addColumn("Duracion");
        modeloTabla.addColumn("Fecha Inicio");
        modeloTabla.addColumn("Fecha Final");
        this.Ttarea.setModel(modeloTabla);
    }
    public void Insertar (Tarea tarea)
    {
        if (tarea != null) {
            InsertarFila(tarea);
        }
    }
    public void InsertarFila (Tarea tarea)
    {
        String [] datos =  new String[6];
        datos[0] = tarea.getNombre();
        datos[1] = tarea.getTipoTarea();
        datos[2] = tarea.getFaseProyecto();
        datos[3] = String.valueOf(tarea.getDuracion());
        datos[4] = tarea.ObtenerFecharCorta(tarea.getFechaInicio());
        datos[5] = tarea.ObtenerFecharCorta(tarea.getFechaLimite());
        modeloTabla.addRow(datos);
    }

    public void AgregarTarea()
    {
        try {
            Tarea tarea = this.CrearTarea();
            tarea.CalcularFechaFinal();
            if(tarea != null)
            {
                this.Insertar(tarea);
                this.tareas.add(tarea);
                proyecto.addTarea(tarea);
                proyecto.AddIngeniero(tarea.getIngeniero());
                this.MostrarFechaCalculadaProyecto();
            }
        } catch (Exception e) {
            Mensaje.MostrarNotificacion(e.getMessage());
        }
    }
   
    public void CrearProyecto()
    {
        String nombreProyecto = TfNombreProyecto.getText();
        proyecto = new Proyecto(nombreProyecto);
        proyecto.setTareas(tareas);
        ServicioProyecto servicioProyecto = new ServicioProyecto();
        Mensaje.MostrarNotificacion(servicioProyecto.GuardarProyecto(proyecto));
    }
    public void MostrarFechaCalculadaProyecto()
    {
        try {
            proyecto.CalcularFechaFinal();
            String fechaInicio = proyecto.ObtenerFecharCorta(proyecto.getFechaInicio());
            String fechaFinal = proyecto.ObtenerFecharCorta(proyecto.getFechaLimite());
            TfFechaInicio.setText(fechaInicio);
            TfFechaLimite.setText(fechaFinal);
        } catch (Exception e) {
            Mensaje.MostrarNotificacion(e.getMessage());
        }
    }
    public void MostrarFechaCalculadaTarea()
    {
        try {
            Tarea t = CrearTarea();
            t.CalcularFechaFinal();
            String fechaInicio = t.ObtenerFecharCorta(t.getFechaInicio());
            String fechaFinal = t.ObtenerFecharCorta(t.getFechaLimite());
            TfFechaInicioTarea.setText(fechaInicio);
            TfFechaLimiteTarea.setText(fechaFinal);
        } catch (Exception e) {
            Mensaje.MostrarNotificacion(e.getMessage());
        }
    }
    public Respuesta<Ingeniero> BuscarIngeniero()
    {
        ServicioPersona servicioPersona =  new ServicioPersona();
        String identificacion = TfCedula.getText();
        Respuesta respuesta = servicioPersona.Buscar(identificacion);
        if(!respuesta.isError())
        {
            Mapear((Ingeniero)respuesta.getObjeto());
            ingeniero = (Ingeniero)respuesta.getObjeto();
        }
        Mensaje.MostrarNotificacion(respuesta.getMensaje());
        return respuesta;
    }
    
    public void Mapear(Ingeniero i)
    {
        TfNombre.setText(i.getNombres());
        TfApellidos.setText(i.getApellidos());
        TfEdad.setText(i.getEdad());
        TfEspecialidad.setText(i.getEspecialidad());
    }
    public Tarea CrearTarea()
    {
        String nombreTarea = TfNombreTarea.getText();
        int duracionTarea = Integer.parseInt(TfDuracionTarea.getText());
        String tipoTarea = CmbTipoTarea.getSelectedItem().toString();
        String fase = CmbFase.getSelectedItem().toString();
        String DescripcionTarea = TaDescripcionTarea.getText();
        Tarea tarea;
        if(tipoTarea.equals("Tarea Basica"))
        {
            tarea  = new TareaBasica(duracionTarea, nombreTarea, DescripcionTarea, fase, ingeniero);
        }
        else
        {
            tarea  = new TareaComplementaria(duracionTarea, nombreTarea, DescripcionTarea, fase, ingeniero);
        }
        return tarea;
    }
    
}

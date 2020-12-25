package proyectopoo2;

import Clases.*;
import Logica.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionarTareas extends javax.swing.JFrame {

    public Proyecto proyecto;
    DefaultTableModel modeloTablaTareas;
    DefaultTableModel modeloTablaIngenieros;
    ServicioProyecto servicioProyecto;
    Tarea tarea;

    public GestionarTareas(Proyecto proyecto) {
        initComponents();
        this.proyecto = proyecto;
        servicioProyecto = new ServicioProyecto();
        this.setLocationRelativeTo(null);
        this.CrearModeloDeTablaTarea();
        this.LlenarTablaTarea();
        this.EstablecerInfoProyecto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TfFechaLimite = new javax.swing.JTextField();
        TfNombreProyecto = new javax.swing.JTextField();
        LbTipoContrato1 = new javax.swing.JLabel();
        LbTipoContrato5 = new javax.swing.JLabel();
        LbTipoContrato6 = new javax.swing.JLabel();
        TfFechaInicio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ttarea = new javax.swing.JTable();
        LbTipoContrato3 = new javax.swing.JLabel();
        LbPropuesta3 = new javax.swing.JLabel();
        TfEstado = new javax.swing.JTextField();
        LbTipoContrato7 = new javax.swing.JLabel();
        LbProgreso = new javax.swing.JLabel();
        LbTipoContrato8 = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        BtnSeleccionarTarea = new javax.swing.JButton();
        LbPropuesta2 = new javax.swing.JLabel();
        TfDuracionTarea = new javax.swing.JTextField();
        LbTipoContrato2 = new javax.swing.JLabel();
        TfNombreTarea = new javax.swing.JTextField();
        LbTipoContrato9 = new javax.swing.JLabel();
        LbTipoContrato10 = new javax.swing.JLabel();
        LbTipoContrato11 = new javax.swing.JLabel();
        LbTipoContrato4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TaDescripcionTarea = new javax.swing.JTextArea();
        TfFase = new javax.swing.JTextField();
        TfTipo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TaJustificacion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        BtnCerrarTarea = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabelTitulo.setText("Gestionar Tareas de un Proyecto");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, 10));

        TfFechaLimite.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfFechaLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfFechaLimiteActionPerformed(evt);
            }
        });
        getContentPane().add(TfFechaLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 166, 30));

        TfNombreProyecto.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        getContentPane().add(TfNombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 350, -1));

        LbTipoContrato1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato1.setText("Nombre Del Proyecto:");
        getContentPane().add(LbTipoContrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, -1));

        LbTipoContrato5.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato5.setText("Progreso Proyecto");
        getContentPane().add(LbTipoContrato5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 166, -1));

        LbTipoContrato6.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato6.setText("Fecha de Inicio");
        getContentPane().add(LbTipoContrato6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 166, -1));

        TfFechaInicio.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfFechaInicioActionPerformed(evt);
            }
        });
        getContentPane().add(TfFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 166, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 880, 100));

        LbTipoContrato3.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato3.setText("Tareas :");
        getContentPane().add(LbTipoContrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, -1));

        LbPropuesta3.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        LbPropuesta3.setText("Datos Del Proyecto :");
        getContentPane().add(LbPropuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        TfEstado.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        TfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(TfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 166, 30));

        LbTipoContrato7.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato7.setText("Estado");
        getContentPane().add(LbTipoContrato7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 166, 20));

        LbProgreso.setBackground(new java.awt.Color(0, 102, 153));
        LbProgreso.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        LbProgreso.setForeground(new java.awt.Color(0, 102, 153));
        LbProgreso.setText("100%");
        getContentPane().add(LbProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, -1, -1));

        LbTipoContrato8.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato8.setText("Fecha Limite");
        getContentPane().add(LbTipoContrato8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 166, -1));

        BtnCerrar.setText("Cerrar Pestaña");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 160, 50));

        BtnSeleccionarTarea.setText("Seleccionar Tarea");
        BtnSeleccionarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarTareaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSeleccionarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 270, 40));

        LbPropuesta2.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        LbPropuesta2.setText("Tareas :");
        getContentPane().add(LbPropuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        TfDuracionTarea.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        TfDuracionTarea.setEnabled(false);
        getContentPane().add(TfDuracionTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 160, -1));

        LbTipoContrato2.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato2.setText("Descripcion :");
        getContentPane().add(LbTipoContrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 139, -1));

        TfNombreTarea.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        TfNombreTarea.setEnabled(false);
        getContentPane().add(TfNombreTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 160, -1));

        LbTipoContrato9.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato9.setText("Duracion de la Tarea :");
        getContentPane().add(LbTipoContrato9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 174, -1));

        LbTipoContrato10.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato10.setText("Fase del Proyecto :");
        getContentPane().add(LbTipoContrato10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 139, -1));

        LbTipoContrato11.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato11.setText("Nombre Tarea :");
        getContentPane().add(LbTipoContrato11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 130, -1));

        LbTipoContrato4.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato4.setText("Tipo de Tarea :");
        getContentPane().add(LbTipoContrato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 139, -1));

        TaDescripcionTarea.setColumns(20);
        TaDescripcionTarea.setRows(5);
        TaDescripcionTarea.setEnabled(false);
        jScrollPane2.setViewportView(TaDescripcionTarea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 270, 50));

        TfFase.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        TfFase.setEnabled(false);
        getContentPane().add(TfFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 160, -1));

        TfTipo.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        TfTipo.setEnabled(false);
        getContentPane().add(TfTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 160, -1));

        TaJustificacion.setColumns(20);
        TaJustificacion.setRows(5);
        TaJustificacion.setEnabled(false);
        jScrollPane3.setViewportView(TaJustificacion);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 320, 50));

        jLabel1.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        jLabel1.setText("Justifique el retraso de la tarea:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        BtnCerrarTarea.setText("Cerrar Tarea");
        BtnCerrarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarTareaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCerrarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 160, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfFechaLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfFechaLimiteActionPerformed

    }//GEN-LAST:event_TfFechaLimiteActionPerformed

    private void TfFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfFechaInicioActionPerformed

    private void TfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfEstadoActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnSeleccionarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarTareaActionPerformed
       MapearTarea(); 
    }//GEN-LAST:event_BtnSeleccionarTareaActionPerformed

    private void BtnCerrarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarTareaActionPerformed
        if (this.tarea != null) {
            if (this.tarea.getEstado().equals("En Desarrollo Con Retraso") && !"".equals(TaJustificacion.getText())) {
                if (Mensaje.RespuestaDecision("¿Esta seguro que desea cerrar la tarea?"))
                    this.CerrarTarea();
            }
            else Mensaje.MostrarNotificacion("Advertencia, debe justificar el retraso antes de cerrar la tarea");
        }
        else Mensaje.MostrarNotificacion("Advertencia, seleccione primero una tarea");
    }//GEN-LAST:event_BtnCerrarTareaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnCerrarTarea;
    private javax.swing.JButton BtnSeleccionarTarea;
    private javax.swing.JLabel LbProgreso;
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
    private javax.swing.JTextArea TaJustificacion;
    private javax.swing.JTextField TfDuracionTarea;
    private javax.swing.JTextField TfEstado;
    private javax.swing.JTextField TfFase;
    private javax.swing.JTextField TfFechaInicio;
    private javax.swing.JTextField TfFechaLimite;
    private javax.swing.JTextField TfNombreProyecto;
    private javax.swing.JTextField TfNombreTarea;
    private javax.swing.JTextField TfTipo;
    private javax.swing.JTable Ttarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public void EstablecerInfoProyecto() {
        this.TfEstado.setText(proyecto.getEstado());
        this.TfNombreProyecto.setText(proyecto.getNombre());
        this.TfFechaInicio.setText(proyecto.ObtenerFecharCorta(proyecto.getFechaInicio()));
        this.TfFechaLimite.setText(proyecto.ObtenerFecharCorta(proyecto.getFechaLimite()));
        this.LbProgreso.setText(String.valueOf(proyecto.ObtenerPorcentajeTareaRealizadas()));
    }

    public void CrearModeloDeTablaTarea() {
        modeloTablaTareas = new DefaultTableModel();
        modeloTablaTareas.addColumn("ID");
        modeloTablaTareas.addColumn("nombre");
        modeloTablaTareas.addColumn("tipo");
        modeloTablaTareas.addColumn("Fase");
        modeloTablaTareas.addColumn("Duracion");
        modeloTablaTareas.addColumn("Estado");
        modeloTablaTareas.addColumn("Fecha Inicio");
        modeloTablaTareas.addColumn("Fecha Final");
        this.Ttarea.setModel(modeloTablaTareas);
    }

    public void LlenarTablaTarea() {
        if (proyecto.getTareas().size() != 0) {
            for (Tarea tarea : proyecto.getTareas()) {
                if (!"Finalizado Con Retraso".equals(tarea.getEstado()) && !"Finalizado".equals(tarea.getEstado()))
                    tarea.ActualizarEstadoTarea();
                InsertarFila(tarea);
            }
        }
    }

    public void InsertarFila(Tarea tarea) {
        String[] datos = new String[8];
        datos[0] = String.valueOf(tarea.getIdTarea());
        datos[1] = tarea.getNombre();
        datos[2] = tarea.getTipoTarea();
        datos[3] = tarea.getFaseProyecto();
        datos[4] = String.valueOf(tarea.getDuracion());
        datos[5] = tarea.getEstado();
        datos[6] = tarea.ObtenerFecharCorta(tarea.getFechaInicio());
        datos[7] = tarea.ObtenerFecharCorta(tarea.getFechaLimite());
        modeloTablaTareas.addRow(datos);
    }

    public Tarea ObtenerTarea() {
        int filaSeleccionada = Ttarea.getSelectedRow();
        if (filaSeleccionada != -1) {
            if (Ttarea.getSelectedRows().length == 1) {
                int idTarea = Integer.parseInt(Ttarea.getValueAt(filaSeleccionada, 0).toString());
                this.tarea = proyecto.BuscarTarea(idTarea);
                this.ValidarEstado();
            } else {
                Mensaje.MostrarNotificacion("error seleccione solo una fila");
            }
        } else {
            Mensaje.MostrarNotificacion("error seleccione una fila");
        }
        return null;
    }
    
    public void ValidarEstado() {
        if (this.tarea.getEstado().equals("En Desarrollo Con Retraso")) {
            TaJustificacion.setEnabled(true);
            Mensaje.MostrarNotificacion("A continuación, justifique el retraso de la tarea");
        }
    }

    public void MapearTarea() {
        ObtenerTarea();
        TfNombreTarea.setText(tarea.getNombre());
        TfFase.setText(tarea.getFaseProyecto());
        TfDuracionTarea.setText(String.valueOf(tarea.getDuracion()));
        TfTipo.setText(tarea.getTipoTarea());
        TaDescripcionTarea.setText(tarea.getDescripcion());

    }
    
    public void CerrarTarea() {
        this.tarea.CerrarTarea();
        this.proyecto.Actualizar(tarea);
        String mensaje = this.servicioProyecto.Actualizar(this.proyecto);
        Mensaje.MostrarNotificacion(mensaje);
    }
}

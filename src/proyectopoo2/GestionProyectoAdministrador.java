
package proyectopoo2;
import Clases.*;
import Logica.*;
import javax.swing.table.DefaultTableModel;
public class GestionProyectoAdministrador extends javax.swing.JFrame {

    public Proyecto proyecto; 
    DefaultTableModel modeloTablaTareas;
    DefaultTableModel modeloTablaIngenieros;

    public GestionProyectoAdministrador(Proyecto proyecto) {
        initComponents();
        this.proyecto = proyecto;
        this.setLocationRelativeTo(null);
        this.CrearModeloDeTablaTarea();
        this.CrearModeloDeTablaIngenieros();
        this.LlenarTablaTarea();
        this.LlenarTablaIngeniero();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        TIngenieros = new javax.swing.JTable();
        LbTipoContrato4 = new javax.swing.JLabel();
        TfEstado = new javax.swing.JTextField();
        LbTipoContrato7 = new javax.swing.JLabel();
        LbProgreso = new javax.swing.JLabel();
        LbTipoContrato8 = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        BtnCerrarProyecto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabelTitulo.setText("Gestion Proyecto");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 750, 100));

        LbTipoContrato3.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato3.setText("Tareas :");
        getContentPane().add(LbTipoContrato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, -1));

        LbPropuesta3.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        LbPropuesta3.setText("Datos Del Proyecto :");
        getContentPane().add(LbPropuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        TIngenieros.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        TIngenieros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TIngenieros);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 730, 100));

        LbTipoContrato4.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        LbTipoContrato4.setText("Ingenieros");
        getContentPane().add(LbTipoContrato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 130, -1));

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
        getContentPane().add(BtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 640, 160, 40));

        BtnCerrarProyecto.setText("Cerrar Proyecto");
        BtnCerrarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarProyectoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCerrarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 140, 60));

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

    private void BtnCerrarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarProyectoActionPerformed
      CerrarProyecto();
    }//GEN-LAST:event_BtnCerrarProyectoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnCerrarProyecto;
    private javax.swing.JLabel LbProgreso;
    private javax.swing.JLabel LbPropuesta3;
    private javax.swing.JLabel LbTipoContrato1;
    private javax.swing.JLabel LbTipoContrato3;
    private javax.swing.JLabel LbTipoContrato4;
    private javax.swing.JLabel LbTipoContrato5;
    private javax.swing.JLabel LbTipoContrato6;
    private javax.swing.JLabel LbTipoContrato7;
    private javax.swing.JLabel LbTipoContrato8;
    private javax.swing.JTable TIngenieros;
    private javax.swing.JTextField TfEstado;
    private javax.swing.JTextField TfFechaInicio;
    private javax.swing.JTextField TfFechaLimite;
    private javax.swing.JTextField TfNombreProyecto;
    private javax.swing.JTable Ttarea;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
    public void EstablecerInfoProyecto ()
    {
        this.TfEstado.setText(proyecto.getEstado());
        this.TfNombreProyecto.setText(proyecto.getNombre());
        this.TfFechaInicio.setText(proyecto.ObtenerFecharCorta(proyecto.getFechaInicio()));
        this.TfFechaLimite.setText(proyecto.ObtenerFecharCorta(proyecto.getFechaLimite()));
        this.LbProgreso.setText(String.valueOf(proyecto.ObtenerPorcentajeTareaRealizadas()));
    }
    public void CrearModeloDeTablaTarea ()
    {
        modeloTablaTareas= new DefaultTableModel();
        modeloTablaTareas.addColumn("nombre");
        modeloTablaTareas.addColumn("tipo");
        modeloTablaTareas.addColumn("Fase");
        modeloTablaTareas.addColumn("Duracion");
        modeloTablaTareas.addColumn("Estado");
        modeloTablaTareas.addColumn("Fecha Inicio");
        modeloTablaTareas.addColumn("Fecha Final");
        this.Ttarea.setModel(modeloTablaTareas);
    }
    public void LlenarTablaTarea ( )
    {
        if(proyecto.getTareas().size() != 0)
        {
            for (Tarea tarea : proyecto.getTareas()) {
                tarea.ActualizarEstadoTarea();
                InsertarFila(tarea);
            }
        }
    }
    public void InsertarFila (Tarea tarea)
    {
        String [] datos =  new String[7];
        datos[0] = tarea.getNombre();
        datos[1] = tarea.getTipoTarea();
        datos[2] = tarea.getFaseProyecto();
        datos[3] = String.valueOf(tarea.getDuracion());
        datos[4] = tarea.getEstado();
        datos[5] = tarea.ObtenerFecharCorta(tarea.getFechaInicio());
        datos[6] = tarea.ObtenerFecharCorta(tarea.getFechaLimite());
        modeloTablaTareas.addRow(datos);
    }
    public void CrearModeloDeTablaIngenieros ()
    {
        modeloTablaIngenieros= new DefaultTableModel();
        modeloTablaIngenieros.addColumn("nombres");
        modeloTablaIngenieros.addColumn("apellidos");
        modeloTablaIngenieros.addColumn("especilidad");
        modeloTablaIngenieros.addColumn("edad");
        modeloTablaIngenieros.addColumn("años de experiencia");
        this.TIngenieros.setModel(modeloTablaIngenieros);
    }
    public void LlenarTablaIngeniero ( )
    {
        if(proyecto.getIngenieros().size() != 0)
        {
            for (Ingeniero Ingeniero : proyecto.getIngenieros()) {
                InsertarFilaIngeniero(Ingeniero);
            }
        }
        }
    public void InsertarFilaIngeniero (Ingeniero Ingeniero)
    {
        String [] datos =  new String[5];
        datos[0] = Ingeniero.getNombres();
        datos[1] = Ingeniero.getApellidos();
        datos[2] = Ingeniero.getEspecialidad();
        datos[3] = Ingeniero.getEdad();
        datos[4] = String.valueOf(Ingeniero.getAniosExperiencia());
        modeloTablaIngenieros.addRow(datos);
    }
    public void CerrarProyecto ()
    {
        Mensaje.MostrarNotificacion(this.proyecto.CerrarProyecto());
        if(this.proyecto.getEstado().equals("Finalizado Con Retraso") || this.proyecto.getEstado().equals("Finalizado"))
        {
            ServicioProyecto servicioProyecto = new ServicioProyecto();
            servicioProyecto.Actualizar(proyecto);
        }
    }
}

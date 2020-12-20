/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo2;

import Clases.*;
import Logica.ServicioProyecto;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;
import Logica.ServicioPersona;

public class GestionarProyectoIngeniero extends javax.swing.JInternalFrame {

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    ServicioProyecto sProyecto = new ServicioProyecto();
    DefaultTableModel modeloTabla;
    Respuesta<ArrayList<Proyecto>> respuesta;
    ServicioPersona servicioPersona ;
    Ingeniero ingeniero;
    public void ocultarBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();

    }

    public GestionarProyectoIngeniero() {
        initComponents();
        this.respuesta = new Respuesta(new ArrayList<Proyecto>());
        this.ocultarBarraTitulo();
        this.CrearModeloDeTabla();
        servicioPersona = new ServicioPersona();
        ingeniero = (Ingeniero) servicioPersona.Buscar();
        this.ConsultarProyectos();
    }

    private void ConsultarProyectos() {
        this.respuesta  = sProyecto.ObtenerProyectoDeIngeniero(ingeniero.getCedula());
        if (!respuesta.isError()) {
            if(respuesta.getObjeto().size() > 0)
            {
                this.Insertar(respuesta.getObjeto());
            }
            else
            {
                Mensaje.MostrarNotificacion("no se encontraron proyectos asociados a la identificacion digitada");
            }
        } else {
            Mensaje.MostrarNotificacion(respuesta.getMensaje());
        }
    }

    public void CrearModeloDeTabla() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Fecha de Inicio");
        modeloTabla.addColumn("Fecha Final");
        modeloTabla.addColumn("Cantidad Completado");
        modeloTabla.addColumn("Estado");
        this.TbProyectos.setModel(modeloTabla);
    }

    public void Insertar(ArrayList<Proyecto> proyectos) {
        if (TbProyectos != null) {
            proyectos.forEach(proyecto -> {
                InsertarFila(proyecto);
            });
        }
    }

    public void InsertarFila(Proyecto proyecto) {
        String[] datos = new String[5];
        datos[0] = proyecto.getNombre();
        datos[1] = proyecto.ObtenerFecharCorta(proyecto.getFechaInicio());
        datos[2] = proyecto.ObtenerFecharCorta(proyecto.getFechaLimite());
        datos[3] = String.valueOf(proyecto.ObtenerPorcentajeTareaRealizadas()*100 + "%");
        datos[4] = String.valueOf(proyecto.getEstado());
        modeloTabla.addRow(datos);
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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbProyectos = new javax.swing.JTable();
        BtnVisualizarProyecto = new javax.swing.JButton();
        jLabelTitulo2 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabelTitulo.setText("Consutla de Proyectos en Desarrollo Ingeniero");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1010, 10));

        TbProyectos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TbProyectos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 690, 330));

        BtnVisualizarProyecto.setText("Visualizar Proyecto Seleccionado");
        BtnVisualizarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVisualizarProyectoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVisualizarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 310, 40));

        jLabelTitulo2.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        jLabelTitulo2.setText("Asignar Ingeniero");
        getContentPane().add(jLabelTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVisualizarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVisualizarProyectoActionPerformed
        if (TbProyectos.getSelectedRows().length == 1) {
            int indice = TbProyectos.getSelectedRow();
            Proyecto proyecto = this.respuesta.getObjeto().get(indice);
            GestionarTareas gpa = new GestionarTareas(proyecto);
            gpa.setVisible(true);
        }
        else if (TbProyectos.getSelectedRows().length == 0) 
            Mensaje.MostrarNotificacion("Advertencia: seleccione por lo menos un proyecto");
        else Mensaje.MostrarNotificacion("Advertencia: debe seleccionar solo un proyecto");
    }//GEN-LAST:event_BtnVisualizarProyectoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVisualizarProyecto;
    private javax.swing.JTable TbProyectos;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

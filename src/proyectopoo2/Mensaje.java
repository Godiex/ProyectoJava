/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo2;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author spayd
 */
public class Mensaje {
    
    public static void CampoVacio(Component obj) {
        JOptionPane.showMessageDialog(obj, "error : llene los campos requeridos");
    }
    public static void MostrarNotificacion( String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static boolean RespuestaDecision( String msg) {
        int respuesta = JOptionPane.showConfirmDialog(null, msg);
        if (respuesta == JOptionPane.YES_OPTION) {
            return true;
        }
        else
        {
            return false;
        }    
    }
    
}

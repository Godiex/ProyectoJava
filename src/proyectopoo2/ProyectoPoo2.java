
package proyectopoo2;

import Clases.*;
import Datos.*;
import Logica.*;

public class ProyectoPoo2 {

    
    public static void main(String[] args) {
        
       Persona persona = new Persona("1", "sdfdsf", "dsfaf", "adsdsa");
       Usuario usuario = new Usuario("Administrador", "1", "a", persona);
       ServicioUsuario servicioUsuario = new ServicioUsuario();
       servicioUsuario.GuardarUsuario(usuario);
       new LoginForm();
    }
    
}

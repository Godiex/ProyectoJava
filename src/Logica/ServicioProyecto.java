
package Logica;

import Clases.ListaProyecto;
import Clases.Proyecto;
import Clases.Respuesta;
import Datos.*;

public class ServicioProyecto {
     private final ArchivoProyecto archivoProyecto;

    public ServicioProyecto() 
    {
        archivoProyecto = new ArchivoProyecto();
    }
    public String GuardarProyecto (Proyecto Proyecto)
    {
        try
        {
            String mensaje = archivoProyecto.GuardarProyecto(Proyecto);
            return mensaje;
        }
        catch (Exception e)
        {
            return "error al guardar : " +e.getMessage();
        }
    }
    public Respuesta<ListaProyecto> ConsultaProyecto  ()
    {
       return archivoProyecto.ObtenerListaProyecto();
    }
}

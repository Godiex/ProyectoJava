
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
    
    public Respuesta<ListaProyecto> ConsultarProyectosEnDesarrollo() {
        try {
            ListaProyecto listaProyectos = (ListaProyecto) this.ConsultaProyecto().getObjeto().getproyectos().stream()
                    .filter((listaProyecto) -> listaProyecto.getEstado().equals("En Desarrollo"));
            Respuesta<ListaProyecto> respuesta = new Respuesta(listaProyectos);
            if (respuesta.getObjeto().getproyectos().isEmpty()) {
                respuesta.setMensaje("No existen proyectos registrados");
                respuesta.setError(true);
            }
            return respuesta;
        }
        catch (Exception e) {
            return new Respuesta(e);
        }
    }
}

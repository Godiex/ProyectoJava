
package Datos;

import Clases.*;
import Clases.Proyecto;
import Clases.Respuesta;
import java.io.File;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoProyecto {
    private final File flujoDelArchivo;
    private FileOutputStream flujoDeEntradaDelArchivo;
    private FileInputStream flujoDeSalidaDelArchivo;
    private final String ruta = "Proyecto.Obj";

    public ArchivoProyecto() {
        flujoDelArchivo = new File(ruta);
    }
    
    public Respuesta<ListaProyecto> Guardar (ListaProyecto ListaProyecto)
    {
        try 
        {
            flujoDeEntradaDelArchivo = new FileOutputStream(flujoDelArchivo);
            ObjectOutputStream escritor = new ObjectOutputStream(flujoDeEntradaDelArchivo);
            escritor.writeObject(ListaProyecto);
            escritor.close();
            flujoDeEntradaDelArchivo.close();
            return new Respuesta(ListaProyecto);
        }
        catch(Exception e)
        {
            return new Respuesta(e);
        }
    }
    
    public Respuesta<ListaProyecto> ObtenerListaProyecto ()
    {
        try 
        {
            flujoDeSalidaDelArchivo = new FileInputStream(flujoDelArchivo);
            ObjectInputStream lector = new ObjectInputStream(flujoDeSalidaDelArchivo);
            ListaProyecto ListaProyecto = (ListaProyecto ) lector.readObject();
            lector.close();
            flujoDeSalidaDelArchivo.close();
            if (ListaProyecto != null) {
                return new Respuesta(ListaProyecto);
            }
            else    
            {
                return new Respuesta("No hay Proyecto Registrado");
            }
        }
        catch(Exception e)
        {
            return new Respuesta(e);
        }
    }
    public ListaProyecto ObtenerListaParaCrud ()
    {
        ListaProyecto ListaProyecto ;
        if (flujoDelArchivo.exists()) {
            ListaProyecto = (ListaProyecto) ObtenerListaProyecto().getObjeto();
        }
        else    
        {
            ListaProyecto = new ListaProyecto();
        }
        return ListaProyecto;
    }
    public Respuesta<ArrayList<Proyecto>> ObtenerProyectoDeIngeniero (String cedula)
    {
        try {
           ArrayList<Proyecto> proyectosIngeniero;
            if (flujoDelArchivo.exists()) {
                proyectosIngeniero = ObtenerListaProyecto().getObjeto().ObtenerProyectosIngeniero(cedula);
                return new Respuesta<ArrayList<Proyecto>>(proyectosIngeniero);
            }
            return new Respuesta<ArrayList<Proyecto>>("no existen proyectos registrados");
        } catch (Exception e) {
            return new Respuesta<ArrayList<Proyecto>>(e);
        }
    }
    public String GuardarProyecto (Proyecto Proyecto)
    {
        ListaProyecto ListaProyecto = ObtenerListaParaCrud ();
        ListaProyecto.Guardar(Proyecto);
        String mensaje = Guardar(ListaProyecto).getMensaje();
        return mensaje;
    }
    public void Actualizar (Proyecto Proyecto )
    {
        ListaProyecto ListaProyecto = ObtenerListaParaCrud();
        ListaProyecto.Actualizar(Proyecto);
        Guardar(ListaProyecto);
    }
}

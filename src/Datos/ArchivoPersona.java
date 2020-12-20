
package Datos;
import Clases.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoPersona {
    private final File flujoDelArchivo;
    private FileOutputStream flujoDeEntradaDelArchivo;
    private FileInputStream flujoDeSalidaDelArchivo;
    private final String ruta = "Persona.Obj";

    public ArchivoPersona() {
        flujoDelArchivo = new File(ruta);
    }
    public ArchivoPersona(String logeados) {
        flujoDelArchivo = new File("logeados.obj");
    }
    
    public Respuesta<ListaPersona> Guardar (ListaPersona listaPersona)
    {
        try 
        {
            flujoDeEntradaDelArchivo = new FileOutputStream(flujoDelArchivo);
            ObjectOutputStream escritor = new ObjectOutputStream(flujoDeEntradaDelArchivo);
            escritor.writeObject(listaPersona);
            escritor.close();
            flujoDeEntradaDelArchivo.close();
            return new Respuesta(listaPersona);
        }
        catch(IOException e)
        {
            return new Respuesta(e);
        }
    }
    
    public Respuesta<ListaPersona> ObtenerListaPersona ()
    {
        try 
        {
            flujoDeSalidaDelArchivo = new FileInputStream(flujoDelArchivo);
            ObjectInputStream lector = new ObjectInputStream(flujoDeSalidaDelArchivo);
            ListaPersona listaPersona = (ListaPersona ) lector.readObject();
            lector.close();
            flujoDeSalidaDelArchivo.close();
            if (listaPersona != null) {
                return new Respuesta(listaPersona);
            }
            else    
            {
                return new Respuesta("No hay Persona Registrado");
            }
        }
        catch( Exception e)
        {
            return new Respuesta(e);
        }
    }
    public ListaPersona ObtenerListaParaCrud ()
    {
        ListaPersona ListaPersona ;
        if (flujoDelArchivo.exists()) {
            ListaPersona = (ListaPersona) ObtenerListaPersona().getObjeto();
        }
        else    
        {
            ListaPersona = new ListaPersona();
        }
        return ListaPersona;
    }
    public String GuardarPersona (Persona persona)
    {
        ListaPersona ListaPersona = ObtenerListaParaCrud ();
        ListaPersona.Guardar(persona);
        String mensaje = Guardar(ListaPersona).getMensaje();
        return mensaje;
    }
    public void Eliminar (String cedula)
    {
        ListaPersona ListaPersona = ObtenerListaParaCrud();
        Persona persona = Buscar(cedula);
        ListaPersona.Borrar(persona.getCedula());
        Guardar(ListaPersona);
    }
    public void EliminarUsuarioLogeado ()
    {
        ListaPersona ListaPersona = ObtenerListaParaCrud();
        ListaPersona.setPersonas(new ArrayList<>());
        Guardar(ListaPersona);
    }
    public void Actualizar (Persona persona )
    {
        ListaPersona ListaPersona = ObtenerListaParaCrud();
        ListaPersona.Actualizar(persona);
        Guardar(ListaPersona);
    }
    public Persona Buscar (String cedula)
    {
        ListaPersona ListaPersona = ObtenerListaParaCrud();
        Persona persona = ListaPersona.BuscarPersona(cedula);
        return persona;
    }
    public Persona BuscarUsuarioLogeado ()
    {
        ListaPersona ListaPersona = ObtenerListaParaCrud();
        Persona persona = ListaPersona.getPersonas().get(0);
        return persona;
    }
}

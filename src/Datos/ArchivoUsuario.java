
package Datos;
import Clases.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoUsuario {
    private final File flujoDelArchivo;
    private FileOutputStream flujoDeEntradaDelArchivo;
    private FileInputStream flujoDeSalidaDelArchivo;
    private final String ruta = "Usuarios.Obj";

    public ArchivoUsuario() {
        flujoDelArchivo = new File(ruta);
    }
    
    public Respuesta<ListaUsuario> Guardar (ListaUsuario listaUsuario)
    {
        try 
        {
            flujoDeEntradaDelArchivo = new FileOutputStream(flujoDelArchivo);
            ObjectOutputStream escritor = new ObjectOutputStream(flujoDeEntradaDelArchivo);
            escritor.writeObject(listaUsuario);
            escritor.close();
            flujoDeEntradaDelArchivo.close();
            return new Respuesta(listaUsuario);
        }
        catch(Exception e)
        {
            return new Respuesta(e);
        }
    }
    
    public Respuesta<ListaUsuario> ObtenerListaUsuario ()
    {
        try 
        {
            flujoDeSalidaDelArchivo = new FileInputStream(flujoDelArchivo);
            ObjectInputStream lector = new ObjectInputStream(flujoDeSalidaDelArchivo);
            ListaUsuario listaUsuario = (ListaUsuario ) lector.readObject();
            lector.close();
            flujoDeSalidaDelArchivo.close();
            if (listaUsuario != null) {
                return new Respuesta(listaUsuario);
            }
            else    
            {
                return new Respuesta("No hay Usuario Registrado");
            }
        }
        catch(Exception e)
        {
            return new Respuesta(e);
        }
    }
    public ListaUsuario ObtenerListaParaCrud ()
    {
        ListaUsuario listaUsuario ;
        if (flujoDelArchivo.exists()) {
            listaUsuario = (ListaUsuario) ObtenerListaUsuario().getObjeto();
        }
        else    
        {
            listaUsuario = new ListaUsuario();
        }
        return listaUsuario;
    }
    public String GuardarUsuario (Usuario usuario)
    {
        ListaUsuario listaUsuario = ObtenerListaParaCrud ();
        listaUsuario.Guardar(usuario);
        String mensaje = Guardar(listaUsuario).getMensaje();
        return mensaje;
    }
    public void Eliminar (String cedula)
    {
        ListaUsuario listaUsuario = ObtenerListaParaCrud();
        Usuario usuario = Buscar(cedula);
        listaUsuario.Borrar(usuario);
        Guardar(listaUsuario);
    }
    public void Actualizar (Usuario usuario )
    {
        ListaUsuario listaUsuario = ObtenerListaParaCrud();
        listaUsuario.Actualizar(usuario);
        Guardar(listaUsuario);
    }
    public Usuario Buscar (String cedula)
    {
        ListaUsuario listaUsuario = ObtenerListaParaCrud();
        Usuario usuario = listaUsuario.BuscarUsuario(cedula);
        return usuario;
    }
    public Usuario Buscar (String nick, String contraseña)
    {
        ListaUsuario listaUsuario = ObtenerListaParaCrud();
        Usuario usuario = listaUsuario.BuscarUsuario(nick, contraseña);
        return usuario;
    }
}

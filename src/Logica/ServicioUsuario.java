
package Logica;

import Datos.ArchivoUsuario;
import Clases.*;

public class ServicioUsuario {
    private ArchivoUsuario archivoUsuario;

    public ServicioUsuario() 
    {
        archivoUsuario = new ArchivoUsuario();
    }
    public String GuardarUsuario (Usuario usuario)
    {
        try
        {
            Usuario usuarioAux = archivoUsuario.Buscar(usuario.getPersona().getCedula());
            if (usuarioAux == null) {
                String mensaje = archivoUsuario.GuardarUsuario(usuario);
                return mensaje;
            }
            return "el usuario ya se encuentra registrado";
        }
        catch (Exception e)
        {
            return "error al guardar : " +e.getMessage();
        }
    }
    public Respuesta<ListaUsuario> ConsultaUsuario  ()
    {
       return archivoUsuario.ObtenerListaUsuario();
    }
    public String Eliminar (String cedula)
    {
        try 
        {
            Usuario usuarioAux = archivoUsuario.Buscar(cedula);
            if (usuarioAux != null) {
               archivoUsuario.Eliminar(cedula);
            return "usuario borrado con exito";
            }
            return "el usuario no se encuentra registrado";
        }
        catch(Exception e)
        {
            return "error al eliminar : " +e.getMessage();
        }
       
    }
    
    public String Actualizar (Usuario usuario )
    {
       try  
       {
            Usuario usuarioAux = archivoUsuario.Buscar(usuario.getPersona().getCedula());
            if (usuarioAux != null) {
                archivoUsuario.Actualizar(usuario);
                return "Usuario actualizado con exito";
            }
            return "el usuario ya se encuentra registrado";
       }
       catch (Exception e)
       {
           return "error al actualizar : " +e.getMessage();
       }
    }

    public Respuesta<Usuario> Buscar (String cedula)
    {
        try
        {
           Usuario usuario = archivoUsuario.Buscar(cedula);
            if (usuario != null) {
                return new Respuesta(usuario);
            }
            else    
            {
                return new Respuesta("El Usuario no se encuntra registrado");
            }
        }
        catch(Exception e)
        {
            return new Respuesta(e);
        } 
    }
    
    public Respuesta<Usuario> Buscar (String nick ,String contraseña)
    {
        try
        {
           Usuario usuario = archivoUsuario.Buscar(nick, contraseña);
            if (usuario != null) {
                return new Respuesta(usuario);
            }
            else    
            {
                return new Respuesta("El Usuario no se encuntra registrado");
            }
        }
        catch(Exception e)
        {
           return new Respuesta(e);
        } 
    }
    
    
}

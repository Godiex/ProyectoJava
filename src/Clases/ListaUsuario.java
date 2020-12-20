
package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaUsuario implements Serializable
{
    ArrayList<Usuario> usuarios;

    public ListaUsuario() {
        usuarios = new ArrayList<>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void Guardar(Usuario usuario)
    {
        usuarios.add(usuario);
    }
    public Usuario BuscarUsuario(String nick,String contraseña)
    {
        for (Usuario usuario : usuarios) {
            if (usuario.getContraseña().equals(contraseña) && usuario.getNombreUsuario().equals(nick) ) {
                return usuario;
            }
        }
        return null;
    }
    public Usuario BuscarUsuario(String cedula)
    {
        for (Usuario usuario : usuarios) {
            if (usuario.getPersona().getCedula().equals(cedula)) {
                return usuario;
            }
        }
        return null;
    }
    public int ObtenerPosicionDeUsuario(String cedula)
    {
        int posicion = 0;
        for (Usuario usuario : usuarios)
        {
            if (usuario.getPersona().getCedula().equals(cedula))
            {
                return posicion;
            }
            posicion = posicion + 1;
        }
        return posicion;
    }
    public void Borrar(Usuario usuario)
    {
        int posicion = ObtenerPosicionDeUsuario(usuario.getPersona().getCedula());
        usuarios.remove(posicion);
    } 
    public void Actualizar(Usuario usuario)
    {
        int posicion = ObtenerPosicionDeUsuario(usuario.getPersona().getCedula());
        usuarios.set(posicion, usuario);
    }
}
